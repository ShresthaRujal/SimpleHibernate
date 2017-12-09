package com.test.hibernate.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.test.hibernate.Dao.UserDao;
import com.test.hibernate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	private UserDao userDao;

	private int id=0;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletRequest request) throws IOException{
		String button=request.getParameter("button");
			return new ModelAndView("signUp");
	}

	@RequestMapping(value = "/view",method = RequestMethod.POST)
	public String display(@Valid User user, BindingResult result, Model model){
		if (result.hasErrors()){
			return "signUp";
		}else {
			model.addAttribute("display",user);
			userDao.save(user);
			return "success";
		}
	}

	@RequestMapping(value = "/viewAll")
	public ModelAndView displayAll(){

		List<User> users = userDao.display();
		ModelAndView modelAndView = new ModelAndView("showAll","users",users);

		return modelAndView;
	}

	@RequestMapping(value = "/deleteById")
	public String deleteById(HttpServletRequest request){

		int id= Integer.parseInt(request.getParameter("editid"));
		System.out.println(id);
		userDao.delete(id);


		return "redirect:/viewAll";

	}

	@RequestMapping(value = "/getId")
	public String getId(HttpServletRequest request,Model model){

		id = Integer.parseInt(request.getParameter("editid"));
		System.out.println(id);
		model.addAttribute("id",id);
		return "udpate";

	}

	@RequestMapping(value="/udpateById")
	public String udpateById(@ModelAttribute User user, BindingResult result, Model model){
		if (result.hasErrors()){

			return "udpate";
		}else {
			System.out.println(user.getName());
			model.addAttribute("display",user);
			userDao.update(user);
			return "success";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute User user,BindingResult result,HttpServletResponse response){

		if (result.hasErrors()){
			System.out.println("error");
			ModelAndView modelAndView = new ModelAndView("login");

			return modelAndView;
		}else {
			try {
				System.out.println(user.getPassword());
				user = userDao.search(user.getEmail(),user.getPassword());
				if (user==null){
					ModelAndView mav=new ModelAndView("login");
					return mav;
				}else {
					ModelAndView modelAndView = new ModelAndView("view", "users", user);

					return modelAndView;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("no alert");
			}
			return null;
		}


	}

	@RequestMapping(value = "/jspController",method = RequestMethod.GET)
	public String jspController(HttpServletRequest request,HttpServletResponse response){
		String value = request.getParameter("action");
		if (value.equals("signup")){
			return "signUp";
		}
		else {
			return null;
		}
	}
	
}

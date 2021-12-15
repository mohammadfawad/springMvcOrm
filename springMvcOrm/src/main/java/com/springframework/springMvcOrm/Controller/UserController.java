package com.springframework.springMvcOrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springframework.springMvcOrm.Entities.User;
import com.springframework.springMvcOrm.Service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("register")
	public String displayUserRegisterationForm() {
		return "RegisterUser";
	}
	
	@RequestMapping(value = "RegisteredUser", method =RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		System.out.print(user);
		modelMap.addAttribute("user",user);
		modelMap.addAttribute("userCreated","Result userCreated = " + userService.addUser(user));
		return "RergisteredUserModelMapString";
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}

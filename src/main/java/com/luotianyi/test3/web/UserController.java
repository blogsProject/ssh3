package com.luotianyi.test3.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.luotianyi.test3.entiy.User;
import com.luotianyi.test3.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller
public class UserController extends ActionSupport {
	@Autowired
	@Qualifier("userService")
	UserService userService;
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String login() {
		String flag;
		System.out.println(user);
		String username = user.getUsername();
		User temp = userService.getUserByUsername(username);
		if (temp == null) {
			flag = "error";
		} else {
			flag = temp.getPassword().equals(user.getPassword()) ? "success" : "error";
		}
		return flag;
	}
}

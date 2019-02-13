package cn.ce.user.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ce.user.model.User;

@RestController
public class UserController {

	@RequestMapping("/user/{userId}")
	public User get(@PathVariable("userId") Integer userId) {
		
		User user = new User();
		user.setUserId(userId);
		user.setUsername("用户名"+userId);
		user.setAge(18 + userId);
		
		return user;
	}

}

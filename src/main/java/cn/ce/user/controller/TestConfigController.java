package cn.ce.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigController {

	@Value("${name}")
	private String name;
	
	@RequestMapping("/testconfig")
	public String test() {
		return "hello, " + name;
	}
}

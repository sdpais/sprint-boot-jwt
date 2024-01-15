package com.javainuse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World, this is a fine day to be trying Java! on to something else next!";
	}

}
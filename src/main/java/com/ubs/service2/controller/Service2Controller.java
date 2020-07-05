package com.ubs.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

	@GetMapping("/first")
	public String service2() {
		return "Service2 service called";
	}
}

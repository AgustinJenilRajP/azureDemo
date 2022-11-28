package com.azure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureHelloWorld {

	@RequestMapping(value = "/app", method = RequestMethod.GET)
	public String helooWorld() {
		return "Hello azure";
	}
}

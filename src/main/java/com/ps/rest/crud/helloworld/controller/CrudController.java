package com.ps.rest.crud.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/")
public class CrudController {
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() {
		return "spring-rest-crud-helloworld Deployment is OK";
	}
}

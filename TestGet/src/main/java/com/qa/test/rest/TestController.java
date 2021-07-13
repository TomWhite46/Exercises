package com.qa.test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/") // MAPS a GET request to "/" to this method
	public String hello() {
		return "<div style=\"display:inline;color:green;font-size:150px;font-family:'Comic Sans MS';background:red\">&#128512; <strong><em>Hello</em>, World!</strong> &#128512;</div>";
	}
}

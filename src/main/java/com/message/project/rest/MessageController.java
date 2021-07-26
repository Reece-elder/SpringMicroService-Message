package com.message.project.rest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/message")
public class MessageController {

//	Creating an object called rest that is a Rest Template
	RestTemplate rest;
	
//	MessageController constructor, but this is equal to RestTemplateBuilder being built
	public MessageController(RestTemplateBuilder builder) {
		super();
		this.rest = builder.build();
	}
	
//	Using get mapping with "/get"
	@GetMapping("/get")
	
//	Allows the creation of HTTP responses with Java Objects
//	Name of method is getMessage()
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok(new String("hello, World!"));
	}
	
//	The project can't run on the default port as it will conflict with the gateway
	
}

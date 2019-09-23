package com.em.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.service.MessageService;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class MessageController {

	@Autowired
	private MessageService service;
	
	@GetMapping(value="/getList", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getList(String name){
		return new ResponseEntity<List<String>>(service.getList(name),HttpStatus.OK);
	}
}

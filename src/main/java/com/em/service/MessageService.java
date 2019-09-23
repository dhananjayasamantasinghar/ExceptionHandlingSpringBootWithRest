package com.em.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

	public List<String> getList(String name){
		if(name != null && !"".equals(name)){
			return Arrays.asList("1","2","3");
		}
		throw new RuntimeException("Name should not be null !!");
	}
}

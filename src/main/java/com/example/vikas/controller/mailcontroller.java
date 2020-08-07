package com.example.vikas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vikas.mail.*;

@RestController
@CrossOrigin(origins = "*")
public class mailcontroller 
{
	@Autowired
	mail service;
	
	@GetMapping("/mail")
	public void mail()
	{
		service.sendmail();
	}
}

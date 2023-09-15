package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class sampleController {
	
	@GetMapping("/")
	public String name() {
		return "Java最高!!!!!";
	}
}

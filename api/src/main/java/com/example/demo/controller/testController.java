package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 * mock用のcontroller
 * @author yukishi
 *
 */
@RestController
@RequiredArgsConstructor
public class testController {

	@GetMapping("/")
	public String getSample() {
		return "hello";
	}
}

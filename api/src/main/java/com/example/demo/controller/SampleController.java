package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 * サンプル
 * 
 * @author yukishi
 *
 */
@RestController
@RequiredArgsConstructor
public class SampleController {
	/**
	 * /sampleでアクセスした時に文言を追加する。
	 * 
	 * @return
	 */
	@GetMapping("/sample")
	public String getSample() {
		return "this is sample";
	}
}

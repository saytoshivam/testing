package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KashishController {
	@RequestMapping("say-hello")
	@ResponseBody
	public String getAllStudent() {
		return "S1, s2, s3";
	}
	
	@RequestMapping("bitch")
	@ResponseBody
	public String Kashish() {
		return "<html><body>kashish</body></html>";
	}
}

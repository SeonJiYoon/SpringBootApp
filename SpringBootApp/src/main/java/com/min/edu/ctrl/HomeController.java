package com.min.edu.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String home() {
		System.out.println(" (っ °Д °;)っ 처음 호출되는 요청");
		return "Hello";
	}
}

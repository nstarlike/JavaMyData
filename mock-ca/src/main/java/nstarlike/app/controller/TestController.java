package nstarlike.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class TestController {
	@GetMapping("/test")
	public String test() {
		return "test";
	}
}

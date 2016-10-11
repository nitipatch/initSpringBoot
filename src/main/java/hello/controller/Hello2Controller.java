package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {
	
	@RequestMapping("/2")
	public String index2() {
		return "Hello 2 World";
	}

}
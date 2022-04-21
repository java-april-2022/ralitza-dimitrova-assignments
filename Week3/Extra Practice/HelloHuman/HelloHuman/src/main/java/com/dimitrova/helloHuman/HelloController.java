package com.dimitrova.helloHuman;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name") String firstName, @RequestParam(value="last_name") String lastName, @RequestParam(value="times", defaultValue="1") Integer times) {
        if(firstName .equals("")) {
        	return "Hello human!";
        }
		String result = "";
		for(int i = 0; i < times; i++) {
			result += "Hello " + firstName + " " + lastName + "!";
		}
		return result;
		}
}


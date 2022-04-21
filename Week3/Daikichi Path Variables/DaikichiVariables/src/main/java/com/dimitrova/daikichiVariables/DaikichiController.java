package com.dimitrova.daikichiVariables;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping(value = "/daikichi")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping(value = "/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value = "/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/daikichi/travel/{location}")
    public String travel(@PathVariable("location") String location){
    	return "Congratulations! You will soon travel to " + location + "!";
    }
	@RequestMapping("/daikichi/lotto/{lottoNumber}")
    public String lotto(@PathVariable("lottoNumber") int lottoNumber){
    	if(lottoNumber % 2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers.";
    	}
    	else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    }
}
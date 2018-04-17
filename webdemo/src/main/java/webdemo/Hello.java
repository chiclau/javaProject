package webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class Hello {
	
	@RequestMapping("/save")
	public String name() {
		System.out.println("asd");
		
		return "success";
	}

}

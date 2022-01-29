package ServerProgramming.Week2TestInClass.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestInClassController {
	
	@RequestMapping("hello")
	public String sayHello(@RequestParam(name="name") String nimi, 
			@RequestParam(name="age") String ika, Model model) {
		model.addAttribute("thNimi", nimi);
		model.addAttribute("thIka", ika);
		return "welcome";
		}
}

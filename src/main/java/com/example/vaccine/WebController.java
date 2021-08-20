package com.example.vaccine;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Controller
public class WebController implements WebMvcConfigurer{
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/result").setViewName("result");
	}
	@GetMapping("/")
	public String showHome(Model model) {
		return "index";
	}

	@GetMapping("/form")
	public String showRegistrationForm(Model model) {
		Vaccine vaccine = new Vaccine();
		model.addAttribute("vaccine", vaccine);
		return "form";
	}

	
	@PostMapping("/result")
	public String submitForm(@Valid @ModelAttribute("vaccine") Vaccine vaccine,
	        BindingResult bindingResult, Model model) {
	    System.out.println(vaccine);
	     
	    if (bindingResult.hasErrors()) {       
	         
	        return "form";
	    } else {
	        return "result";
	    }
	}
	

//	@RequestMapping("/save")
//	public String saveVaccine(@ModelAttribute Vaccine vaccine, Model model) {		
//		model.addAttribute("vaccine", vaccine);
//		return "result";
//	}
	
	

}

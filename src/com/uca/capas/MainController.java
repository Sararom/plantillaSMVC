package com.uca.capas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Student;

@Controller
public class MainController {
	
	@RequestMapping ("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/formData", method = RequestMethod.POST)
	
	public ModelAndView formData(
			@RequestParam(value="name") String name,
			@RequestParam(value="apellido") String apellido,
			@RequestParam(value="fecha") String fecha,
			@RequestParam(value="career") String career,
			@RequestParam(value="exp") String exp) {
		
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		student.setName(name);
		student.setApellido(apellido);
		student.setFecha(fecha);
		student.setCareer(career);
		student.setExp(exp);
		mav.setViewName("form");
		mav.addObject("student",student);
		return mav;
	}
	
}

//Investigar las JCL y que hacen esas tags :v y hacer un programa de eso 
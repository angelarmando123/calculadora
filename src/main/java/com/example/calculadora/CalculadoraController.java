package com.example.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CalculadoraController {

	@GetMapping("/")
	public String index(Model modelo)
	{
		modelo.addAttribute("calculadora", new Calculadora());
		return "/index";
	}
	
	@PostMapping("/resultado")
	public String resultado(@ModelAttribute Calculadora calcu, Model modelo)
	{
		calcu.Calcular();
		modelo.addAttribute("calcu", calcu);
		return "/index";
		}
}

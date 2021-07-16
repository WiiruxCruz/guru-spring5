package mx.com.wiirux.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.wiirux.repositories.AutorRepository;

@Controller
public class AutorController {
	private final AutorRepository ar;
	
	public AutorController(AutorRepository ar) {
		this.ar = ar;
	}
	
	@RequestMapping("/autores")
	public String getAutores(Model m) {
		m.addAttribute("listadoAutores", ar.findAll());
		
		return "lista/autores";
	}
}

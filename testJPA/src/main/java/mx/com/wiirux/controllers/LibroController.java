package mx.com.wiirux.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.wiirux.repositories.LibroRepository;

@Controller
public class LibroController {
	
	private final LibroRepository lr;
	
	public LibroController(LibroRepository lr) {
		this.lr = lr;
	}
	
	@RequestMapping("/libros")
	public String getLibros(Model m) {
		m.addAttribute("listadoLibros", lr.findAll());
		
		return "lista/libros";
	}
	
	
	@RequestMapping("/librosViejo")
	public String getLibrosViejo(Model m) {
		
		m.addAttribute( "Libros", lr.findAll() );
		
		return "listadoLibros";
	}
	
	@RequestMapping("/otraRutaLibros")
	public String getOtraRutaLibros(Model m) {
		
		m.addAttribute( "Libros", lr.findAll() );
		
		return "otraCarpeta/listadoLibros";
	}
}

package mx.com.wiirux.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mx.com.wiirux.domain.Autor;
import mx.com.wiirux.domain.Editor;
import mx.com.wiirux.domain.Libro;
import mx.com.wiirux.repositories.AutorRepository;
import mx.com.wiirux.repositories.EditorRepository;
import mx.com.wiirux.repositories.LibroRepository;

@Component
public class BootStrapData implements CommandLineRunner{
	
	private final AutorRepository ar;
	private final LibroRepository lr;
	private final EditorRepository er;
	
	

	public BootStrapData(AutorRepository ar, LibroRepository lr, EditorRepository er) {
		super();
		this.ar = ar;
		this.lr = lr;
		this.er = er;
	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println("Iniciando in Bootstrap");
		Editor e = new Editor();
		e.setNombre("Hiram Ramirez");
		e.setCiudad("Veracruz");
		e.setEstado("Veracruz");
		
		er.save(e);
		
		System.out.println("Editores count:" + er.count() );
		
		Autor a = new Autor("Diana", "Lopez");
		Libro l = new Libro("Receta de la felicidad", "123123");
		a.getLibros().add(l);
		l.getAutores().add(a);
		
		l.setEditor(e);
		e.getLibros().add(l);
		
		ar.save(a);
		lr.save(l);
		er.save(e);
		
		Autor a2 = new Autor("Victor", "Lopez");
		Libro l2 = new Libro("Libro del taco", "sin isbd");
		a2.getLibros().add(l2);
		l2.getAutores().add(a2);
		
		l2.setEditor(e);
		e.getLibros().add(l2);
		
		ar.save(a2);
		lr.save(l2);
		er.save(e);
		
		System.out.println("Numero de libros: " + lr.count());
		System.out.println("Editor numero de libros:" + e.getLibros().size());
		
		
	}
	
}

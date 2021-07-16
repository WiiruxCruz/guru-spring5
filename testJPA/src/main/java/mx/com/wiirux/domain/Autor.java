package mx.com.wiirux.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String apellido;
	
	@ManyToMany(mappedBy = "autores")
	private Set<Libro> libros = new HashSet<>();
	
	public Autor() {
		super();
	}
	public Autor(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Set<Libro> getLibros() {
		return libros;
	}
	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}
	
	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Autor a = (Autor) obj;
		
		return id != null ? id.equals(a.getId()) : a.id == null;
	}
	@Override
	public String toString() {
		return "Autor{"
				+ "id=" + id
				+ ", nombre=" + nombre
				+ ", apellido=" + apellido
				+ ", libros=" + libros
				+ "}";
	}
	
	
}

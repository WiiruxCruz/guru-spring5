package mx.com.wiirux.domain;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String titulo;
	private String isbn;
	
	@ManyToOne
	private Editor editor;
	
	@ManyToMany
	@JoinTable(
		name = "autor_libro",
		joinColumns = @JoinColumn(name = "libro_id"),
		inverseJoinColumns = @JoinColumn(name = "autor_id")
	)
	private Set<Autor> autores = new HashSet<>();
	
	public Libro() {
		super();
	}
	public Libro(String titulo, String isbn) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set<Autor> getAutores() {
		return autores;
	}
	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
	public Editor getEditor() {
		return editor;
	}
	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Libro l = (Libro) obj;
		
		return id != null ? id.equals(l.id) : l.id == null;
	}
	
	@Override
	public String toString() {
		return "Libro{"
				+ "id=" + id
				+ ", titulo=" + titulo
				+ ", isbn=" + isbn
				+ "}";
	}
	
	
}

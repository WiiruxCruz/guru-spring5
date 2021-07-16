package mx.com.wiirux.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Editor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String direccion;
	private String ciudad;
	private String estado;
	private String codigoPostal;
	
	@OneToMany
	@JoinColumn(name="editor_id")
	private Set<Libro> libros = new HashSet<>();
	
	public Editor() {}

	public Editor(Long id, String nombre, String direccion, String ciudad, String estado, String codigoPostal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
	}



	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
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
	
	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id != null ? id.hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		if(obj == null || getClass()!= obj.getClass()) return false;
		
		Editor e = (Editor) obj;
		
		return id != null ? id.equals(e.id) : e.id == null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Editor("
			+ "id=" + id
			+ ", nombre=" + nombre
			+ ", direccion=" + direccion
			+ ", ciudad=" + ciudad
			+ ", estado=" + estado
			+ ", codigoPostal=" + codigoPostal
			+ ")";
	}
	
	
}

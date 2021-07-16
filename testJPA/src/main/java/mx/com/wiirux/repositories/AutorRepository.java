package mx.com.wiirux.repositories;

import org.springframework.data.repository.CrudRepository;

import mx.com.wiirux.domain.Autor;

public interface AutorRepository extends CrudRepository<Autor, Long> {
	
}

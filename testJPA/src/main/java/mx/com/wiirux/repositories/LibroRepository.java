package mx.com.wiirux.repositories;

import org.springframework.data.repository.CrudRepository;

import mx.com.wiirux.domain.Libro;

public interface LibroRepository extends CrudRepository<Libro, Long>{

}

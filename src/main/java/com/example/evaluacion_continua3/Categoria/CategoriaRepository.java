package com.example.evaluacion_continua3.Categoria;

import java.util.List;

import com.example.evaluacion_continua3.Instrumento.Instrumento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categoria", path = "categoria")
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Integer>, CrudRepository<Categoria, Integer> {
    
    List<Instrumento> findByNombre(@Param("nombre") String nombre);

}

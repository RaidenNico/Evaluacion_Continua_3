package com.example.evaluacion_continua3.Categoria;

import java.util.HashSet;
import java.util.Set;

import com.example.evaluacion_continua3.Instrumento.Instrumento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nombre;

    @OneToMany(targetEntity = Instrumento.class, mappedBy = "categoria")
    @OrderBy("nombre ASC")
    private Set<Instrumento> instrumentos = new HashSet<Instrumento>();

    public Set<Instrumento> getInstrumentos() {
        return instrumentos;
    }
    public void setInstrumentos(Set<Instrumento> cursos) {
        this.instrumentos = cursos;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

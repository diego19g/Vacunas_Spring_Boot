package com.example.Vacunas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods

import com.example.Vacunas.model.Vacuna;

@Repository
public interface VacunasRepository extends JpaRepository<Vacuna, Integer> {
	public final static String FIND_BY_Nombre_QUERY = "SELECT v " + 
            "FROM Vacuna v  " +
            "WHERE v.nombre = :nombre";
	
	/**
     * Find persons like first name.
     */
    public List<Vacuna> findByNombreLike(String nombre);
    
    @Query(FIND_BY_Nombre_QUERY)
    public List<Vacuna> Consulta_por_Nombre(@Param("nombre") String nombre);
    
    
	
}

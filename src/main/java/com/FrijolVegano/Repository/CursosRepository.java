package com.FrijolVegano.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.FrijolVegano.Entity.Cursos;


@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long>{
	@Query("SELECT u FROM Cursos u WHERE u.titulo = :titulo")
	Optional<Cursos> buscarPorTitulo(@Param("titulo")String titulo);
}

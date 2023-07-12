package com.FrijolVegano.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FrijolVegano.Entity.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Long> {
	Optional<Cursos> buscarPorCodigoCurso(String codigoCurso);
	//Creo que el cliente debe ingresar un código interno de curso/producto pq seria dificil buscarlo con nombre(por la longitud)
}

package com.FrijolVegano.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FrijolVegano.Entity.Resenias;

public interface ReseniasRepository extends JpaRepository<Resenias, Long> {
	Optional<Resenias> buscarPorNombre(String nombre);
	//No estoy seguro si lo ideal sea buscar las reseñas por nombre o por el curso/producto que se haya evaluado....
}

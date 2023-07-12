package com.FrijolVegano.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FrijolVegano.Entity.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
	Optional<Productos> buscarPorCodigoProducto(String codigoProducto);
	//Lo mismo que para los cursos, un código interno de curso/producto pq seria dificil buscarlo con nombre
}

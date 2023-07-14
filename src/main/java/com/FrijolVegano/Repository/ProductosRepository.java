package com.FrijolVegano.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.FrijolVegano.Entity.Productos;
@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long> {
	
	@Query("SELECT u FROM Productos u WHERE u.nombre = :nombre")
	Optional<Productos> buscarPorNombre(@Param("nombre") String nombre);
	
//	Optional<Productos> buscarPorCodigoProducto(String codigoProducto);
//	Lo mismo que para los cursos, un código interno de curso/producto pq seria dificil buscarlo con nombre
//	Optional<Productos> buscarPorNombre(String nombre);

}

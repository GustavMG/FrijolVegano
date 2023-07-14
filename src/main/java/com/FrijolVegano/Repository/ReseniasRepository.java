package com.FrijolVegano.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.FrijolVegano.Entity.Resenias;
@Repository
public interface ReseniasRepository extends JpaRepository<Resenias, Long> {
	@Query("SELECT u FROM Resenias u WHERE u.nombre = :nombre")
	Optional<Resenias> buscarPorNombre(@Param("nombre") String nombre);
	//Aqui estamos buscando las reseñas por nombre DEL USUARIO QUE COMENTÓ
}

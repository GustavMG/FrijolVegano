package com.FrijolVegano.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FrijolVegano.Entity.Carritos;

@Repository
public interface CarritosRepository extends JpaRepository<Carritos, Long> {
	Optional<Carritos> buscarCarritoCliente(String correo);
	//Verificar como encontrar la información del carrito, creo podría hacerse la busqueda con el correo ya que asi enlazamos la info
}

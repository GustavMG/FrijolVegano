package com.FrijolVegano.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FrijolVegano.Entity.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	Optional<Usuarios> buscarPorCorreo(String correo);
	//Aqui el correo es el dato importante ya que es con el que se identifican los usuarios
}

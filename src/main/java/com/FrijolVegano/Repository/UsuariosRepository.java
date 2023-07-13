package com.FrijolVegano.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.FrijolVegano.Entity.Usuarios;
@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	@Query("SELECT u FROM Usuarios u WHERE u.email = :email")
	Optional<Usuarios> buscarPorEmail(@Param("email") String email);
//	Optional<Usuarios> buscarPorEmail(String email);
	//Aqui el correo es el dato importante ya que es con el que se identifican los usuarios
}

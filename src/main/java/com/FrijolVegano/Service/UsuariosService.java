package com.FrijolVegano.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.FrijolVegano.Entity.Usuarios;
import com.FrijolVegano.Repository.UsuariosRepository;

public class UsuariosService {
	public final UsuariosRepository usuariosRepository;
	@Autowired
	public UsuariosService(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}
	
	//Los usuarios se consultan, crean, modifican y tal vez se eliminan
	//Leemos los datos (GET)
	public List<Usuarios> leerUsuarios(){
		return usuariosRepository.findAll();
	}

}

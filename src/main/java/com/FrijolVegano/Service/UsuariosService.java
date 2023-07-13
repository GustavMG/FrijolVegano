package com.FrijolVegano.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FrijolVegano.Entity.Usuarios;
import com.FrijolVegano.Repository.UsuariosRepository;
@Service
public class UsuariosService {
	public final UsuariosRepository usuariosRepository;
	@Autowired
	public UsuariosService(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}//Constructor
	
	//Los usuarios se consultan, crean, modifican y tal vez se eliminan
	//Leemos los datos de TODOS los usuarios(GET)
	public List<Usuarios> leerUsuarios(){
		return usuariosRepository.findAll();
	}//leerUsuarios
	
	//Leemos los datos de un usuario en especifico(GET)
	public Optional<Usuarios> leerUsuariosId(Long id){
		return usuariosRepository.findById(id);
	}//leerUsuariosId
	
	//Creamos nuevos usuarios(POST)
	public Usuarios crearUsuarios(Usuarios usuarios) {
		Usuarios usuarioTemp = null;
		if(usuariosRepository.buscarPorEmail(usuarios.getEmail()).isEmpty()) {
			usuarioTemp = usuariosRepository.save(usuarios);
		}
		return usuarioTemp;
	}//crearUsuarios
	
	//Modificamos parametros del usuario (PUT) 
	//EXCEPTUANDO EL COREEO todos los demas parámetros se pueden modificar
	public Usuarios modificarUsuarios(Long id, Boolean admin, String nombre, String telefono, String email, String contrasenia, String imagenPerfil, String direccion) {
		Usuarios usuarioTemp = null;
		if(usuariosRepository.existsById(id)) {
			usuarioTemp = usuariosRepository.findById(id).get();
			
			//Asignación de nuevos parámetros, NO TODOS se pueden modificar
			//Validación de NO datos en blanco, pero NO aplica para todos
			//Id NO se modifica
			usuarioTemp.setAdmin(admin);
			//Tipo de cuenta NO se modifica por el momento
			if(nombre != null) usuarioTemp.setNombre(nombre);
			if(telefono != null) usuarioTemp.setTelefono(telefono);
			//email NO se puede modificar
			//contraseña NO se puede modificar por el momento
			usuarioTemp.setImagenPerfil(imagenPerfil); //La imagen de perfil no es estrictamente necesaria
			usuarioTemp.setDireccion(direccion); //La dirección no es estrictamente necesaria
			
			usuariosRepository.save(usuarioTemp);
		}
		return usuarioTemp;
	}//modificarUsuarios
	
	//Eliminamos usuarios (DELET)
	public Usuarios eliminarUsuarios(Long id) {
		Usuarios usuarioTemp = null;
		if(usuariosRepository.existsById(id)) {
			usuarioTemp = usuariosRepository.findById(id).get();
			usuariosRepository.deleteById(id);
		}
		return usuarioTemp;
	}//eliminarUsuarios

}

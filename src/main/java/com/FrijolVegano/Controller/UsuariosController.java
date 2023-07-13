package com.FrijolVegano.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.FrijolVegano.Entity.Usuarios;
import com.FrijolVegano.Service.UsuariosService;

@RestController
@RequestMapping (path = "/frijolVegano/usuario")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.PUT })
public class UsuariosController {
	public final UsuariosService usuariosService;
	@Autowired
	public UsuariosController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}
	
	//Metodos HTTP
	
	//GET
	//Traer TODOS los usuarios
	@GetMapping
	public List<Usuarios> getUsuarios(){
		return usuariosService.leerUsuarios();
	}//getUsuarios
	//Traer UNICO usuario (por su id existente)
	@GetMapping(path = "{idUsuarios}")
	public Optional<Usuarios> getUsuariosId(@PathVariable("idUsuarios") Long id){
		return usuariosService.leerUsuariosId(id);
	}//getUsuariosId
		
	//POST
	//Crear usuarios
	@PostMapping
	public Usuarios postUsuarios(@RequestBody Usuarios usuarios) {
		return usuariosService.crearUsuarios(usuarios);
	}//postUsuarios
		
	//PUT
	//Modificar usuarios(por su id existente)
	@PutMapping(path = "{idUsuarios}")
	public Usuarios putUsuarios(@PathVariable("idUsuarios") Long id,
			@RequestParam(required = false) boolean admin,
			@RequestParam(required = false)String nombre,
			@RequestParam(required = false)String telefono,
			@RequestParam(required = false)String email,
			@RequestParam(required = false)String contrasenia,
			@RequestParam(required = false)String imagenPerfil,
			@RequestParam(required = false)String direccion) {
		return usuariosService.modificarUsuarios(id, admin, nombre, telefono, email, contrasenia, imagenPerfil, direccion);
	}//modificarUsuarios
	
	//DELET
	@DeleteMapping(path = "{idUsuarios}")
	public Usuarios deletUsuarios(@PathVariable("idUsuarios") Long id) {
		return usuariosService.eliminarUsuarios(id);
	}//deletUsuarios

}

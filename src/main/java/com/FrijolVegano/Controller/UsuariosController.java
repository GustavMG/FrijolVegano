package com.FrijolVegano.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FrijolVegano.Service.UsuariosService;

@RestController
@RequestMapping (path = "/frijolVegano/usuarios")
public class UsuariosController {
	public final UsuariosService usuariosService;
	@Autowired
	public UsuariosController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}
	
	//Metodos HTTP
	
	//GET
		
	//POST
		
	//PUT
	
	//DELET

}

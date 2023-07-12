package com.FrijolVegano.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FrijolVegano.Service.CursosService;

@RestController
@RequestMapping (path = "/frijolVegano/cursos")
public class CursosController {
	public final CursosService cursosService;
	@Autowired
	public CursosController(CursosService cursosService) {
		this.cursosService = cursosService;
	}
	
	//Metodos HTTP
	
	//GET
		
	//POST
		
	//PUT
		
	//DELET

}

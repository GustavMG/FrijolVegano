package com.FrijolVegano.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FrijolVegano.Service.ReseniasService;

@RestController
@RequestMapping (path = "/frijolVegano/resenias")
public class ReseniasController {
	public final ReseniasService reseniasService;
	@Autowired
	public ReseniasController(ReseniasService reseniasService) {
		this.reseniasService = reseniasService;
	}
	
	//Metodos HTTP
	
	//GET
		
	//POST
		
	//PUT
		
	//DELET

}

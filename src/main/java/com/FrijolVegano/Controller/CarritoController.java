package com.FrijolVegano.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FrijolVegano.Service.CarritosService;

@RestController
@RequestMapping	(path = "/frijolVegano/carrito")
public class CarritoController {
	public final CarritosService carritosServicie;
	@Autowired
	public CarritoController(CarritosService carritosService) {
		this.carritosServicie = carritosService;
	}
	
	//Metodos HTTP
	
	//GET
	
	//POST
	
	//PUT
	
	//DELET
}

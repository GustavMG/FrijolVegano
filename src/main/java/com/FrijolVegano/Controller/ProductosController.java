package com.FrijolVegano.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FrijolVegano.Entity.Productos;
import com.FrijolVegano.Service.ProductosService;

@RestController
@RequestMapping (path = "frijolVegano/productos")
public class ProductosController {
	public final ProductosService productosService;
	@Autowired
	public ProductosController(ProductosService productosService) {
		this.productosService = productosService;
	}
	
	//Metodos HTTP
	//GET
	@GetMapping
	public List<Productos> getProductos(){
		return null;
	}
//	POST
//	@PostMapping
//	//PUT
//	@PutMapping
//	//DELET
//	@DeleteMapping	

}

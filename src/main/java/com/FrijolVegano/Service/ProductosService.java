package com.FrijolVegano.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.FrijolVegano.Entity.Productos;
import com.FrijolVegano.Repository.ProductosRepository;

public class ProductosService {
	public final ProductosRepository productosRepository;
	@Autowired
	public ProductosService(ProductosRepository productosRepository) {
		this.productosRepository = productosRepository;
	}
	
	//Los metodos para los productos, deberian ser agregar, modificar y eliminar
	public List<Productos> leerProductos(){
		return productosRepository.findAll();
	}

}

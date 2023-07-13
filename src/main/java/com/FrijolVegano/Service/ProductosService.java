package com.FrijolVegano.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.FrijolVegano.Entity.Productos;
import com.FrijolVegano.Repository.ProductosRepository;

public class ProductosService {
	public final ProductosRepository productosRepository;
	@Autowired
	public ProductosService(ProductosRepository productosRepository) {
		this.productosRepository = productosRepository;
	}//Constructor
	
	//Los metodos para los PRODUCTOS, deberian ser agregar, modificar y eliminar
	public List<Productos> leerProductos(){
		return productosRepository.findAll();
	}//leerProductos
	
	//Buscar/Leer PRODUCTO
	public Optional<Productos> leerProductosId(Long id){
		return productosRepository.findById(id);
	}//leerProductos id
	
	//CREAR PRODUCTO
	public Productos crearProductos(Productos productos) {
		Productos productoTemp = null;
//		if(productosRepository.buscarPorNombre(getNombre()).isEmpty())
			productoTemp = productosRepository.save(productos);
//		}
		return productoTemp;
	}//crearProductos
	
	//MODIFICAR PRODUCTO
	public Productos modificarProductos(Productos productos) {
		Productos productoTemp = null;
//		if(productosRepository.existsById(id)) {
		if(productosRepository.existsById(null)) {
//			productoTemp = productosRepository.findById(id).get();
			productoTemp = productosRepository.findById(null).get();
			//TODO:Agregar las validaciones de las entradas, se requiere los parametros de la tabla, por ejemplo:
//			if(nombre != null) productoTemp.setNombre(nombre);
			
			productoTemp = productosRepository.save(productos);
		}
		return productoTemp;
	}//modificarProductos
	
	//ELIMINAR PRODUCTO
	public Productos eliminarProductos(Productos productos) {
		Productos productoTemp = null;
//		if(productosRepository.existsById(id)) {
		if(productosRepository.existsById(null)) {
			productoTemp = productosRepository.findById(null).get();
			productosRepository.delete(null);
		}
		return productoTemp;
	}//eliminarProductos
}

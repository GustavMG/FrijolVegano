package com.FrijolVegano.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FrijolVegano.Entity.Productos;
import com.FrijolVegano.Repository.ProductosRepository;

@Service //De esta forma indicamos que esta clase es un servicio

public class ProductosService {
	
	public final ProductosRepository productosRepository;
	
	//Anotacion que funciona para el autoconectado
	@Autowired
	
	
	public ProductosService(ProductosRepository productosRepository) {
		this.productosRepository = productosRepository;
	}//Constructor
	
	//Los metodos del CRUD para los PRODUCTOS, deberian ser agregar, modificar y eliminar
	public List<Productos> leerProductos(){
		return productosRepository.findAll();
	}//leerProductos
	
	//Buscar/Leer PRODUCTO
	public Optional<Productos> leerProductosNombre(Long id){
		return productosRepository.findById(id);
	}//leerProductos por nombre
	
	//CREAR PRODUCTO
	public Productos crearProductos(Productos productos) {
		Productos productoTemp = null;
		if(productosRepository.buscarPorNombre(productos.getNombre()).isEmpty()){
			productoTemp = productosRepository.save(productos);
		}
		return productoTemp;
	}//crearProductos
	
	//MODIFICAR PRODUCTO
	public Productos modificarProductos(Long id, Boolean esProducto, String nombre, String marca, String presentacion, String fabricante,
			String descripcion, String tipoEnvase, String dimensiones, String pesoTotal, String existencias,
			Double precio, String imgUrl, Boolean enOferta, Double precioOferta) {
		
		Productos productoTemp = null;
		
		if(productosRepository.existsById(id)) {
			// Se modificaran sus parametros
			productoTemp = productosRepository.findById(id).get();
			if(nombre != null) productoTemp.setNombre(nombre);
			if(marca != null) productoTemp.setMarca(marca);
			if(presentacion != null) productoTemp.setPresentacion(presentacion);
			if(fabricante != null) productoTemp.setFabricante(fabricante);
			if(descripcion != null) productoTemp.setDescripcion(descripcion);
			if(tipoEnvase != null) productoTemp.setTipoEnvase(tipoEnvase);
			if(dimensiones != null) productoTemp.setDimensiones(dimensiones);
			if(pesoTotal != null) productoTemp.setPesoTotal(pesoTotal);
			if(existencias != null) productoTemp.setExistencias(existencias);
			if(precio != null) productoTemp.setPrecio(precio);
			if(imgUrl != null) productoTemp.setImgUrl(imgUrl);
			if(enOferta != null)productoTemp.setEnOferta(enOferta);
			if(precioOferta != null) productoTemp.setPrecioOferta(precioOferta);
			
			productosRepository.save(productoTemp);
		}
		return productoTemp;
	}//modificarProductos
	
	//ELIMINAR PRODUCTO
	public Productos eliminarProductos(Long id) {
		Productos productoTemp = null;
		
		if(productosRepository.existsById(id)) {
			productoTemp = productosRepository.findById(id).get();
			productosRepository.deleteById(id);
		}
		return productoTemp;
	}//eliminarProductos
}

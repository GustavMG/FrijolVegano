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
	}//leerProductos
	
	//CREAR PRODUCTO
	public Productos crearProductos(Productos productos) {
		Productos productoTemp = null;
		if(productosRepository.buscarPorNombre(productos.getNombre()).isEmpty()){
			productoTemp = productosRepository.save(productos);
		}
		return productoTemp;
	}//crearProductos
	
	//MODIFICAR PRODUCTO
	public Productos modificarProductos(Long id, String es_producto, String nombre, String marca, String presentacion, String fabricante,
			String descripcion, String tipo_envase, String dimensiones, String peso_total, String existencias,
			double precio, String img_url, String en_oferta, double precio_oferta) {
		
		Productos productoTemp = null;
		
		if(productosRepository.existsById(id)) {
			// Se modificaran sus parametros
			productoTemp = productosRepository.findById(id).get();
			if(es_producto != null) productoTemp.setEs_producto(es_producto);
			if(nombre != null) productoTemp.setNombre(nombre);
			if(marca != null) productoTemp.setMarca(marca);
			if(presentacion != null) productoTemp.setPresentacion(presentacion);
			if(fabricante != null) productoTemp.setFabricante(fabricante);
			if(descripcion != null) productoTemp.setDescripcion(descripcion);
			if(tipo_envase != null) productoTemp.setTipo_envase(tipo_envase);
			if(dimensiones != null) productoTemp.setDimensiones(dimensiones);
			if(peso_total != null) productoTemp.setPeso_total(peso_total);
			if(existencias != null) productoTemp.setExistencias(existencias);
			if(precio != 0) productoTemp.setPrecio(precio);
			if(img_url != null) productoTemp.setImg_url(img_url);
			if(en_oferta != null)productoTemp.setEn_oferta(en_oferta);
			if(precio_oferta != 0) productoTemp.setPrecio_oferta(precio_oferta);
			
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

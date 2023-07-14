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

import com.FrijolVegano.Entity.Productos;
import com.FrijolVegano.Service.ProductosService;

@RestController
@RequestMapping (path = "/frijolvegano/productos")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.PUT })

public class ProductosController {
	public final ProductosService productosService;
	@Autowired
	public ProductosController(ProductosService productosService) {
		this.productosService = productosService;
	}
	
	//Metodos HTTP
//	GET
	@GetMapping
	public List<Productos> getProductos(){
		return productosService.leerProductos();
	}
	
	@GetMapping (path = "{prodId}")
	public Optional<Productos> getProdcutosId(@PathVariable("prodId")Long id){
		return productosService.leerProductosNombre(id);
	}
	
//	POST
	@PostMapping
	public Productos postProducto(@RequestBody Productos productos) {
		return productosService.crearProductos(productos);
	}
	
//	//PUT
	@PutMapping (path = "{prodId}")
	public Productos updateProducto(@PathVariable("prodId")Long id,
			@RequestParam(required = false)String es_producto,
			@RequestParam(required = false)String nombre,
			@RequestParam(required = false)String marca,
			@RequestParam(required = false)String presentacion,
			@RequestParam(required = false)String fabricante,
			@RequestParam(required = false)String descripcion,
			@RequestParam(required = false)String tipo_envase,
			@RequestParam(required = false)String dimensiones,
			@RequestParam(required = false)String peso_total,
			@RequestParam(required = false)String existencias,
			@RequestParam(required = false)Double precio,
			@RequestParam(required = false)String img_url,
			@RequestParam(required = false)String en_oferta,
			@RequestParam(required = false)Double precio_oferta) {
		
		return productosService.modificarProductos(id, es_producto, nombre, marca, presentacion, fabricante, descripcion, tipo_envase, dimensiones, peso_total, existencias, precio, img_url, en_oferta, precio_oferta);
	
	}
	
	
//	//DELETE
	@DeleteMapping (path = "{prodId}")	
	public Productos deleteProducto(@PathVariable("prodId")Long id) {
		return productosService.eliminarProductos(id);
	}

}

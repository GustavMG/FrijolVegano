package com.FrijolVegano.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping (path = "/FrijolVegano/productos")
@Entity
@Table (name = "productos")
public class Productos {
	
	@Id //Llave Primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Comportamientos de la PK Autoincremental
	
	//Atributos ----------------------------------------------------------------------------------------------
	
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String es_producto;
	private String nombre;
	private String marca;
	private String presentacion;
	private String fabricante;
	private String descripcion;
	private String tipo_envase;
	private String dimensiones;
	private String peso_total;
	private String existencias;
	private double precio;
	private String img_url;
	private String en_oferta;
	private double precio_oferta;
	
	
	//Constructor con todos los campos -----------------------------------------------------------------------
	public Productos(Long id, String es_producto, String nombre, String marca, String presentacion, String fabricante,
			String descripcion, String tipo_envase, String dimensiones, String peso_total, String existencias,
			double precio, String img_url, String en_oferta, double precio_oferta) {
		super();
		this.id = id;
		this.es_producto = es_producto;
		this.nombre = nombre;
		this.marca = marca;
		this.presentacion = presentacion;
		this.fabricante = fabricante;
		this.descripcion = descripcion;
		this.tipo_envase = tipo_envase;
		this.dimensiones = dimensiones;
		this.peso_total = peso_total;
		this.existencias = existencias;
		this.precio = precio;
		this.img_url = img_url;
		this.en_oferta = en_oferta;
		this.precio_oferta = precio_oferta;
	}
	
	//Constructor vacio --------------------------------------------------------------------------------------
	public Productos() {
		
	}
	
	//Setter y Getters ---------------------------------------------------------------------------------------
	public String isEs_producto() {
		return es_producto;
	}

	public void setEs_producto(String es_producto) {
		this.es_producto = es_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo_envase() {
		return tipo_envase;
	}

	public void setTipo_envase(String tipo_envase) {
		this.tipo_envase = tipo_envase;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getPeso_total() {
		return peso_total;
	}

	public void setPeso_total(String peso_total) {
		this.peso_total = peso_total;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String isEn_oferta() {
		return en_oferta;
	}

	public void setEn_oferta(String en_oferta) {
		this.en_oferta = en_oferta;
	}

	public double getPrecio_oferta() {
		return precio_oferta;
	}

	public void setPrecio_oferta(double precio_oferta) {
		this.precio_oferta = precio_oferta;
	}

	public Long getId() {
		return id;
	}
	
	// toString ---------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Productos [id=" + id + ", es_producto=" + es_producto + ", nombre=" + nombre + ", marca=" + marca
				+ ", presentacion=" + presentacion + ", fabricante=" + fabricante + ", descripcion=" + descripcion
				+ ", tipo_envase=" + tipo_envase + ", dimensiones=" + dimensiones + ", peso_total=" + peso_total
				+ ", existencias=" + existencias + ", precio=" + precio + ", img_url=" + img_url + ", en_oferta="
				+ en_oferta + ", precio_oferta=" + precio_oferta + "]";
	}	

	
	
	
	
	
	
	
/*	TODO: Hay que colocar los atributos restantes de la tabla, darle una ultima verificación antes de colocarlos
 *  Se requiere anexar el constructor ya con los parametros BIEN
 *  Se requeire generar los getters y los setters 
 */

}

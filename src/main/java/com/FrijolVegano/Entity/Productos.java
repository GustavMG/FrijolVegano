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
@Table (name = "producto")
public class Productos {
	
	@Id //Llave Primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Comportamientos de la PK Autoincremental
	
	//Atributos ----------------------------------------------------------------------------------------------
	
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private Boolean esProducto;
	private String nombre;
	private String marca;
	private String presentacion;
	private String fabricante;
	private String descripcion;
	private String tipoEnvase;
	private String dimensiones;
	private String pesoTotal;
	private String existencias;
	private Double precio;
	private String imgUrl;
	private Boolean enOferta;
	private Double precioOferta;
	
	//Constructor con todos los campos -----------------------------------------------------------------------
	
	public Productos(Long id, Boolean esProducto, String nombre, String marca, String presentacion, String fabricante,
			String descripcion, String tipoEnvase, String dimensiones, String pesoTotal, String existencias,
			Double precio, String imgUrl, Boolean enOferta, Double precioOferta) {
		super();
		this.id = id;
		this.esProducto = esProducto;
		this.nombre = nombre;
		this.marca = marca;
		this.presentacion = presentacion;
		this.fabricante = fabricante;
		this.descripcion = descripcion;
		this.tipoEnvase = tipoEnvase;
		this.dimensiones = dimensiones;
		this.pesoTotal = pesoTotal;
		this.existencias = existencias;
		this.precio = precio;
		this.imgUrl = imgUrl;
		this.enOferta = enOferta;
		this.precioOferta = precioOferta;
	}
	
	//Constructor vacio --------------------------------------------------------------------------------------
	
	public Productos() {
		
	}
	
	//Setter y Getters ---------------------------------------------------------------------------------------
	
	public boolean isEsProducto() {
		return esProducto;
	}

	public void setEsProducto(Boolean esProducto) {
		this.esProducto = esProducto;
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

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(String pesoTotal) {
		this.pesoTotal = pesoTotal;
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

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public boolean isEnOferta() {
		return enOferta;
	}

	public void setEnOferta(Boolean enOferta) {
		this.enOferta = enOferta;
	}

	public double getPrecioOferta() {
		return precioOferta;
	}

	public void setPrecioOferta(Double precioOferta) {
		this.precioOferta = precioOferta;
	}

	public Long getId() {
		return id;
	}

	// toString ---------------------------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "Productos [id=" + id + ", esProducto=" + esProducto + ", nombre=" + nombre + ", marca=" + marca
				+ ", presentacion=" + presentacion + ", fabricante=" + fabricante + ", descripcion=" + descripcion
				+ ", tipoEnvase=" + tipoEnvase + ", dimensiones=" + dimensiones + ", pesoTotal=" + pesoTotal
				+ ", existencias=" + existencias + ", precio=" + precio + ", imgUrl=" + imgUrl + ", enOferta="
				+ enOferta + ", precioOferta=" + precioOferta + "]";
	}
	
	
	
	
	
	
	
/*	TODO: Hay que colocar los atributos restantes de la tabla, darle una ultima verificación antes de colocarlos
 *  Se requiere anexar el constructor ya con los parametros BIEN
 *  Se requeire generar los getters y los setters 
 */

}

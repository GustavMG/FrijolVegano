package com.FrijolVegano.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "cursos")

public class Cursos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	// Atributos ----------------------------------------------------------------------------------------------
	
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String es_producto;
	private String titulo;
	private String categoria;
	private String descripcion;
	private double precio;
	private String detalles;
	private String aprendizaje;
	private String img_url;
	private String video_url;
	private int estrellas;
	
	// Constructor --------------------------------------------------------------------------------------------
	public Cursos(Long id, String es_producto, String titulo, String categoria, String descripcion, double precio,
			String detalles, String aprendizaje, String img_url, String video_url, int estrellas) {
		super();
		this.id = id;
		this.es_producto = es_producto;
		this.titulo = titulo;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.precio = precio;
		this.detalles = detalles;
		this.aprendizaje = aprendizaje;
		this.img_url = img_url;
		this.video_url = video_url;
		this.estrellas = estrellas;
	}
	
	//Constructor Vacio ---------------------------------------------------------------------------------------
	public Cursos() {
		
	}
	
	// Setters y Getters --------------------------------------------------------------------------------------
	public String getEs_producto() {
		return es_producto;
	}

	public void setEs_producto(String es_producto) {
		this.es_producto = es_producto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public String getAprendizaje() {
		return aprendizaje;
	}

	public void setAprendizaje(String aprendizaje) {
		this.aprendizaje = aprendizaje;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public Long getId() {
		return id;
	}
	
	// toString ----------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Cursos [id=" + id + ", es_producto=" + es_producto + ", titulo=" + titulo + ", categoria=" + categoria
				+ ", descripcion=" + descripcion + ", precio=" + precio + ", detalles=" + detalles + ", aprendizaje="
				+ aprendizaje + ", img_url=" + img_url + ", video_url=" + video_url + ", estrellas=" + estrellas + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	TODO: Hay que colocar los atributos restantes de la tabla, darle una ultima verificación antes de colocarlos
 *  Se requiere anexar el constructor ya con los parametros BIEN
 *  Se requeire generar los getters y los setters 
 */

}

package com.FrijolVegano.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "resenias")
public class Resenias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String nombre;
	private Integer estrellas;
	private String resenia;
	
	//Constructor
	public Resenias(Long id, String nombre, Integer estrellas, String resenia) {
		this.id = id;
		this.nombre = nombre;
		this.estrellas = estrellas;
		this.resenia = resenia;
	}//Resenias
	
	public Resenias() { } //Constructor vacío
	
	//Getters y Setters	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
	}

	public String getResenia() {
		return resenia;
	}

	public void setResenia(String resenia) {
		this.resenia = resenia;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Resenias [id=" + id + ", nombre=" + nombre + ", estrellas=" + estrellas + ", resenia=" + resenia + "]";
	}//toString	
}//Resenias

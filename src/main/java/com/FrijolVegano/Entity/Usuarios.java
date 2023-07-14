package com.FrijolVegano.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table (name = "usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String admon;
	private String nombre;
	private String telefono;
	private String email;
	private String contrasenia;
	private String imagen_perfil;
	private String direccion;
	
	//Constructor
	public Usuarios(Long id, String admon, String nombre, String telefono, String email, String contrasenia,
			String imagen_perfil, String direccion) {
		this.id = id;
		this.admon = admon;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.contrasenia = contrasenia;
		this.imagen_perfil = imagen_perfil;
		this.direccion = direccion;
	}//Constructor Usuarios
	
	public Usuarios() {}//Constructor vacío
	
	//Getters y Setters	
	public Long getId() {
		return id;
	}

	public String isAdmon() {
		return admon;
	}

	public void setAdmon(String admon) {
		this.admon = admon;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getImagen_perfil() {
		return imagen_perfil;
	}

	public void setImagen_perfil(String imagen_perfil) {
		this.imagen_perfil = imagen_perfil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", admon=" + admon + ", nombre=" + nombre + ", telefono=" + telefono + ", email="
				+ email + ", contrasenia=" + contrasenia + ", imagen_perfil=" + imagen_perfil + ", direccion=" + direccion
				+ "]";
	}//toString
}//Usuarios
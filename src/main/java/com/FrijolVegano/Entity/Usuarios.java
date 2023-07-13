package com.FrijolVegano.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table (name = "usuario")
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private boolean admin;
	private String nombre;
	private String telefono;
	private String email;
	private String contrasenia;
	private String imagenPerfil;
	private String direccion;
	
	//Constructor
	public Usuarios(Long id, boolean admin, String nombre, String telefono, String email, String contrasenia,
			String imagenPerfil, String direccion) {
		this.id = id;
		this.admin = admin;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.contrasenia = contrasenia;
		this.imagenPerfil = imagenPerfil;
		this.direccion = direccion;
	}//Constructor Usuarios
	
	public Usuarios() {}//Constructor vacío
	
	//Getters y Setters	
	public Long getId() {
		return id;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
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

	public String getImagenPerfil() {
		return imagenPerfil;
	}

	public void setImagenPerfil(String imagenPerfil) {
		this.imagenPerfil = imagenPerfil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", admin=" + admin + ", nombre=" + nombre + ", telefono=" + telefono + ", email="
				+ email + ", contrasenia=" + contrasenia + ", imagenPerfil=" + imagenPerfil + ", direccion=" + direccion
				+ "]";
	}//toString
}//Usuarios
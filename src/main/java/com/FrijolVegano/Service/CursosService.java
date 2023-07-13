package com.FrijolVegano.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FrijolVegano.Entity.Cursos;
import com.FrijolVegano.Repository.CursosRepository;
@Service
public class CursosService {
	public final CursosRepository cursosRepository;
	@Autowired
	public CursosService(CursosRepository cursosRepository) {
		this.cursosRepository = cursosRepository;
	}
	
	//Los metodos para los cursos, deberian ser agregar, modificar y eliminar
	public List<Cursos> leerCursos(){
		return cursosRepository.findAll();
	}
}

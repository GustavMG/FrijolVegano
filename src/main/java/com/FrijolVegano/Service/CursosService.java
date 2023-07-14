package com.FrijolVegano.Service;

import java.util.List;
import java.util.Optional;

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
	
	//Metodo para leer un producto por su Id
	public Optional<Cursos> leerCursoPorID(Long id){
		return cursosRepository.findById(id);
	}
	
	//Metodo para crear un nuevo producto
	public Cursos crearCurso(Cursos cursos) {
		
		Cursos cursoTemporal = null;
		
		if(cursosRepository.buscarPorTitulo(cursos.getTitulo()).isEmpty()){
			cursoTemporal = cursosRepository.save(cursos);
		}
		return cursoTemporal;
	}//Crear Producto
	
	//Metodo para modificar un producto
	public Cursos actualizarCurso(Long id, String es_producto, String titulo, String categoria, String descripcion, Double precio,
			String detalles, String aprendizaje, String img_url, String video_url, Integer estrellas) {
		
		Cursos cursoTemporal = null;
		
		if(cursosRepository.existsById(id)) {
			cursoTemporal = cursosRepository.findById(id).get();
			if(es_producto != null)cursoTemporal.setEs_producto(es_producto);
			if(titulo != null)cursoTemporal.setTitulo(titulo);
			if(categoria != null)cursoTemporal.setCategoria(categoria);
			if(descripcion != null)cursoTemporal.setDescripcion(descripcion);
			if(precio != null)cursoTemporal.setPrecio(precio);
			if(detalles != null)cursoTemporal.setDetalles(detalles);
			if(aprendizaje != null)cursoTemporal.setAprendizaje(aprendizaje);
			if(img_url != null)cursoTemporal.setImg_url(img_url);
			if(video_url != null)cursoTemporal.setVideo_url(video_url);
			if(estrellas != null)cursoTemporal.setEstrellas(estrellas);
			cursosRepository.save(cursoTemporal);
		}
		return cursoTemporal;
	}
	
	//Metodo para borrar un producto
	public Cursos borrarCurso(Long id) {
		Cursos cursoTemporal = null;
		
		if(cursosRepository.existsById(id)) {
			cursoTemporal = cursosRepository.findById(id).get();
			cursosRepository.deleteById(id);
		}
		return cursoTemporal;
	}
	
	
	
	
	
	
	
	
}

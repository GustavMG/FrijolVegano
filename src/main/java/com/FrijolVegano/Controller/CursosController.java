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

import com.FrijolVegano.Entity.Cursos;
import com.FrijolVegano.Service.CursosService;

@RestController
@RequestMapping (path = "/frijolvegano/cursos")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.PUT })

public class CursosController {
	
	public final CursosService cursosService;
	
	@Autowired
	
	public CursosController(CursosService cursosService) {
		this.cursosService = cursosService;
	}
	
	//Metodos HTTP
	
	//GET
	@GetMapping 
	public List<Cursos> getTodosLosCursos(){
		return cursosService.leerCursos();
	}
	
	//Metodo GET para traer un producto por id
	@GetMapping (path = "{cursoId}")
	public Optional<Cursos> getCursos(@PathVariable("cursoId")Long id){
		return cursosService.leerCursoPorID(id);
	}
		
	//POST
	@PostMapping
	public Cursos postCurso(@RequestBody Cursos curso) {
		return cursosService.crearCurso(curso);
	}
		
	//PUT
	@PutMapping (path = "{cursoId}")
	public Cursos updateCurso(@PathVariable("cursoId")Long id, 
		@RequestParam(required = false) String es_producto,
		@RequestParam(required = false) String titulo,
		@RequestParam(required = false) String categoria,
		@RequestParam(required = false) String descripcion,
		@RequestParam(required = false) double precio,
		@RequestParam(required = false) String detalles,
		@RequestParam(required = false) String aprendizaje,
		@RequestParam(required = false) String img_url,
		@RequestParam(required = false) String video_url,
		@RequestParam(required = false) int estrellas) {
		
		return cursosService.actualizarCurso(id, es_producto, titulo, categoria, descripcion, precio, detalles, aprendizaje, img_url, video_url, estrellas);
	
	}
	
		
	//DELET
	@DeleteMapping (path = "{cursoId}")
	public Cursos deleteCursp(@PathVariable("cursoId")Long id) {
		return cursosService.borrarCurso(id);
	}

	
	
	
	
}

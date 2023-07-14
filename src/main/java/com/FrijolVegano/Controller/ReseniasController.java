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

import com.FrijolVegano.Entity.Resenias;
//
import com.FrijolVegano.Service.ReseniasService;

@RestController
@RequestMapping (path = "/frijolvegano/resenias")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.PUT })
public class ReseniasController {
	public final ReseniasService reseniasService;
	@Autowired
	public ReseniasController(ReseniasService reseniasService) {
		this.reseniasService = reseniasService;
	}
	
	//Metodos HTTP
	
	//GET
	//Traes todas las reseñas
	@GetMapping
	public List<Resenias> getResenias(){
		return reseniasService.leerResenias();
	}//getResenias
	
	//Traer una UNICA reseña (por su id existente)
	@GetMapping(path = "{idResenias}")
	public Optional<Resenias> getReseniasId(@PathVariable("idResenias") Long id) {
		return reseniasService.leerReseniasId(id);
	}//getReseniasId
		
	//POST
	//Crear una nueva reseña TODO: pendiente la implementación en el FRONT
	@PostMapping
	public Resenias postResenias(@RequestBody Resenias resenia) {
		return reseniasService.crearResenias(resenia);
	}//postResenia
		
	//PUT
	//Modificar datos de resenia(por su id existente)
	@PutMapping(path = "{idResenias}")
	public Resenias putResenias(@PathVariable("idResenias") Long id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) Integer estrellas,
			@RequestParam(required = false) String resenia) {
		return reseniasService.modificarResenias(id, nombre, estrellas, resenia);
	}//putResenias
		
	//DELET
	@DeleteMapping(path = "{idResenias}")
	public Resenias deletResenias(@PathVariable("idResenias") Long id) {
		return reseniasService.eliminarResenias(id);
	}//deletResenias

}

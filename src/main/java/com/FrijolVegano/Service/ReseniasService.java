package com.FrijolVegano.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FrijolVegano.Entity.Resenias;
import com.FrijolVegano.Repository.ReseniasRepository;
@Service
public class ReseniasService {
	public final ReseniasRepository reseniasRepository;
	@Autowired
	public ReseniasService(ReseniasRepository reseniasRepository) {
		this.reseniasRepository = reseniasRepository;
	}//Constructor
	
	//Las reseñas unicamente se requieren consultar, crear y tal vez eliminar
	//Leemos los datos de TODAS las reseñas(GET)
	public List<Resenias> leerResenias(){
		return reseniasRepository.findAll();
	}//leerResenias
	
	//Leemos los datos de una reseña en especifico(GET)
	public Optional<Resenias> leerReseniasId(Long id){
		return reseniasRepository.findById(id);
	}//leerReseniasId
	
	//Creamos nuevas reseñas(POST)
	public Resenias crearResenias(Resenias resenias) {
		Resenias reseniasTemp = null;
		
		if(reseniasRepository.buscarPorNombre(resenias.getNombre()).isEmpty()) {
			reseniasTemp = reseniasRepository.save(resenias);
		}
		return reseniasTemp;
	}//crearResenias
	
	//Modificamos parametros de la reseña (PUT) 
	//Solo la descripción se podrá modificar
	public Resenias modificarResenias(Long id, String nombre, Integer estrellas, String resenia) {
		Resenias reseniasTemp = null;
		if(reseniasRepository.existsById(id)) {
			reseniasTemp = reseniasRepository.findById(id).get();
			//Asignación de nuevos parámetros, NO TODOS se pueden modificar
			//Validación de NO datos en blanco ya que TODOS deben llenarse
			//Id NO se modifica
			//El nombre NO se puede modificar
			if(estrellas != null) reseniasTemp.setEstrellas(estrellas);
			if(resenia != null) reseniasTemp.setResenia(resenia);
			reseniasRepository.save(reseniasTemp);
		}
		return reseniasTemp;
	}//modificarReseias
	
	
	//Eliminamos resenias (DELET)
	public Resenias eliminarResenias(Long id) {
		Resenias reseniasTemp = null;
		if(reseniasRepository.existsById(id)) {
			reseniasTemp = reseniasRepository.findById(id).get(); 
			reseniasRepository.deleteById(id);
		}
		return reseniasTemp;
	}//eliminarResenias
}

package com.FrijolVegano.Service;

import java.util.List;

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
	}
	
	//Las reseñas unicamente se requieren consultar, crear y tal vez eliminar
	//Leemos los datos (GET)
	public List<Resenias> leerResenias(){
		return reseniasRepository.findAll();
	}
}

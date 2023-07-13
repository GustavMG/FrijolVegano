package com.FrijolVegano.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FrijolVegano.Entity.Carritos;
import com.FrijolVegano.Repository.CarritosRepository;
@Service
public class CarritosService {
	public final CarritosRepository carritosRepository;
	@Autowired
	public CarritosService(CarritosRepository carritosRepository) {
		this.carritosRepository = carritosRepository;
	}
	
	//Los metodos para el carrito de compras deberian ser agregar elementos al carrito, modificar y eliminar
	//Leemos los carritos guardados
	public List<Carritos> leerCarritos(){
		return carritosRepository.findAll();
	}
}

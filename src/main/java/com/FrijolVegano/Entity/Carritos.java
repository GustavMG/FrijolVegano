package com.FrijolVegano.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping (path = "/FrijolVegano/carritos")
@Entity
@Table (name = "producto")
public class Carritos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
/*	TODO: Hay que colocar los atributos restantes de la tabla, darle una ultima verificación antes de colocarlos
 *  Se requiere anexar el constructor ya con los parametros BIEN
 *  Se requeire generar los getters y los setters 
 */

}

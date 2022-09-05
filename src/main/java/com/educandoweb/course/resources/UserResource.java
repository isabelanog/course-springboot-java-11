package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Usuario;

@RestController //recurso web que eh implementado por um controlador REST
@RequestMapping(value = "/users") //nome do recurso
public class UserResource {
	
	// recurso para testar se a aplicação web tá funcionando.
	//recurso web correspondente a entidade User.
	
	@GetMapping
	public ResponseEntity<Usuario> findAll() {
		Usuario u = new Usuario(1L,"Maria","maria@gmail.com","9999999","123456");
				return ResponseEntity.ok().body(u);
	}
	
	
}

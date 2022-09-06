package com.educandoweb.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
	
}

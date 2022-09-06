package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Usuario;
import com.educandoweb.course.respositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	//classe de configuração espefícia para o perfil de teste
	// so vai rodar essa configuração quando vc estiver no perfil de teste
	//essa classe vai servir pra fazer o database seeding -> popular o banco de dados
	
	@Autowired //dependência
	private UsuarioRepository usuarioRepository; //classe que acessa os dados. declarei um atributo para fazer uma dependencia 

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//tudo que eu colocar dentro desse método vai ser executado quando a aplicação for iniciada
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
	
}

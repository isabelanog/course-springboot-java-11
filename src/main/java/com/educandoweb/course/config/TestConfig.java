package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.Usuario;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.respositories.CategoryRepository;
import com.educandoweb.course.respositories.OrderRepository;
import com.educandoweb.course.respositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	//classe de configuração espefícia para o perfil de teste
	// so vai rodar essa configuração quando vc estiver no perfil de teste
	//essa classe vai servir pra fazer o database seeding -> popular o banco de dados
	
	@Autowired //dependência
	private UsuarioRepository usuarioRepository; //classe que acessa os dados. declarei um atributo para fazer uma dependencia 
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//tudo que eu colocar dentro desse método vai ser executado quando a aplicação for iniciada
		
		//instanciando cada entidade:
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		
		//para salvar no banco de dados
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
	
	
	
	
}

package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User  implements Serializable {
	
	private static final long serialVersionUID = 1L; // tem que colocar a versao
	
	
	// usa-se o serializeble quando vc quer que os objetos (ex. User)
	// possam ser transformados em cadeia de bytes pra que o objeto trafegue
	//na rede, possa ser gravado em arquivo 
	
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
//	como eu estou usando framework, é obrigado colocar o construtor vazio
	public User() {
		
	}
//por conveniência
	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
	 
}

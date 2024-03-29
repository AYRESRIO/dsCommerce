package com.devsuperior.dscommerece.entities;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;


@Entity
@Table(name = "tb_role")
public class Role implements GrantedAuthority {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String authority;
	

	public Role() {

	}
	

	public Role(long id, String authority) {

		this.id = id;
		this.authority = authority;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}

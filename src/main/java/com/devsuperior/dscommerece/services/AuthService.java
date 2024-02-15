package com.devsuperior.dscommerece.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscommerece.entities.User;
import com.devsuperior.dscommerece.services.exceptions.ForbiddenException;

@Service
public class AuthService {

	@Autowired
	private UserService userService;
	
	public void validateSelfOrAdmin(long userId) {
		User me = userService.authenticated();
		if(!me.hasRole("ROLE_ADMIN") && !me.getId().equals(userId)) {
			throw new ForbiddenException("Access denied");
		}
	}
}
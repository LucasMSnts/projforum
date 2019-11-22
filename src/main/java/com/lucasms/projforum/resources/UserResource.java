package com.lucasms.projforum.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucasms.projforum.domain.User;
import com.lucasms.projforum.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	 
	@RequestMapping(method=RequestMethod.GET) // ou @GetMapping
	public ResponseEntity<List<User>> findAll() {		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
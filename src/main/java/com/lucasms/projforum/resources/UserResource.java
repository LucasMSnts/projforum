package com.lucasms.projforum.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucasms.projforum.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	 
	@RequestMapping(method=RequestMethod.GET) // ou @GetMapping
	public ResponseEntity<List<User>> findAll() {
		User mauro = new User("1","Mauro Santos","mauro@gmail.com");
		User alex = new User("2","Alex Silva","alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(mauro,alex));
		return ResponseEntity.ok().body(list);
	}
}

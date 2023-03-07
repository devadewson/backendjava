package Project1.ECOMERCE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import Project1.ECOMERCE.Service.UserService;
import Project1.ECOMERCE.model.User;

@RestController
@RequestMapping("api/project1/user")
@CrossOrigin
public class UserController {
	@Autowired
	UserService userservice;

	@GetMapping
	public List<User> findAll() {
		return userservice.findAll();

	}
	
	@PostMapping("/{username}") 
	public User getUserByusername(@PathVariable String username){
		
		return userservice.getUserByusername(username);
	}

	@PostMapping
	public String requser(@RequestBody User req) {

		return userservice.reqUser(req);

	}
	@PutMapping
	public String updUser(@RequestBody User req) {

		return userservice.updUser(req);
	}

	@DeleteMapping("{idUser}")
	public String delUser(@PathVariable String idUser) {
	return userservice.delUser(idUser);
	}
	
	@PostMapping("/matchPassword")
	public boolean isPasswordMatch(@RequestParam("username")String username,@RequestParam("pasword") String pasword) {
		return userservice.isPasswordMatch(username, pasword);
	}
	
}






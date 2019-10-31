package com.maaltijd.Maaltijden.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Component;
import com.maaltijd.Maaltijden.Controller.UserService;
import com.maaltijd.Maaltijden.Domain.User;

/*import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
*/

@RestController
public class UserEndpoint {
	@Autowired
	UserService userService;

	@GetMapping("/allUsers")
	public Iterable<User> geefUser() {
		return userService.findAll();
	}

	@PostMapping("/allUsers")
	public User nieuweUser(@RequestBody User user) {
		User toegevoegdeUser = userService.save(user);
		System.out.println("User "+ user.getUserfirstName() +" toegevoegd");
		return toegevoegdeUser;
	}

	@DeleteMapping("/user/{id}/delete")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.delete(id);
		System.out.println("Gebruiker verwijderd");
	}

	@PatchMapping("/user/{id}")
	public User updateUser(@RequestBody User user, @PathVariable Long id) {
		user.setUserID(id);
		User updateUser = userService.save(user);
		System.out.println("Gebruiker aangepast");
		return updateUser;
	}

}

package com.maaltijd.Maaltijden.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maaltijd.Maaltijden.Domain.User;

@Service
public class UserService {
	@Autowired
	
	private UserRepository userRepository; 
	
	
	public User save(User user) {
		return userRepository.save(user); 
	}
	
	
	public User findById(Long id) {
		return userRepository.findById(id).get(); 
	}
	
	public Iterable<User> findAll(){
		Iterable<User> result = userRepository.findAll(); 
		return result; 
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	
	
	
	

}

package com.maaltijd.Maaltijden.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maaltijd.Maaltijden.Domain.Sessie;

@Service
public class SessieService {
	@Autowired
	private SessieRepository sessieRepository; 
	
	
	public Sessie save(Sessie sessie) {
		return sessieRepository.save(sessie); 
	}
	
	public Sessie findById(Long id) {
		return sessieRepository.findById(id).get();
	}
	public Iterable<Sessie> findAll(){
		Iterable<Sessie> result = sessieRepository.findAll(); 
		return result; 
	}
	
	public void delete(Long id) {
		sessieRepository.deleteById(id);
	}
	
	

}

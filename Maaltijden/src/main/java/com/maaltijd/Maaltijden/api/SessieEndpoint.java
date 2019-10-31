package com.maaltijd.Maaltijden.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maaltijd.Maaltijden.Controller.SessieService;
import com.maaltijd.Maaltijden.Domain.Sessie;

@RestController
public class SessieEndpoint {
	
	@Autowired
	SessieService sessieService; 
	
	@GetMapping("/Sessies")
	public Iterable<Sessie> geefSessie(){
		return sessieService.findAll(); 
	}
	
	@PostMapping("/Sessies")
	public Sessie nieuweSessie(@RequestBody Sessie sessie) {
		Sessie toegevoegdeSessie = sessieService.save(sessie); 
		System.out.println(sessie.getBeschrijvingOefening() + " toegevoegd aan alle sessies ");
		return toegevoegdeSessie; 
	}
	
	@DeleteMapping("/sessie/{id}/delete")
	public void deleteSessie(@PathVariable("id") Long id) {
		sessieService.delete(id);
		System.out.println("Sessie verwijderd");
	}

}

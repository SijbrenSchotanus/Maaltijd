package com.maaltijd.Maaltijden.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sessie {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   
	   private long id; 
	   private int dag; 
	   private int calVerbrand;
	   private String beschrijvingOefening; 
	   
	   
	public String getBeschrijvingOefening() {
		return beschrijvingOefening;
	}
	public void setBeschrijvingOefening(String beschrijvingOefening) {
		this.beschrijvingOefening = beschrijvingOefening;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getDag() {
		return dag;
	}
	public void setDag(int dag) {
		this.dag = dag;
	}
	public int getCalVerbrand() {
		return calVerbrand;
	}
	public void setCalVerbrand(int calVerbrand) {
		this.calVerbrand = calVerbrand;
	} 
	   
	   

}

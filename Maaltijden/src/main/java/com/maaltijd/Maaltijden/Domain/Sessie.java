package com.maaltijd.Maaltijden.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sessie {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   
	   private long id; 
	   private int dag; 
	   private int calVerbrand;
	   private String beschrijvingOefening; 
	    private int jaar; 
	    private int maand; 
	    
	/*
	 * @ManyToOne() private User user;
	 * 
	 * 
	 * 
	 * 
	 * public User getUser() { return user; }
	 * 
	 * public void setUser(User user) { this.user = user; }
	 */

		public int getJaar() {
			return jaar;
		}

		public void setJaar(int jaar) {
			this.jaar = jaar;
		}

		public int getMaand() {
			return maand;
		}

		public void setMaand(int maand) {
			this.maand = maand;
		}
	   
	   
	   
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

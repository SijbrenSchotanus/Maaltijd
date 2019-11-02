package com.maaltijd.Maaltijden.Domain;


import javax.persistence.*;


@Entity
public class Maaltijd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int caloriesPerPortion;
    private int hoeveelheidInGrammen;
    private int dag; 
    private int jaar; 
    private int maand; 
    
    
    
    

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


    

    public int getDag() {
		return dag;
	}

	public void setDag(int dag) {
		this.dag = dag;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesPerPortion() {
        return caloriesPerPortion;
    }

    public void setCaloriesPerPortion(int caloriesPerPortion) {
        this.caloriesPerPortion = caloriesPerPortion;
    }

    public int getHoeveelheidInGrammen() {
        return hoeveelheidInGrammen;
    }

    public void setHoeveelheidInGrammen(int hoeveelheidInGrammen) {
        this.hoeveelheidInGrammen = hoeveelheidInGrammen;
    }
}

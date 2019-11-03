package com.maaltijd.Maaltijden.Domain;

import java.util.List;
import javax.persistence.*;

@Entity
//@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userID;
	private String userPW;
	private String userfirstName;
	private String userLastName;
	private double userWeight;
	private double userHeight;
	private int userAge;
	private String sex;

	/*
	 * @OneToMany(mappedBy = "user") private List<Maaltijd> maaltijd;
	 * 
	 * public List<Maaltijd> getMaaltijd() { return maaltijd; }
	 * 
	 * public void setMaaltijd(List<Maaltijd> maaltijd) { this.maaltijd = maaltijd;
	 * }
	 */

	/*
	 * @OneToMany(mappedBy = "user", fetch = FetchType.EAGER) private List<Sessie>
	 * sessie;
	 * 
	 * public List<Sessie> getSessie() { return sessie; }
	 * 
	 * 
	 * public void setSessie(List<Sessie> sessie) { this.sessie = sessie; }
	 */

	
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public String getUserfirstName() {
		return userfirstName;
	}

	public void setUserfirstName(String userfirstName) {
		this.userfirstName = userfirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public double getUserWeight() {
		return userWeight;
	}

	public void setUserWeight(double userWeight) {
		this.userWeight = userWeight;
	}

	public double getUserHeight() {
		return userHeight;
	}

	public void setUserHeight(double userHeight) {
		this.userHeight = userHeight;
	}

}

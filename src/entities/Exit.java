package entities;

import java.sql.Date;

public class Exit {

	// Atributos 
	public Integer id;
	public String posto;
	public String filia;
	public Date date;
	
	public Exit() {
		// TODO Auto-generated constructor stub
	}
	
	public Exit(Integer id, String posto, String filia, Date date) {
		this.id = id;
		this.posto = posto;
		this.filia = filia;
		this.date = date;
	}

	// Getters e Setters 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPosto() {
		return posto;
	}

	public void setPosto(String posto) {
		this.posto = posto;
	}

	public String getFilia() {
		return filia;
	}

	public void setFilia(String filia) {
		this.filia = filia;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
}

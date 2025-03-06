package modal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Exit implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	// Atributos 
	public Integer id;
	public String posto;
	public String filia;
	public Date date;
	
	public Exit() {
		
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exit other = (Exit) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Saída [id=" + id + ", posto=" + posto + ", filia=" + filia + ", date=" + date + "]";
	}
	
	
	
	
}

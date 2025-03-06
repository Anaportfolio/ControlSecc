package modal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Equipment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// Atributos
	public Integer id;
	public Integer cod_serial;
	public Date date;
	public String  modal;
	
	public Equipment() {
		
	}

	public Equipment(Integer id, Integer cod_serial, Date date, String modal) {
		this.id = id;
		this.cod_serial = cod_serial;
		this.date = date;
		this.modal = modal;
	}
	
	// Gettres e Setters 
	public Integer getId() {
		return id;
	}

	public Integer getCod_serial() {
		return cod_serial;
	}

	public void setCod_serial(Integer cod_serial) {
		this.cod_serial = cod_serial;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
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
		Equipment other = (Equipment) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Equipamento [id=" + id + ", cod_serial=" + cod_serial + ", date=" + date + ", modal=" + modal + "]";
	}

	
	
	

}

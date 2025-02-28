package entities;

import java.sql.Date;

public class Equipment {
	
	// Atributos
	public Integer id;
	public Integer cod_serial;
	public Date date;
	public String  modal;
	
	public Equipment() {
		// TODO Auto-generated constructor stub
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

	public void setId(Integer id) {
		this.id = id;
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
	public String toString() {
		return "Equipment [id=" + id + ", cod_serial=" + cod_serial + ", date=" + date + ", modal=" + modal + "]";
	}
	
	

}

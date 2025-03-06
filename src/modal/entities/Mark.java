package modal.entities;

import java.io.Serializable;
import java.util.Objects;

public class Mark implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// Atributos
	public String mark;
	public Integer id;
	
	public Mark() {
		
	}

	public Mark(String mark, Integer id) {
		this.mark = mark;
		this.id = id;
	}

	// Getters e Setters
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Integer getId() {
		return id;
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
		Mark other = (Mark) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Marca [mark=" + mark + ", id=" + id + "]";
	}
	
	
}

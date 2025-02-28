package entities;

public class Mark {

	// Atributos
	public String mark;
	public Integer id;
	
	public Mark() {
		// TODO Auto-generated constructor stub
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

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Mark [mark=" + mark + ", id=" + id + "]";
	}
	
	
	
}

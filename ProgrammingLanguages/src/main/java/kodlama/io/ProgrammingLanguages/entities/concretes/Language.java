package kodlama.io.ProgrammingLanguages.entities.concretes;

import javax.validation.constraints.NotNull;

public class Language {

	private int id;
	
	@NotNull(message = "Language Name is cannot be null")
	private String name;

	public Language() {
		// TODO Auto-generated constructor stub
	}

	public Language(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

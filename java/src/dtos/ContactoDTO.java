package src.dtos;

public class ContactoDTO {

	private String email;

	private Integer telefono;

	public ContactoDTO(String email, Integer telefono) {
		super();
		this.email = email;
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

}

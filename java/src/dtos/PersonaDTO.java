package src.dtos;

import java.util.Date;

public class PersonaDTO {

	private String nombreCompleto;

	private Date fechaNacimiento;

	private ContactoDTO contacto;

	private DomicilioDTO domicilio;

	private Genero genero;

	public PersonaDTO(String nombreCompleto, ContactoDTO contacto) {
		nombreCompleto(nombreCompleto).contacto(contacto);
	}

	public PersonaDTO contacto(ContactoDTO contacto) {
		this.contacto = contacto;
		return this;
	}

	public PersonaDTO domicilio(DomicilioDTO domicilio) {
		this.domicilio = domicilio;
		return this;
	}

	public PersonaDTO genero(Genero genero) {
		this.genero = genero;
		return this;
	}

	public PersonaDTO nombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
		return this;
	}

	public PersonaDTO fechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		return this;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public ContactoDTO getContacto() {
		return contacto;
	}

	public DomicilioDTO getDomicilio() {
		return domicilio;
	}

	public Genero getGenero() {
		return genero;
	}

}

package src.dtos;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PersonaDTOTest {
	
	private static String nombreCompleto = "Nombre Prueba";
	
	private static Date fechaNacimiento = new Date (1999,03,01);
	
	private DomicilioDTO domicilio = new DomicilioDTO("Avenida Peron", 2738);
	
	private ContactoDTO contacto = new ContactoDTO("email@test.com", 12312);
	
	private PersonaDTO persona = new PersonaDTO(nombreCompleto, contacto); 
	
	
	
	@Test
	public void testPersonaDTO() {
		assertNotNull(persona);
	}
	
	@Test
	public void testGetNombreCompleto() {
		assertEquals(nombreCompleto, persona.getNombreCompleto());
	}
	
	@Test
	public void testGetContacto() {
		persona.contacto(contacto);
		assertEquals(contacto, persona.getContacto());
	}	
	
	@Test
	public void testGetDomicilio() {
		persona.domicilio(domicilio);
		assertEquals(domicilio, persona.getDomicilio());
	}
	
	@Test
	public void testGetGenero() {
		persona.genero(Genero.HOMBRE);
		assertEquals(Genero.HOMBRE, persona.getGenero());
	}
	
	@Test
	public void testGetFechaNacimiento() {
		persona.fechaNacimiento(fechaNacimiento);
		assertEquals(fechaNacimiento, persona.getFechaNacimiento());
	}
	
	

}

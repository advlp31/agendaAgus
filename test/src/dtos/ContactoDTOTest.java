package src.dtos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactoDTOTest {

	private static final String EMAIL = "test@mail.com";

	private ContactoDTO dto = new ContactoDTO(EMAIL, 441122);

	@Test
	public void testContactoDTO() {
		assertNotNull(dto);
	}

	@Test
	public void testGetEmail() {
		assertNotNull(dto.getEmail());
	}

	@Test
	public void testGetEmailNotFails() {
		assertEquals(dto.getEmail(), EMAIL);
	}

	@Test
	public void testGetTelefono() {
		assertNotNull(dto.getTelefono());
	}

}

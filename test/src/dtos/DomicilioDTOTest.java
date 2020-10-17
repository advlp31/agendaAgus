package src.dtos;

import static org.junit.Assert.*;

import org.junit.Test;

public class DomicilioDTOTest {
	
	//CONSTANTES EN MAYUS
	private static final String CALLE = "Test Calle";
	
	private static final Integer TELEFONO = 111234;
	
	private DomicilioDTO domicilio = makeDomicilioDTO();
	
	private DomicilioDTO makeDomicilioDTO() {
		DomicilioDTO domicilio = new DomicilioDTO(CALLE, TELEFONO)
				.codigoPostal(1155)
				.piso(2)
				.departamento("1-B");		
		return domicilio;
	}
	
	@Test
	public void test() {
		assertNotNull(domicilio);
	}

}

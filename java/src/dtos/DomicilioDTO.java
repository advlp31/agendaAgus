package src.dtos;

public class DomicilioDTO {

	private String calle;

	private Integer altura;

	private Integer piso;

	private String departamento;

	private Integer codigoPostal;

	public DomicilioDTO(String calle, Integer altura) {
		calle(calle).altura(altura);
	}

	public DomicilioDTO calle(String calle) {
		this.calle = calle;
		return this;
	}

	public DomicilioDTO altura(Integer altura) {
		this.altura = altura;
		return this;
	}

	public DomicilioDTO piso(Integer piso) {
		this.piso = piso;
		return this;
	}

	public DomicilioDTO departamento(String departamento) {
		this.departamento = departamento;
		return this;
	}

	public DomicilioDTO codigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
		return this;
	}

	public String getCalle() {
		return calle;
	}

	public Integer getAltura() {
		return altura;
	}

	public Integer getPiso() {
		return piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

}

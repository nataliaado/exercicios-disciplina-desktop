package exercicio2.a.revisao;

public class Endereco {

	private String rua;
	private String cep;
	private String estado;
	private String cidade;

	public Endereco() {
		super();
	}

	public Endereco(String rua, String cep, String estado, String cidade) {
		super();
		this.rua = rua;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}

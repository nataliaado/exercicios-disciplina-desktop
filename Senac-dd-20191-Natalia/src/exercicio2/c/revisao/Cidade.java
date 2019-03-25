package exercicio2.c.revisao;

public class Cidade {

	private String nome;
	private String cep;
	private String uf;

	public Cidade() {
		super();
	}

	public Cidade(String nome, String cep, String uf) {
		super();
		this.nome = nome;
		this.cep = cep;
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}

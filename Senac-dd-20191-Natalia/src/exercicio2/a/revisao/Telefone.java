package exercicio2.a.revisao;

public class Telefone {

	private String ddd;
	private String numeroDoTelefone;

	public Telefone() {
		super();
	}

	public Telefone(String ddd, String numeroDoTelefone) {
		super();
		this.ddd = ddd;
		this.numeroDoTelefone = numeroDoTelefone;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumeroDoTelefone() {
		return numeroDoTelefone;
	}

	public void setNumeroDoTelefone(String numeroDoTelefone) {
		this.numeroDoTelefone = numeroDoTelefone;
	}

}

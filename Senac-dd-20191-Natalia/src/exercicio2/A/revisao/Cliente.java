package exercicio2.A.revisao;

public class Cliente extends Pessoa {

	private Endereco endereco;
	private Telefone[] telefone;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf) {
		super(nome, cpf);
	}

	public Cliente(Endereco endereco, Telefone[] telefone) {
		super();
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone[] getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}

}
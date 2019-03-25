package exercicio2.a.revisao;

public class Cliente extends Pessoa {

	private Endereco endereco;
	private Telefone[] telefones;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf) {
		super(nome, cpf);
	}

	public Cliente(Endereco endereco, Telefone[] telefones) {
		super();
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

}
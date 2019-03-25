package exercicio2.c.revisao;

public class PessoaFisica extends Cliente {

	private String cpf;
	private char sexo;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String dataNascimento, Cidade cidade, Double saldo) {
		super(nome, dataNascimento, cidade, saldo);
	}

	public PessoaFisica(String cpf, char sexo) {
		super();
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public Double getSaldo() {
		return getSaldo();
	}

}

package exercicio2.C.revisao;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String dataNascimento, Cidade cidade, Double saldo) {
		super(nome, dataNascimento, cidade, saldo);
	}

	public PessoaJuridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public Double getSaldo() {
		return getSaldo();
	}

}

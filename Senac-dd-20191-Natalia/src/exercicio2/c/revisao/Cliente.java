package exercicio2.c.revisao;

public class Cliente {

	private String nome;
	private String dataNascimento;
	private Cidade cidade;
	private Double saldo;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String dataNascimento, Cidade cidade, Double saldo) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}

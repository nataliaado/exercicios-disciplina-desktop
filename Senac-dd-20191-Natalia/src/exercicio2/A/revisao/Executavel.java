package exercicio2.A.revisao;

public class Executavel {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco();
		endereco1.setRua("Rua Conselheiro Mafra");
		endereco1.setCep("880801-02");
		endereco1.setCidade("Florianópolis");
		endereco1.setEstado("Santa Catarina");
		
		Telefone telefone1 = new Telefone();
		telefone1.setDdd(48);
		telefone1.setNumeroDoTelefone(32984019);
		
		Telefone telefone2 = new Telefone();
		telefone2.setDdd(21);
		telefone2.setNumeroDoTelefone(32984010);
		
		Telefone[] telefones = {telefone1, telefone2};
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("João");
		cliente1.setCpf("284938490-10");
		cliente1.setEndereco(endereco1);
		cliente1.setTelefone(telefones);

		System.out.println("Dados do Endereço do cliente: ");
		System.out.println("Cep: " + endereco1.getCep());
		System.out.println("Cidade: " + endereco1.getCidade());
		System.out.println("Estado: " + endereco1.getEstado());
		System.out.println("Rua: " + endereco1.getRua());
		
		System.out.println("Dados do Telefone do cliente: ");
		System.out.println("DDD: " + telefone1.getDdd());
		System.out.println("Telefone: " + telefone1.getNumeroDoTelefone());
		System.out.println("DDD: " + telefone2.getDdd());
		System.out.println("Telefone: " + telefone2.getNumeroDoTelefone());

		System.out.println("Dados do cliente: ");
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Cpf: " + cliente1.getCpf());

	}

}

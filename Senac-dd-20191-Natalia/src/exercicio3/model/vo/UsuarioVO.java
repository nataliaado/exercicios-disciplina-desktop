package exercicio3.model.vo;

public class UsuarioVO {

	private int id;
	private String nome;
	private String email;
	private String senha;
	private NivelVO nivelVO;

	public UsuarioVO() {
		super();
	}

	public UsuarioVO(int id, String nome, String email, String senha, NivelVO nivelVO) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.nivelVO = nivelVO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public NivelVO getNivelVO() {
		return nivelVO;
	}

	public void setNivelVO(NivelVO nivelVO) {
		this.nivelVO = nivelVO;
	}
}
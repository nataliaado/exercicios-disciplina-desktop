package exercicio3.model.vo;

public class NivelVO {

	private int id;
	private String descricao;
	private boolean flagAtivo;

	public NivelVO() {
		super();
	}

	public NivelVO(int id, String descricao, boolean flagAtivo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.flagAtivo = flagAtivo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFlagAtivo() {
		return flagAtivo;
	}

	public void setFlagAtivo(boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

}

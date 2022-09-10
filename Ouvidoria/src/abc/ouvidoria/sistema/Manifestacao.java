package abc.ouvidoria.sistema;

public class Manifestacao {
	private int idmanifestacao;
	private String titulo;
	private String descricao;
	private String tipo;
	private String situacao;
	
	public Manifestacao(int idmanifestacao, String titulo, String descricao, String tipo, String situacao) {
		this.idmanifestacao = idmanifestacao;
		this.titulo = titulo;
		this.descricao = descricao;
		this.tipo = tipo;
		this.situacao = situacao;

	}


	public int getIdmanifestacao() {
		return idmanifestacao;
	}
	
	
	public void setIdmanifestacao(int idmanifestacao) {
		this.idmanifestacao = idmanifestacao;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getSituacao() {
		return situacao;
	}
	
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	

	@Override
	public String toString() {
		return "ID da Manifestacao = " + idmanifestacao + ", Titulo = " + titulo + ", Descricao = " + descricao
				+ ", Tipo = " + tipo + ", Situacao = " + situacao + "";
	}
	
	
	
}


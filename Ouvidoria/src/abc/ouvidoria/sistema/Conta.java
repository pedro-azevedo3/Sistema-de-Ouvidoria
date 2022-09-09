package abc.ouvidoria.sistema;

public class Conta {
	private String nome;
	private String login;
	private String senha;
	private String idUsuario;
	
	public Conta(String nome, String login, String senha, String idUsuario) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.idUsuario = idUsuario;
	}



	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getLogin() {
		return login;
	}
	
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	
	public String getSenha() {
		return senha;
	}
	
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public String getIdUsuario() {
		return idUsuario;
	}
	
	
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}



	@Override
	public String toString() {
		return "Nome = " + nome + ", Login = " + login + ", Senha = " + senha + ", ID-Usuario = " + idUsuario + "]";
	}
	
	
	
	
}




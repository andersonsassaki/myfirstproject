package br.com.constran.treinamentos.jdbc.modelo;

public class Usuario {
	private int id;
	private String login;
	private String nome;
	private String senha;
	private String grupoUsuario;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getGrupoUsuario() {
		return grupoUsuario;
	}
	
	public void setGrupoUsuario(String grupoUsuario) {
		this.grupoUsuario = grupoUsuario;
	}
	
	
}

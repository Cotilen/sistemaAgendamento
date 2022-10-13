package br.senai.sp.jandira.model;

public class Especialidade {
	
	private String nome;
	private String descricao;
	private static int quantidade;
	
	public Especialidade() {
		quantidade++;
	}
	
	// Métodos de acesso getters and setters
	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
		
}

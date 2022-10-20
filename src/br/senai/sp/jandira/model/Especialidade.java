package br.senai.sp.jandira.model;

public class Especialidade {

    private Integer codigo;
    private String nome;
    private String descricao;
    private static int quantidade = 100;

    // Métodos Construtotres
    public Especialidade() {
        quantidade++;
    }

    public Especialidade(String nome) {
        this.nome = nome;
        atualizarCodigo();
      
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();
      
    }

    private void atualizarCodigo() {
        this.codigo = quantidade;
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

    public Integer getCodigo() {
        return codigo;
    }
}

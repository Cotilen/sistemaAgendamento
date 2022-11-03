package br.senai.sp.jandira.model;

public class Especialidade {

    private static int quantidade = 99;
    private Integer codigo;
    private String nome;
    private String descricao;

    // Métodos Construtotres
    public Especialidade() {
        atualizarCodigo();
    }

    public Especialidade(String nome) {
        this.nome = nome;
        atualizarCodigo();

    }

    public Especialidade(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = this.codigo;

    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();

    }

    private void atualizarCodigo() {
        quantidade++;
        this.codigo = quantidade;

    }

    public String getEspecialidadeSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.nome + ";" + this.descricao;
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

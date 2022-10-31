package br.senai.sp.jandira.model;

public class PlanoDeSaude {

    private static int contador = 100;
    private Integer codigo;
    private String operadora;
    private String tipoDoPlano;

    // Construtores da classe
    
    public PlanoDeSaude(int codigo, String operadora, String tipoDoPlano) {
        this.codigo = codigo;
        this.operadora = operadora;
        this.tipoDoPlano = tipoDoPlano;
        contador++;
    }

    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        atualizarCodigo();
    }

    public PlanoDeSaude(String operadora, String tipoDoPlano) {
        this.operadora = operadora;
        this.tipoDoPlano = tipoDoPlano;
        atualizarCodigo();
    }

    public PlanoDeSaude() {
        atualizarCodigo();
    }

    public String getPlanoDeSaudeSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.operadora + ";" + this.tipoDoPlano;
    }

    private void atualizarCodigo() {
        this.codigo = contador;
        contador++;
    }

    // Métodos de acesso
    public Integer getCodigo() {
        return codigo;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getOperadora() {
        return this.operadora;
    }

    public void setTipoDoPlano(String tipoDoPlano) {
        this.tipoDoPlano = tipoDoPlano;
    }

    public String getTipoDoPlano() {
        return this.tipoDoPlano;
    }

    public String getDadosDoPlano() {
        return "Plano: " + this.operadora + ", " + this.tipoDoPlano;
    }

    public static int getContador() {
        return contador;
    }

}

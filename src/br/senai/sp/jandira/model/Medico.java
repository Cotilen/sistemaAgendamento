package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private static int contador = 999;
    private Integer codigo;
    private String crm;
    private ArrayList<Especialidade> especialidades;

    //Metodos construtores
    public Medico(){
        atualizarCodigo();
    }
    
    public Medico(String nome){
        super.setNome(nome);
        atualizarCodigo();
    }
    
    public Medico(String crm, String nome){
        super();setNome(nome);
        this.crm = crm;
        atualizarCodigo();
    }
    
    public Medico(int codigo, String crm, String nome){
        this.codigo = codigo;
        this.crm = crm;
        super.setNome(nome);
        this.contador = this.codigo;
    }
    
    public String getMedicoSeparadoporPontoEVirgula(){
        return this.codigo + ";" + this.crm + ";" +  super.getNome() ;
    }
    
 
    //Metodos de Getters e Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Medico.contador = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    

    //Metodos de acesso
    
     private void atualizarCodigo() {
        contador++;
        this.codigo = contador;

    }
}

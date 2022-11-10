package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    
     public Medico(int codigo, String crm, String nome,String telefone){
        this.codigo = codigo;
        this.crm = crm;
        super.setNome(nome);
        super.setTelefone(telefone);
        this.contador = this.codigo;
    }
     
     public Medico(int codigo, String crm, String nome,String telefone,String email,LocalDate dataNascimento, ArrayList especialidades){
        this.codigo = codigo;
        this.crm = crm;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
         setDataNascimento(dataNascimento);
        this.especialidades = especialidades;
        this.contador = this.codigo;
    }
    
    public String getMedicoSeparadoporPontoEVirgula(){
        return this.codigo + ";" + this.crm + ";" +  getNome() + ";" + getTelefone() + ";" + getEmail() + ";" + getEmail() + ";" + getDataNascimento() + ";" + this.especialidades ;
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

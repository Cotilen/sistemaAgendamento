package br.senai.sp.jandira.model;

public class Paciente extends Pessoa {

    private String tipoSanguineo;
    private PlanoDeSaude planoDeSaude;

    // Métodos de acesso
    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

}

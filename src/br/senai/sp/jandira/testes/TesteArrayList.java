package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) { // arguments
		
            
            
            
            
            
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		planos.add(plano1);
		planos.add(plano3);
		
		int i = 0;
		
		while (i < planos.size()) {
			System.out.println(planos.get(i).getOperadora());
			i++;
		}
		
		System.out.println("Saiu do looping!!");
		
		// Looping FOR
//		for(contador;condição;acumulador) {
//			
//		}
		System.out.println("------------ UTILIZANDO FOR -----------------");
		for(int contador = 0; contador < planos.size(); contador++) {
			System.out.println(planos.get(contador).getOperadora());
		}
		
		System.out.println("------------- FOR EACH - PARA CADA ----------------------");
		// Iteração em listas - ArrayList<>
		for(PlanoDeSaude plano : planos) {
			System.out.println(plano.getOperadora());
		}
		
		// Criar 3 especialidades, guardar as especialidades em um arraylist
		// e exibir o nome das especialides usando for each
		
		Especialidade e1 = new Especialidade();
		e1.setNome("Cardiologia");
		e1.setDescricao("Cuida do coração.");
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Otorrino");
		e2.setDescricao("Cuida do ouvido.");
		
		Especialidade e3 = new Especialidade();
		e3.setNome("Fisioterapia");
		e3.setDescricao("Cuida dos ossos e músculos.");
		
		Especialidade teste = new Especialidade();
		
		e1.getQuantidade();
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		
		for(Especialidade e : especialidades) {
			System.out.printf("%s --> %s\n", e.getNome(), e.getDescricao());
		}
		
		System.out.println(EspecialidadeDAO.ListarTodasEspecialidades());
		
		
	}
        
       
}

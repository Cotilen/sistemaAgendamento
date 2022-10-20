package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDao {

    public static void main(String[] args) {

//        String[] linha0 = {"Cotia", "Itapevi", "Jandira"};
//        String[] linha1 = {"Barueri", "Carapicuíba", "Pirapora"};
//        String[] linha2 = {"Osasco", "Itu", "Valinhos"};
//        String[] linha3 = {"Presidente Prudente", "São Roque", "Pindamonhangaba"};
//
//        String[][] linhas = {linha0, linha1, linha2, linha3};
//
//        System.out.println(linhas[2][2]);
//
//        String[][][] frutas = {
//            {
//                {"a", "b", "c", "cc"},
//                {"d", "e", "f", "ff"},
//                {"d", "e", "f", "ff"},
//                {"d", "e", "f", "ff"}
//            },
//            {
//                {"g", "h", "i"},
//                {"j", "kyyyy", "l"}
//            },
//            {
//                {"m", "n", "o"},
//                {"p", "q", "r"}
//            }
//        };
//        System.out.println(frutas[1][1][1]);
        //System.out.println(frutas[0][1]);
        // System.out.println(frutas[2][2]);
//        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
//        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
//        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
//        PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
//        PlanoDeSaude plano5 = new PlanoDeSaude();
//
//        System.out.println(PlanoDeSaude.getContador());
//
//        System.out.println(plano1.getCodigo());
//        System.out.println(plano5.getCodigo());
//
//        PlanoDeSaudeDAO.gravar(plano1);
//        PlanoDeSaudeDAO.gravar(plano2);
//        PlanoDeSaudeDAO.gravar(plano3);
//        PlanoDeSaudeDAO.gravar(plano4);
//        PlanoDeSaudeDAO.gravar(plano5);
//
//        System.out.println("---------------------------------------");
//        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
//            System.out.println("Código: " + p.getCodigo());
//            System.out.println("Operadora: " + p.getOperadora());
//            System.out.println("-------------------------");
//
//        }
        // TEste excluir plano de saude
//        PlanoDeSaudeDAO.excluir(101);
//
//        System.out.println("---------------Após Exclusão--------------------");
//        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
//            System.out.println("Código: " + p.getCodigo());
//            System.out.println("Operadora: " + p.getOperadora());
//            System.out.println("-------------------------");
//
//        }
        //Testar o metodo GetPlanoDeSaude do Dao
//        PlanoDeSaude p = PlanoDeSaudeDAO.getPlanoDeSaude(102);
//
//        System.out.println("Código: " + p.getCodigo());
//        System.out.println("Operadora: " + p.getOperadora());
//        
//        int i = PlanoDeSaudeDAO.listarTodos().indexOf(plano5);
//        
//        System.out.println(i);
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		for(PlanoDeSaude plano : dao.listarTodos()) {
//			System.out.println(plano.getOperadora());
//		}
//		
//		PlanoDeSaudeDAO dao2 = new PlanoDeSaudeDAO();
//		dao2.gravar(plano3);
//		dao2.gravar(plano4);
//		
//		PlanoDeSaudeDAO x = new PlanoDeSaudeDAO();
//		
//		System.out.println("--------------------------------");
//		for(PlanoDeSaude plano : x.listarTodos()) {
//			System.out.println(plano.getOperadora());
//		}
//		
        // Criação de especialidades
        Especialidade especialidade1 = new Especialidade("Odontologia", "Área da saúde humana que estuda e trata do sistema estomatognático - "
                + "compreende o crânio, a face, pescoço e cavidade bucal, abrangendo ossos, musculatura mastigatória, articulações, dentes e tecidos");
        Especialidade especialidade2 = new Especialidade("Pediatria");
        Especialidade especialidade3 = new Especialidade("Cardiologia",
                "Área da medicina que estuda e trata das doenças que acometem o coração");
        Especialidade especialidade4 = new Especialidade("Ortopedia",
                "Área da medicina que estuda e trata da saúde que atigem os aprelhos locomotores, como os ossos, ligamentos, músculos e articulações");

        // Teste gravar Especialidades
        EspecialidadeDAO.gravar(especialidade1);
        EspecialidadeDAO.gravar(especialidade2);
        EspecialidadeDAO.gravar(especialidade3);
        EspecialidadeDAO.gravar(especialidade4);

//        System.out.println(especialidade1.getCodigo());
//        System.out.println(especialidade1.getNome());
//        System.out.println(especialidade1.getDescricao());
//        System.out.println(especialidade1.getQuantidade());

        for (Especialidade e : EspecialidadeDAO.listarTodos()) {
            System.out.println("Código: " + e.getCodigo());
            System.out.println("Operadora: " + e.getNome());
            System.out.println("-------------------------");
        }
        
        
        // Teste Excluir Epecialidade
        EspecialidadeDAO.excluir(100);

        System.out.println("---------------Após Exclusão--------------------");
        for (Especialidade e : EspecialidadeDAO.listarTodos()) {
            System.out.println("Código: " + e.getCodigo());
            System.out.println("Operadora: " + e.getNome());
            System.out.println("-------------------------");
        }
    }

}

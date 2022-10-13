package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDao {

    public static void main(String[] args) {

        String[] linha0 = {"Cotia", "Itapevi", "Jandira"};
        String[] linha1 = {"Barueri", "Carapicuíba", "Pirapora"};
        String[] linha2 = {"Osasco", "Itu", "Valinhos"};
        String[] linha3 = {"Presidente Prudente", "São Roque", "Pindamonhangaba"};

        String[][] linhas = {linha0, linha1, linha2, linha3};

        System.out.println(linhas[2][2]);

        String[][][] frutas = {
            {
                {"a", "b", "c", "cc"},
                {"d", "e", "f", "ff"},
                {"d", "e", "f", "ff"},
                {"d", "e", "f", "ff"}
            },
            {
                {"g", "h", "i"},
                {"j", "kyyyy", "l"}
            },
            {
                {"m", "n", "o"},
                {"p", "q", "r"}
            }
        };

        System.out.println(frutas[1][1][1]);
        //System.out.println(frutas[0][1]);
        // System.out.println(frutas[2][2]);

        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
        PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
        PlanoDeSaude plano5 = new PlanoDeSaude();

        System.out.println(PlanoDeSaude.getContador());

        System.out.println(plano1.getCodigo());
        System.out.println(plano5.getCodigo());

        PlanoDeSaudeDAO.gravar(plano1);
        PlanoDeSaudeDAO.gravar(plano2);
        PlanoDeSaudeDAO.gravar(plano3);
        PlanoDeSaudeDAO.gravar(plano4);
        PlanoDeSaudeDAO.gravar(plano5);

        System.out.println("---------------------------------------");
        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Operadora: " + p.getOperadora());
            System.out.println("-------------------------");

        }

        PlanoDeSaudeDAO.excluir(101);

        System.out.println("---------------Após Exclusão--------------------");
        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Operadora: " + p.getOperadora());
            System.out.println("-------------------------");
            
        }
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
        }

    }

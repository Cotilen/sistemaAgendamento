package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    // Métodos construtores
    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }

    public EspecialidadeDAO() {

    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;

            }

        }
        return null;
    }

    public static boolean excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                return true;
            }
        }
        return false;
    }

    public static void editar(Especialidade especialidade) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidade);   
            break;
            }
        }

    }
    
    public static void criarEspecialidadesTeste(){
        Especialidade especialidade1 = new Especialidade("Odontologia", "Área da saúde humana que estuda e trata do sistema estomatognático - "
                + "compreende o crânio, a face, pescoço e cavidade bucal, abrangendo ossos, musculatura mastigatória, articulações, dentes e tecidos");
        Especialidade especialidade2 = new Especialidade("Pediatria");
        Especialidade especialidade3 = new Especialidade("Cardiologia",
                "Área da medicina que estuda e trata das doenças que acometem o coração");
        Especialidade especialidade4 = new Especialidade("Ortopedia",
                "Área da medicina que estuda e trata da saúde que atigem os aprelhos locomotores, como os ossos, ligamentos, músculos e articulações");

        EspecialidadeDAO.gravar(especialidade1);
        EspecialidadeDAO.gravar(especialidade2);
        EspecialidadeDAO.gravar(especialidade3);
        EspecialidadeDAO.gravar(especialidade4);
    }
    
     public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[especialidades.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }

        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "Nome da especialidade", "Descrição"};

        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }
}

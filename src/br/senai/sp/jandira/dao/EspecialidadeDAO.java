package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EspecialidadeDAO {

    private final static String CAMINHO = "C:\\Users\\22282081\\Documents\\NetBeansProjects\\projeto\\02-2022-ds1m-b\\src\\br\\senai\\sp\\jandira\\arquivos\\especialidade.txt";
    private static Path PATH = Paths.get(CAMINHO);
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

        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            bw.write(especialidade.getEspecialidadeSeparadoPorPontoEVirgula());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
          JOptionPane.showMessageDialog(
                  null, 
                  "Ocorreu um erro ao gravar", 
                  "Erro ao gravar",
                  JOptionPane.ERROR_MESSAGE);
        }
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

    public static void criarEspecialidadesTeste() {

   try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = "";

            // ler uma linha do arquivo e armazenar na variavel linha
            linha = br.readLine();

            while (linha != null) {

                String[] linhaVetor = linha.split(";");
                Especialidade e = new Especialidade(Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2]);
                especialidades.add(e);
                linha = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O arquivo não existe");

        }
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

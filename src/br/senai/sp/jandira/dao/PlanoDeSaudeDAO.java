package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private final static String ARQUIVO = "C:\\Users\\22282081\\Documents\\NetBeansProjects\\projeto\\02-2022-ds1m-b\\src\\br\\senai\\sp\\jandira\\arquivos\\planoDeSaude";
    private final static String ARQUIVO_TEMP = "C:\\Users\\22282081\\Documents\\NetBeansProjects\\projeto\\02-2022-ds1m-b\\src\\br\\senai\\sp\\jandira\\arquivos\\planoDeSaude_temp";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);
    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bw.write(planoDeSaude.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }

        planos.add(planoDeSaude);
    }

    public static boolean excluir(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                planos.remove(p);
                break;
            }
        }

        atualizarArquivo();

        return false;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                return p;

            }

        }

        return null;
    }

    public static void editar(PlanoDeSaude planoDeSaude) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
                planos.set(planos.indexOf(p), planoDeSaude);
                break;
            }
        }

        atualizarArquivo();

    }

    private static void atualizarArquivo() {
        //Reconstruir um arquivo atualizado
        //sem o plano que foi removido
        //Passo 1 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            //Criar o arquivo temporario
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporario para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar na liosta para adicionar os planos no arquivo temporario
            for (PlanoDeSaude p : planos) {
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
                bwTemp.newLine();

            }
            //Fechar o arquivo temporario
            bwTemp.close();

            //Excluir arquivo atual - planoDeSaude
            arquivoAtual.delete();

            //Renomear o arquivo temporario
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao criar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    public static void criarListaPlanoDeSaude() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = "";

            // ler uma linha do arquivo e armazenar na variavel linha
            linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                PlanoDeSaude p = new PlanoDeSaude(Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2]);
                planos.add(p);
                linha = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O arquivo planoDeSaude não existe");

        }

    }

    public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "Nome da operadora", "Tipo do plano"};

        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}

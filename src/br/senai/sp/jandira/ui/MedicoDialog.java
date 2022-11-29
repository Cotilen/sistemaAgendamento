package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;
    private DefaultListModel<String> listaTodasEspecialidadesModel = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesSelecionadas = EspecialidadeDAO.listarTodos();
    private DefaultListModel<String> especialidadesMedicoModel = new DefaultListModel<>();
    private ArrayList<String> especialidadesMedico = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesSelecionadasMedico = new ArrayList<>();

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        carregarEspecalidades();

        // Preencher os campos caso o tipo de operação for alterar
        if (tipoOperacao == TipoOperacao.EDITAR) {
            preencherFormulario();
            carregarEspecalidades();
        }
    }

    private void preencherFormulario() {

        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png")));
        labelTitulo.setText("Médico - " + tipoOperacao);
        textCodigo.setText(medico.getCodigo().toString());
        textCrm.setText(medico.getCrm());
        textNomeMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
        textEmail.setText(medico.getEmail());
        textDataNascimento.setText(medico.getDataNascimentoComBarra());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adicionarMedicoPanel = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textCrm = new javax.swing.JTextField();
        textNomeMedico = new javax.swing.JTextField();
        textCodigo = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        scrollListaEspecialidadeMedico = new javax.swing.JScrollPane();
        listEspecialidadeMedico = new javax.swing.JList<>();
        scrollListaEspecialidade = new javax.swing.JScrollPane();
        listEspecialidade = new javax.swing.JList<>();
        buttonRemoverEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();
        buttonCancelar1 = new javax.swing.JButton();
        buttonSalvar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textDataNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        adicionarMedicoPanel.setBackground(new java.awt.Color(51, 51, 51));
        adicionarMedicoPanel.setForeground(new java.awt.Color(51, 51, 51));
        adicionarMedicoPanel.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 204, 0));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("Médicos - NOVO");
        adicionarMedicoPanel.add(labelTitulo);
        labelTitulo.setBounds(50, 10, 300, 70);

        getContentPane().add(adicionarMedicoPanel);
        adicionarMedicoPanel.setBounds(0, 0, 760, 100);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) Médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 2, 14), new java.awt.Color(255, 204, 102))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);
        jPanel1.add(textCrm);
        textCrm.setBounds(160, 55, 110, 22);
        jPanel1.add(textNomeMedico);
        textNomeMedico.setBounds(290, 55, 430, 22);

        textCodigo.setEditable(false);
        jPanel1.add(textCodigo);
        textCodigo.setBounds(40, 55, 100, 22);
        jPanel1.add(textTelefone);
        textTelefone.setBounds(40, 120, 100, 22);
        jPanel1.add(textEmail);
        textEmail.setBounds(160, 120, 390, 22);

        scrollListaEspecialidadeMedico.setViewportView(listEspecialidadeMedico);

        jPanel1.add(scrollListaEspecialidadeMedico);
        scrollListaEspecialidadeMedico.setBounds(330, 200, 170, 190);

        scrollListaEspecialidade.setViewportView(listEspecialidade);

        jPanel1.add(scrollListaEspecialidade);
        scrollListaEspecialidade.setBounds(40, 200, 170, 190);

        buttonRemoverEspecialidade.setBackground(new java.awt.Color(255, 0, 0));
        buttonRemoverEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonRemoverEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverEspecialidadeActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRemoverEspecialidade);
        buttonRemoverEspecialidade.setBounds(235, 310, 70, 50);

        buttonAdicionarEspecialidade.setBackground(new java.awt.Color(102, 255, 0));
        buttonAdicionarEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(235, 225, 70, 50);

        buttonCancelar1.setBackground(new java.awt.Color(255, 204, 0));
        buttonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar1.setToolTipText("Cancelar");
        buttonCancelar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancelar1);
        buttonCancelar1.setBounds(530, 330, 90, 60);

        buttonSalvar1.setBackground(new java.awt.Color(255, 204, 0));
        buttonSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar32.png"))); // NOI18N
        buttonSalvar1.setToolTipText("Adicionar");
        buttonSalvar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buttonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvar1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalvar1);
        buttonSalvar1.setBounds(640, 330, 90, 60);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Lista de Especialidades:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 180, 127, 15);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Lista de Especialidades do Médico:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 180, 186, 15);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("CRM:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 30, 28, 15);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Nome do(a) Médico(a):");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 30, 140, 15);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setText("Telefone:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 95, 52, 15);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("E-mail:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 95, 60, 15);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("Data de Nascimento:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(570, 95, 115, 15);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 51));
        jLabel8.setText("Código:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 30, 60, 15);

        textDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        textDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataNascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(textDataNascimento);
        textDataNascimento.setBounds(570, 120, 150, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 760, 470);

        setBounds(0, 0, 776, 604);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar1ActionPerformed

        dispose();
    }//GEN-LAST:event_buttonCancelar1ActionPerformed

    private void buttonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvar1ActionPerformed

        if (tipoOperacao == tipoOperacao.ADICIONAR) {
            gravar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvar1ActionPerformed

    private void textDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataNascimentoActionPerformed

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed

        List<String> especialidadeMedico = listEspecialidade.getSelectedValuesList();

        for (String e : especialidadeMedico) {
            especialidadesMedico.add(e);
        }

        for (Especialidade e : especialidadesSelecionadas) {
            if (especialidadeMedico.contains(e.getNome())) {
                especialidadesSelecionadasMedico.add(e);
            }
        }
        especialidadesMedicoModel.clear();
        especialidadesMedicoModel.addAll(especialidadesMedico);
        listEspecialidadeMedico.setModel(especialidadesMedicoModel);

        int[] excluir = listEspecialidadeMedico.getSelectedIndices();
        for (int e : excluir) {
            listEspecialidade.remove(e);
            especialidades.remove(e);

        }


    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed

    private void buttonRemoverEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverEspecialidadeActionPerformed
        List<String> removerEspecialidadeMedico = listEspecialidadeMedico.getSelectedValuesList();

    
        
        
        for (Especialidade e : especialidadesSelecionadas) {
            if (removerEspecialidadeMedico.contains(e.getNome())) {
                especialidadesSelecionadasMedico.remove(e);
            }
        }
        

        listaTodasEspecialidadesModel.clear();
        listaTodasEspecialidadesModel.addAll(especialidades);
        listEspecialidade.setModel(listaTodasEspecialidadesModel);

        int[] excluir = listEspecialidadeMedico.getSelectedIndices();
        for (int e : excluir) {
            especialidadesMedicoModel.remove(e);
            especialidadesMedico.remove(e);
        }


    }//GEN-LAST:event_buttonRemoverEspecialidadeActionPerformed

    private void editar() {

        medico.setCrm(textCrm.getText());
        medico.setNome(textNomeMedico.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEmail(textEmail.getText());
        medico.setDataNascimento(LocalDate.parse(textDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        medico.setEspecialidades(especialidadesSelecionadasMedico);
        if (validarCadastro()) {
            MedicoDAO.editar(medico);
            JOptionPane.showMessageDialog(
                    null,
                    "Médico atualizado com sucesso",
                    "Medico",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }

    }

    private void gravar() {
        //Criar um objeto Plano de Saude
        Medico medico = new Medico();
        medico.setCrm(textCrm.getText());
        medico.setNome(textNomeMedico.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEmail(textEmail.getText());
        medico.setDataNascimento(LocalDate.parse(textDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        medico.setEspecialidades(especialidadesSelecionadasMedico);

        if (validarCadastro()) {

            MedicoDAO.gravar(medico);

            JOptionPane.showMessageDialog(
                    this,
                    "Médico gravado com sucesso",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {

        if (textCrm.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o crm!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);

            textCrm.requestFocus();
            return false;
        }

        if (textNomeMedico.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            textNomeMedico.requestFocus();
            return false;
        }
        return true;

    }

    private void carregarEspecalidades() {

        especialidades = EspecialidadeDAO.getListaDeNomes();
        listaTodasEspecialidadesModel.addAll(especialidades);
        listEspecialidade.setModel(listaTodasEspecialidadesModel);
        if (tipoOperacao == TipoOperacao.ADICIONAR) {

        } else {
            especialidadesSelecionadasMedico = medico.getEspecialidades();
            especialidadesMedico = medico.getEspecialidadesMedicoLista();
            especialidadesMedicoModel.clear();
            especialidadesMedicoModel.addAll(especialidadesMedico);
            listEspecialidadeMedico.setModel(especialidadesMedicoModel);

            int i = 0;
            for (String e : especialidadesMedico) {
                if (especialidades.contains(e)) {
                    especialidades.remove(e);
                }
            }
            especialidadesMedicoModel.clear();
            especialidadesMedicoModel.addAll(especialidades);

        }

   

}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adicionarMedicoPanel;
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonRemoverEspecialidade;
    private javax.swing.JButton buttonSalvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listEspecialidade;
    private javax.swing.JList<String> listEspecialidadeMedico;
    private javax.swing.JScrollPane scrollListaEspecialidade;
    private javax.swing.JScrollPane scrollListaEspecialidadeMedico;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCrm;
    private javax.swing.JFormattedTextField textDataNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeMedico;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}

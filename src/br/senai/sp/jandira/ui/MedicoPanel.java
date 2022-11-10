package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.awt.Dialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

    int linha;

    public MedicoPanel() {
        initComponents();
        criarTabelaMedicos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMedicos = new javax.swing.JLabel();
        buttonExcluirMedicos = new javax.swing.JButton();
        buttonEditarMedicos = new javax.swing.JButton();
        buttonAdicionarMedicos = new javax.swing.JButton();
        scrollMedico = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(null);

        labelMedicos.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        labelMedicos.setForeground(new java.awt.Color(255, 204, 0));
        labelMedicos.setText("Medicos");
        add(labelMedicos);
        labelMedicos.setBounds(30, 15, 80, 20);

        buttonExcluirMedicos.setBackground(new java.awt.Color(255, 204, 0));
        buttonExcluirMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/trash-bin.png"))); // NOI18N
        buttonExcluirMedicos.setToolTipText("Excluir médico");
        buttonExcluirMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonExcluirMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonExcluirMedicosMouseClicked(evt);
            }
        });
        buttonExcluirMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicosActionPerformed(evt);
            }
        });
        add(buttonExcluirMedicos);
        buttonExcluirMedicos.setBounds(692, 302, 70, 60);

        buttonEditarMedicos.setBackground(new java.awt.Color(255, 204, 0));
        buttonEditarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonEditarMedicos.setToolTipText("Editar médico");
        buttonEditarMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonEditarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicosActionPerformed(evt);
            }
        });
        add(buttonEditarMedicos);
        buttonEditarMedicos.setBounds(774, 302, 70, 60);

        buttonAdicionarMedicos.setBackground(new java.awt.Color(255, 204, 0));
        buttonAdicionarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarMedicos.setToolTipText("Adicionar médico");
        buttonAdicionarMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonAdicionarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicosActionPerformed(evt);
            }
        });
        add(buttonAdicionarMedicos);
        buttonAdicionarMedicos.setBounds(854, 302, 70, 60);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollMedico.setViewportView(tableMedicos);

        add(scrollMedico);
        scrollMedico.setBounds(30, 40, 905, 240);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExcluirMedicosMouseClicked
    }//GEN-LAST:event_buttonExcluirMedicosMouseClicked

    private void buttonExcluirMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicosActionPerformed

        //Obtemos o índice da linha selecionada na tabela
        linha = tableMedicos.getSelectedRow();

        //Verificamos se a linha é diferente de -1
        //-1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione o plano que deseja excluir!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirMedicosActionPerformed

    private void buttonEditarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicosActionPerformed

        linha = tableMedicos.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o médico que deseja editar!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarMedicosActionPerformed

    private void buttonAdicionarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicosActionPerformed

        MedicoDialog medicoDialog = new MedicoDialog(
                null,
                true,
                TipoOperacao.ADICIONAR,
                null);
        medicoDialog.setVisible(true);

        criarTabelaMedicos();
    }//GEN-LAST:event_buttonAdicionarMedicosActionPerformed
   private void editar() {
        
        Medico medico = MedicoDAO.getMedico(getCodigo());

        MedicoDialog medicoDialog = new MedicoDialog(
                null,
                true,
                TipoOperacao.EDITAR,
                medico);

        medicoDialog.setVisible(true);

         criarTabelaMedicos();
    }

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão do Médico selecionado?",
                "Médicos",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        // Excluir plano de saúde
        if (resposta == 0) {
           
            MedicoDAO.excluir(getCodigo());
            criarTabelaMedicos();
        }

    }

    private Integer getCodigo() {

        String codigoStr = tableMedicos.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
        

    }

    private void criarTabelaMedicos() {

        tableMedicos.setModel(MedicoDAO.getTableModel());

        // Desativar o redimensionamento da JTable
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(300);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(200);
        

        // Impedir/bloquear a movimentação das colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tableMedicos.setDefaultEditor(Object.class, null);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedicos;
    private javax.swing.JButton buttonEditarMedicos;
    private javax.swing.JButton buttonExcluirMedicos;
    private javax.swing.JLabel labelMedicos;
    private javax.swing.JScrollPane scrollMedico;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables
}

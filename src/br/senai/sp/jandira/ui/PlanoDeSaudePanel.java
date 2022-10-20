package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanoDeSaudePanel extends javax.swing.JPanel {

    int linha;

    public PlanoDeSaudePanel() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelplanosDeSaude = new javax.swing.JLabel();
        scrollTablePlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonEditarPlanoDeSaude = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(1050, 420));
        setLayout(null);

        labelplanosDeSaude.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        labelplanosDeSaude.setForeground(new java.awt.Color(255, 204, 0));
        labelplanosDeSaude.setText("Planos de saúde");
        add(labelplanosDeSaude);
        labelplanosDeSaude.setBounds(30, 10, 180, 20);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePlanosDeSaude.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePlanosDeSaudeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                excluir(evt);
            }
        });
        scrollTablePlanosDeSaude.setViewportView(tablePlanosDeSaude);

        add(scrollTablePlanosDeSaude);
        scrollTablePlanosDeSaude.setBounds(30, 40, 905, 240);

        buttonAdicionarPlanoDeSaude.setBackground(new java.awt.Color(255, 204, 0));
        buttonAdicionarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarPlanoDeSaude.setToolTipText("Adicionar Plano de Saúde");
        buttonAdicionarPlanoDeSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonAdicionarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlanoDeSaude);
        buttonAdicionarPlanoDeSaude.setBounds(854, 302, 70, 60);

        buttonExcluirPlanoDeSaude.setBackground(new java.awt.Color(255, 204, 0));
        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/trash-bin.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir plano de saúde");
        buttonExcluirPlanoDeSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonExcluirPlanoDeSaude.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonExcluirPlanoDeSaudeMouseClicked(evt);
            }
        });
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(692, 302, 70, 60);

        buttonEditarPlanoDeSaude.setBackground(new java.awt.Color(255, 204, 0));
        buttonEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonEditarPlanoDeSaude.setToolTipText("Editar plano de saúde");
        buttonEditarPlanoDeSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(774, 302, 70, 60);

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoDeSaudeActionPerformed

        PlanosdeSaudeDialog planosDeSaudeDialog = new PlanosdeSaudeDialog(
                null,
                true,
                TipoOperacao.ADICIONAR,
                null);
        planosDeSaudeDialog.setVisible(true);

        criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_buttonAdicionarPlanoDeSaudeActionPerformed

    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed

        //Obtemos o índice da linha selecionada na tabela
        linha = tablePlanosDeSaude.getSelectedRow();

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


    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed

    private void buttonEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoDeSaudeActionPerformed

        linha = tablePlanosDeSaude.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que deseja editar!",
                    "Plano de Saúde",
                    JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_buttonEditarPlanoDeSaudeActionPerformed


    private void excluir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluir

    }//GEN-LAST:event_excluir

    private void tablePlanosDeSaudeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePlanosDeSaudeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablePlanosDeSaudeMouseClicked

    private void buttonExcluirPlanoDeSaudeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeMouseClicked

    private void editar() {
        
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());

        PlanosdeSaudeDialog planosDeSaudeDialog = new PlanosdeSaudeDialog(
                null,
                true,
                TipoOperacao.EDITAR,
                planoDeSaude);

        planosDeSaudeDialog.setVisible(true);

         criarTabelaPlanosDeSaude();
    }

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão do Plano de saúde selecionado?",
                "Plano de Saúde",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        // Excluir plano de saúde
        if (resposta == 0) {
           
            PlanoDeSaudeDAO.excluir(getCodigo());
            criarTabelaPlanosDeSaude();
        }

    }

    private Integer getCodigo() {

        String codigoStr = tablePlanosDeSaude.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonEditarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JLabel labelplanosDeSaude;
    private javax.swing.JScrollPane scrollTablePlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {

        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTableModel());

        // Desativar o redimensionamento da JTable
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(300);

        // Impedir/bloquear a movimentação das colunas
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);

    }

}

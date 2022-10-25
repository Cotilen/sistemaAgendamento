package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//

public class EspecialidadePanel extends javax.swing.JPanel {

    int linha;

    public EspecialidadePanel() {
        initComponents();
        criarTabelaEspecialidade();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEspecialidades = new javax.swing.JLabel();
        ScrollTableEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonAdicionarEspecialidade = new javax.swing.JButton();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonEditarEspecialidade = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(null);

        labelEspecialidades.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        labelEspecialidades.setForeground(new java.awt.Color(255, 204, 0));
        labelEspecialidades.setText("Especialidades");
        add(labelEspecialidades);
        labelEspecialidades.setBounds(30, 10, 180, 20);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollTableEspecialidades.setViewportView(tableEspecialidades);

        add(ScrollTableEspecialidades);
        ScrollTableEspecialidades.setBounds(30, 40, 905, 240);

        buttonAdicionarEspecialidade.setBackground(new java.awt.Color(255, 204, 0));
        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar especialidade");
        buttonAdicionarEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(854, 302, 70, 60);

        buttonExcluirEspecialidade.setBackground(new java.awt.Color(255, 204, 0));
        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/trash-bin.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("Excluir especialidade");
        buttonExcluirEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonExcluirEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonExcluirEspecialidadeMouseClicked(evt);
            }
        });
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(692, 302, 70, 60);

        buttonEditarEspecialidade.setBackground(new java.awt.Color(255, 204, 0));
        buttonEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonEditarEspecialidade.setToolTipText("Editar especialidade");
        buttonEditarEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonEditarEspecialidade);
        buttonEditarEspecialidade.setBounds(774, 302, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed

        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, TipoOperacao.ADICIONAR, null);
        especialidadeDialog.setVisible(true);
        criarTabelaEspecialidade();
    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed

    private void buttonExcluirEspecialidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeMouseClicked

    }//GEN-LAST:event_buttonExcluirEspecialidadeMouseClicked

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed
        //Obtemos o índice da linha selecionada na tabela
        linha = tableEspecialidades.getSelectedRow();

        //Verificamos se a linha é diferente de -1
        //-1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione a especialidade que deseja excluir!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void buttonEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadeActionPerformed

        linha = tableEspecialidades.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que deseja editar!",
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarEspecialidadeActionPerformed

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão da especialidade selecionado?",
                "Especialidade",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        // Excluir plano de saúde
        if (resposta == 0) {

            EspecialidadeDAO.excluir(getCodigo());
            criarTabelaEspecialidade();
        }

    }

    private Integer getCodigo() {

        String codigoStr = tableEspecialidades.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);

    }

    private void editar() {

        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());

        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(
                null,
                true,
                TipoOperacao.EDITAR, 
                especialidade);

        especialidadeDialog.setVisible(true);

        criarTabelaEspecialidade();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollTableEspecialidades;
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JLabel labelEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaEspecialidade() {
        tableEspecialidades.setModel(EspecialidadeDAO.getTableModel());

        // Desativar o redimensionamento da JTable
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(300);

        // Impedir/bloquear a movimentação das colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tableEspecialidades.setDefaultEditor(Object.class, null);

    }
}

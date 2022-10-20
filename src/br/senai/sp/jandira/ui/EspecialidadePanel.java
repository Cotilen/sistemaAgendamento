
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;


public class EspecialidadePanel extends javax.swing.JPanel {

 
    public EspecialidadePanel() {
        initComponents();
        EspecialidadeDAO.criarEspecialidadesTeste();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEspecialidades = new javax.swing.JLabel();
        ScrollTableEspecialidades = new javax.swing.JScrollPane();
        TableEspecialidades = new javax.swing.JTable();
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

        TableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollTableEspecialidades.setViewportView(TableEspecialidades);

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

        
    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed

    private void buttonExcluirEspecialidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeMouseClicked

    }//GEN-LAST:event_buttonExcluirEspecialidadeMouseClicked

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed

        
    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void buttonEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadeActionPerformed

     

    }//GEN-LAST:event_buttonEditarEspecialidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollTableEspecialidades;
    private javax.swing.JTable TableEspecialidades;
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JLabel labelEspecialidades;
    // End of variables declaration//GEN-END:variables
}

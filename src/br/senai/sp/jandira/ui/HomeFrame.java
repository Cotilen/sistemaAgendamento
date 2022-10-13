package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    private PlanoDeSaudePanel planosDeSaudePanel;

    private final int POSIÇAO_X = 10;
    private final int POSIÇAO_Y = 180;
    private final int LARGURA = 945;
    private final int ALTURA = 370;

    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.criarPlanosDeSaudeTeste();
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setForeground(new java.awt.Color(51, 0, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit32.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        getContentPane().add(buttonSair);
        buttonSair.setBounds(875, 100, 80, 60);

        buttonAgenda.setBackground(new java.awt.Color(246, 246, 246));
        buttonAgenda.setForeground(new java.awt.Color(51, 0, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda32.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(110, 100, 80, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        buttonPlanosDeSaude.setForeground(new java.awt.Color(51, 0, 255));
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/health-card.png"))); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de saúde");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(470, 100, 80, 60);

        buttonEspecialidades.setBackground(new java.awt.Color(246, 246, 246));
        buttonEspecialidades.setForeground(new java.awt.Color(51, 0, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/especialidades32.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(380, 100, 80, 60);

        buttonPacientes.setBackground(new java.awt.Color(246, 246, 246));
        buttonPacientes.setForeground(new java.awt.Color(51, 0, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick32.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(200, 100, 80, 60);

        buttonMedicos.setBackground(new java.awt.Color(246, 246, 246));
        buttonMedicos.setForeground(new java.awt.Color(51, 0, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/doctor32.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(290, 100, 80, 60);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("SISACON");
        panelHome.add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 40);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Dados para contato");
        panelHome.add(jLabel4);
        jLabel4.setBounds(30, 120, 280, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Telefone: (11)95555 - 5555");
        panelHome.add(jLabel5);
        jLabel5.setBounds(30, 200, 220, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("www.sisacon.com.br");
        panelHome.add(jLabel6);
        jLabel6.setBounds(30, 230, 220, 20);

        jLabel7.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel7);
        jLabel7.setBounds(30, 60, 220, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("E-mail: suporte@sisacon.com.br");
        panelHome.add(jLabel8);
        jLabel8.setBounds(30, 170, 220, 20);

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));
        panelHome.add(jPanel2);
        jPanel2.setBounds(20, 80, 900, 3);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 180, 945, 370);

        buttonHome.setBackground(new java.awt.Color(153, 0, 153));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home32.png"))); // NOI18N
        buttonHome.setToolTipText("Voltar para a tela principal");
        buttonHome.setMaximumSize(new java.awt.Dimension(80, 60));
        buttonHome.setPreferredSize(new java.awt.Dimension(80, 60));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(20, 100, 80, 60);

        setBounds(0, 0, 983, 601);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonHome.setBackground(new java.awt.Color(153, 0, 153));
        buttonPlanosDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        panelHome.setVisible(true);
        planosDeSaudePanel.setVisible(false);

    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed

        buttonPlanosDeSaude.setBackground(new java.awt.Color(153, 0, 153));
        buttonHome.setBackground(new java.awt.Color(246, 246, 246));
        panelHome.setVisible(false);
        planosDeSaudePanel.setVisible(true);


    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {

        planosDeSaudePanel = new PlanoDeSaudePanel();

        planosDeSaudePanel.setBounds(POSIÇAO_X, POSIÇAO_Y, LARGURA, ALTURA);

        getContentPane().add(planosDeSaudePanel);
        planosDeSaudePanel.setVisible(false);

    }
}

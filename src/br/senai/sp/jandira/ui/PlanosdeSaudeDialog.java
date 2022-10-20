package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class PlanosdeSaudeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;

    public PlanosdeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;

        // Preencher os campos caso o tipo de operação for alterar
        if (tipoOperacao == TipoOperacao.EDITAR) {
            preencherFormulario();
        }

    }

    private void preencherFormulario() {

        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png")));
        labelTitulo.setText("Planos de Saúde - " + tipoOperacao);
        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textFieldOperadora.setText(planoDeSaude.getOperadora());
        textFieldTipoDePlano.setText(planoDeSaude.getTipoDoPlano());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adicionarPlanoPanel = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        detalhesPlanoPanel = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        labelTipoDePlano = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        textFieldTipoDePlano = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        getContentPane().setLayout(null);

        adicionarPlanoPanel.setBackground(new java.awt.Color(51, 51, 51));
        adicionarPlanoPanel.setForeground(new java.awt.Color(51, 51, 51));
        adicionarPlanoPanel.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 204, 0));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("Planos de Saude -  NOVO");
        adicionarPlanoPanel.add(labelTitulo);
        labelTitulo.setBounds(50, 10, 300, 70);

        getContentPane().add(adicionarPlanoPanel);
        adicionarPlanoPanel.setBounds(0, 0, 640, 100);

        detalhesPlanoPanel.setBackground(new java.awt.Color(102, 102, 102));
        detalhesPlanoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do plano de saude", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 2, 14), new java.awt.Color(255, 204, 102))); // NOI18N
        detalhesPlanoPanel.setMinimumSize(new java.awt.Dimension(945, 370));
        detalhesPlanoPanel.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(255, 204, 51));
        labelCodigo.setText("Código:");
        detalhesPlanoPanel.add(labelCodigo);
        labelCodigo.setBounds(50, 50, 50, 15);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBackground(new java.awt.Color(255, 204, 153));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        detalhesPlanoPanel.add(textFieldCodigo);
        textFieldCodigo.setBounds(50, 70, 64, 22);

        labelOperadora.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        labelOperadora.setForeground(new java.awt.Color(255, 204, 51));
        labelOperadora.setText("Nome da operadora:");
        detalhesPlanoPanel.add(labelOperadora);
        labelOperadora.setBounds(50, 110, 120, 15);

        labelTipoDePlano.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        labelTipoDePlano.setForeground(new java.awt.Color(255, 204, 51));
        labelTipoDePlano.setText("Tipo do Plano:");
        detalhesPlanoPanel.add(labelTipoDePlano);
        labelTipoDePlano.setBounds(50, 170, 90, 15);

        textFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraActionPerformed(evt);
            }
        });
        detalhesPlanoPanel.add(textFieldOperadora);
        textFieldOperadora.setBounds(50, 130, 240, 22);
        detalhesPlanoPanel.add(textFieldTipoDePlano);
        textFieldTipoDePlano.setBounds(50, 190, 320, 22);

        buttonSalvar.setBackground(new java.awt.Color(255, 204, 0));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Adicionar");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        detalhesPlanoPanel.add(buttonSalvar);
        buttonSalvar.setBounds(520, 263, 90, 60);

        buttonCancelar.setBackground(new java.awt.Color(255, 204, 0));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        detalhesPlanoPanel.add(buttonCancelar);
        buttonCancelar.setBounds(410, 263, 90, 60);

        getContentPane().add(detalhesPlanoPanel);
        detalhesPlanoPanel.setBounds(0, 100, 640, 350);

        setBounds(0, 0, 655, 489);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (tipoOperacao == tipoOperacao.ADICIONAR) {
            gravar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed


    private void textFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOperadoraActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void editar() {
        
        planoDeSaude.setOperadora(textFieldOperadora.getText());
        planoDeSaude.setTipoDoPlano(textFieldTipoDePlano.getText());
       
        
        if(validarCadastro()){
             PlanoDeSaudeDAO.editar(planoDeSaude);
              JOptionPane.showMessageDialog(
                null, 
                "Plano de saúde atualizado com sucesso",
                "Plano de Saúde",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
        }
       
    }

    private void gravar() {
        //Criar um objeto Plano de Saude
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textFieldOperadora.getText());
        planoDeSaude.setTipoDoPlano(textFieldTipoDePlano.getText());

        if (validarCadastro()) {

            PlanoDeSaudeDAO.gravar(planoDeSaude);

            JOptionPane.showMessageDialog(
                    this,
                    "Plano de Saúde gravado com sucesso",
                    "Plano de Saúde",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {

        if (textFieldOperadora.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome da Operadora!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);

            textFieldOperadora.requestFocus();
            return false;
        }

        if (textFieldTipoDePlano.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o tipo de plano!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
            textFieldTipoDePlano.requestFocus();
            return false;
        }
        return true;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adicionarPlanoPanel;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel detalhesPlanoPanel;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTipoDePlano;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldOperadora;
    private javax.swing.JTextField textFieldTipoDePlano;
    // End of variables declaration//GEN-END:variables
}

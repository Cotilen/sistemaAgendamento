package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.JOptionPane;

public class EspecialidadeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;

    public EspecialidadeDialog(java.awt.Frame parent, boolean modal, TipoOperacao tipoOperacao, Especialidade especialidade) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;

//         Preencher os campos caso o tipo de operação for alterar
        if (tipoOperacao == TipoOperacao.EDITAR) {
            preencherFormulario();
        }
    }

    private void preencherFormulario() {

        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png")));
        labelTitulo.setText("Especialidade - " + tipoOperacao);
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldOperadora.setText(especialidade.getNome());
        textFieldTipoDePlano.setText(especialidade.getDescricao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalhesPlanoPanel = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        labelTipoDePlano = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        textFieldTipoDePlano = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        adicionarPlanoPanel = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        detalhesPlanoPanel1 = new javax.swing.JPanel();
        labelCodigo1 = new javax.swing.JLabel();
        textFieldCodigo1 = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textDescricao = new javax.swing.JTextField();
        buttonSalvar1 = new javax.swing.JButton();
        buttonCancelar1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        adicionarPlanoPanel.setBackground(new java.awt.Color(51, 51, 51));
        adicionarPlanoPanel.setForeground(new java.awt.Color(51, 51, 51));
        adicionarPlanoPanel.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 204, 0));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("Especialidade - NOVO");
        adicionarPlanoPanel.add(labelTitulo);
        labelTitulo.setBounds(50, 10, 300, 70);

        getContentPane().add(adicionarPlanoPanel);
        adicionarPlanoPanel.setBounds(0, 0, 640, 100);

        detalhesPlanoPanel1.setBackground(new java.awt.Color(102, 102, 102));
        detalhesPlanoPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhe Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 2, 14), new java.awt.Color(255, 204, 102))); // NOI18N
        detalhesPlanoPanel1.setMinimumSize(new java.awt.Dimension(945, 370));
        detalhesPlanoPanel1.setLayout(null);

        labelCodigo1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        labelCodigo1.setForeground(new java.awt.Color(255, 204, 51));
        labelCodigo1.setText("Código:");
        detalhesPlanoPanel1.add(labelCodigo1);
        labelCodigo1.setBounds(50, 50, 50, 15);

        textFieldCodigo1.setEditable(false);
        textFieldCodigo1.setBackground(new java.awt.Color(255, 204, 153));
        textFieldCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigo1ActionPerformed(evt);
            }
        });
        detalhesPlanoPanel1.add(textFieldCodigo1);
        textFieldCodigo1.setBounds(50, 70, 64, 22);

        labelNome.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 204, 51));
        labelNome.setText("Nome da especialidade:");
        detalhesPlanoPanel1.add(labelNome);
        labelNome.setBounds(50, 110, 150, 15);

        labelDescricao.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        labelDescricao.setForeground(new java.awt.Color(255, 204, 51));
        labelDescricao.setText("Descriçao da especialidade:");
        detalhesPlanoPanel1.add(labelDescricao);
        labelDescricao.setBounds(50, 170, 149, 15);

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });
        detalhesPlanoPanel1.add(textNome);
        textNome.setBounds(50, 130, 240, 22);
        detalhesPlanoPanel1.add(textDescricao);
        textDescricao.setBounds(50, 190, 570, 22);

        buttonSalvar1.setBackground(new java.awt.Color(255, 204, 0));
        buttonSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar32.png"))); // NOI18N
        buttonSalvar1.setToolTipText("Adicionar");
        buttonSalvar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buttonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvar1ActionPerformed(evt);
            }
        });
        detalhesPlanoPanel1.add(buttonSalvar1);
        buttonSalvar1.setBounds(520, 263, 90, 60);

        buttonCancelar1.setBackground(new java.awt.Color(255, 204, 0));
        buttonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar1.setToolTipText("Cancelar");
        buttonCancelar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        buttonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelar1ActionPerformed(evt);
            }
        });
        detalhesPlanoPanel1.add(buttonCancelar1);
        buttonCancelar1.setBounds(410, 263, 90, 60);

        getContentPane().add(detalhesPlanoPanel1);
        detalhesPlanoPanel1.setBounds(0, 100, 640, 350);

        setBounds(0, 0, 656, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed

    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraActionPerformed

    }//GEN-LAST:event_textFieldOperadoraActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (tipoOperacao == tipoOperacao.ADICIONAR) {
            gravar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textFieldCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigo1ActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void buttonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvar1ActionPerformed

        if (tipoOperacao == tipoOperacao.ADICIONAR) {
            gravar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvar1ActionPerformed

    private void buttonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar1ActionPerformed

        dispose();
    }//GEN-LAST:event_buttonCancelar1ActionPerformed
    private void editar() {

        especialidade.setNome(textNome.getText());
        especialidade.setDescricao(textDescricao.getText());

        if (validarCadastro()) {
            EspecialidadeDAO.editar(especialidade);
            JOptionPane.showMessageDialog(
                    null,
                    "Especialidade alterada com sucesso",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }

    }

    private void gravar() {
        //Criar um objeto Plano de Saude
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textNome.getText());
        especialidade.setDescricao(textDescricao.getText());

        if (validarCadastro()) {

            EspecialidadeDAO.gravar(especialidade);

            JOptionPane.showMessageDialog(
                    this,
                    "Especialidade gravada com sucesso",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {

        if (textNome.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome !",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);

            textNome.requestFocus();
            return false;
        }

        if (textDescricao.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha a descrição!",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
            textFieldTipoDePlano.requestFocus();
            return false;
        }
        return true;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adicionarPlanoPanel;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonSalvar1;
    private javax.swing.JPanel detalhesPlanoPanel;
    private javax.swing.JPanel detalhesPlanoPanel1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCodigo1;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTipoDePlano;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCodigo1;
    private javax.swing.JTextField textFieldOperadora;
    private javax.swing.JTextField textFieldTipoDePlano;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}

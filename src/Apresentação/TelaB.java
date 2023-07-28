/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Apresentação;

import ControleAlunos.ControleAlunos;
import Dados.Aluno;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lohran
 */
public class TelaB extends javax.swing.JDialog {

    ControleAlunos ca;
    /**
     * Creates new form TelaB
     */
    public TelaB(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
     public TelaB(java.awt.Frame parent, boolean modal, ControleAlunos ca) {
        super(parent, modal);
        this.ca = ca;
        initComponents();
        exibeInformacoes();
    }
     
     private void exibeInformacoes(){
         ArrayList<Aluno> a = ca.retornarTodos();
        
         String busca = ca.getBusca();
         
          for (int i = 0; i < a.size() && a.get(i) != null; i++){
              if(busca.equals(a.get(i).getMatricula())){
                  SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                  tdfNome.setText(a.get(i).getNome());
                  tdfMat.setText(a.get(i).getMatricula());
                  tdfTel.setText(a.get(i).getTelefone());
                  tdfIdade.setText(a.get(i).getIdade());
                  tdfCPF.setText(a.get(i).getCPF());
                  tdfData.setText(formato.format(a.get(i).getData()));
                  JOptionPane.showMessageDialog(null, "Numero pesquisado com sucesso.");
              } else {
                  JOptionPane.showMessageDialog(null, "Numero pesquisado falhou.");
              }
          }
     }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tdfNome = new javax.swing.JTextField();
        tdfMat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tdfIdade = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tdfData = new javax.swing.JFormattedTextField();
        tdfCPF = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        tdfTel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();

        jTextField2.setText("jTextField1");

        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aluno");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Matrícula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        getContentPane().add(tdfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 235, -1));
        getContentPane().add(tdfMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 235, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Idade");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));
        getContentPane().add(tdfIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 200, -1));

        btnVoltar.setBackground(new java.awt.Color(242, 242, 242));
        btnVoltar.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data de Nascimento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        try {
            tdfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tdfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdfDataActionPerformed(evt);
            }
        });
        getContentPane().add(tdfData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 200, -1));

        try {
            tdfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tdfCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CPF");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        try {
            tdfTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tdfTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdfTelActionPerformed(evt);
            }
        });
        getContentPane().add(tdfTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 232, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apresentação/Imagens/723.444.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tdfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdfDataActionPerformed

    private void tdfTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdfTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdfTelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaB dialog = new TelaB(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JFormattedTextField tdfCPF;
    private javax.swing.JFormattedTextField tdfData;
    private javax.swing.JTextField tdfIdade;
    private javax.swing.JTextField tdfMat;
    private javax.swing.JTextField tdfNome;
    private javax.swing.JFormattedTextField tdfTel;
    // End of variables declaration//GEN-END:variables
}

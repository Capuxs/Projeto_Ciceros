/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pasta_Login;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author vsant
 */
public class alterar_Login_VIEW extends javax.swing.JFrame {
    
    usuario_DTO objusuarioDTO = new usuario_DTO();
    usuario_DAO objDAO = new usuario_DAO();
    String usuario,senha,confirmacao_senha,pergunta,resposta;
    int ID;
    /**
     * Creates new form alterar_Login_VIEW
     */
    public alterar_Login_VIEW() {
        initComponents();
        
    }
    
      public void exportarID(usuario_DTO objDTO){
            lbl_ID.setText(Integer.toString(objDTO.setChave_primaria()));
            ID=objDTO.setChave_primaria();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_pergunta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_resposta = new javax.swing.JTextField();
        txt_senha = new javax.swing.JPasswordField();
        txt_confirmacao_senha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Senha");
        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("PERGUNTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        txt_pergunta.setColumns(20);
        txt_pergunta.setRows(5);
        jScrollPane1.setViewportView(txt_pergunta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 330, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("USUÁRIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 330, 30));

        btn_buscar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("ALTERAR SENHA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btn_salvar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_salvar.setText("SALVAR");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("SENHA NOVA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("CONFIRMAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        txt_resposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_respostaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_resposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 330, 30));
        getContentPane().add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 151, 30));
        getContentPane().add(txt_confirmacao_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 153, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setText("RESPOSTA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        lbl_ID.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbl_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ID.setText("ID");
        getContentPane().add(lbl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 47, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
         
        if(ID==0){
              usuario_DTO objDTO = new usuario_DTO();
        
            String senha="",confirmacao_senha="",resposta="",resposta_do_bd = objusuarioDTO.setResposta();

            int id = objusuarioDTO.setChave_primaria();

             senha = new String(txt_senha.getPassword());
             confirmacao_senha = new String(txt_confirmacao_senha.getPassword());  
             resposta = txt_resposta.getText();

             objDTO.getSenha(senha);
             objDTO.getResposta(resposta);
             objDTO.getChave_primaria(id);

             if (resposta_do_bd.equals(resposta)) {
                    if (senha.equals(confirmacao_senha)) {

                    usuario_DAO objDAO = new usuario_DAO();
                    objDAO.alterarSenha(objDTO);
                    LimparCampos();
                }
            }
    
         }
        
        else if(ID != 0){
           
           confirmacao_senha =new String( txt_confirmacao_senha.getPassword());
           senha = new String(txt_senha.getPassword());
           if(senha.equals(confirmacao_senha)){
                usuario=txt_usuario.getText();
                pergunta = txt_pergunta.getText();
                resposta = txt_resposta.getText();

                objusuarioDTO.getUsusario(usuario);
                objusuarioDTO.getSenha(senha);
                objusuarioDTO.getPergunta(pergunta);
                objusuarioDTO.getResposta(resposta);
                objusuarioDTO.getChave_primaria(ID);
           
                objDAO.alterar_login_Completo(objusuarioDTO);
                LimparCampos();
           }
               
           else{
               JOptionPane.showMessageDialog(null, "A senha está errada.");
           }
           
        }
        
        
      
        
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if(ID==0){
           
            usuario = txt_usuario.getText();   
       
            objusuarioDTO = objDAO.consultarUsuario(usuario);
        
            txt_pergunta.setText(objusuarioDTO.setPergunta());
       }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_respostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_respostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_respostaActionPerformed

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
            java.util.logging.Logger.getLogger(alterar_Login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alterar_Login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alterar_Login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alterar_Login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new alterar_Login_VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JPasswordField txt_confirmacao_senha;
    private javax.swing.JTextArea txt_pergunta;
    private javax.swing.JTextField txt_resposta;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables


    private void LimparCampos(){
    txt_pergunta.setText("");
    txt_senha.setText("");
    txt_confirmacao_senha.setText("");
    txt_pergunta.setText("");
    txt_resposta.setText("");
        
    }

}

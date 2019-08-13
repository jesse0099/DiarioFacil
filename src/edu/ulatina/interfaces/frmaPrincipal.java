/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.interfaces;

import com.sun.awt.AWTUtilities;
import edu.ulatina.entidades.Cliente;
import edu.ulatina.entidades.Constantes;
import edu.ulatina.entidades.DiarioFacil;
import edu.ulatina.entidades.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojeru_san.RSPanelsSlider;

/**
 *
 * @author Nvidi
 */
public class frmaPrincipal extends javax.swing.JFrame {
        frmaMenu men= new frmaMenu();
        frmaMenuCliente menCliente  = new frmaMenuCliente();
    /**
     * Creates new form frmaPrincipal
     */
    //Declaracion del menu de admin
    private frmaMenu frmaMenuV ;
    public frmaPrincipal() {
         //si no se coloca el frame como no decorado revienta
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(this);
        //Pone el background invisible
        AWTUtilities.setWindowOpaque(this, false);
        DiarioFacilTester.diarioFacil.read("nombre", "Daniel",DiarioFacilTester.diarioFacil.getProveedores());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow3 = new rojeru_san.RSPanelShadow();
        jPanel3 = new javax.swing.JPanel();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        btnClose = new rojeru_san.RSButton();
        btnRegister = new rojeru_san.RSButtonRiple();
        btnLogin = new rojeru_san.RSButtonRiple();
        pnlSlider = new rojeru_san.RSPanelsSlider();
        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContra = new rojeru_san.RSMPassView();
        txtUser = new rojeru_san.RSMTextFull();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        pnlregister = new javax.swing.JPanel();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelVergas = new javax.swing.JPanel();
        txtNombre = new rojeru_san.RSMTextFull();
        txtApellido = new rojeru_san.RSMTextFull();
        txtEmail = new rojeru_san.RSMTextFull();
        txtNewUser = new rojeru_san.RSMTextFull();
        txtPass = new rojeru_san.RSMTextFull();
        txtCedula = new rojeru_san.RSMTextFull();
        txtVeriPass = new rojeru_san.RSMTextFull();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        rSPanelShadow3.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 40, 430, 520));

        rSPanelShadow1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnClose.setText("X");
        btnClose.setColorHover(new java.awt.Color(0, 153, 255));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTRARSE");
        btnRegister.setColorHover(new java.awt.Color(0, 153, 255));
        btnRegister.setColorText(new java.awt.Color(0, 112, 192));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("INICIAR SESIÓN");
        btnLogin.setColorHover(new java.awt.Color(0, 153, 255));
        btnLogin.setColorText(new java.awt.Color(0, 112, 192));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        pnlSlider.setBackground(new java.awt.Color(139, 195, 74));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setName("pnlLogin"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 112, 192));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar Sesión");

        txtContra.setModoMaterial(true);
        txtContra.setPlaceholder("Contraseña");

        txtUser.setModoMaterial(true);
        txtUser.setPlaceholder("Usuario");

        rSButtonRiple1.setText("INGRESAR");
        rSButtonRiple1.setColorHover(new java.awt.Color(0, 153, 255));
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(txtContra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pnlSlider.add(pnlLogin, "card2");

        pnlregister.setBackground(new java.awt.Color(255, 255, 255));
        pnlregister.setName("pnlRegister"); // NOI18N

        rSButtonRiple2.setText("Registrarme");
        rSButtonRiple2.setColorHover(new java.awt.Color(0, 153, 255));
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 112, 192));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar");

        PanelVergas.setBackground(new java.awt.Color(255, 255, 255));

        txtNombre.setModoMaterial(true);
        txtNombre.setPlaceholder("Nombre");

        txtApellido.setModoMaterial(true);
        txtApellido.setPlaceholder("Apellidos");

        txtEmail.setModoMaterial(true);
        txtEmail.setPlaceholder("Email");

        txtNewUser.setModoMaterial(true);
        txtNewUser.setPlaceholder("Usuario");

        txtPass.setModoMaterial(true);
        txtPass.setPlaceholder("Contraseña");
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        txtCedula.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtCedula.setModoMaterial(true);
        txtCedula.setPlaceholder("Cédula");
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtVeriPass.setModoMaterial(true);
        txtVeriPass.setPlaceholder("Verificar Contraseña");
        txtVeriPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVeriPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelVergasLayout = new javax.swing.GroupLayout(PanelVergas);
        PanelVergas.setLayout(PanelVergasLayout);
        PanelVergasLayout.setHorizontalGroup(
            PanelVergasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
            .addComponent(txtNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
            .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
            .addComponent(txtVeriPass, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
            .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );
        PanelVergasLayout.setVerticalGroup(
            PanelVergasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVergasLayout.createSequentialGroup()
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVeriPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(PanelVergas);

        javax.swing.GroupLayout pnlregisterLayout = new javax.swing.GroupLayout(pnlregister);
        pnlregister.setLayout(pnlregisterLayout);
        pnlregisterLayout.setHorizontalGroup(
            pnlregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlregisterLayout.createSequentialGroup()
                .addGroup(pnlregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlregisterLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(pnlregisterLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlregisterLayout.setVerticalGroup(
            pnlregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlregisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pnlSlider.add(pnlregister, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                        .addComponent(pnlSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(800, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, 970, 448));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(!btnLogin.isSelected()){
            btnLogin.setSelected(true);
            btnRegister.setSelected(false);
            this.pnlSlider.setPanelSlider(10, this.pnlLogin, RSPanelsSlider.DIRECT.RIGHT);
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(!btnRegister.isSelected()){
            btnRegister.setSelected(true);
            btnLogin.setSelected(false);
            pnlSlider.setPanelSlider(10, pnlregister, RSPanelsSlider.DIRECT.RIGHT);
        }
       
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        // TODO add your handling code here:
        if(DiarioFacilTester.diarioFacil.login(txtUser.getText(),new String (txtContra.getPassword()))){
            if(Constantes.ADMINLOGUEADO.getApellido()!=null){
                //Esconder el login y limpiar los campos
                this.setVisible(false);
                //Abrir el admin
                this.men.setVisible(true);
                Constantes.ADMINLOGUEADO.toString();
            }else {
                //Esconder login
                this.setVisible(false);
                //Abrir el cliente
                this.menCliente.setVisible(true);
            }
        }
        else{
             JOptionPane.showMessageDialog(null, "Chale,esta mal", "Sys", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
        }
           
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtVeriPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVeriPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVeriPassActionPerformed

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
   //<editor-fold defaultstate="collapsed" desc=" Variables AK7 ">
    String cedula = this.txtCedula.getText();
    String nombre = this.txtNombre.getText();
    String apellido = this.txtApellido.getText();
    String email = this.txtEmail.getText();
    String user = this.txtNewUser.getText();
    String pass1= this.txtPass.getText();
    String pass2= this.txtVeriPass.getText();
    boolean check=false;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date(System.currentTimeMillis());  
    
     //</editor-fold>
   
   //<editor-fold defaultstate="collapsed" desc=" Funcion ak7 ">
   
   if(pass1.equals(pass2)){
   Cliente newuser = new Cliente(cedula,nombre,apellido,email,user, pass1,"Cliente",date);
   DiarioFacilTester.diarioFacil.create(newuser);
   
   JOptionPane.showMessageDialog(null, "Usuario creado!");
   }else{
      JOptionPane.showMessageDialog(null, "La contraseña no coincide!");
   }
    //</editor-fold>
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelVergas;
    private rojeru_san.RSButton btnClose;
    private rojeru_san.RSButtonRiple btnLogin;
    private rojeru_san.RSButtonRiple btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlLogin;
    private rojeru_san.RSPanelsSlider pnlSlider;
    private javax.swing.JPanel pnlregister;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow3;
    private rojeru_san.RSMTextFull txtApellido;
    private rojeru_san.RSMTextFull txtCedula;
    private rojeru_san.RSMPassView txtContra;
    private rojeru_san.RSMTextFull txtEmail;
    private rojeru_san.RSMTextFull txtNewUser;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtPass;
    private rojeru_san.RSMTextFull txtUser;
    private rojeru_san.RSMTextFull txtVeriPass;
    // End of variables declaration//GEN-END:variables
}

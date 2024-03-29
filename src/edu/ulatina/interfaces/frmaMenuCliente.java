/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.interfaces;

import com.sun.awt.AWTUtilities;
import edu.ulatina.entidades.Administrador;
import edu.ulatina.entidades.CarritoCompras;
import edu.ulatina.entidades.Cliente;
import edu.ulatina.entidades.Constantes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojeru_san.RSPanelsSlider;

/**
 *
 * @author Nvidi
 */
public class frmaMenuCliente extends javax.swing.JFrame {

    /**
     * Creates new form frmaMenuCliente
     */
    public frmaMenuCliente() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, true);
        this.rSPanelsSlider1.setPanelSlider(1,pnlHomeUI1,RSPanelsSlider.DIRECT.RIGHT);
        
    }
    
    //Cargar y mostrar preferencias
    public void preferencias(){
        if(Constantes.USUARIOLOGUEADO!=null){
            //Revisar si tiene preferencias
            if(Constantes.USUARIOLOGUEADO.getPreferencias().size()>0){
                //Implementacion luego
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

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSPanelImage2 = new rojerusan.RSPanelImage();
        rSPanelCircleImage1 = new rojerusan.RSPanelCircleImage();
        rSButtonIconI6 = new rojerusan.RSButtonIconI();
        rSButtonIconI5 = new rojerusan.RSButtonIconI();
        rSButtonIconI7 = new rojerusan.RSButtonIconI();
        btnHome = new rojerusan.RSButtonIconI();
        rSButtonIconI4 = new rojerusan.RSButtonIconI();
        btnCompras = new rojerusan.RSButtonIconI();
        btnPaquetes = new rojerusan.RSButtonIconI();
        jPanel1 = new javax.swing.JPanel();
        btnClose = new rojeru_san.RSButton();
        rSPanelsSlider1 = new rojeru_san.RSPanelsSlider();
        pnlPromociones1 = new edu.ulatina.interfaces.pnlPromociones();
        pnlInventarioCliente1 = new edu.ulatina.interfaces.pnlInventarioCliente();
        pnlCarritos1 = new edu.ulatina.interfaces.pnlCarritos();
        pnlHomeUI1 = new edu.ulatina.interfaces.pnlHomeUI();
        pnlCompraFinal1 = new edu.ulatina.interfaces.pnlFinalizarCompra();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1265, 758));
        setMinimumSize(new java.awt.Dimension(1265, 758));
        setPreferredSize(new java.awt.Dimension(1265, 758));
        setResizable(false);
        setSize(new java.awt.Dimension(1265, 758));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 112, 192));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 112, 192));

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/259368327015212.png"))); // NOI18N

        rSPanelCircleImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/0083f9a69c.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelCircleImage1Layout = new javax.swing.GroupLayout(rSPanelCircleImage1);
        rSPanelCircleImage1.setLayout(rSPanelCircleImage1Layout);
        rSPanelCircleImage1Layout.setHorizontalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );
        rSPanelCircleImage1Layout.setVerticalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(rSPanelCircleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(rSPanelCircleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        rSButtonIconI6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-shutdown-24.png"))); // NOI18N
        rSButtonIconI6.setText("Salir");
        rSButtonIconI6.setColorHover(new java.awt.Color(255, 102, 102));
        rSButtonIconI6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rSButtonIconI6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI6ActionPerformed(evt);
            }
        });

        rSButtonIconI5.setBorder(null);
        rSButtonIconI5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-mobile-order-24.png"))); // NOI18N
        rSButtonIconI5.setText("Carrito");
        rSButtonIconI5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rSButtonIconI5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI5ActionPerformed(evt);
            }
        });

        rSButtonIconI7.setBorder(null);
        rSButtonIconI7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-sell-24.png"))); // NOI18N
        rSButtonIconI7.setText("Productos");
        rSButtonIconI7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rSButtonIconI7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI7ActionPerformed(evt);
            }
        });

        btnHome.setBorder(null);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-home-24.png"))); // NOI18N
        btnHome.setText("Inicio");
        btnHome.setInheritsPopupMenu(true);
        btnHome.setName("btnHome"); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        rSButtonIconI4.setBorder(null);
        rSButtonIconI4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-price-tag-24.png"))); // NOI18N
        rSButtonIconI4.setText("Promociones ");
        rSButtonIconI4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rSButtonIconI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI4ActionPerformed(evt);
            }
        });

        btnCompras.setBorder(null);
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-shopping-24.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnPaquetes.setBorder(null);
        btnPaquetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-paquete-24.png"))); // NOI18N
        btnPaquetes.setText("Paquetes");
        btnPaquetes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaquetesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(rSButtonIconI6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonIconI5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonIconI7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonIconI4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonIconI7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonIconI4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonIconI5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonIconI6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnClose.setText("X");
        btnClose.setColorHover(new java.awt.Color(255, 102, 102));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        pnlPromociones1.setName("pnlPromo"); // NOI18N
        rSPanelsSlider1.add(pnlPromociones1, "card3");

        pnlInventarioCliente1.setName("pnlInventarioCliente"); // NOI18N
        rSPanelsSlider1.add(pnlInventarioCliente1, "card4");

        pnlCarritos1.setName("pnlCarritos"); // NOI18N
        rSPanelsSlider1.add(pnlCarritos1, "card5");

        pnlHomeUI1.setName("pnlHomeUI"); // NOI18N
        rSPanelsSlider1.add(pnlHomeUI1, "card2");

        pnlCompraFinal1.setName("pnlCompraFinal1"); // NOI18N
        rSPanelsSlider1.add(pnlCompraFinal1, "card6");
        pnlCompraFinal1.getAccessibleContext().setAccessibleName("pnlCompraFinal1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, Short.MAX_VALUE))
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        preferencias();
    }//GEN-LAST:event_formWindowOpened

    private void rSButtonIconI6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI6ActionPerformed
        edu.ulatina.interfaces.DiarioFacilTester.frmaPrincipal.show();
        Constantes.ADMINLOGUEADO = new Administrador();
        Constantes.USUARIOLOGUEADO = new Cliente();
        this.rSPanelsSlider1.setPanelSlider(1,pnlHomeUI1,RSPanelsSlider.DIRECT.RIGHT);
        this.dispose();
    }//GEN-LAST:event_rSButtonIconI6ActionPerformed

    private void rSButtonIconI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI4ActionPerformed
        //<editor-fold defaultstate="collapsed" desc="Revision de permiso de entrada al modulo de paquetes y promociones">
            //Entrada al modulo a implementar proximamente
            if(DiarioFacilTester.diarioFacil.aplicaPromos(Constantes.USUARIOLOGUEADO)){
                this.rSPanelsSlider1.setPanelSlider(1,pnlPromociones1,RSPanelsSlider.DIRECT.RIGHT);
                pnlPromociones1.loadPanels();
            }else{
                JOptionPane.showMessageDialog(null,"No tiene acceso a las promociones","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
            }

        //</editor-fold>
    }//GEN-LAST:event_rSButtonIconI4ActionPerformed

    private void rSButtonIconI5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI5ActionPerformed
        // TODO add your handling code here:
        this.rSPanelsSlider1.setPanelSlider(1,pnlCarritos1,RSPanelsSlider.DIRECT.RIGHT);
        //Chequeando si el cliente tiene carritos
        if(Constantes.USUARIOLOGUEADO.getCedula()!=null){
            if(DiarioFacilTester.diarioFacil.clienteCarritos(Constantes.USUARIOLOGUEADO)){
                //Do nothing
                pnlCarritos1.loadCombo();
            }else{
                pnlCarritos1.loadCombo();
                List<CarritoCompras> car  = new ArrayList<>();
                pnlCarritos1.loadTable(car);
                pnlCarritos1.cleanScreen();
                JOptionPane.showMessageDialog(null,"No tiene ningun carrito creado,cree uno!","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
            }
        }
    }//GEN-LAST:event_rSButtonIconI5ActionPerformed

    private void rSButtonIconI7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI7ActionPerformed
        // TODO add your handling code here:
        this.rSPanelsSlider1.setPanelSlider(1,pnlInventarioCliente1,RSPanelsSlider.DIRECT.RIGHT);
        pnlInventarioCliente1.loadPanels();
        
    }//GEN-LAST:event_rSButtonIconI7ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
         this.rSPanelsSlider1.setPanelSlider(1,pnlHomeUI1,RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
    /* pnlCompraFinal1*/
        this.rSPanelsSlider1.setPanelSlider(1,pnlCompraFinal1,RSPanelsSlider.DIRECT.RIGHT);
        this.pnlCompraFinal1.loadCarrito(Constantes.USUARIOLOGUEADO);
        
       /* pnlCompraFinal1*/
        
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaquetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaquetesActionPerformed

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
            java.util.logging.Logger.getLogger(frmaMenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmaMenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmaMenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmaMenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmaMenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnClose;
    private rojerusan.RSButtonIconI btnCompras;
    private rojerusan.RSButtonIconI btnHome;
    private rojerusan.RSButtonIconI btnPaquetes;
    private javax.swing.JPanel jPanel1;
    private edu.ulatina.interfaces.pnlCarritos pnlCarritos1;
    private edu.ulatina.interfaces.pnlFinalizarCompra pnlCompraFinal1;
    private edu.ulatina.interfaces.pnlHomeUI pnlHomeUI1;
    private edu.ulatina.interfaces.pnlInventarioCliente pnlInventarioCliente1;
    private edu.ulatina.interfaces.pnlPromociones pnlPromociones1;
    private rojerusan.RSButtonIconI rSButtonIconI4;
    private rojerusan.RSButtonIconI rSButtonIconI5;
    private rojerusan.RSButtonIconI rSButtonIconI6;
    private rojerusan.RSButtonIconI rSButtonIconI7;
    private rojerusan.RSPanelCircleImage rSPanelCircleImage1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage2;
    private rojeru_san.RSPanelsSlider rSPanelsSlider1;
    // End of variables declaration//GEN-END:variables
}

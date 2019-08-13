/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.interfaces;
import edu.ulatina.interfaces.pnlAdmins;
import com.sun.awt.AWTUtilities;
import edu.ulatina.entidades.Administrador;
import edu.ulatina.entidades.Cliente;
import edu.ulatina.entidades.Constantes;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.PanelUI;
import rojeru_san.RSPanelsSlider;

/**
 *
 * @author Nvidi
 */
public class frmaMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmaMenu
     */
    public frmaMenu() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(this);
        //Pone el background invisible
        AWTUtilities.setWindowOpaque(this, false);
        
        this.setResizable(true);
        
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
        rSButtonIconI3 = new rojerusan.RSButtonIconI();
        btnAdminCategoria = new rojerusan.RSButtonIconI();
        rSButtonIconI7 = new rojerusan.RSButtonIconI();
        rSButtonIconI6 = new rojerusan.RSButtonIconI();
        rSButtonIconI4 = new rojerusan.RSButtonIconI();
        btnHome = new rojerusan.RSButtonIconI();
        lblUserName = new javax.swing.JLabel();
        btnAdminProveedor = new rojerusan.RSButtonIconI();
        btnAdmins = new rojerusan.RSButtonIconI();
        btnAdministrarProductos = new rojerusan.RSButtonIconI();
        btnClient = new rojerusan.RSButtonIconI();
        pnlSlider = new rojeru_san.RSPanelsSlider();
        pnlHomeUI2 = new edu.ulatina.interfaces.pnlHomeUI();
        pnlAdminProducts2 = new edu.ulatina.interfaces.pnlAdminProductsCategories();
        pnlAdminProveedorHome2 = new edu.ulatina.interfaces.pnlAdminProveedorHome();
        pnlAdmins1 = new edu.ulatina.interfaces.pnlAdmins();
        pnlAdminInventario1 = new edu.ulatina.interfaces.pnlAdminInventario();
        pnlAdminClientes1 = new edu.ulatina.interfaces.pnlAdminClientes();
        jPanel1 = new javax.swing.JPanel();
        btnClose = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rSPanelGradiente1.setBackground(new java.awt.Color(0, 112, 192));
        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 112, 192));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 112, 192));
        rSPanelGradiente1.setDoubleBuffered(false);
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.CENTRAL);

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

        rSButtonIconI3.setBorder(null);
        rSButtonIconI3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-change-user-24.png"))); // NOI18N
        rSButtonIconI3.setText("Administrar usuarios");
        rSButtonIconI3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rSButtonIconI3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonIconI3.setInheritsPopupMenu(true);
        rSButtonIconI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI3ActionPerformed(evt);
            }
        });

        btnAdminCategoria.setBorder(null);
        btnAdminCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-inventory-flow-24.png"))); // NOI18N
        btnAdminCategoria.setText("Administrar categorias");
        btnAdminCategoria.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnAdminCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminCategoriaActionPerformed(evt);
            }
        });

        rSButtonIconI7.setBorder(null);
        rSButtonIconI7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-google-docs-24.png"))); // NOI18N
        rSButtonIconI7.setText("Registro de compras");
        rSButtonIconI7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rSButtonIconI7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI7ActionPerformed(evt);
            }
        });

        rSButtonIconI6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-shutdown-24.png"))); // NOI18N
        rSButtonIconI6.setText("Salir");
        rSButtonIconI6.setColorHover(new java.awt.Color(255, 102, 102));
        rSButtonIconI6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rSButtonIconI6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI6ActionPerformed(evt);
            }
        });

        rSButtonIconI4.setBorder(null);
        rSButtonIconI4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-price-tag-24.png"))); // NOI18N
        rSButtonIconI4.setText("Promociones y paquetes");
        rSButtonIconI4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rSButtonIconI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI4ActionPerformed(evt);
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

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("Jese Chavez");

        btnAdminProveedor.setBorder(null);
        btnAdminProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-sell-24.png"))); // NOI18N
        btnAdminProveedor.setText("Administrar proveedores");
        btnAdminProveedor.setInheritsPopupMenu(true);
        btnAdminProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminProveedorActionPerformed(evt);
            }
        });

        btnAdmins.setBorder(null);
        btnAdmins.setText("Administradores");
        btnAdmins.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminsActionPerformed(evt);
            }
        });

        btnAdministrarProductos.setBorder(null);
        btnAdministrarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/ejemplos/img/icons8-inventory-flow-24_1.png"))); // NOI18N
        btnAdministrarProductos.setText("Administrar productos");
        btnAdministrarProductos.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnAdministrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarProductosActionPerformed(evt);
            }
        });

        btnClient.setBorder(null);
        btnClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ulatina/interfaces/cliente.png"))); // NOI18N
        btnClient.setText("Clientes");
        btnClient.setActionCommand("Clientes");
        btnClient.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnClient.setName("btnClient"); // NOI18N
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonIconI3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdminCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonIconI7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonIconI6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUserName)
                .addGap(73, 73, 73))
            .addComponent(btnAdminProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonIconI4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdministrarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdminProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonIconI3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdminCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonIconI7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonIconI4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdministrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonIconI6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSlider.setBackground(new java.awt.Color(255, 255, 255));

        pnlHomeUI2.setName("pnlHomeUI2"); // NOI18N
        pnlSlider.add(pnlHomeUI2, "card2");

        pnlAdminProducts2.setName("pnlAdminProducts2"); // NOI18N
        pnlSlider.add(pnlAdminProducts2, "card3");

        pnlAdminProveedorHome2.setName("pnlAdminProveedorHome1"); // NOI18N
        pnlSlider.add(pnlAdminProveedorHome2, "card4");
        pnlSlider.add(pnlAdmins1, "card5");

        pnlAdminInventario1.setName("pnlInventario"); // NOI18N
        pnlSlider.add(pnlAdminInventario1, "card6");

        pnlAdminClientes1.setName("pblAdminClientes1"); // NOI18N
        pnlSlider.add(pnlAdminClientes1, "card7");
        pnlAdminClientes1.getAccessibleContext().setAccessibleName("");

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 712, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAdminCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminCategoriaActionPerformed
        //<editor-fold defaultstate="collapsed" desc="Revision de permisos de entrada al modulo de productos" >
        if(Constantes.ADMINLOGUEADO.checkCredentials("VPRODUCTO")){
            if(!btnAdminCategoria.isSelected()){
               btnAdminCategoria.setSelected(true);
               btnHome.setSelected(false);
               btnAdmins.setSelected(false);
               btnAdminProveedor.setSelected(false);
               pnlSlider.setPanelSlider(1, pnlAdminProducts2,RSPanelsSlider.DIRECT.RIGHT);
               pnlAdminProducts2.checkEdit();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No tiene acceso al modulo", "Sys", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png")); 
        }

         //</editor-fold>
    }//GEN-LAST:event_btnAdminCategoriaActionPerformed

    private void rSButtonIconI7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI7ActionPerformed
        //<editor-fold defaultstate="collapsed" desc="Revision de registros de compra " >
            if(Constantes.ADMINLOGUEADO.checkCredentials("VCOMPRAS")){
                //Implementacion en proximas versiones
            }else{
                JOptionPane.showMessageDialog(null, "No tiene acceso al modulo", "Sys", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
            }
        
        //</editor-fold>
    }//GEN-LAST:event_rSButtonIconI7ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

        if(!btnHome.isSelected()){
           btnHome.setSelected(true);
           btnAdmins.setSelected(false);
           btnAdministrarProductos.setSelected(false);
           btnAdminProveedor.setSelected(false);
           btnAdminCategoria.setSelected(false);
           pnlSlider.setPanelSlider(1, pnlHomeUI2,RSPanelsSlider.DIRECT.RIGHT);
       }
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAdminProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminProveedorActionPerformed
       //<editor-fold defaultstate="collapsed" desc="Revision de permiso de entrada al modulo de proveedores">
       if(Constantes.ADMINLOGUEADO.checkCredentials("VPROV")){
           //Permiso de entrada concedido
           if(!btnAdminProveedor.isSelected()){
                btnAdminProveedor.setSelected(true); 
                btnAdmins.setSelected(false);
                btnHome.setSelected(false);
                btnAdministrarProductos.setSelected(false);
                btnAdminCategoria.setSelected(false);
                pnlSlider.setPanelSlider(1, pnlAdminProveedorHome2,RSPanelsSlider.DIRECT.RIGHT);
                pnlAdminProveedorHome2.checkEdit();
           }
       }else{
            JOptionPane.showMessageDialog(null, "No tiene acceso al modulo", "Sys", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));  
       }
       //</editor-fold>
        
    }//GEN-LAST:event_btnAdminProveedorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblUserName.setText(Constantes.ADMINLOGUEADO.getNombre()+"    "+Constantes.ADMINLOGUEADO.getApellido());
        
    }//GEN-LAST:event_formWindowOpened

    private void rSButtonIconI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI3ActionPerformed
        // <editor-fold defaultstate="collapsed" desc="Revision de permiso de entrada al modulo de usuarios">
            if(Constantes.ADMINLOGUEADO.checkCredentials("VUSUARIO")){
                //Entrada al modulo a implementar proximamente
            }else{
                JOptionPane.showMessageDialog(null, "No tiene acceso al modulo", "Sys", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));  
            }
        //</editor-fold>
    }//GEN-LAST:event_rSButtonIconI3ActionPerformed

    private void rSButtonIconI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI4ActionPerformed
        //<editor-fold defaultstate="collapsed" desc="Revision de permiso de entrada al modulo de paquetes y promociones">
            if(Constantes.ADMINLOGUEADO.checkCredentials("VPROM")){
                //Entrada al modulo a implementar proximamente
            }else{
                JOptionPane.showMessageDialog(null, "No tiene acceso al modulo", "Sys", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));  
            } 
        //</editor-fold>
    }//GEN-LAST:event_rSButtonIconI4ActionPerformed
    private void btnAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminsActionPerformed
       //<editor-fold defaultstate="collapsed" desc="Revision de permiso de entrada al modulo de administracion de administradores">
        if(Constantes.ADMINLOGUEADO.checkCredentials("VUSUARIO")){
            if(!btnAdmins.isSelected()){
               btnAdmins.setSelected(true);
               btnAdminProveedor.setSelected(false);
               btnHome.setSelected(false);
               btnAdminCategoria.setSelected(false);
               btnAdministrarProductos.setSelected(false);
               pnlSlider.setPanelSlider(1, pnlAdmins1,RSPanelsSlider.DIRECT.RIGHT);
               pnlAdmins1.checkEdit();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No tiene acceso al modulo", "Sys", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
        }
      //</editor-fold>
       
    }//GEN-LAST:event_btnAdminsActionPerformed

    private void rSButtonIconI6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI6ActionPerformed
        edu.ulatina.interfaces.DiarioFacilTester.frmaPrincipal.show();
        Constantes.ADMINLOGUEADO = new Administrador();
        Constantes.USUARIOLOGUEADO = new Cliente();
        this.dispose();
    }//GEN-LAST:event_rSButtonIconI6ActionPerformed

    private void btnAdministrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarProductosActionPerformed
        //<editor-fold defaultstate="collapsed" desc="Revision de permiso de entrada al modulo de inventario">
            if(Constantes.ADMINLOGUEADO.checkCredentials("VPRODUCTO")){
               btnAdministrarProductos.setSelected(true);
               btnAdmins.setSelected(false);
               btnAdminProveedor.setSelected(false);
               btnAdminCategoria.setSelected(false);
               btnHome.setSelected(false);
               pnlSlider.setPanelSlider(1,pnlAdminInventario1 ,RSPanelsSlider.DIRECT.RIGHT);
               pnlAdminInventario1.checkEdit();
            }else{
                JOptionPane.showMessageDialog(null, "No tiene acceso al modulo", "Sys", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
            }
        //</editor-fold>
    }//GEN-LAST:event_btnAdministrarProductosActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
             if(Constantes.ADMINLOGUEADO.checkCredentials("EUSUARIO")){
            if(!btnClient.isSelected()){
              btnClient.setSelected(true);
               btnAdmins.setSelected(false);
               btnAdminProveedor.setSelected(false);
               btnHome.setSelected(false);
               btnAdminCategoria.setSelected(false);
               btnAdministrarProductos.setSelected(false);
               pnlSlider.setPanelSlider(1, pnlAdminClientes1,RSPanelsSlider.DIRECT.RIGHT);
               this.pnlAdminClientes1.refresh();
               
              pnlAdminClientes1.checkEdit();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No tiene acceso al modulo", "Sys", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
        }
    }//GEN-LAST:event_btnClientActionPerformed

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
            java.util.logging.Logger.getLogger(frmaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btnAdminCategoria;
    private rojerusan.RSButtonIconI btnAdminProveedor;
    private rojerusan.RSButtonIconI btnAdministrarProductos;
    private rojerusan.RSButtonIconI btnAdmins;
    private rojerusan.RSButtonIconI btnClient;
    private rojeru_san.RSButton btnClose;
    private rojerusan.RSButtonIconI btnHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUserName;
    private edu.ulatina.interfaces.pnlAdminClientes pnlAdminClientes1;
    private edu.ulatina.interfaces.pnlAdminInventario pnlAdminInventario1;
    private edu.ulatina.interfaces.pnlAdminProductsCategories pnlAdminProducts2;
    private edu.ulatina.interfaces.pnlAdminProveedorHome pnlAdminProveedorHome2;
    private edu.ulatina.interfaces.pnlAdmins pnlAdmins1;
    private edu.ulatina.interfaces.pnlHomeUI pnlHomeUI2;
    private rojeru_san.RSPanelsSlider pnlSlider;
    private rojerusan.RSButtonIconI rSButtonIconI3;
    private rojerusan.RSButtonIconI rSButtonIconI4;
    private rojerusan.RSButtonIconI rSButtonIconI6;
    private rojerusan.RSButtonIconI rSButtonIconI7;
    private rojerusan.RSPanelCircleImage rSPanelCircleImage1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.interfaces;

import edu.ulatina.entidades.CarritoCompras;
import edu.ulatina.entidades.Constantes;
import edu.ulatina.entidades.Producto;
import edu.ulatina.entidades.Promocion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import rojeru_san.RSButtonRiple;
import rojerusan.RSComboMetro;

/**
 *
 * @author Nvidi
 */
public class pnlInventarioCliente extends javax.swing.JPanel {

    /**
     * Creates new form pnlInventarioClientwe
     */
    public pnlInventarioCliente() {
        initComponents();
        loadPanels();
    }
        public void loadPanels(){
        this.jPanel2.removeAll();
        JPanel pan;
        JLabel lab;
        JLabel prod;
        JLabel icon;
        JLabel icon2;
        JLabel precioOriginal;
        JButton comprar;
        GridLayout lay   = new GridLayout(100,2,20,20);
        jPanel2.setLayout(lay);
        for (Producto p : DiarioFacilTester.diarioFacil.getProductosFiltrados()) {
            pan = new JPanel(new BorderLayout());
            lab = new JLabel(p.getNombre());
            prod = new JLabel("Precio : "+p.getPrecio()+"   Disponibles : "+p.getExistencias());
            comprar = new JButton("Agregar al carrito");
            icon = new JLabel();
            icon2 = new JLabel();
            precioOriginal = new JLabel();
            icon.setIcon(new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-price-tag-24.png"));
            icon2.setIcon(new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-shopping-cart-promotion-24.png"));
            
            comprar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        Object source = e.getSource();
                        if (source instanceof JButton) {
                            //Creando controles para el JOptionPane
                            SpinnerNumberModel model1 = new SpinnerNumberModel(1.0, 1.0, 100.0, 1.0);
                            RSComboMetro   comboCarritos = new RSComboMetro();
                            JSpinner spin  = new JSpinner(model1);
                            //Deshabilitando la escritura en el spinner
                            ((JSpinner.DefaultEditor) spin.getEditor()).getTextField().setEditable(false);
                            JLabel cantidad= new JLabel("Cantidad :");
                            RSButtonRiple button = new RSButtonRiple();
                            button.setText("Aceptar");
                            //Cargar el carrito
                            for(CarritoCompras car : DiarioFacilTester.diarioFacil.carritosCompra(Constantes.USUARIOLOGUEADO)){
                                comboCarritos.addItem(car.getNombreCarrito());
                            }
                            //Obteniendo codigo de la promocion
                            JButton btn = (JButton)source;
                            String butSrcTxt = btn.getText();
                            //Coleccion de controles
                            JComponent[]   componentes  = new JComponent[]{
                                comboCarritos,
                                cantidad,
                                spin
                            } ;
                            if(comboCarritos.getItemCount()>0){
                                int result = JOptionPane.showConfirmDialog(null, componentes,"Seleccione a que carrito desea agregar" ,JOptionPane.YES_NO_OPTION);
                                if(result==JOptionPane.YES_OPTION){
                                    if(DiarioFacilTester.diarioFacil.stockDisponibleCompra(p.getNombre(),(int)Math.round(Double.parseDouble(spin.getValue().toString())))>=0){
                                        //Realizar el agregado al carrito
                                        if(DiarioFacilTester.diarioFacil.agregarProductoAlCarrito(DiarioFacilTester.diarioFacil.getProductoByName(p.getNombre()),(int)Math.round(Double.parseDouble(spin.getValue().toString())), Constantes.USUARIOLOGUEADO,comboCarritos.getSelectedItem().toString())){
                                            //Todo nice
                                            JOptionPane.showMessageDialog(null,"Producto agregado al carrito exitosamente","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-ok-24.png"));
                                        }else{
                                            //Ohh nooo jojo scream
                                            JOptionPane.showMessageDialog(null,"Algo salio mal","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
                                        }
                                    
                                    }else{
                                        JOptionPane.showMessageDialog(null,"No tenemos suficientes :(","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
                                    }
                                }
                            }else{
                                //No hay carritos
                                JOptionPane.showMessageDialog(null,"No tiene ningun carrito creado,cree uno!","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
                            }
                           
                        }
                }
            });
            
            comprar.setIcon(icon2.getIcon());
            
            precioOriginal.setFont(new Font("TimesRoman", Font.PLAIN, 14));
            prod.setFont(new Font("TimesRoman", Font.PLAIN, 14));
            lab.setFont(new Font("TimesRoman", Font.PLAIN, 16));
            comprar.setFont(new Font("TimesRoman", Font.PLAIN, 16));
            lab.setForeground(Color.WHITE);
            prod.setForeground(Color.WHITE);
            precioOriginal.setForeground(Color.WHITE);
            pan.add(icon,BorderLayout.WEST);
            pan.add(comprar,BorderLayout.PAGE_END);
            pan.add(lab,BorderLayout.PAGE_START);
            pan.add(prod,BorderLayout.CENTER);
            
            
            pan.setPreferredSize(new Dimension(300, 100));
            pan.setBackground(Color.DARK_GRAY);
            jPanel2.add(pan);
        }
        lay.setRows(DiarioFacilTester.diarioFacil.getProductosFiltrados().size()/2);
        jPanel2.setLayout(lay);
        jPanel2.revalidate();
    }
        
        private void searchInventario(List<Producto> productos){
           JPanel pan;
           JLabel lab;
           JLabel prod;
           JLabel icon;
           JLabel icon2;
           JLabel precioOriginal;
           JButton comprar;
           GridLayout lay   = new GridLayout(100,2,20,20);
           jPanel2.setLayout(lay);
           for (Producto p : productos) {
               pan = new JPanel(new BorderLayout());
               lab = new JLabel(p.getNombre());
               prod = new JLabel("Precio : "+p.getPrecio()+"   Disponibles : "+p.getExistencias());
               comprar = new JButton("Agregar al carrito");
               icon = new JLabel();
               icon2 = new JLabel();
               precioOriginal = new JLabel();
               icon.setIcon(new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-price-tag-24.png"));
               icon2.setIcon(new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-shopping-cart-promotion-24.png"));

               comprar.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                           Object source = e.getSource();
                           if (source instanceof JButton) {
                               //Creando controles para el JOptionPane
                               SpinnerNumberModel model1 = new SpinnerNumberModel(1.0, 1.0, 100.0, 1.0);
                               RSComboMetro   comboCarritos = new RSComboMetro();
                               JSpinner spin  = new JSpinner(model1);
                               //Deshabilitando la escritura en el spinner
                               ((JSpinner.DefaultEditor) spin.getEditor()).getTextField().setEditable(false);
                               JLabel cantidad= new JLabel("Cantidad :");
                               RSButtonRiple button = new RSButtonRiple();
                               button.setText("Aceptar");
                               //Cargar el carrito
                               for(CarritoCompras car : DiarioFacilTester.diarioFacil.carritosCompra(Constantes.USUARIOLOGUEADO)){
                                   comboCarritos.addItem(car.getNombreCarrito());
                               }
                               //Obteniendo codigo de la promocion
                               JButton btn = (JButton)source;
                               String butSrcTxt = btn.getText();
                               //Coleccion de controles
                               JComponent[]   componentes  = new JComponent[]{
                                   comboCarritos,
                                   cantidad,
                                   spin
                               } ;
                               if(comboCarritos.getItemCount()>0){
                                   int result = JOptionPane.showConfirmDialog(null, componentes,"Seleccione a que carrito desea agregar" ,JOptionPane.YES_NO_OPTION);
                                   if(result==JOptionPane.YES_OPTION){
                                       if(DiarioFacilTester.diarioFacil.stockDisponibleCompra(p.getNombre(),(int)Math.round(Double.parseDouble(spin.getValue().toString())))>=0){
                                           //Realizar el agregado al carrito
                                           if(DiarioFacilTester.diarioFacil.agregarProductoAlCarrito(DiarioFacilTester.diarioFacil.getProductoByName(p.getNombre()),(int)Math.round(Double.parseDouble(spin.getValue().toString())), Constantes.USUARIOLOGUEADO,comboCarritos.getSelectedItem().toString())){
                                               //Todo nice
                                               JOptionPane.showMessageDialog(null,"Producto agregado al carrito exitosamente","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-ok-24.png"));
                                           }else{
                                               //Ohh nooo jojo scream
                                               JOptionPane.showMessageDialog(null,"Algo salio mal","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
                                           }

                                       }else{
                                           JOptionPane.showMessageDialog(null,"No tenemos suficientes :(","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
                                       }
                                   }
                               }else{
                                   //No hay carritos
                                   JOptionPane.showMessageDialog(null,"No tiene ningun carrito creado,cree uno!","Sys",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-error-32.png"));
                               }

                           }
                   }
               });

               comprar.setIcon(icon2.getIcon());

               precioOriginal.setFont(new Font("TimesRoman", Font.PLAIN, 14));
               prod.setFont(new Font("TimesRoman", Font.PLAIN, 14));
               lab.setFont(new Font("TimesRoman", Font.PLAIN, 16));
               comprar.setFont(new Font("TimesRoman", Font.PLAIN, 16));
               lab.setForeground(Color.WHITE);
               prod.setForeground(Color.WHITE);
               precioOriginal.setForeground(Color.WHITE);
               pan.add(icon,BorderLayout.WEST);
               pan.add(comprar,BorderLayout.PAGE_END);
               pan.add(lab,BorderLayout.PAGE_START);
               pan.add(prod,BorderLayout.CENTER);


               pan.setPreferredSize(new Dimension(300, 100));
               pan.setBackground(Color.DARK_GRAY);
               jPanel2.add(pan);
           }
           lay.setRows(DiarioFacilTester.diarioFacil.getProductosFiltrados().size()/2);
           jPanel2.setLayout(lay);
           jPanel2.repaint();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        rSMTextFull1 = new rojeru_san.RSMTextFull();
        rSButton1 = new rojeru_san.RSButton();
        rSComboMetro1 = new rojerusan.RSComboMetro();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        rSMTextFull1.setPlaceholder("Nombre de un producto...");
        rSMTextFull1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rSMTextFull1KeyTyped(evt);
            }
        });

        rSButton1.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSMTextFull1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSComboMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSMTextFull1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSComboMetro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSMTextFull1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rSMTextFull1KeyTyped
        // TODO add your handling code here:
        jPanel2.removeAll();
        searchInventario(DiarioFacilTester.diarioFacil.searchProductos(rSMTextFull1.getText()));
        this.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_rSMTextFull1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSButton rSButton1;
    private rojerusan.RSComboMetro rSComboMetro1;
    private rojeru_san.RSMTextFull rSMTextFull1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.interfaces;

import edu.ulatina.entidades.CarritoCompras;
import edu.ulatina.entidades.Constantes;
import edu.ulatina.entidades.Promocion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import rojeru_san.RSButtonRiple;
import rojerusan.RSComboMetro;

/**
 *
 * @author Nvidi
 */
public class pnlPromociones extends javax.swing.JPanel {

    /**
     * Creates new form pnlPromociones
     */
    public pnlPromociones() {
        initComponents();
        loadPanels();
    }
    
    
    public void loadPanels(){
        JPanel pan;
        JLabel lab;
        JLabel prod;
        JLabel icon;
        JLabel icon2;
        JLabel precioOriginal;
        JButton comprar;
        GridLayout lay   = new GridLayout(100,2,20,20);
        jPanel1.setLayout(lay);
        for (Promocion p : DiarioFacilTester.diarioFacil.getPromociones()) {
            pan = new JPanel(new BorderLayout());
            lab = new JLabel(p.getNombre());
            prod = new JLabel("Precio promocional : "+p.getPrecioPromocional() + "  Precio original : " +p.getPrecio());
            comprar = new JButton("Agregar al carrito :" +DiarioFacilTester.diarioFacil.getPromociones().indexOf(p));
            icon = new JLabel();
            icon2 = new JLabel();
            precioOriginal = new JLabel("Precio original : "+p.getPrecio());
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
                            ((DefaultEditor) spin.getEditor()).getTextField().setEditable(false);
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
                                 JOptionPane.showMessageDialog(null, componentes,"Seleccione a que carrito desea agregar" ,JOptionPane.QUESTION_MESSAGE,new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-shopping-cart-promotion-24.png"));
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
            jPanel1.add(pan);
        }
        lay.setRows(DiarioFacilTester.diarioFacil.getPromociones().size()/2);
        jPanel1.setLayout(lay);
        jPanel1.repaint();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setAutoscrolls(true);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jPanel1);
        jPanel1.getAccessibleContext().setAccessibleParent(null);

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

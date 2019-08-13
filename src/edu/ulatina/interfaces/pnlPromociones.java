/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.interfaces;

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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
        JPanel pan;
        JLabel lab;
        JLabel prod;
        JLabel icon;
        JButton comprar;
        GridLayout lay   = new GridLayout(100,2,20,20);
        jPanel1.setLayout(lay);
        for (int i = 0; i <40; i++) {
            pan = new JPanel(new BorderLayout());
            lab = new JLabel("Producto");
            prod = new JLabel("Precio promocional : "+"23.4");
            comprar = new JButton("Comprar :"+i);
            icon = new JLabel();
            icon.setIcon(new ImageIcon("src/edu/ulatina/ejemplos/img/icons8-price-tag-24.png"));
            
            comprar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        Object source = e.getSource();
                        if (source instanceof JButton) {
                            JButton btn = (JButton)source;
                            String butSrcTxt = btn.getText();
                            JOptionPane.showMessageDialog(null, butSrcTxt);
                        }
                }
            });
            prod.setFont(new Font("TimesRoman", Font.PLAIN, 12));
            lab.setFont(new Font("TimesRoman", Font.PLAIN, 15));
            comprar.setFont(new Font("TimesRoman", Font.PLAIN, 15));
            lab.setForeground(Color.WHITE);
            prod.setForeground(Color.WHITE);
            
            pan.add(icon,BorderLayout.WEST);
            pan.add(comprar,BorderLayout.PAGE_END);
            pan.add(lab,BorderLayout.PAGE_START);
            pan.add(prod,BorderLayout.CENTER);
            
            pan.setPreferredSize(new Dimension(300, 100));
            pan.setBackground(Color.DARK_GRAY);
            jPanel1.add(pan);
        }
        lay.setRows(40/2);
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

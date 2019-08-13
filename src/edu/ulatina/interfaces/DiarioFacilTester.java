/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.interfaces;

import edu.ulatina.entidades.Categoria;
import edu.ulatina.entidades.Constantes;
import edu.ulatina.entidades.DiarioFacil;
import edu.ulatina.entidades.Promocion;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TEC-HP
 */
public final class DiarioFacilTester {
    public static frmaPrincipal frmaPrincipal ;
    public static DiarioFacil diarioFacil = new DiarioFacil();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
                Constantes.loadCredentialsSa();
                Constantes.loadInventory();
                try {
                    Constantes.loadPromociones();
                } catch (ParseException ex) {
                    System.err.println(""+ex.getMessage());
                }
                for(Categoria c: Constantes.CATEGORIAS){
                    diarioFacil.addCategoria(c);
                }
                diarioFacil.addPromos((ArrayList<Promocion>) Constantes.PROMODEFAULT);
                diarioFacil.create(Constantes.CLIENTEDEFAULT);
                diarioFacil.create(Constantes.ADMINSUPERUSUARIO);
                diarioFacil.create(Constantes.DEFAULTPROV);
                frmaPrincipal = new frmaPrincipal();
                frmaPrincipal.setVisible(true);
            }
        });
    }
    
}

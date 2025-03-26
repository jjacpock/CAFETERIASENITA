
package REGISTROS;

import FORMULARIOS.Panel_Clientes;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import FORMULARIOS.Panel_Empleados;
import FORMULARIOS.Panel_Familia;
import FORMULARIOS.Panel_Ingredientes;
import FORMULARIOS.Panel_Producto;



/**
 *
 * @author Usuario
 */
public class FInicio_Sesion_Cafeteria extends javax.swing.JFrame {

   
  private boolean menuAbierto = false;
           
    public FInicio_Sesion_Cafeteria() {
        initComponents();
        
    
        
    }
    
    public void desplegar(JPanel p ){
        
        p.setSize(1230, 630);
        p.setLocation(0,0);
        ancla1.removeAll();
        ancla1.add(p, BorderLayout.CENTER);
        ancla1.revalidate();
        ancla1.repaint();
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu9 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        ancla = new javax.swing.JPanel();
        pnmenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnempleados = new javax.swing.JButton();
        btnclientes = new javax.swing.JButton();
        btnfamilia = new javax.swing.JButton();
        btnproducto = new javax.swing.JButton();
        btnnutrientes = new javax.swing.JButton();
        ancla1 = new javax.swing.JPanel();
        menu = new javax.swing.JButton();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenu9.setText("jMenu9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ancla.setBackground(new java.awt.Color(209, 235, 247));
        ancla.setPreferredSize(new java.awt.Dimension(1000, 1000));

        pnmenu.setBackground(new java.awt.Color(242, 248, 251));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("COFFÉ DEIJOR");

        btnempleados.setBackground(new java.awt.Color(121, 182, 201));
        btnempleados.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnempleados.setForeground(new java.awt.Color(0, 0, 0));
        btnempleados.setText("EMPLEADOS");
        btnempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleadosActionPerformed(evt);
            }
        });

        btnclientes.setBackground(new java.awt.Color(121, 182, 201));
        btnclientes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnclientes.setForeground(new java.awt.Color(0, 0, 0));
        btnclientes.setText("CLIENTES");
        btnclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientesActionPerformed(evt);
            }
        });

        btnfamilia.setBackground(new java.awt.Color(121, 182, 201));
        btnfamilia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnfamilia.setForeground(new java.awt.Color(0, 0, 0));
        btnfamilia.setText("FAMILIA");
        btnfamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfamiliaActionPerformed(evt);
            }
        });

        btnproducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnproducto.setText("PRODUCTO");
        btnproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductoActionPerformed(evt);
            }
        });

        btnnutrientes.setBackground(new java.awt.Color(0, 153, 153));
        btnnutrientes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnnutrientes.setForeground(new java.awt.Color(0, 0, 0));
        btnnutrientes.setText("INGREDIENTES");
        btnnutrientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnutrientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnmenuLayout = new javax.swing.GroupLayout(pnmenu);
        pnmenu.setLayout(pnmenuLayout);
        pnmenuLayout.setHorizontalGroup(
            pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnmenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnmenuLayout.createSequentialGroup()
                        .addGroup(pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnempleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnmenuLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnclientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnfamilia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(pnmenuLayout.createSequentialGroup()
                        .addComponent(btnnutrientes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnmenuLayout.setVerticalGroup(
            pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnmenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(btnclientes)
                .addGap(18, 18, 18)
                .addComponent(btnempleados)
                .addGap(18, 18, 18)
                .addComponent(btnfamilia)
                .addGap(18, 18, 18)
                .addComponent(btnproducto)
                .addGap(18, 18, 18)
                .addComponent(btnnutrientes)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        ancla1.setBackground(new java.awt.Color(209, 235, 247));
        ancla1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 255), null));

        javax.swing.GroupLayout ancla1Layout = new javax.swing.GroupLayout(ancla1);
        ancla1.setLayout(ancla1Layout);
        ancla1Layout.setHorizontalGroup(
            ancla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1226, Short.MAX_VALUE)
        );
        ancla1Layout.setVerticalGroup(
            ancla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        menu.setBackground(new java.awt.Color(209, 235, 247));
        menu.setForeground(new java.awt.Color(209, 235, 247));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/granos-de-cafe (2).png"))); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout anclaLayout = new javax.swing.GroupLayout(ancla);
        ancla.setLayout(anclaLayout);
        anclaLayout.setHorizontalGroup(
            anclaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anclaLayout.createSequentialGroup()
                .addComponent(pnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(anclaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ancla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        anclaLayout.setVerticalGroup(
            anclaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(anclaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ancla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ancla, javax.swing.GroupLayout.DEFAULT_SIZE, 1506, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ancla, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientesActionPerformed

     Panel_Clientes p = new Panel_Clientes();
     desplegar(p);
    }//GEN-LAST:event_btnclientesActionPerformed

    private void btnempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempleadosActionPerformed

       Panel_Empleados p = new Panel_Empleados();
       desplegar(p);
    }//GEN-LAST:event_btnempleadosActionPerformed

    private void btnfamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfamiliaActionPerformed

        Panel_Familia p = new Panel_Familia();
        desplegar(p);
    }//GEN-LAST:event_btnfamiliaActionPerformed

    private void btnproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductoActionPerformed

        Panel_Producto p = new Panel_Producto();
        desplegar(p);
    }//GEN-LAST:event_btnproductoActionPerformed

    private void btnnutrientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnutrientesActionPerformed

        Panel_Ingredientes p = new Panel_Ingredientes();
        desplegar(p);
    }//GEN-LAST:event_btnnutrientesActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

        int posicion = this.pnmenu.getX();
    
    if (menuAbierto) {
        // Si el menú está abierto, lo movemos hacia la izquierda
        Animacion.Animacion.mover_izquierda(0, -227, 2, 2, pnmenu);
        menuAbierto = false; // Cambiamos el estado a cerrado
    } else {
        // Si el menú está cerrado, lo movemos hacia la derecha
        Animacion.Animacion.mover_derecha(-227, 0, 2, 2, pnmenu);
        menuAbierto = true; // Cambiamos el estado a abierto
    }
          
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(FInicio_Sesion_Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FInicio_Sesion_Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FInicio_Sesion_Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FInicio_Sesion_Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FInicio_Sesion_Cafeteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ancla;
    private javax.swing.JPanel ancla1;
    private javax.swing.JButton btnclientes;
    private javax.swing.JButton btnempleados;
    private javax.swing.JButton btnfamilia;
    private javax.swing.JButton btnnutrientes;
    private javax.swing.JButton btnproducto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JButton menu;
    private javax.swing.JPanel pnmenu;
    // End of variables declaration//GEN-END:variables
}

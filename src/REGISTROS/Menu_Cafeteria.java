
package REGISTROS;

import FORMULARIOS.Panel_Clientes;
import FORMULARIOS.Panel_Detalle_Venta;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import FORMULARIOS.Panel_Empleados;
import FORMULARIOS.Panel_Familia;
import FORMULARIOS.Panel_Ingredientes;
import FORMULARIOS.Panel_Producto;
import FORMULARIOS.Panel_Ventas;



/**
 *
 * @author Usuario
 */
public class Menu_Cafeteria extends javax.swing.JFrame {

   
  private boolean menuAbierto = false;
           
    public Menu_Cafeteria() {
        initComponents();
        
    
        
    }
    
    public void desplegar(JPanel p ){
        
        p.setSize(1370, 680);
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
        btnempleados = new javax.swing.JButton();
        btnclientes = new javax.swing.JButton();
        btnfamilia = new javax.swing.JButton();
        btnproducto = new javax.swing.JButton();
        btnnutrientes = new javax.swing.JButton();
        btnventas = new javax.swing.JButton();
        btndetalleventa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        ancla1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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

        ancla.setBackground(new java.awt.Color(112, 138, 147));
        ancla.setPreferredSize(new java.awt.Dimension(1000, 1000));

        pnmenu.setBackground(new java.awt.Color(112, 138, 147));
        pnmenu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), "MENÚ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Showcard Gothic", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        btnempleados.setBackground(new java.awt.Color(121, 182, 201));
        btnempleados.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnempleados.setForeground(new java.awt.Color(0, 0, 0));
        btnempleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/cafe.png"))); // NOI18N
        btnempleados.setToolTipText("AGREGAR EMPLEADO");
        btnempleados.setContentAreaFilled(false);
        btnempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleadosActionPerformed(evt);
            }
        });

        btnclientes.setBackground(new java.awt.Color(121, 182, 201));
        btnclientes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnclientes.setForeground(new java.awt.Color(0, 0, 0));
        btnclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/cliente.png"))); // NOI18N
        btnclientes.setToolTipText("AGREGAR CLIENTE");
        btnclientes.setContentAreaFilled(false);
        btnclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientesActionPerformed(evt);
            }
        });

        btnfamilia.setBackground(new java.awt.Color(121, 182, 201));
        btnfamilia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnfamilia.setForeground(new java.awt.Color(0, 0, 0));
        btnfamilia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-cafeteria-64.png"))); // NOI18N
        btnfamilia.setToolTipText("AGREGAR UNA FAMILIA");
        btnfamilia.setContentAreaFilled(false);
        btnfamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfamiliaActionPerformed(evt);
            }
        });

        btnproducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/menu-de-cafe.png"))); // NOI18N
        btnproducto.setToolTipText("AÑADIR UN PRODUCTO");
        btnproducto.setContentAreaFilled(false);
        btnproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductoActionPerformed(evt);
            }
        });

        btnnutrientes.setBackground(new java.awt.Color(0, 153, 153));
        btnnutrientes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnnutrientes.setForeground(new java.awt.Color(0, 0, 0));
        btnnutrientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/libro-de-cocina.png"))); // NOI18N
        btnnutrientes.setToolTipText("AÑADIR INGREDIENTES");
        btnnutrientes.setContentAreaFilled(false);
        btnnutrientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnnutrientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnutrientesActionPerformed(evt);
            }
        });

        btnventas.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/punto-de-venta (1).png"))); // NOI18N
        btnventas.setToolTipText("INGRESAR VENTAS");
        btnventas.setContentAreaFilled(false);
        btnventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventasActionPerformed(evt);
            }
        });

        btndetalleventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/punto-de-venta.png"))); // NOI18N
        btndetalleventa.setToolTipText("DETALLE DE VENTAS");
        btndetalleventa.setContentAreaFilled(false);
        btndetalleventa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btndetalleventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndetalleventaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CLIENTES");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EMPLEADOS");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FAMILIAS");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NUTRIENTES");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DETA-VENTA");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("VENTAS");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PRODUCTOS");

        javax.swing.GroupLayout pnmenuLayout = new javax.swing.GroupLayout(pnmenu);
        pnmenu.setLayout(pnmenuLayout);
        pnmenuLayout.setHorizontalGroup(
            pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(btnclientes)
                    .addComponent(jLabel2)
                    .addComponent(btnempleados)
                    .addComponent(jLabel1)
                    .addComponent(btnfamilia)
                    .addComponent(jLabel4)
                    .addComponent(btnproducto)
                    .addComponent(jLabel5)
                    .addComponent(btnnutrientes)
                    .addComponent(jLabel6)
                    .addComponent(btndetalleventa)
                    .addComponent(btnventas)
                    .addComponent(jLabel8))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnmenuLayout.setVerticalGroup(
            pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnclientes)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(btnempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfamilia)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnproducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(btnnutrientes)
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(btndetalleventa)
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(btnventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.setBackground(new java.awt.Color(209, 235, 247));
        menu.setForeground(new java.awt.Color(209, 235, 247));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/granos-de-cafe (2).png"))); // NOI18N
        menu.setContentAreaFilled(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        ancla1.setBackground(new java.awt.Color(209, 235, 247));
        ancla1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 255), null));

        javax.swing.GroupLayout ancla1Layout = new javax.swing.GroupLayout(ancla1);
        ancla1.setLayout(ancla1Layout);
        ancla1Layout.setHorizontalGroup(
            ancla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        ancla1Layout.setVerticalGroup(
            ancla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CAFETERIA SENITA");

        javax.swing.GroupLayout anclaLayout = new javax.swing.GroupLayout(ancla);
        ancla.setLayout(anclaLayout);
        anclaLayout.setHorizontalGroup(
            anclaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anclaLayout.createSequentialGroup()
                .addComponent(pnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(anclaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anclaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(menu)
                        .addGap(399, 399, 399)
                        .addComponent(jLabel3))
                    .addGroup(anclaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ancla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        anclaLayout.setVerticalGroup(
            anclaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anclaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(anclaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(menu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ancla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, anclaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ancla, javax.swing.GroupLayout.DEFAULT_SIZE, 1515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ancla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
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
        Animacion.Animacion.mover_izquierda(0, -250, 2, 2, pnmenu);
        menuAbierto = false; // Cambiamos el estado a cerrado
    } else {
        // Si el menú está cerrado, lo movemos hacia la derecha
        Animacion.Animacion.mover_derecha(-250, 0, 2, 2, pnmenu);
        menuAbierto = true; // Cambiamos el estado a abierto
    }
          
    }//GEN-LAST:event_menuActionPerformed

    private void btnventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventasActionPerformed

        Panel_Ventas p = new Panel_Ventas();
        desplegar(p);
    }//GEN-LAST:event_btnventasActionPerformed

    private void btndetalleventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetalleventaActionPerformed
        
        Panel_Detalle_Venta p = new Panel_Detalle_Venta();
        desplegar(p);
    }//GEN-LAST:event_btndetalleventaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Cafeteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ancla;
    private javax.swing.JPanel ancla1;
    private javax.swing.JButton btnclientes;
    private javax.swing.JButton btndetalleventa;
    private javax.swing.JButton btnempleados;
    private javax.swing.JButton btnfamilia;
    private javax.swing.JButton btnnutrientes;
    private javax.swing.JButton btnproducto;
    private javax.swing.JButton btnventas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FORMULARIOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Panel_Detalle_Venta extends javax.swing.JPanel {

     DefaultTableModel tb = new DefaultTableModel();
    /**
     * Creates new form Panel_Detalle_Venta
     */
    public Panel_Detalle_Venta() {
        initComponents();
        
        String ids [] = {"ID DETALLE","ID VENTA","ID PRODUCTO","CANTIDAD","PRECIO UNITARIO","DESCUENTOS","SUBTOTAL","TOTAL DETALLE"};
        
        tb.setColumnIdentifiers(ids);
        tabla.setModel(tb);
        
        
        //llamar producto
        
         Connection conect = null;
              PreparedStatement loguin = null;
              ResultSet rs = null;
        
        
         try {

              Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
              
              con.ConexionPostgres();
              
               conect=con.getConnection();
           
            String query = ("Select * From productos order by id_producto ASC");
            
             loguin = conect.prepareStatement(query);
             
             rs = loguin.executeQuery();
             
              while(rs.next()){
              
                  Long  ID_PRODUCTO = rs.getLong("id_producto");
                  String NOMBRE_PRODUCTO = rs.getString("nombre_producto");
                  System.out.println(ID_PRODUCTO+" - "+NOMBRE_PRODUCTO);
                  
                  idproducto.addItem(NOMBRE_PRODUCTO);
              
              }
              
              
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(Panel_Familia.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(Panel_Familia.class.getName()).log(Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
              Logger.getLogger(Panel_Familia.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
              Logger.getLogger(Panel_Familia.class.getName()).log(Level.SEVERE, null, ex);
          } 
              finally{
           try{
               if(rs != null) rs.close();
               if(loguin != null)loguin.close();
               if(conect != null)conect.close();
           }
           catch(SQLException e){
               e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iddetalle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idventa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idproducto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        totaldetalle = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        descuentos = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(228, 242, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), "DETALLE VENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID_DETALLE:");

        iddetalle.setBackground(new java.awt.Color(209, 235, 247));
        iddetalle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        iddetalle.setForeground(new java.awt.Color(0, 0, 0));
        iddetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID_VENTA:");

        idventa.setBackground(new java.awt.Color(209, 235, 247));
        idventa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        idventa.setForeground(new java.awt.Color(0, 0, 0));
        idventa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRODUCTO:");

        idproducto.setBackground(new java.awt.Color(209, 235, 247));
        idproducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        idproducto.setForeground(new java.awt.Color(0, 0, 0));
        idproducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CANTIDAD:");

        cantidad.setBackground(new java.awt.Color(209, 235, 247));
        cantidad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cantidad.setForeground(new java.awt.Color(0, 0, 0));
        cantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PRECIO UNITARIO:");

        precio.setBackground(new java.awt.Color(209, 235, 247));
        precio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        precio.setForeground(new java.awt.Color(0, 0, 0));
        precio.setToolTipText("");
        precio.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DESCUENTOS:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SUBTOTAL:");

        subtotal.setBackground(new java.awt.Color(209, 235, 247));
        subtotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        subtotal.setForeground(new java.awt.Color(0, 0, 0));
        subtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TOTAL_DETALLE:");

        totaldetalle.setBackground(new java.awt.Color(209, 235, 247));
        totaldetalle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totaldetalle.setForeground(new java.awt.Color(0, 0, 0));
        totaldetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        btnguardar.setBackground(new java.awt.Color(112, 138, 147));
        btnguardar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(0, 0, 0));
        btnguardar.setText("GUARDAR");
        btnguardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(112, 138, 147));
        btnbuscar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnbuscar.setText("BUSCAR");
        btnbuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(112, 138, 147));
        btneditar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btneditar.setForeground(new java.awt.Color(0, 0, 0));
        btneditar.setText("EDITAR");
        btneditar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(112, 138, 147));
        btneliminar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(0, 0, 0));
        btneliminar.setText("ELIMINAR");
        btneliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnmostrar.setBackground(new java.awt.Color(112, 138, 147));
        btnmostrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnmostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnmostrar.setText("MOSTRAR");
        btnmostrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(209, 235, 247));
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        tabla.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(tabla);

        descuentos.setBackground(new java.awt.Color(209, 235, 247));
        descuentos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        descuentos.setForeground(new java.awt.Color(0, 0, 0));
        descuentos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)
                        .addComponent(descuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20)
                        .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addGap(20, 20, 20)
                        .addComponent(totaldetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(iddetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(idventa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iddetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(idventa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totaldetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(descuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
      
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox<String> descuentos;
    private javax.swing.JTextField iddetalle;
    private javax.swing.JComboBox<String> idproducto;
    private javax.swing.JTextField idventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField totaldetalle;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FORMULARIOS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
     DefaultTableModel tb2 = new DefaultTableModel();
    /**
     * Creates new form Panel_Detalle_Venta
     */
    public Panel_Detalle_Venta() {
        initComponents();
        
        String ids [] = {"ID DETALLE","ID VENTA","ID PRODUCTO","CANTIDAD","PRECIO UNITARIO","DESCUENTOS","SUBTOTAL","TOTAL DETALLE"};
        String ids2 [] = {"ID PRODUCTO","NOMBRE PRODUCTO","VALOR UNITARIO","CANTIDAD A COMPRAR","SUBTOTAL"};
        
        tb.setColumnIdentifiers(ids);
        tb2.setColumnIdentifiers(ids2);
        tabla.setModel(tb);
        tabla2.setModel(tb2);
        
        jButton1.setVisible(true);
        
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

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
        descuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuentosActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(209, 235, 247));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), "PRODUCTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(112, 138, 147));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("AÑADIR");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla2.setBackground(new java.awt.Color(209, 235, 247));
        tabla2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        tabla2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tabla2.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(tabla2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(totaldetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(descuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iddetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(idventa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(totaldetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        double subtotal_1= 0.0;
        
         //Declarar variables
       Connection conect = null;
       PreparedStatement search = null;
       ResultSet rs = null;
        
         try {
             String producto = idproducto.getSelectedItem().toString().trim();
             
             //iniciar conexion con la BD
             
             Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
             
             con.ConexionPostgres();
             
             conect = con.getConnection();
             
             String buscar_BD = ("SELECT*FROM productos WHERE nombre_producto = ?");
             
             search = conect.prepareStatement(buscar_BD);
             
             search.setString(1, producto);
             
             rs = search.executeQuery();
             
             if(rs.next()){
                 
                 long id_producto = rs.getLong("id_producto");
                 double valorunitario = rs.getDouble("precio_producto");
                 
                  //pedir las unidades a comprar
                  
                  double unidades = Double.parseDouble(JOptionPane.showInputDialog(null,"Teniendo en cuenta que el valor unitario del producto es de $"+valorunitario+"\n"+"¿Cuantas unidades desea adquirir?","Unidades solicitadas",JOptionPane.INFORMATION_MESSAGE));
                  
                  double unidadesXvalorunitario = unidades*valorunitario;
                  
                  if(unidades >= 5){
                      
                      //crear el item a añadir
                      String item5U = "Descuento del 5% por 5 o mas unidades";
                      //validar si no existe el item (descuento)
                      boolean itemExistente = false;
                      
                      for (int i = 0; i < descuentos.getItemCount(); i++) {
            if (descuentos.getItemAt(i).equals(item5U)) {
                itemExistente = true;
                break;
            }
        }                    
                      // Si no existe, agregarlo
        if (!itemExistente) {
            descuentos.addItem(item5U);
            System.out.println("El ítem '" + item5U + "' fue agregado.");
        } else {
            System.out.println("El ítem '" + item5U + "' ya existe en el JComboBox.");
            
        }
                  }
          if (unidades >= 8){
                      
                      //crear el item a añadir
                      String item5U = "Descuento del 10% por 8 o mas unidades";
                      //validar si no existe el item (descuento)
                      boolean itemExistente = false;
                      
                      for (int i = 0; i < descuentos.getItemCount(); i++) {
            if (descuentos.getItemAt(i).equals(item5U)) {
                itemExistente = true;
                break;
            }
        }                    
                      // Si no existe, agregarlo
        if (!itemExistente) {
            descuentos.addItem(item5U);
            System.out.println("El ítem '" + item5U + "' fue agregado.");
        } else {
            System.out.println("El ítem '" + item5U + "' ya existe en el JComboBox.");
            
        }
                                     
                  }
          
          tb2.addRow(new  Object[]{id_producto,producto,valorunitario,unidades,unidadesXvalorunitario});
                 
          int confirmacion;
          
          confirmacion = JOptionPane.showConfirmDialog(null, "Desea agregar mas productos?","",JOptionPane.INFORMATION_MESSAGE);
          
          if(confirmacion == JOptionPane.NO_OPTION){
              
              jButton1.setVisible(false);
              
              double suma = 0.0;

               for( int i = 0; i<tabla2.getRowCount(); i++){
            DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
 
            String fila = modelo.getValueAt(i, 4).toString();
            
            suma+= Double.parseDouble(fila);
            
                  System.out.println(fila);                 
}
               System.out.println(suma);

               subtotal.setText(suma+"");
              
               
              
          }              
             }
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void descuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuentosActionPerformed
        
        String descuento_seleccionado = descuentos.getSelectedItem().toString();
        
        descuentos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String descuento_seleccionado = descuentos.getSelectedItem().toString();
                
                if(descuento_seleccionado == "Descuento del 5% por 5 o mas unidades"){
                    
                    double subt = Double.parseDouble(subtotal.getText().trim());
                    
                    double descuento5U = subt-(subt*0.05);
                    
                    totaldetalle.setText(""+descuento5U);
                    
                }else if(descuento_seleccionado == "Descuento del 10% por 8 o mas unidades"){
                    
                    double subt = Double.parseDouble(subtotal.getText().trim());
                    
                    double descuento8U = subt-(subt*0.10);
                    
                    totaldetalle.setText(""+descuento8U);
                }           
            }
        });
    }//GEN-LAST:event_descuentosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JComboBox<String> descuentos;
    private javax.swing.JTextField iddetalle;
    private javax.swing.JComboBox<String> idproducto;
    private javax.swing.JTextField idventa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField totaldetalle;
    // End of variables declaration//GEN-END:variables
}

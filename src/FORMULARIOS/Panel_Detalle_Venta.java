
package FORMULARIOS;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Panel_Detalle_Venta extends javax.swing.JPanel {

     DefaultTableModel tb = new DefaultTableModel();
     DefaultTableModel tb2 = new DefaultTableModel();
    /**
     * Creates new form Panel_Detalle_Venta
     */
    public Panel_Detalle_Venta() {
        initComponents();
        
        String ids [] = {"ID DETALLE","ID VENTA","SUBTOTAL","TOTAL DETALLE"};
        String ids2 [] = {"ID PRODUCTO","NOMBRE PRODUCTO","VALOR UNITARIO","CANTIDAD A COMPRAR","SUBTOTAL"};
        
        tb.setColumnIdentifiers(ids);
        tb2.setColumnIdentifiers(ids2);
        tabla.setModel(tb);
        tabla2.setModel(tb2);
        
        jButton1.setVisible(true);

         Connection conect = null;
              PreparedStatement loguin = null;
              ResultSet rs = null;              
              
          //llamar familias
            
        
         try {

              Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
              
              con.ConexionPostgres();
              
               conect=con.getConnection();
           
            String query = ("Select * From familias order by id_familia ASC");
            
             loguin = conect.prepareStatement(query);
             
             rs = loguin.executeQuery();
             
              while(rs.next()){
              
                  Long  Familia_ID = rs.getLong("id_familia");
                  String Familia_N = rs.getString("nombre_familia");
                  System.out.println(Familia_ID+" - "+Familia_N);
                  
                  familia.addItem(Familia_N);
              
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
        btneliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        descuentos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        familia = new javax.swing.JComboBox<>();
        btneliminartabla2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        candis = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(228, 242, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), "DETALLE VENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID_DETALLE:");

        iddetalle.setBackground(new java.awt.Color(209, 235, 247));
        iddetalle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        iddetalle.setForeground(new java.awt.Color(0, 0, 0));
        iddetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        iddetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iddetalleActionPerformed(evt);
            }
        });

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
        idproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idproductoActionPerformed(evt);
            }
        });

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

        jButton1.setBackground(new java.awt.Color(112, 138, 147));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/anadir-al-carrito (1).png"))); // NOI18N
        jButton1.setToolTipText("Añadir Articulos Al Carrito");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla2.setBackground(new java.awt.Color(209, 235, 247));
        tabla2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tabla2.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(tabla2);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FAMILIA_PRODUCTO:");

        familia.setBackground(new java.awt.Color(209, 235, 247));
        familia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        familia.setForeground(new java.awt.Color(0, 0, 0));
        familia.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        familia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familiaActionPerformed(evt);
            }
        });

        btneliminartabla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/quitar-del-carrito.png"))); // NOI18N
        btneliminartabla2.setToolTipText("Eliminar Articulos Del Carrito");
        btneliminartabla2.setContentAreaFilled(false);
        btneliminartabla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminartabla2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CANTIDADES DISPONIBLES:");

        candis.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        candis.setForeground(new java.awt.Color(204, 0, 0));
        candis.setText("...");

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
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(descuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20)
                                .addComponent(iddetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(idventa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(familia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(totaldetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButton1)
                                .addGap(27, 27, 27)
                                .addComponent(btneliminartabla2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(candis, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iddetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(idventa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(familia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(totaldetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1)
                            .addComponent(btneliminartabla2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(candis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
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

         try {
             
             
            //Validar Datos
            if(iddetalle.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "Debe rellenar el campo de ID de Detalle", "Campo Vacio", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(idventa.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "Debe rellenar el campo de ID de Venta","Campo Vacio",JOptionPane.ERROR_MESSAGE);
                return;
            }
           
            if(subtotal.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "Debe rellenar el campo de Subtotal","Campo vacio",JOptionPane.ERROR_MESSAGE);
                return;
            }
            

            
            //Asignar orden de los datos en la tabla
            
            int ADT = tb.getRowCount();
            
            for(int i = 0; i<ADT; i++){
                
                //Asignar Dato en la Tabla (ID DETALLE)
                long IDdetalle_ADT = Long.parseLong(tb.getValueAt(i, 0).toString());
                
                //Asignar Dato en la Tabla (ID VENTA)
                long IDventa_ADT = Long.parseLong(tb.getValueAt(i, 1).toString());             
                
                //Asignar Dato en la Tabla (SUBTOTAL)
                double Subtotal_ADT = Double.parseDouble(tb.getValueAt(i, 2).toString().replace(",", ""));
                                           
                //Asignar Dato en la Tabla (TOTAL)              
                double Total_ADT = Double.parseDouble(tb.getValueAt(i, 3).toString().replace(",", ""));

            }
                       
            //Obtener Los Datos Para Insertarlos
              
            //ID de detalle
            long Id_detalle = Long.parseLong(iddetalle.getText().trim());
            
            //ID de Venta
            long id_venta = Long.parseLong(idventa.getText().trim());
            
           
           //Subtotal
           double subtotal_detalle = Double.parseDouble(subtotal.getText());
           

            if(descuentos.getItemCount() == 0){
                    totaldetalle.setText(subtotal_detalle+"");
                }
                       
            //Total 
            double Total_detalle = Double.parseDouble(totaldetalle.getText());
                        
            
            //PRODUCTOS TABLA REFERENTE AL DETALLE
        
           for( int i = 0; i<tabla2.getRowCount(); i++){
            DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
            
             long id_producto_detalleventa = Long.parseLong(modelo.getValueAt(i, 0).toString());
             
             String nombre_producto_detalleventa = modelo.getValueAt(i, 1).toString();
             
             double valorunitario_producto_detalleventa = Double.parseDouble(modelo.getValueAt(i, 2).toString().replace(",",""));
             
             double cantidad_producto_detalleventa = Double.parseDouble(modelo.getValueAt(i, 3).toString());
             
             double subtotal_producto_detalleventa =Double.parseDouble(modelo.getValueAt(i, 4).toString().replace(",", ""));
             
              System.out.println(Id_detalle+"\n"+id_producto_detalleventa+"\n"+nombre_producto_detalleventa+"\n"+valorunitario_producto_detalleventa+"\n"+cantidad_producto_detalleventa+"\n"+subtotal_producto_detalleventa);
           
              
              //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            //query o consulta
            String query = "Insert into productos_detalleventas values("+Id_detalle+", "+id_producto_detalleventa+", '"+nombre_producto_detalleventa+"', "+valorunitario_producto_detalleventa+","+cantidad_producto_detalleventa+","+subtotal_detalle+"  )";
              
            System.out.println(query);
            con.actualizar(query);
                        
         }
            
                         
            //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            //query o consulta
            String query = "Insert into detalle_ventas values("+Id_detalle+", "+id_venta+", "+subtotal_detalle+", "+Total_detalle+"  )";
            
            System.out.println(query);
            con.actualizar(query);
            
            JOptionPane.showMessageDialog(null, "DETALLE DE VENTA REALIZADO CON EXITO");
            
            
            DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
            modelo.setRowCount(0); // Borra todas las filas
            
            //Cerrar conexión
            con.cerrar();          
            
            //Mostrar Los Datos En La Tabla
            tb.addRow(new Object []{Id_detalle,id_venta,(subtotal_detalle),(Total_detalle)} );
                     
            //Limpiar Los Campos
            iddetalle.setText("");
            idventa.setText("");
            subtotal.setText("");
            totaldetalle.setText("");
            descuentos.removeAllItems();
            
            //Listar Desde La BD
        tb.setRowCount(0);
        
        //Establecer Conexión con la base de datos         
            try{
                
                con.ConexionPostgres();
                
                String seleccionar_ = "SELECT * FROM detalle_ventas order by id_detalle ASC";
                
                ResultSet rs = con.consultar(seleccionar_);
                
                while(rs.next()){
                    
                    tb.addRow(new Object[]{
                    
                   rs.getLong("id_detalle"),
                   rs.getLong("id_venta"),
                   (rs.getDouble("subtotal_detalle")),
                   (rs.getDouble("total_detalle"))
                            
                    });
                }                            
            }catch (Exception ex) {
ex.printStackTrace();
JOptionPane.showMessageDialog(null, "ERROR AL CARGAR DETALLES DE VENTA DESDE LA BASE DE DATOS");
}
           con.cerrar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
                                          
            
              
              //Declarar variables
              Connection conect = null;
              PreparedStatement search = null;
              ResultSet rs = null;
              
              long IdBuscar = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el id para buscar", "Buscar", JOptionPane.INFORMATION_MESSAGE));
              
              //try catch
              try{
                  Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                  
                  con.ConexionPostgres();
                  
                  conect=con.getConnection();
                  
                  //buscar datos basicos
                  
                  String Mostrar = ("SELECT * FROM detalle_ventas WHERE id_detalle = ?");
                  
                  search = conect.prepareStatement(Mostrar);
                  
                  
                  search.setLong(1, IdBuscar);
                  
                  rs= search.executeQuery();
                  
                  if(rs.next()){
                      
                      double subt = Double.parseDouble(rs.getString("subtotal_detalle"));
                      double tot = Double.parseDouble(rs.getString("total_detalle"));
                      
                      iddetalle.setText(rs.getString("id_detalle"));
                      idventa.setText(rs.getString("id_venta"));
                      subtotal.setText((subt)+"");
                      totaldetalle.setText((tot)+"");
                      
                      
                      
                      
                  }else{
                      JOptionPane.showMessageDialog(null, "Registro no encontrado", "Registro no Encontrado", JOptionPane.ERROR_MESSAGE);
                  }
                  
              }
              catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "Ingrese un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
              }
              catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Error en la base de Datos", "Error", JOptionPane.ERROR_MESSAGE);
              }
              catch(HeadlessException | ClassNotFoundException | IllegalAccessException | InstantiationException e){
                  JOptionPane.showMessageDialog(null, "Error inesperado", "Error", JOptionPane.ERROR_MESSAGE);
              }
              finally{
                  try {
                      if(rs != null) rs.close();
                      if(search != null)search.close();
                      if(conect != null)conect.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
               try{         
              
              Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
              
              //Buscar Porductos asociados
              con.ConexionPostgres();
              conect = con.getConnection();
              
              String buscarproductos = ("SELECT*FROM productos_detalleventas WHERE id_detalle_tabladetalle= ?");
              
              search = conect.prepareStatement(buscarproductos);
              search.setLong(1, IdBuscar);
              
              rs= search.executeQuery();
              
              while(rs.next()){
                  
                  long id_producto =  rs.getLong("id_producto_tabladetalle");
                  
                  String nombre_producto = rs.getString("nombre_producto_tabladetalle");
                  
                  double valoru_producto = rs.getDouble("valoru_producto_tabla");
                  
                  double cantidadu_producto = rs.getDouble("productoc_producto_tabladetalle");
                  
                  double subtotal_producto = rs.getDouble("subt_producto_tabladetalle");
                  
                  tb2.addRow(new  Object[]{id_producto,nombre_producto,(valoru_producto),cantidadu_producto,(subtotal_producto)});
                  
                 JOptionPane.showMessageDialog(null, "Registro encontrado", "Registro Encontrado", JOptionPane.INFORMATION_MESSAGE);
              }
              
              
                         
          }
       catch(ClassNotFoundException ex){
             Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch(SQLException ex){
             Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
       }
       catch(InstantiationException ex){
             Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
             Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
         } 
          
          
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        
         int confirmacion;
        
        int fila= tabla.getSelectedRow();
        
        if(fila==-1){
            
            JOptionPane.showMessageDialog(null, "Seleccione una fila primero","Seleccionar fila",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
         confirmacion= JOptionPane.showConfirmDialog(null,"¿Esta Seguro de Eliminar la linea seleccionada?","Confirmación Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
            if(confirmacion==JOptionPane.YES_OPTION){
                
                

             try {
                 String Id_venta = tabla.getValueAt(fila, 0).toString();
                 
                 Conexion  con= new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                 
                 con.ConexionPostgres();
                 
                 String query_delete = "DELETE FROM detalle_ventas WHERE id_detalle= '"+Id_venta+"'";
                 String query_delete_productos = "DELETE FROM productos_detalleventas WHERE id_detalle_tabladetalle = '"+Id_venta+"'";
                 
                 int FilasAfectadasP = con.actualizar1(query_delete_productos);
                 int FilasAfectadas = con.actualizar1(query_delete);
                 
                 if(FilasAfectadas > 0 && FilasAfectadasP > 0){
                     JOptionPane.showMessageDialog(null, "Detalle de Venta eliminado con exíto");
                    
                     DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
                     modelo.setRowCount(0); // Borra todas las filas
                 }
                 else{
                     
                     JOptionPane.showMessageDialog(null, "No Hay dicho Detalle de Venta en la base de Datos");
                 }
                 con.cerrar();
                 
                 tb.removeRow(tabla.getSelectedRow());
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
             }
                 
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
DecimalFormat formato = new DecimalFormat("#,###.00"); // Formato con separadores de miles y dos decimales       
       
     
                 //Listar Desde La BD
        tb.setRowCount(0);
        
        //Establecer Conexión con la base de datos        

            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            try{
                
                con.ConexionPostgres();
                
                String seleccionar_ = "SELECT * FROM detalle_ventas order by id_detalle ASC";
                
                ResultSet rs = con.consultar(seleccionar_);
                
                while(rs.next()){
                    
                    tb.addRow(new Object[]{
                    
                   rs.getLong("id_detalle"),
                   rs.getLong("id_venta"),
                   formato.format(rs.getDouble("subtotal_detalle")),
                   formato.format(rs.getDouble("total_detalle"))
                            
                    });
                } con.cerrar();
            }catch (Exception ex) {
ex.printStackTrace();
JOptionPane.showMessageDialog(null, "ERROR AL CARGAR DETALLES DE VENTA DESDE LA BASE DE DATOS");
}


    }//GEN-LAST:event_btnmostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

   
        double CU_Disp = Double.parseDouble(candis.getText());
           
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
                  
                  double unidades = Double.parseDouble(JOptionPane.showInputDialog(null,"Teniendo en cuenta que el valor unitario del producto es de $"+(valorunitario)+"\n"+"¿Cuantas unidades desea adquirir?","Unidades solicitadas",JOptionPane.INFORMATION_MESSAGE));
                  
                  if(unidades > CU_Disp){
                      
                      JOptionPane.showMessageDialog(null, "Revise las Unidades Disponibles, La Cantidad Seleccionada es mayor a las unidades disponibles","No Hay Unidades Suficientes",JOptionPane.ERROR_MESSAGE );
                      
                  }else{
                      
                      int unidades_resta = (int) (CU_Disp-unidades);
                      
                      candis.setText(unidades_resta+"");
                      
                      String queryupdatecan = "update productos set cantidad_producto= "+unidades_resta+" Where id_producto= "+id_producto;
                      
                      con.actualizar(queryupdatecan);
                      
                      
                      
                      double unidadesXvalorunitario = unidades*valorunitario;
                  
          
          tb2.addRow(new  Object[]{id_producto,producto,(valorunitario),unidades,(unidadesXvalorunitario)});
                 
          
            double suma = 0.0;
              double sumaC = 0.0;

               for( int i = 0; i<tabla2.getRowCount(); i++){
            DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
 
            String fila = modelo.getValueAt(i, 4).toString();
            
            suma+= Double.parseDouble(fila);
            
                  System.out.println(fila);                 
}
               System.out.println(suma);
               
               

               subtotal.setText((suma)+"");
               
                              for( int i = 0; i<tabla2.getRowCount(); i++){
            DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
 
            String fila = modelo.getValueAt(i, 3).toString();
            
            sumaC+= Double.parseDouble(fila);
            
                  System.out.println(fila);                 
}
                              
                              System.out.println(sumaC);
                              
                                                      
                   if(sumaC >= 5){
                      
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
          if (sumaC >= 8){
                      
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
                        
        descuentos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String descuento_seleccionado = (String) descuentos.getSelectedItem();
                
                if(descuento_seleccionado == "Descuento del 5% por 5 o mas unidades"){
                    
                    double subt = Double.parseDouble(subtotal.getText().trim());
                    
                    double descuento5U = subt-(subt*0.05);
                    
                    totaldetalle.setText(""+(descuento5U));
                    
                }else if(descuento_seleccionado == "Descuento del 10% por 8 o mas unidades"){
                    
                    double subt = Double.parseDouble(subtotal.getText().trim());
                    
                    double descuento8U = subt-(subt*0.10);
                    
                    totaldetalle.setText(""+(descuento8U));
                }     
            }
        });
    }//GEN-LAST:event_descuentosActionPerformed

    private void btneliminartabla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminartabla2ActionPerformed

                 //Declarar variables
       Connection conect = null;
       PreparedStatement search = null;
       ResultSet rs = null;
        
        
         int confirmacion;
        
        int fila= tabla2.getSelectedRow();
        
        if(fila==-1){
            
            JOptionPane.showMessageDialog(null, "Seleccione una fila primero","Seleccionar fila",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
         confirmacion= JOptionPane.showConfirmDialog(null,"¿Esta Seguro de Eliminar la linea seleccionada?","Confirmación Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
            if(confirmacion==JOptionPane.YES_OPTION){
                
                double resta = 0.0;
                

                for( int i = 0; i<tabla2.getRowCount(); i++){

                    try {
                        DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
                        
                        double subt = Double.parseDouble(subtotal.getText().trim());
                        
                        String fila_ = modelo.getValueAt(i, 4).toString();
                        double cudev = (double) modelo.getValueAt(i, 3);
                        String nompro = modelo.getValueAt(i, 1).toString();
                        
                        int cudevint = (int)cudev;
                        
                        int un = Integer.parseInt(candis.getText());
                        
                        int sumadev = un+cudevint;
                        
                        candis.setText(""+sumadev);
                        
                        //Establecer Conexión con la base de datos
                        Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                        
                        try {
                            con.ConexionPostgres();
                            
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        conect = con.getConnection();
                        
                        String buscar_BD = ("SELECT*FROM productos WHERE nombre_producto = ?");
                        
                        search = conect.prepareStatement(buscar_BD);
                        
                        search.setString(1, nompro);
                        
                        rs = search.executeQuery();
                        
                        if(rs.next()){
                            
                            long id_producto = rs.getLong("id_producto");
                                                 
                            try {
                                con.ConexionPostgres();
                                
                                String devcanquery = "update productos set cantidad_producto= "+sumadev+" Where id_producto= "+id_producto;
                                
                                con.actualizar(devcanquery);
                                
                                            
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (InstantiationException ex) {
                                Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IllegalAccessException ex) {
                                Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            resta = subt-(Double.parseDouble(fila_));
                            
                            System.out.println(fila_);
                            
                            System.out.println(resta);
                        }
                        
                        subtotal.setText(""+(resta));
                        
                        descuentos.removeAllItems();
                        
                        tb2.removeRow(tabla2.getSelectedRow());
                        
                        subtotal.setText("");
                        totaldetalle.setText("");
                    } catch (SQLException ex) {
                        Logger.getLogger(Panel_Detalle_Venta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 
                 
                }
            }
        }
    }//GEN-LAST:event_btneliminartabla2ActionPerformed

    private void familiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familiaActionPerformed

        String descuento_seleccionado = familia.getSelectedItem().toString();
        
        
        familia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
                idproducto.removeAllItems();
            
                try {
                    //Declarar variables
                    Connection conect = null;
                    PreparedStatement search = null;
                    ResultSet rs = null;
                    
                    
                    String familia_ = familia.getSelectedItem().toString().trim();
                    
                    //iniciar conexion con la BD
                    
                    Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                    
                    con.ConexionPostgres();
                    
                    conect = con.getConnection();
                    
                    String buscar_BD = ("SELECT*FROM productos WHERE familia_producto = ?");
                    
                    search = conect.prepareStatement(buscar_BD);
             
             search.setString(1, familia_);
             
             rs = search.executeQuery();
             
             while(rs.next()){
                 
                 String productos = rs.getString("nombre_producto");
                 
                 idproducto.addItem(productos);
                 
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
            } 
         });
    }//GEN-LAST:event_familiaActionPerformed

    private void iddetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iddetalleActionPerformed

        idventa.requestFocus();
    }//GEN-LAST:event_iddetalleActionPerformed

    private void idproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idproductoActionPerformed

            idproducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  
            
                try {
                    Connection conect = null;
                    PreparedStatement search = null;
                    ResultSet rs = null;
                    
                    String pro_nom= (String) idproducto.getSelectedItem();
                    
                    //iniciar conexion con la BD
                    
                    Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                    
                    con.ConexionPostgres();
                    
                    conect = con.getConnection();
                    
                    String buscar_BD = ("SELECT*FROM productos WHERE nombre_producto = ?");
                    
                    search = conect.prepareStatement(buscar_BD);
             
             search.setString(1, pro_nom);
             
             rs = search.executeQuery();
             
             while(rs.next()){
                 
                 String cantidad_pro = rs.getString("cantidad_producto");
                 
                 candis.setText(cantidad_pro);
                 
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
            
            
            
            
            
            
            }});     
    }//GEN-LAST:event_idproductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminartabla2;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JLabel candis;
    private javax.swing.JComboBox<String> descuentos;
    private javax.swing.JComboBox<String> familia;
    private javax.swing.JTextField iddetalle;
    private javax.swing.JComboBox<String> idproducto;
    private javax.swing.JTextField idventa;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField totaldetalle;
    // End of variables declaration//GEN-END:variables
}

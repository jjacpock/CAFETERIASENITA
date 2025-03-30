
package FORMULARIOS;

import com.sun.source.tree.BreakTree;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.DecimalFormat;


public class Panel_Ventas extends javax.swing.JPanel {
    
    DefaultTableModel tb = new DefaultTableModel();


    public Panel_Ventas() {
        initComponents();
        
        String ids [] = {"ID_VENTA","FECHA_VENTA","DATOS_CLIENTE","DATOS_EMPLEADO","FORMA_PAGO","TOTAL"};
        tb.setColumnIdentifiers(ids);
        tabla.setModel(tb);
        
        //añadir formas de pago
        pago.addItem("Efectivo");
        pago.addItem("Con Tarjeta - De Contado");
        pago.addItem("Con Tarjeta - A Credito");
        
        
        
        //llamar id venta
        
         Connection conect = null;
              PreparedStatement loguin = null;
              ResultSet rs = null;
        
        
         try {

              Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
              
              con.ConexionPostgres();
              
               conect=con.getConnection();
           
            String query = ("Select * From detalle_ventas order by id_venta DESC");
            
             loguin = conect.prepareStatement(query);
             
             rs = loguin.executeQuery();
             
              while(rs.next()){
              
                  Long  ID_Venta = rs.getLong("id_venta");
                  System.out.println(ID_Venta+"");
                  
                  id.addItem(ID_Venta+"");
              
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
         
         //llamar datos cliente
         
         try {

              Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
              
              con.ConexionPostgres();
              
               conect=con.getConnection();
           
            String query = ("Select * From clientes order by cedula_cliente ASC");
            
             loguin = conect.prepareStatement(query);
             
             rs = loguin.executeQuery();
             
              while(rs.next()){
              
                  Long  Cedula_cliente = rs.getLong("cedula_cliente");
                  String Nombre_Cliente = rs.getString("nombre_cliente");
                  System.out.println(Cedula_cliente+" - "+Nombre_Cliente);
                  
                  datoscliente.addItem(Cedula_cliente+" - "+Nombre_Cliente);
              
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
         
         
                  //llamar datos empleado
         
         try {

              Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
              
              con.ConexionPostgres();
              
               conect=con.getConnection();
           
            String query = ("Select * From empleados order by cedula_empleado ASC");
            
             loguin = conect.prepareStatement(query);
             
             rs = loguin.executeQuery();
             
              while(rs.next()){
              
                  Long  Cedula_Empleado = rs.getLong("cedula_empleado");
                  String Nombre_Empleado = rs.getString("nombre_empleado");
                  System.out.println(Cedula_Empleado+" - "+Nombre_Empleado);
                  
                  datosempleado.addItem(Cedula_Empleado+" - "+Nombre_Empleado);
              
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
        id = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        datoscliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        datosempleado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        pago = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        totalventa = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        valorventa = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(228, 242, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), "INGRESAR VENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID_Venta");

        id.setBackground(new java.awt.Color(209, 235, 247));
        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FECHA DE VENTA:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DATOS_CLIENTE:");

        datoscliente.setBackground(new java.awt.Color(209, 235, 247));
        datoscliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        datoscliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        datoscliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosclienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DATOS_EMPLEADO:");

        datosempleado.setBackground(new java.awt.Color(209, 235, 247));
        datosempleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        datosempleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("FORMA DE PAGO:");

        fecha.setBackground(new java.awt.Color(209, 235, 247));
        fecha.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        fecha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        pago.setBackground(new java.awt.Color(209, 235, 247));
        pago.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pago.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TOTAL_VENTA:");

        totalventa.setBackground(new java.awt.Color(209, 235, 247));
        totalventa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totalventa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

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
        btnbuscar.setToolTipText("");
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
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("VALOR_VENTA:");

        valorventa.setBackground(new java.awt.Color(209, 235, 247));
        valorventa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valorventa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(valorventa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(datoscliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addComponent(datosempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(40, 40, 40)
                                .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7)
                                .addGap(40, 40, 40)
                                .addComponent(totalventa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100)
                        .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8)
                        .addComponent(valorventa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(datoscliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(datosempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(totalventa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnbuscar)
                    .addComponent(btneditar)
                    .addComponent(btneliminar)
                    .addComponent(btnmostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
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

    private void datosclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datosclienteActionPerformed

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
                 
                 String query_delete = "DELETE FROM ventas WHERE id_venta= ' "+Id_venta+" ' ";
                 int FilasAfectadas = con.actualizar1(query_delete);
                 
                 if(FilasAfectadas > 0){
                     JOptionPane.showMessageDialog(null, "Venta eliminada con exíto");
                     
                     ((DefaultTableModel)tabla.getModel()).removeRow(fila);
                 }
                 else{
                     
                     JOptionPane.showMessageDialog(null, "No Hay dicha venta en la base de Datos");
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

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
DecimalFormat formato = new DecimalFormat("#,###.00"); // Formato con separadores de miles y dos decimales       
        try {


            //Validar Datos
            if(totalventa.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "Debe rellenar el campo del total de la venta", "Campo Vacio", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Asignar orden de los datos en la tabla
            
            int ADT = tb.getRowCount();
            
            for(int i = 0; i<ADT; i++){
                
                //Asignar Dato en la Tabla (ID)
                long ID_ADT = Long.parseLong(tb.getValueAt(i, 0).toString());
                
                //Asignar Dato en la Tabla (Fecha de Venta)
                String FechaVenta_ADT = tb.getValueAt(i, 1).toString();
                
                //Asignar Dato en la Tabla (Datos Cliente)
                String DatosCliente_ADT = tb.getValueAt(i, 2).toString();
                
                //Asignar Dato en la Tabla (Datos Empleado)
                String DatosEmpleado_ADT = tb.getValueAt(i, 3).toString();
                
                //Asignar Dato en la Tabla (Forma De Pago)
                String FormaDePago_ADT = tb.getValueAt(i, 4).toString();
                
                //Asignar Dato en la Tabla (Total Venta)              
                String TotalVenta_ADT = tb.getValueAt(i, 5).toString();

            }
            
            //Obtener Los Datos Para Insertarlos
            
            //ID de venta
            long Id = Long.parseLong(id.getSelectedItem().toString());
            
            //Fecha De Venta
            Date FechaVenta = fecha.getDate();
            
            //Formato de fecha
            SimpleDateFormat fc = new SimpleDateFormat("yyyy-MM-dd");
            String facha = fc.format(FechaVenta);
            
            //Datos De Cliente
            String DatosCliente = datoscliente.getSelectedItem().toString();
            
            //Datos De Empleado
            String DatosEmpleado = datosempleado.getSelectedItem().toString();
            
            //Forma De pago
            String FormaPago = pago.getSelectedItem().toString();
            
            //Total Venta
            double TotalVenta = Double.parseDouble(totalventa.getText().trim().replace(",", ""));
            
            
            //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            
            //query o consulta
            String query = "Insert into ventas values("+Id+", '"+facha+"', '"+DatosCliente+"', '"+DatosEmpleado+"', '"+FormaPago+"',"+TotalVenta+")";
            
            System.out.println(query);
            con.actualizar(query);
            
            JOptionPane.showMessageDialog(null, "VENTA REALIZADA CON EXITO");
            
            //Cerrar conexión
            con.cerrar();
                     
            //Mostrar Los Datos En La Tabla
            tb.addRow(new Object []{Id, facha, DatosCliente, DatosEmpleado, FormaPago, formato.format(TotalVenta)} );
            
            
            //Limpiar Los Campos
            totalventa.setText("");
            
            
            con.ConexionPostgres();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Listar Desde La BD
        tb.setRowCount(0);
        
        //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            try{
                
                con.ConexionPostgres();
                
                String seleccionar = "SELECT * FROM ventas";
                
                ResultSet rs = con.consultar(seleccionar);
                
                while(rs.next()){
                    
                    tb.addRow(new Object[]{
                    
                    rs.getLong("id_venta"),
                    rs.getString("fecha_venta"),
                    rs.getString("datoscliente_venta"),
                    rs.getString("datosempleado_venta"),
                    rs.getString("formapago_venta"),
                    rs.getDouble("total_venta")
                            
                    });
                }                            
            }catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR CLIENTES DESDE LA BASE DE DATOS");
}          
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
       
         //Listar Desde La BD
        tb.setRowCount(0);
        
        //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            try{
                
                con.ConexionPostgres();
                
                String seleccionar = "SELECT * FROM ventas";
                
                ResultSet rs = con.consultar(seleccionar);
                
                while(rs.next()){
                    
                    tb.addRow(new Object[]{
                    
                    rs.getLong("id_venta"),
                    rs.getString("fecha_venta"),
                    rs.getString("datoscliente_venta"),
                    rs.getString("datosempleado_venta"),
                    rs.getString("formapago_venta"),
                    rs.getDouble("total_venta")
                            
                    });
                }                            
            }catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR CLIENTES DESDE LA BASE DE DATOS");
}
            
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        DecimalFormat formato = new DecimalFormat("#,###.00"); // Formato con separadores de miles y dos decimales       
         //Declarar variables
       Connection conect = null;
       PreparedStatement search = null;
       ResultSet rs = null;
        
        
        //try catch
          try{
            Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
           
           con.ConexionPostgres();
           
           conect=con.getConnection();
           
            String Mostrar = ("SELECT * FROM ventas WHERE id_venta = ?");
            
              search = conect.prepareStatement(Mostrar);
              
              long IdBuscar = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese la Cedula para buscar", "Buscar", JOptionPane.INFORMATION_MESSAGE));
              search.setLong(1, IdBuscar);
              
           rs= search.executeQuery();
            
           if(rs.next()){
   
               id.setSelectedItem(rs.getString("id_venta"));
               fecha.setDate(rs.getDate("fecha_venta"));
               datoscliente.setSelectedItem(rs.getString("datoscliente_venta"));
               datosempleado.setSelectedItem(rs.getString("datosempleado_venta"));
               totalventa.setText(formato.format(rs.getDouble("total_venta")));
               
               
               JOptionPane.showMessageDialog(null, "Registro encontrado", "Registro Encontrado", JOptionPane.INFORMATION_MESSAGE);
               
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
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        
    
         try {


            //Validar Datos
            if(totalventa.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "Debe rellenar el campo del total de la venta", "Campo Vacio", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Asignar orden de los datos en la tabla
            
            int ADT = tb.getRowCount();
            
            for(int i = 0; i<ADT; i++){
                
                //Asignar Dato en la Tabla (ID)
                long ID_ADT = Long.parseLong(tb.getValueAt(i, 0).toString());
                
                //Asignar Dato en la Tabla (Fecha de Venta)
                String FechaVenta_ADT = tb.getValueAt(i, 1).toString();
                
                //Asignar Dato en la Tabla (Datos Cliente)
                String DatosCliente_ADT = tb.getValueAt(i, 2).toString();
                
                //Asignar Dato en la Tabla (Datos Empleado)
                String DatosEmpleado_ADT = tb.getValueAt(i, 3).toString();
                
                //Asignar Dato en la Tabla (Forma De Pago)
                String FormaDePago_ADT = tb.getValueAt(i, 4).toString();
                
                //Asignar Dato en la Tabla (Total Venta)              
                String TotalVenta_ADT = tb.getValueAt(i, 5).toString();

            }
            
            //Obtener Los Datos Para Insertarlos
            
            //ID de venta
            long Id = Long.parseLong(id.getSelectedItem().toString());
            
            //Fecha De Venta
            Date FechaVenta = fecha.getDate();
            
            //Formato de fecha
            SimpleDateFormat fc = new SimpleDateFormat("yyyy-MM-dd");
            String facha = fc.format(FechaVenta);
            
            //Datos De Cliente
            String DatosCliente = datoscliente.getSelectedItem().toString();
            
            //Datos De Empleado
            String DatosEmpleado = datosempleado.getSelectedItem().toString();
            
            //Forma De pago
            String FormaPago = pago.getSelectedItem().toString();
            
            //Total Venta
            double TotalVenta = Double.parseDouble(totalventa.getText().trim());
            
            
            //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            //query o consulta
            String query = "update ventas set"
                    +"fecha_venta= '"+FechaVenta+" ', "
                    +"datoscliente_venta= '"+DatosCliente+" ', "
                    +"datosempleado_venta= '"+DatosEmpleado+" ', "
                    +"formapago_venta= '"+FormaPago+" ' ,"
                    +"total_venta= "+TotalVenta
                    +"WHERE id_venta= "+Id;
            
            System.out.println(query);
            con.actualizar(query);
            
            JOptionPane.showMessageDialog(null, "VENTA ACTUALIZADA CON EXITO");
            
            //Cerrar conexión
            con.cerrar();
                     
            //Mostrar Los Datos En La Tabla
            tb.addRow(new Object []{Id, facha, DatosCliente, DatosEmpleado, FormaPago, TotalVenta} );
            
            
            //Limpiar Los Campos
            totalventa.setText("");
            
            
            con.ConexionPostgres();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Listar Desde La BD
        tb.setRowCount(0);
        
        //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            try{
                
                con.ConexionPostgres();
                
                String seleccionar = "SELECT * FROM ventas";
                
                ResultSet rs = con.consultar(seleccionar);
                
                while(rs.next()){
                    
                    tb.addRow(new Object[]{
                    
                    rs.getLong("id_venta"),
                    rs.getString("fecha_venta"),
                    rs.getString("datoscliente_venta"),
                    rs.getString("datosempleado_venta"),
                    rs.getString("formapago_venta"),
                    rs.getDouble("total_venta")
                            
                    });
                }                            
            }catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR CLIENTES DESDE LA BASE DE DATOS");
}
    }//GEN-LAST:event_btneditarActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
       
        
        id.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DecimalFormat formato = new DecimalFormat("#,###.00"); // Formato con separadores de miles y dos decimales
                
              Connection conect = null;
              PreparedStatement search = null;
              ResultSet rs = null;
                
                try {
                    long iddetalle_seleccionado = Long.parseLong((String) id.getSelectedItem());
                    
                    //Establecer Conexión con la BD
                    Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                    
                    con.ConexionPostgres();
             
               conect=con.getConnection();
           
            String query = ("Select * From detalle_ventas WHERE id_venta=? ");
            
             search = conect.prepareStatement(query);
             
             search.setLong(1, iddetalle_seleccionado);
             
             rs = search.executeQuery();
             
             if(rs.next()){
                 
                  double tot = Double.parseDouble(rs.getString("total_detalle"));
                 
                  valorventa.setText(formato.format(tot));
             }
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Panel_Ventas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
    }//GEN-LAST:event_idActionPerformed

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        
        
        for (ActionListener al : pago.getActionListeners()) {
    pago.removeActionListener(al);
}
               
        pago.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
        String forma_de_pago = pago.getSelectedItem().toString();   
        
        double valor_venta = Double.parseDouble(valorventa.getText().replace(",", ""));
        double cargo = 2000;
        
        DecimalFormat formato = new DecimalFormat("#,###.00"); // Formato con separadores de miles y dos decimales
                
        //efectivo
                if(forma_de_pago == "Efectivo"){
                    
                    totalventa.setText(formato.format(valor_venta));    
                    
                    //tarjeta de contado
                }else if(forma_de_pago == "Con Tarjeta - De Contado"){
                    
                    int confirmacion;
                    
                   pago.setEnabled(false);
                    confirmacion = JOptionPane.showConfirmDialog(null, "Se Cobraran 2,000.00 adicionales"+"\n" +"como RECARGO por el uso de tarjeta. ¿OK?","RECARGO POR USO DE TARJETA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    pago.setEnabled(true);
                    if(confirmacion == JOptionPane.YES_OPTION){
                    
                        
                    double valor_total = (valor_venta+cargo);
                    
                    totalventa.setText(formato.format(valor_total));
                     
                    }else{
                        JOptionPane.showMessageDialog(null, "Seleccione otro Metodo de Pago Disponible","SELECCIONAR OTRO METODO DE PAGO",JOptionPane.INFORMATION_MESSAGE);
                    }
                    //tarjeta a credito
                }else if(forma_de_pago == "Con Tarjeta - A Credito"){
                    
                    String [ ] Opciones = {"1 mes",
                     "2 meses",
                     "3 meses"};
                    
                      int meses = JOptionPane.showOptionDialog(null, "Seleccione a cuantos meses quiere el pago a credito", "Opciones para credito", 0,JOptionPane.INFORMATION_MESSAGE,null ,Opciones, "1 mes");
                    //un mes
                      if(meses == 0){
                          
                          double unmes = ((valor_venta*1.05)+cargo);
                          double valorcredito = (unmes-valor_venta);
                          
                            totalventa.setText(formato.format(unmes));
                          
                          JOptionPane.showMessageDialog(null, "Para que logres hacer tu pago en un mes se sumara un 5%"+"\n"+"equivalente a $"+formato.format(valorcredito)+" de interes y 2000 de cargo por manejo de tarjeta."
                           +"\n"+"Le corresponde una cuota de $"+formato.format(unmes));
                          
                          //dos meses
                      }else if(meses == 1){
                          
                           double dosmeses = ((valor_venta*1.10)+cargo);
                          double cuotas = (dosmeses/2);
                          double valorcredito = (dosmeses-valor_venta);
                           
                          totalventa.setText(formato.format(dosmeses));
                          
                           JOptionPane.showMessageDialog(null, "Para que logres hacer tu pago en dos meses se sumara un 10%"+"\n"+"equivalente a $"+formato.format(valorcredito)+" de interes y 2000 de cargo por manejo de tarjeta."
                           +"\n"+"Le corresponden dos cuotas de $"+formato.format(cuotas));
                           
                          //tres meses
                      }else if(meses == 2){
                          
                          double tresmeses = ((valor_venta*1.15)+cargo);
                          double cuotas = (tresmeses/3);
                          double valorcredito = (tresmeses-valor_venta);
                                               
                          totalventa.setText(formato.format(tresmeses));
                          
                           JOptionPane.showMessageDialog(null, "Para que logres hacer tu pago en tres meses se sumara un 15%"+"\n"+"equivalente a $"+formato.format(valorcredito)+" de interes y 2000 de cargo por manejo de tarjeta."
                           +"\n"+"Le corresponden tres cuotas de $"+formato.format(cuotas));
                          
                      }
                      
                }              
            }
        });
    }//GEN-LAST:event_pagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JComboBox<String> datoscliente;
    private javax.swing.JComboBox<String> datosempleado;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JComboBox<String> id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pago;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField totalventa;
    private javax.swing.JTextField valorventa;
    // End of variables declaration//GEN-END:variables
}

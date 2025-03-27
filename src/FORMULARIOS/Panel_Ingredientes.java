/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FORMULARIOS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Panel_Ingredientes extends javax.swing.JPanel {

    DefaultTableModel tb = new DefaultTableModel();
    
   

    public Panel_Ingredientes() {
        initComponents();
        
        String ids [] = {"ID","NOMBRE","DESCRIPCION"};
        tb.setColumnIdentifiers(ids);
        tabla.setModel(tb);
        
        
         label_ID.setText("");
        label_nombre.setText("");
        label_descripcion.setText("");
        label_barra_like.setText("");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        btnbuscar1 = new javax.swing.JButton();
        label_ID = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_descripcion = new javax.swing.JLabel();
        label_barra_like = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        panelContenedor.setBackground(new java.awt.Color(228, 242, 247));
        panelContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), "INGRESAR INGREDIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID_INGREDIENTE:");

        id.setBackground(new java.awt.Color(209, 235, 247));
        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE:");

        nombre.setBackground(new java.awt.Color(209, 235, 247));
        nombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BUSQUEDA:");

        busqueda.setBackground(new java.awt.Color(209, 235, 247));
        busqueda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        busqueda.setForeground(new java.awt.Color(0, 0, 0));
        busqueda.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busquedaKeyTyped(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(209, 235, 247));
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        tabla.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(tabla);

        btnbuscar.setBackground(new java.awt.Color(112, 138, 147));
        btnbuscar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnbuscar.setText("BUSCAR");
        btnbuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(31, 36, 38), new java.awt.Color(31, 36, 38)));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(112, 138, 147));
        btneliminar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(0, 0, 0));
        btneliminar.setText("ELIMINAR");
        btneliminar.setToolTipText("");
        btneliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(31, 36, 38), new java.awt.Color(31, 36, 38)));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnmostrar.setBackground(new java.awt.Color(112, 138, 147));
        btnmostrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnmostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnmostrar.setText("MOSTRAR");
        btnmostrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(31, 36, 38), new java.awt.Color(31, 36, 38)));
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DESCRIPCION:");

        btnguardar.setBackground(new java.awt.Color(112, 138, 147));
        btnguardar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(0, 0, 0));
        btnguardar.setText("GUARDAR");
        btnguardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(31, 36, 38), new java.awt.Color(31, 36, 38)));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        descripcion.setColumns(20);
        descripcion.setRows(5);
        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descripcionKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(descripcion);

        btnbuscar1.setBackground(new java.awt.Color(112, 138, 147));
        btnbuscar1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnbuscar1.setForeground(new java.awt.Color(0, 0, 0));
        btnbuscar1.setText("EDITAR");
        btnbuscar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(31, 36, 38), new java.awt.Color(31, 36, 38)));
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });

        label_ID.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_ID.setForeground(new java.awt.Color(255, 51, 51));
        label_ID.setText("jLabel1");

        label_nombre.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(255, 51, 51));
        label_nombre.setText("jLabel1");

        label_descripcion.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_descripcion.setForeground(new java.awt.Color(255, 51, 51));
        label_descripcion.setText("jLabel1");

        label_barra_like.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_barra_like.setForeground(new java.awt.Color(255, 51, 51));
        label_barra_like.setText("jLabel1");

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelContenedorLayout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelContenedorLayout.createSequentialGroup()
                                    .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelContenedorLayout.createSequentialGroup()
                                            .addGap(256, 256, 256)
                                            .addComponent(label_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelContenedorLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(42, 42, 42)
                                            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label_barra_like, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(40, 40, 40)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel2)
                                        .addGap(40, 40, 40)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5))))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_ID)
                            .addComponent(label_nombre))
                        .addGap(18, 18, 18)
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_barra_like))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_descripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar)
                    .addComponent(btnmostrar)
                    .addComponent(btnguardar)
                    .addComponent(btnbuscar1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
                 String ID_ = tabla.getValueAt(fila, 0).toString();
                 
                 Conexion  con= new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                 
                 con.ConexionPostgres();
                 
                 String query_delete = "DELETE FROM ingredientes WHERE id_ingrediente= ' "+ID_+" ' ";
                 int FilasAfectadas = con.actualizar1(query_delete);
                 
                 if(FilasAfectadas > 0){
                     JOptionPane.showMessageDialog(null, "INGREDIENTE ELIMINADO CON EXITO");
                     
                     ((DefaultTableModel)tabla.getModel()).removeRow(fila);
                 }
                 else{
                     
                     JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA EL INGREDIENTE EN LA BASE DE DATOS");
                 }
                 con.cerrar();
                 
                 tb.removeRow(tabla.getSelectedRow());
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Panel_Ingredientes.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(Panel_Ingredientes.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Panel_Ingredientes.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Panel_Ingredientes.class.getName()).log(Level.SEVERE, null, ex);
             }
                 
            }
        }

        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

         //Declarar variables
       Connection conect = null;
       PreparedStatement search = null;
       ResultSet rs = null;
        
        
        //try catch
          try{
            Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
           
           con.ConexionPostgres();
           
           conect=con.getConnection();
           
            String Mostrar = ("SELECT * FROM ingredientes WHERE id_ingrediente = ?");
            
              search = conect.prepareStatement(Mostrar);
              
              long IdBuscar = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el id para buscar", "Buscar", JOptionPane.INFORMATION_MESSAGE));
              search.setLong(1, IdBuscar);
              
           rs= search.executeQuery();
            
           if(rs.next()){
               id.setText(rs.getString("id_ingrediente"));
               nombre.setText(rs.getString("nombre_ingrediente"));
               descripcion.setText(rs.getString("descripcion_ingrediente"));
               
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
               Logger.getLogger(Panel_Ingredientes.class.getName()).log(Level.SEVERE, null, ex);
           }
          }

        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed

          //Listar Desde La BD
    tb.setRowCount(0);
//Establecer la conexión
Conexion con1 = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");

try{
    
    con1.ConexionPostgres();
    
    String seleccionar = "SELECT * FROM ingredientes";
    
    ResultSet resultado = con1.consultar(seleccionar);
    
    while (resultado.next()){
        
        tb.addRow(new Object[]{
            
            resultado.getLong("id_ingrediente"),
            resultado.getString("nombre_ingrediente"),
            resultado.getString("descripcion_ingrediente")
               
        });
        
    }     } catch (Exception ex) {
        ex.printStackTrace();
        
        JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LOS INGREDIENTES DESDE LA BASE DE DATOS","ERROR AL CARGAR",JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped

        try {
            String nm= busqueda.getText();
            tb.setRowCount(0);
            
            
            Conexion conex = new Conexion("postgres","1986","localhost","5432","cafeteriasenita");
            
            conex.ConexionPostgres();
            
            String query = "SELECT * FROM ingredientes WHERE \"nombre_ingrediente\" LIKE '%"+nm+"%'";
            
            ResultSet rs = conex.consultar(query);
            
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getLong("id_ingrediente"),
                    rs.getString("nombre_ingrediente"),
                    rs.getString("descripcion_ingrediente")
                });
                
                conex.cerrar();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_busquedaKeyTyped

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
         try {
            //Validar campos
            if(id.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN ID PARA EL INGREDIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                id.requestFocus();
                return;
            }
            
            if(nombre.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN NOMBRE PARA EL INGREDIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                nombre.requestFocus();
                return;
            }
            
            if(descripcion.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA DESCRIPCION PARA EL INGREDIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                descripcion.requestFocus();
                return;
            }

            
            //Asignar orden de los datos en la tabla
            
            int ADT = tb.getRowCount();
            
            for(int i = 0; i<ADT; i++){
                
                //Asignar Dato en la Tabla (ID)
                long ID_ADT = Long.parseLong(tb.getValueAt(i, 0).toString());
                
                //Asignar Dato en la Tabla (Nombre)
                String Nombre_ADT = tb.getValueAt(i, 1).toString();
                
                //Asignar Dato en la Tabla (Descripcion)
                String Descripcion_ADT = tb.getValueAt(i, 2).toString();
                
                
                System.out.println("Guardando datos: "+
                        "\n"+"ID: "+ID_ADT+
                        "\n"+"Nombre: "+Nombre_ADT+
                        "\n"+"Descripción: "+Descripcion_ADT);

            }
            
            //Obtener Los Datos para Insertarlos
            
            //ID
            long  ID = Long.parseLong(id.getText().trim());
            
            //Nombre
            String Nombre= nombre.getText().trim();
            
            //Descripción
            String Descripcion= descripcion.getText().trim();
            
;
            
            //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            
            //query o consulta
            String query = "insert into ingredientes values("+ID+" , '"+Nombre +" ', '"+Descripcion+" ' )";
            
            System.out.println(query);
            con.actualizar(query);
            
            JOptionPane.showMessageDialog(null, "INGREDIENTE INSERTADO");
            
            //Cerrar conexión
            con.cerrar();
                     
            //Mostrar Los Datos En La Tabla
            tb.addRow(new Object []{ID,Nombre,Descripcion} );
            
            //limpiar los campos
            id.setText("");
            nombre.setText("");
            descripcion.setText("");

            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   //Listar Desde La BD
        tb.setRowCount(0);
//Establecer la conexión
Conexion con1 = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");

try{
    
con1.ConexionPostgres();

String seleccionar = "SELECT * FROM ingredientes";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("id_ingrediente"),
resultado.getString("nombre_ingrediente"),
resultado.getString("descripcion_ingrediente")
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR INGREDIENTES DESDE LA BASE DE DATOS");
}
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed

          try {
            //Validar campos
            if(id.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN ID PARA EL INGREDIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                id.requestFocus();
                return;
            }
            
            if(nombre.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN NOMBRE PARA EL INGREDIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                nombre.requestFocus();
                return;
            }
            
            if(descripcion.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA DESCRIPCION PARA EL INGREDIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                descripcion.requestFocus();
                return;
            }

            
            //Asignar orden de los datos en la tabla
            
            int ADT = tb.getRowCount();
            
            for(int i = 0; i<ADT; i++){
                
                //Asignar Dato en la Tabla (ID)
                long ID_ADT = Long.parseLong(tb.getValueAt(i, 0).toString());
                
                //Asignar Dato en la Tabla (Nombre)
                String Nombre_ADT = tb.getValueAt(i, 1).toString();
                
                //Asignar Dato en la Tabla (Descripcion)
                String Descripcion_ADT = tb.getValueAt(i, 2).toString();
                
                
                System.out.println("Guardando datos: "+
                        "\n"+"ID: "+ID_ADT+
                        "\n"+"Nombre: "+Nombre_ADT+
                        "\n"+"Descripción: "+Descripcion_ADT);

            }
            
            //Obtener Los Datos para Insertarlos
            
            //ID
            long  ID = Long.parseLong(id.getText().trim());
            
            //Nombre
            String Nombre= nombre.getText().trim();
            
            //Descripción
            String Descripcion= descripcion.getText().trim();
            
;
            
            //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            
            //query o consulta
            String query = "update ingredientes set"
                    +" nombre_ingrediente= '"+Nombre+"', "
                    +" descripcion_ingrediente= '"+Descripcion
                    +"' where id_ingrediente= "+ID;
            
            System.out.println(query);
            con.actualizar(query);
            
            JOptionPane.showMessageDialog(null, "INGREDIENTE ACTUALIZADO");
            
            //Cerrar conexión
            con.cerrar();
                     
            //Mostrar Los Datos En La Tabla
            tb.addRow(new Object []{ID,Nombre,Descripcion} );
            
            //limpiar los campos
            id.setText("");
            nombre.setText("");
            descripcion.setText("");

            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   //Listar Desde La BD
        tb.setRowCount(0);
//Establecer la conexión
Conexion con1 = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");

try{
    
con1.ConexionPostgres();

String seleccionar = "SELECT * FROM ingredientes";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("id_ingrediente"),
resultado.getString("nombre_ingrediente"),
resultado.getString("descripcion_ingrediente")
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR INGREDIENTES DESDE LA BASE DE DATOS");
}
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
       
          //validar tipo de dato
          
        String texto = id.getText().trim();
        
        //validar campo vacio
        
        if(texto.isEmpty()){
            label_ID.setForeground(Color.red);
            label_ID.setText("¡EL CAMPO NO PUEDE ESTAR VACIO!");
            id.requestFocus();
            return;
        }
             
        //validar si es texto o numero
        for (char c : texto.toCharArray()){
            if(!Character.isDigit(c)){
                label_ID.setForeground(Color.red);
                label_ID.setText("¡SOLO DEBE INGRESAR NUMEROS!");
                id.requestFocus();
                return;
            }
        }
        
        //limpiar
        label_ID.setText("");
    }//GEN-LAST:event_idKeyReleased

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
       
         //validar tipo de dato
          
        String texto = nombre.getText().trim();
        
        //validar campo vacio
           if(texto.isEmpty()){
               label_nombre.setForeground(Color.red);
               label_nombre.setText("¡EL CAMPO NO PUEDE ESTAR VACIO!");
               nombre.requestFocus();
               return;
           }
        
          
            if(!texto.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$")){
            label_nombre.setForeground(Color.red);
            label_nombre.setText("¡EL FORMATO NO ES CORRECTO!");
            nombre.requestFocus();
            return;
        }else{
            label_nombre.setText("");
        }
    }//GEN-LAST:event_nombreKeyReleased

    private void descripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyReleased
        
         //validar tipo de dato
          
        String texto = descripcion.getText().trim();
        
        //validar campo vacio
           if(texto.isEmpty()){
               label_descripcion.setForeground(Color.red);
               label_descripcion.setText("¡EL CAMPO NO PUEDE ESTAR VACIO!");
               descripcion.requestFocus();
               return;
           }
           
           //limpiar
           label_descripcion.setText("");
    }//GEN-LAST:event_descripcionKeyReleased

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
       
         //validar tipo de dato
          
        String texto = busqueda.getText().trim();
        
        //validar campo vacio
           if(texto.isEmpty()){
               label_barra_like.setForeground(Color.red);
               label_barra_like.setText("");
               busqueda.requestFocus();
               return;
           }
        
          
            if(!texto.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$")){
            label_barra_like.setForeground(Color.red);
            label_barra_like.setText("¡EL FORMATO NO ES CORRECTO!");
            busqueda.requestFocus();
            return;
        }else{
            label_barra_like.setText("");
        }
    }//GEN-LAST:event_busquedaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_ID;
    private javax.swing.JLabel label_barra_like;
    private javax.swing.JLabel label_descripcion;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

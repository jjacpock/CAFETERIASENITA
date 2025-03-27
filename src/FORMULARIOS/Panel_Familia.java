
package FORMULARIOS;

import FORMULARIOS.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Panel_Familia extends javax.swing.JPanel {

    DefaultTableModel tb = new DefaultTableModel();

    public Panel_Familia() {
        initComponents();
        
        String ids [] = {"ID_FAMILIA","NOMBRE","DESCRIPCION"};
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

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        label_ID = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_descripcion = new javax.swing.JLabel();
        label_barra_like = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(228, 242, 247));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)), "FAMILIA DE LOS PRODUCTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID FAMILIA:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE:");

        id.setBackground(new java.awt.Color(209, 235, 247));
        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DESCRIPCION:");

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

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("BUSQUEDA:");

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

        btneditar.setBackground(new java.awt.Color(112, 138, 147));
        btneditar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btneditar.setForeground(new java.awt.Color(0, 0, 0));
        btneditar.setText("EDITAR");
        btneditar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(31, 36, 38), new java.awt.Color(31, 36, 38)));
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(112, 138, 147));
        btneliminar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(0, 0, 0));
        btneliminar.setText("ELIMINAR");
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

        tabla.setBackground(new java.awt.Color(209, 235, 247));
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        tabla.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setSelectionBackground(new java.awt.Color(231, 235, 218));
        tabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla);

        descripcion.setBackground(new java.awt.Color(209, 235, 247));
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        descripcion.setForeground(new java.awt.Color(0, 0, 0));
        descripcion.setRows(5);
        descripcion.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        descripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descripcionKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(descripcion);

        label_ID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        label_ID.setForeground(new java.awt.Color(255, 51, 51));
        label_ID.setText("Validacion");

        label_nombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(255, 51, 51));
        label_nombre.setText("Validacioin");

        label_descripcion.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_descripcion.setForeground(new java.awt.Color(255, 51, 51));
        label_descripcion.setText("jLabel1");

        label_barra_like.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        label_barra_like.setForeground(new java.awt.Color(255, 51, 51));
        label_barra_like.setText("Validacion");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(label_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(label_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(178, 178, 178))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                                .addComponent(jLabel6)
                                                .addGap(40, 40, 40))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_barra_like, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(77, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_ID)
                            .addComponent(label_nombre))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(label_barra_like))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(label_descripcion)))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnbuscar)
                    .addComponent(btneditar)
                    .addComponent(btneliminar)
                    .addComponent(btnmostrar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed

        nombre.requestFocus();
    }//GEN-LAST:event_idActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed

        descripcion.requestFocus();
    }//GEN-LAST:event_nombreActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

         try {
            //Validar campos
            if(id.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN ID PARA LA FAMILIA","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                id.requestFocus();
                return;
            }
            
            if(nombre.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN NOMBRE PARA LA FAMILIA","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                nombre.requestFocus();
                return;
            }
            
            if(descripcion.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA DESCRIPCION PARA LA FAMILIA","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
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
            String query = "insert into familias values("+ID+" , '"+Nombre +" ', '"+Descripcion+" ' )";
            
            System.out.println(query);
            con.actualizar(query);
            
            JOptionPane.showMessageDialog(null, "FAMILIA INSERTADA");
            
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

String seleccionar = "SELECT * FROM familias";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("id_familia"),
resultado.getString("nombre_familia"),
resultado.getString("descripcion_familia")
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR FAMILIAS DESDE LA BASE DE DATOS");
}
  
    }//GEN-LAST:event_btnguardarActionPerformed

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
           
            String Mostrar = ("SELECT * FROM familias WHERE id_familia = ?");
            
              search = conect.prepareStatement(Mostrar);
              
              long IdBuscar = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el id para buscar", "Buscar", JOptionPane.INFORMATION_MESSAGE));
              search.setLong(1, IdBuscar);
              
           rs= search.executeQuery();
            
           if(rs.next()){
               id.setText(rs.getString("id_familia"));
               nombre.setText(rs.getString("nombre_familia"));
               descripcion.setText(rs.getString("descripcion_familia"));
               
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
               Logger.getLogger(Panel_Familia.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed

         try {
            //Validar campos
            if(id.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN ID PARA LA FAMILIA","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                id.requestFocus();
                return;
            }
            
            if(nombre.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN NOMBRE PARA LA FAMILIA","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                nombre.requestFocus();
                return;
            }
            
            if(descripcion.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA DESCRIPCION PARA LA FAMILIA","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
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
            String query = "update familias set"
                    +" nombre_familia= '"+Nombre+"', "
                    +" descripcion_familia= '"+Descripcion
                    +"' where id_familia= "+ID;
            
            System.out.println(query);
            con.actualizar(query);
            
            JOptionPane.showMessageDialog(null, "FAMILIA ACTUALIZADA");
            
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

String seleccionar = "SELECT * FROM familias";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("id_familia"),
resultado.getString("nombre_familia"),
resultado.getString("descripcion_familia")
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR FAMILIAS DESDE LA BASE DE DATOS");
}
        
                 
    }//GEN-LAST:event_btneditarActionPerformed

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
                 
                 String query_delete = "DELETE FROM familias WHERE id_familia= ' "+ID_+" ' ";
                 int FilasAfectadas = con.actualizar1(query_delete);
                 
                 if(FilasAfectadas > 0){
                     JOptionPane.showMessageDialog(null, "FAMILIA ELIMINADO CON EXITO");
                     
                     ((DefaultTableModel)tabla.getModel()).removeRow(fila);
                 }
                 else{
                     
                     JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA LA FAMILIA EN LA BASE DE DATOS");
                 }
                 con.cerrar();
                 
                 tb.removeRow(tabla.getSelectedRow());
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Panel_Familia.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(Panel_Familia.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Panel_Familia.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Panel_Familia.class.getName()).log(Level.SEVERE, null, ex);
             }
                 
            }
        }
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed

        //Listar Desde La BD
        tb.setRowCount(0);
//Establecer la conexión
Conexion con1 = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");

try{
    
con1.ConexionPostgres();

String seleccionar = "SELECT * FROM familias";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("id_familia"),
resultado.getString("nombre_familia"),
resultado.getString("descripcion_familia")
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR FAMILIAS DESDE LA BASE DE DATOS");
}
        
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped

        try {
            String nm= busqueda.getText();
            tb.setRowCount(0);
            
            
            Conexion conex = new Conexion("postgres","1986","localhost","5432","cafeteriasenita");
            conex.ConexionPostgres();
            String query = "SELECT * FROM familias WHERE \"id_familia\" LIKE '%"+nm+"%'";
            ResultSet rs = conex.consultar(query);
            
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getLong("id_familia"),
                    rs.getString("nombre_familia"),
                    rs.getString("descripcion_familia")
                });
                
                conex.cerrar();
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
        
    }//GEN-LAST:event_busquedaKeyTyped

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
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_ID;
    private javax.swing.JLabel label_barra_like;
    private javax.swing.JLabel label_descripcion;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

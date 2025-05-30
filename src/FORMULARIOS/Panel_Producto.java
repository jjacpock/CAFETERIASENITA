
package FORMULARIOS;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Panel_Producto extends javax.swing.JPanel {
    
    public static String cad=" ", cad1=" ";
    Vector<Integer> vector = new Vector<>();

    DefaultTableModel tb = new DefaultTableModel();
  
    public void setProductoSeleccionado(String nombreProducto) {
        nombre.setText(nombreProducto);
    }
    
    
    public Panel_Producto() {
        
        
        
        
        initComponents();
        
        String ids [] = {"ID_PRODUCTO","NOMBRE","FAMILIA","PRECIO","DESCRIPCION","INGREDIENTES","CANTIDAD"};
        
        tb.setColumnIdentifiers(ids);
        tabla.setModel(tb);
        
        label_ID.setText("");
        label_nombre.setText("");
        label_precio.setText("");
        label_descripcion.setText("");
            
        
        //llamar familias
        
         Connection conect = null;
              PreparedStatement loguin = null;
              ResultSet rs = null;
        
        
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
         
         //llamar ingredientes
         
          try {

              Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
              
              con.ConexionPostgres();
              
               conect=con.getConnection();
           
            String query = ("Select * From ingredientes order by id_ingrediente ASC");
            
             loguin = conect.prepareStatement(query);
             
             rs = loguin.executeQuery();
             
              while(rs.next()){
              
                  long  Ingrediente_ID = rs.getLong("id_ingrediente");
                  String Ingrediente_N = rs.getString("nombre_ingrediente");
                  System.out.println(Ingrediente_ID+" - "+Ingrediente_N.trim());
                  
                  ingredientes.addItem(String.valueOf(Ingrediente_ID)+" - "+Ingrediente_N.trim());
              
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idproducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        familia = new javax.swing.JComboBox<>();
        ingredientes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        a_vector = new javax.swing.JTextArea();
        label_ID = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_precio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_descripcion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(228, 242, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)), "INGRESAR PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        tabla.setAutoCreateRowSorter(true);
        tabla.setBackground(new java.awt.Color(209, 235, 247));
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        jScrollPane1.setViewportView(tabla);

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID_Producto:");

        idproducto.setBackground(new java.awt.Color(209, 235, 247));
        idproducto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        idproducto.setForeground(new java.awt.Color(0, 0, 0));
        idproducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        idproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idproductoActionPerformed(evt);
            }
        });
        idproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idproductoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE:");

        nombre.setBackground(new java.awt.Color(209, 235, 247));
        nombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FAMILIA:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PRECIO:");

        precio.setBackground(new java.awt.Color(209, 235, 247));
        precio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        precio.setForeground(new java.awt.Color(0, 0, 0));
        precio.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DESCRIPCION:");

        descripcion.setBackground(new java.awt.Color(209, 235, 247));
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        descripcion.setForeground(new java.awt.Color(0, 0, 0));
        descripcion.setRows(5);
        descripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descripcionKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(descripcion);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("INGREDIENTES:");

        familia.setBackground(new java.awt.Color(209, 235, 247));
        familia.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        familia.setForeground(new java.awt.Color(0, 0, 0));
        familia.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        familia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familiaActionPerformed(evt);
            }
        });

        ingredientes.setBackground(new java.awt.Color(209, 235, 247));
        ingredientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ingredientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        jButton1.setText("AÑADIR INGREDIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        a_vector.setBackground(new java.awt.Color(209, 235, 247));
        a_vector.setColumns(20);
        a_vector.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        a_vector.setForeground(new java.awt.Color(0, 0, 0));
        a_vector.setRows(5);
        a_vector.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        a_vector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a_vectorKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(a_vector);

        label_ID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        label_ID.setForeground(new java.awt.Color(255, 51, 51));
        label_ID.setText("Validacion");

        label_nombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(255, 51, 51));
        label_nombre.setText("Validacion");

        label_precio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        label_precio.setForeground(new java.awt.Color(255, 51, 51));
        label_precio.setText("Validacion");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("INGREDIENTES:");

        label_descripcion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        label_descripcion.setForeground(new java.awt.Color(255, 51, 51));
        label_descripcion.setText("Validacion");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CANTIDAD:");

        cantidad.setBackground(new java.awt.Color(209, 235, 247));
        cantidad.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cantidad.setForeground(new java.awt.Color(0, 0, 0));
        cantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idproducto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(precio)
                            .addComponent(label_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40)
                                .addComponent(familia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(familia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ID)
                    .addComponent(label_nombre))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(9, 9, 9)
                        .addComponent(label_precio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnbuscar)
                    .addComponent(btneditar)
                    .addComponent(btneliminar)
                    .addComponent(btnmostrar)
                    .addComponent(jButton1))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

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
           
            String Mostrar = ("SELECT * FROM productos WHERE id_producto = ?");
            
              search = conect.prepareStatement(Mostrar);
              
              long CedulaBuscar = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el ID para buscar", "Buscar", JOptionPane.INFORMATION_MESSAGE));
              search.setLong(1, CedulaBuscar);
              
           rs= search.executeQuery();
            
           if(rs.next()){
               idproducto.setText(rs.getString("id_producto"));
               nombre.setText(rs.getString("nombre_producto"));
               familia.setSelectedItem(rs.getString("familia_producto"));
               precio.setText(rs.getString("precio_producto"));
               descripcion.setText(rs.getString("descripcion_producto"));
               ingredientes.setSelectedItem(rs.getString("ingrediente_producto"));
               a_vector.setText(rs.getString("ingrediente_producto"));
               cantidad.setText(rs.getString("cantidad_producto"));
               
               
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
               Logger.getLogger(Panel_Producto.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void idproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idproductoActionPerformed

        nombre.requestFocus();
    }//GEN-LAST:event_idproductoActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed

        descripcion.requestFocus();
    }//GEN-LAST:event_precioActionPerformed

    private void familiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_familiaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed

        precio.requestFocus();
    }//GEN-LAST:event_nombreActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

          try {
            //Validar campos
            if(idproducto.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA ID PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                idproducto.requestFocus();
                return;
            }
            
            if(nombre.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN NOMBRE PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                nombre.requestFocus();
                return;
            }
              if(familia.getSelectedItem() == null){
                JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA OPCIÓN PARA LA FAMILIA DEL PRODUCTO", "CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                familia.requestFocus();
                return;
            }
            
            if(precio.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN PRECIO PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                precio.requestFocus();
                return;
            }
            if(descripcion.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESA UNA DESCRIPCION PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                descripcion.requestFocus();
                return;
            }
            if(a_vector.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR INGREDIENTE/S PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                ingredientes.requestFocus();
                return;
            }
                        if(cantidad.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR CANTIDAD PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                cantidad.requestFocus();
                return;
            }

            //Asignar orden de los datos en la tabla
                         //Obtener Los Datos para Insertarlos
            
            //ID_Producto
            long IDproducto= Long.parseLong(idproducto.getText().trim());
            
            //Nombre
            String Nombre= nombre.getText().trim();
            
            //Familia
            String Familia= familia.getSelectedItem().toString();
            
            //Precio
            double Precio= Double.parseDouble(precio.getText().trim());
            
            //Descripcion
            String Descripcion= descripcion.getText().trim();
            
            //Ingrediente
            String Ingredientes= a_vector.getText().toString();
            
            int Cantidad = Integer.parseInt(cantidad.getText().trim());
            
                    
            //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            
            //query o consulta
            String query = "insert into productos values(?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = con.getConnection().prepareStatement(query);
            
            ps.setLong(1, IDproducto);
            ps.setString(2, Nombre);
            ps.setString(3, Familia);
            ps.setDouble(4, Precio);
            ps.setString(5, Descripcion);
            ps.setArray(6, con.getConnection().createArrayOf("integer", vector.toArray()));
            ps.setInt(7, Cantidad);
            
            ps.executeUpdate();
            
            
            System.out.println(query);

            
            JOptionPane.showMessageDialog(null, "PRODUCTO INSERTADO");
            
            //Cerrar conexión
            con.cerrar();
                     
            //Mostrar Los Datos En La Tabla
            tb.addRow(new Object []{IDproducto,Nombre,Familia,Precio,Descripcion,Ingredientes,Cantidad} );
            
            //limpiar los campos
            idproducto.setText("");
            nombre.setText("");
            familia.setSelectedItem("");
            precio.setText("");
            descripcion.setText("");
            ingredientes.setSelectedItem("");
            a_vector.setText("");
            cantidad.setText("");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   //Listar Desde La BD
        tb.setRowCount(0);
//Establecer la conexión
Conexion con1 = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");

try{
    
con1.ConexionPostgres();

String seleccionar = "SELECT * FROM productos";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("id_producto"),
resultado.getString("nombre_producto"),
resultado.getString("familia_producto"),
resultado.getDouble("precio_producto"),
resultado.getString("descripcion_producto"),
resultado.getString("ingrediente_producto"),
resultado.getInt("cantidad_producto")
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR PRODUCTOS DESDE LA BASE DE DATOS");
}
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed

         try {
            //Validar campos
            if(idproducto.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA ID PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                idproducto.requestFocus();
                return;
            }
            
            if(nombre.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN NOMBRE PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                nombre.requestFocus();
                return;
            }
              if(familia.getSelectedItem() == null){
                JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA OPCIÓN PARA LA FAMILIA DEL PRODUCTO", "CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                familia.requestFocus();
                return;
            }
            
            if(precio.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN PRECIO PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                precio.requestFocus();
                return;
            }
            if(descripcion.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESA UNA DESCRIPCION PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                descripcion.requestFocus();
                return;
            }
            if(a_vector.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR INGREDIENTE/S PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                ingredientes.requestFocus();
                return;
            }
            if(cantidad.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR CANTIDAD PARA EL PRODUCTO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                cantidad.requestFocus();
                return;
            }
            
            //Obtener Los Datos para Insertarlos
            
            //ID_Producto
            long IDproducto= Long.parseLong(idproducto.getText().trim());
            
            //Nombre
            String Nombre= nombre.getText().trim();
            
            //Familia
            String Familia= familia.getSelectedItem().toString();
            
            //Precio
            double Precio= Double.parseDouble(precio.getText().trim());
            
            //Descripcion
            String Descripcion= descripcion.getText().trim();
            
            //Ingrediente
            String Ingredientes= a_vector.getText();
            
             int Cantidad = Integer.parseInt(cantidad.getText().trim());       
            
            //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            
            //query o consulta
            String query = "update productos set "
                    + "nombre_producto= '"+Nombre+"', "
                    + "familia_producto= '"+Familia+"', "
                    + "precio_producto= "+Precio+" , "
                    + "descripcion_producto= '"+Descripcion+"', "
                    + "ingrediente_producto= '"+Ingredientes+"', "
                    +"cantidad_producto= "+Cantidad+""
                    +" WHERE id_producto= "+IDproducto;
            
            System.out.println(query);
            con.actualizar(query);
            
            JOptionPane.showMessageDialog(null, "PRODUCTO ACTUALIZAR");
            
            //Cerrar conexión
            con.cerrar();
                     
            //Mostrar Los Datos En La Tabla
            tb.addRow(new Object []{IDproducto,Nombre,Familia,Precio,Descripcion,Ingredientes,Cantidad} );
            
            //limpiar los campos
            idproducto.setText("");
            nombre.setText("");
            familia.setSelectedItem("");
            a_vector.setText("");
            precio.setText("");
            descripcion.setText("");
            ingredientes.setSelectedItem("");
            cantidad.setText("");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   //Listar Desde La BD
        tb.setRowCount(0);
//Establecer la conexión
Conexion con1 = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");

try{
    
con1.ConexionPostgres();

String seleccionar = "SELECT * FROM productos";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("id_producto"),
resultado.getString("nombre_producto"),
resultado.getString("familia_producto"),
resultado.getDouble("precio_producto"),
resultado.getString("descripcion_producto"),
resultado.getString("ingrediente_producto"),
resultado.getInt("cantidad_producto")
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR PRODUCTOS DESDE LA BASE DE DATOS");
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
                 String ID = tabla.getValueAt(fila, 0).toString();
                 
                 Conexion  con= new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                 
                 con.ConexionPostgres();
                 
                 String query_delete = "DELETE FROM productos WHERE id_producto= ' "+ID+" ' ";
                 int FilasAfectadas = con.actualizar1(query_delete);
                 
                 if(FilasAfectadas > 0){
                     JOptionPane.showMessageDialog(null, "Producto eliminado con exíto");
                     
                     ((DefaultTableModel)tabla.getModel()).removeRow(fila);
                 }
                 else{
                     
                     JOptionPane.showMessageDialog(null, "No Hay dicho Producto en la base de Datos");
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

          //Listar Desde La BD
        tb.setRowCount(0);
//Establecer la conexión
Conexion con1 = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");

try{
    
con1.ConexionPostgres();

String seleccionar = "SELECT * FROM productos";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("id_producto"),
resultado.getString("nombre_producto"),
resultado.getString("familia_producto"),
resultado.getDouble("precio_producto"),
resultado.getString("descripcion_producto"),
resultado.getString("ingrediente_producto"),
resultado.getInt("cantidad_producto")
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR PRODUCTOS DESDE LA BASE DE DATOS");
}
        
        
    }//GEN-LAST:event_btnmostrarActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String cod_ingrediente=(String)ingredientes.getSelectedItem();
        java.util.StringTokenizer st = new java.util.StringTokenizer(cod_ingrediente,"-");
        
        String token = st.nextToken();
        System.out.println("token="+token);
       vector.add(Integer.valueOf(token.trim()));
        cad+=token+" , ";
        
        System.out.println("longitud ="+cad.length());
        cad1=cad.substring(0,cad.length()-1);
        System.out.println(cad1);
        
        a_vector.append(cod_ingrediente+ "\n");
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idproductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idproductoKeyReleased
       
           //validar tipo de dato
          
        String texto = idproducto.getText().trim();
        
        //validar campo vacio
        
        if(texto.isEmpty()){
            label_ID.setForeground(Color.red);
            label_ID.setText("¡EL CAMPO NO PUEDE ESTAR VACIO!");
            idproducto.requestFocus();
            return;
        }
             
        //validar si es texto o numero
        for (char c : texto.toCharArray()){
            if(!Character.isDigit(c)){
                label_ID.setForeground(Color.red);
                label_ID.setText("¡SOLO DEBE INGRESAR NUMEROS!");
                idproducto.requestFocus();
                return;
            }
        }
        
        //limpiar
        label_ID.setText("");
    }//GEN-LAST:event_idproductoKeyReleased

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
           else{
            label_nombre.setText("");
        }
    }//GEN-LAST:event_nombreKeyReleased

    private void precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyReleased
        
         //validar tipo de dato
          
        String texto = precio.getText().trim();
        
        //validar campo vacio
        
        if(texto.isEmpty()){
            label_precio.setForeground(Color.red);
            label_precio.setText("¡EL CAMPO NO PUEDE ESTAR VACIO!");
            precio.requestFocus();
            return;
        }
             
        //validar si es texto o numero
        for (char c : texto.toCharArray()){
            if(!Character.isDigit(c)){
                label_precio.setForeground(Color.red);
                label_precio.setText("¡SOLO DEBE INGRESAR NUMEROS!");
                precio.requestFocus();
                return;
            }
        }
        
        //limpiar
        label_precio.setText("");
    }//GEN-LAST:event_precioKeyReleased

    private void descripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyReleased

        
        descripcion.setLineWrap(true); // Habilitar el salto de línea automático
        descripcion.setWrapStyleWord(true); // Asegurarse de que el salto de línea ocurra en las palabras

        
        
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

    private void a_vectorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a_vectorKeyReleased

    }//GEN-LAST:event_a_vectorKeyReleased

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a_vector;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JComboBox<String> familia;
    private javax.swing.JTextField idproducto;
    private javax.swing.JComboBox<String> ingredientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_ID;
    private javax.swing.JLabel label_descripcion;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_precio;
    public javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

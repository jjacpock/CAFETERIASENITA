
package FORMULARIOS;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Panel_Clientes extends javax.swing.JPanel {

    DefaultTableModel tb = new DefaultTableModel();
    
    
    public Panel_Clientes() {
        initComponents();
        
            String columnas_tb[] ={"Cedula","Nombre","Telefono","Correo","Dirección","Genero","Fecha De Nacimiento"};
            
            tb.setColumnIdentifiers(columnas_tb);
            
            tabla.setModel(tb);
        
            genero.addItem("M");
            genero.addItem("F");
            
            label_cedula.setText("");
            label_nombre.setText("");
            label_telefono.setText("");
            label_correo.setText("");
            label_direccion.setText("");
            label_barra_like.setText("");
            
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        busqueda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        genero = new javax.swing.JComboBox<>();
        label_cedula = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_telefono = new javax.swing.JLabel();
        label_correo = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_barra_like = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(228, 242, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)), "INGRESAR UN NUEVO CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CÉDULA:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CORREO:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NOMBRE:");

        cedula.setBackground(new java.awt.Color(209, 235, 247));
        cedula.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));
        cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cedulaKeyReleased(evt);
            }
        });

        correo.setBackground(new java.awt.Color(209, 235, 247));
        correo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(0, 0, 0));
        correo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                correoKeyReleased(evt);
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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DIRECCIÓN:");

        direccion.setBackground(new java.awt.Color(209, 235, 247));
        direccion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        direccion.setForeground(new java.awt.Color(0, 0, 0));
        direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                direccionKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TELEFONO:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("GENERO:");

        telefono.setBackground(new java.awt.Color(209, 235, 247));
        telefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 0, 0));
        telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("FECHA DE NACIMIENTO:");

        fecha.setBackground(new java.awt.Color(209, 235, 247));
        fecha.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

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
        btnguardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(31, 36, 38), new java.awt.Color(31, 36, 38)));
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
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(112, 138, 147)));
        tabla.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(tabla);

        genero.setBackground(new java.awt.Color(209, 235, 247));
        genero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(0, 0, 0));
        genero.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(112, 138, 147), new java.awt.Color(112, 138, 147)));

        label_cedula.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_cedula.setForeground(new java.awt.Color(255, 51, 51));
        label_cedula.setText("jLabel1");

        label_nombre.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(255, 51, 51));
        label_nombre.setText("jLabel1");

        label_telefono.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_telefono.setForeground(new java.awt.Color(255, 51, 51));
        label_telefono.setText("jLabel1");

        label_correo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_correo.setForeground(new java.awt.Color(255, 51, 51));
        label_correo.setText("jLabel1");

        label_direccion.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label_direccion.setForeground(new java.awt.Color(255, 51, 51));
        label_direccion.setText("jLabel1");

        label_barra_like.setForeground(new java.awt.Color(255, 51, 51));
        label_barra_like.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_barra_like, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(busqueda)
                                        .addGap(10, 10, 10))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label_cedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cedula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombre)
                                        .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telefono)
                                    .addComponent(genero, 0, 200, Short.MAX_VALUE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cedula)
                    .addComponent(label_nombre)
                    .addComponent(label_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(label_correo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_direccion)))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(label_barra_like)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnbuscar)
                    .addComponent(btneditar)
                    .addComponent(btneliminar)
                    .addComponent(btnmostrar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed

        nombre.requestFocus();
    }//GEN-LAST:event_cedulaActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed

        direccion.requestFocus();
    }//GEN-LAST:event_correoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed

        telefono.requestFocus();
    }//GEN-LAST:event_nombreActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed

        correo.requestFocus();
    }//GEN-LAST:event_telefonoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        
        
        try {
            //Validar campos
            if(cedula.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA CEDULA PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                cedula.requestFocus();
                return;
            }
            
            if(nombre.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN NOMBRE PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                nombre.requestFocus();
                return;
            }
            
            if(telefono.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN TELEFONO PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                telefono.requestFocus();
                return;
            }
            if(correo.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN CORREO PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                correo.requestFocus();
                return;
            }
            if(direccion.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA DIRECCION PARA EL CLIENTE","CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
                direccion.requestFocus();
                return;
            }
            if(genero.getSelectedItem() == null){
                JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA OPCIÓN PARA EL GENERO DEL CLIENTE", "CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                genero.requestFocus();
                return;
            }
            if(fecha.getDate() == null){
                JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FECHA DE NACIMIENTO PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Asignar orden de los datos en la tabla
            
            int ADT = tb.getRowCount();
            
            for(int i = 0; i<ADT; i++){
                
                //Asignar Dato en la Tabla (Cedula)
                long Cedula_ADT = Long.parseLong(tb.getValueAt(i, 0).toString());
                
                //Asignar Dato en la Tabla (Nombre)
                String Nombre_ADT = tb.getValueAt(i, 1).toString();
                
                //Asignar Dato en la Tabla (telefono)
                long Telefono_ADT  = Long.parseLong(tb.getValueAt(i, 2).toString());
                
                //Asignar Dato en la Tabla (Correo)
                String Correo_ADT = tb.getValueAt(i, 3).toString();
                
                //Asignar Dato en la Tabla (Dirección)
                String Direccion_ADT = tb.getValueAt(i, 4).toString();
                
                //Asignar Dato en la Tabla (Genero)
                String Genero_ADT = tb.getValueAt(i, 5).toString();
                
                //Aignar Dato en la Tabla (Fecha De Nacimiento)
                String FechaNacimiento_ADT = tb.getValueAt(i, 6).toString();
                
                System.out.println("Guardando datos: "+
                        "\n"+"Cedula: "+Cedula_ADT+
                        "\n"+"Nombre: "+Nombre_ADT+
                        "\n"+"Telefono: "+Telefono_ADT+
                        "\n"+"Correo: "+Correo_ADT+
                        "\n"+"Dirección: "+Direccion_ADT+
                        "\n"+"Genero: "+Genero_ADT+
                        "\n"+"Fecha De Nacimiento: "+FechaNacimiento_ADT);
            }
            
            //Obtener Los Datos para Insertarlos
            
            //Cedula
            long Cedula= Long.parseLong(cedula.getText().trim());
            
            //Nombre
            String Nombre= nombre.getText().trim();
            
            //Telefono
            long Telefono= Long.parseLong(telefono.getText().trim());
            
            //Correo
            String Correo= correo.getText().trim();
            
            //Dirección
            String Direccion= direccion.getText().trim();
            
            //Genero
            String Genero= genero.getSelectedItem().toString();
            
            //Fecha De Nacimiento
            Date FechaDeNacimiento= fecha.getDate();
            
            //Formato de fecha
            SimpleDateFormat fc = new SimpleDateFormat("yyyy-MM-dd");
            String facha = fc.format(FechaDeNacimiento);
            
            //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            
            //query o consulta
            String query = "insert into clientes values("+ Cedula +" , '"+Nombre +" ',  "+Telefono + " , '"+Correo +" ', '"+Direccion + " ', '"+Genero+ " ' , '"+facha + " ' )";
            
            System.out.println(query);
            con.actualizar(query);
            
            JOptionPane.showMessageDialog(null, "CLIENTE INSERTADO");
            
            //Cerrar conexión
            con.cerrar();
                     
            //Mostrar Los Datos En La Tabla
            tb.addRow(new Object []{Cedula,Nombre,Telefono,Correo,Direccion,Genero,facha} );
            
            //limpiar los campos
            cedula.setText("");
            nombre.setText("");
            telefono.setText("");
            correo.setText("");
            direccion.setText("");
            
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

String seleccionar = "SELECT * FROM clientes";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("cedula_cliente"),
resultado.getString("nombre_cliente"),
resultado.getLong("telefono_cliente"),
resultado.getString("correo_cliente"),
resultado.getString("direccion_cliente"),
resultado.getString("genero_cliente"),
resultado.getString("fechanacimiento_cliente")      
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR CLIENTES DESDE LA BASE DE DATOS");
}
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        
         //Listar Desde La BD
        tb.setRowCount(0);
//Establecer la conexión
Conexion con1 = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");

try{
    
con1.ConexionPostgres();

String seleccionar = "SELECT * FROM clientes";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("cedula_cliente"),
resultado.getString("nombre_cliente"),
resultado.getLong("telefono_cliente"),
resultado.getString("correo_cliente"),
resultado.getString("direccion_cliente"),
resultado.getString("genero_cliente"),
resultado.getString("fechanacimiento_cliente")      
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR CLIENTES DESDE LA BASE DE DATOS");
}
              
    }//GEN-LAST:event_btnmostrarActionPerformed

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
                 String Cedula_ = tabla.getValueAt(fila, 0).toString();
                 
                 Conexion  con= new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                 
                 con.ConexionPostgres();
                 
                 String query_delete = "DELETE FROM clientes WHERE cedula_cliente= ' "+Cedula_+" ' ";
                 int FilasAfectadas = con.actualizar1(query_delete);
                 
                 if(FilasAfectadas > 0){
                     JOptionPane.showMessageDialog(null, "Cliente eliminado con exíto");
                     
                     ((DefaultTableModel)tabla.getModel()).removeRow(fila);
                 }
                 else{
                     
                     JOptionPane.showMessageDialog(null, "No Hay dicho cleinte en la base de Datos");
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

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed

        try {
            //Validar campos
            if(cedula.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA CEDULA PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                cedula.requestFocus();
                return;
            }
            
            if(nombre.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN NOMBRE PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                nombre.requestFocus();
                return;
            }
            
            if(telefono.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN TELEFONO PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                telefono.requestFocus();
                return;
            }
            if(correo.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN CORREO PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                correo.requestFocus();
                return;
            }
            if(direccion.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA DIRECCION PARA EL CLIENTE","CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
                direccion.requestFocus();
                return;
            }
            if(genero.getSelectedItem() == null){
                JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UNA OPCIÓN PARA EL GENERO DEL CLIENTE", "CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                genero.requestFocus();
                return;
            }
            if(fecha.getDate() == null){
                JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FECHA DE NACIMIENTO PARA EL CLIENTE","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Asignar orden de los datos en la tabla
            
            int ADT = tb.getRowCount();
            
            for(int i = 0; i<ADT; i++){
                
                //Asignar Dato en la Tabla (Cedula)
                long Cedula_ADT = Long.parseLong(tb.getValueAt(i, 0).toString());
                
                //Asignar Dato en la Tabla (Nombre)
                String Nombre_ADT = tb.getValueAt(i, 1).toString();
                
                //Asignar Dato en la Tabla (telefono)
                long Telefono_ADT  = Long.parseLong(tb.getValueAt(i, 2).toString());
                
                //Asignar Dato en la Tabla (Correo)
                String Correo_ADT = tb.getValueAt(i, 3).toString();
                
                //Asignar Dato en la Tabla (Dirección)
                String Direccion_ADT = tb.getValueAt(i, 4).toString();
                
                //Asignar Dato en la Tabla (Genero)
                String Genero_ADT = tb.getValueAt(i, 5).toString();
                
                //Aignar Dato en la Tabla (Fecha De Nacimiento)
                String FechaNacimiento_ADT = tb.getValueAt(i, 6).toString();
                
                System.out.println("Actuaizar datos: "+
                        "\n"+"Cedula: "+Cedula_ADT+
                        "\n"+"Nombre: "+Nombre_ADT+
                        "\n"+"Telefono: "+Telefono_ADT+
                        "\n"+"Correo: "+Correo_ADT+
                        "\n"+"Dirección: "+Direccion_ADT+
                        "\n"+"Genero: "+Genero_ADT+
                        "\n"+"Fecha De Nacimiento: "+FechaNacimiento_ADT);
            }
            
            //Obtener Los Datos para Insertarlos
            
            //Cedula
            long Cedula= Long.parseLong(cedula.getText().trim());
            
            //Nombre
            String Nombre= nombre.getText().trim();
            
            //Telefono
            long Telefono= Long.parseLong(telefono.getText().trim());
            
            //Correo
            String Correo= correo.getText().trim();
            
            //Dirección
            String Direccion= direccion.getText().trim();
            
            //Genero
            String Genero= genero.getSelectedItem().toString();
            
            //Fecha De Nacimiento
            Date FechaDeNacimiento= fecha.getDate();
            
            //Formato de fecha
            SimpleDateFormat fc = new SimpleDateFormat("yyyy-MM-dd");
            String facha = fc.format(FechaDeNacimiento);
            
            //Establecer Conexión con la base de datos
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            
            //query o consulta
                       String query_update = "update clientes set "
                   + "nombre_cliente= '"+Nombre+" ', "
                   + "telefono_cliente="+Telefono+" , "
                   + "correo_cliente= '"+Correo+" ', "
                   + "direccion_cliente= '"+Direccion+" ', "
                   + "genero_cliente= '"+Genero+" ', "
                   + "fechanacimiento_cliente= ' "+facha
                   +" ' where cedula_cliente= "+Cedula;
            
            System.out.println(query_update);
            con.actualizar(query_update);
            
            JOptionPane.showMessageDialog(null, "CLIENTE ACTUALIZADO CORECTAMENTE");
            
            //Cerrar conexión
            con.cerrar();
                     
            //Mostrar Los Datos En La Tabla
            tb.addRow(new Object []{Cedula,Nombre,Telefono,Correo,Direccion,Genero,facha} );
            
            //limpiar los campos
            cedula.setText("");
            nombre.setText("");
            telefono.setText("");
            correo.setText("");
            direccion.setText("");
            
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

String seleccionar = "SELECT * FROM clientes";

ResultSet resultado = con1.consultar(seleccionar);

while (resultado.next()){

tb.addRow(new Object[]{

resultado.getLong("cedula_cliente"),
resultado.getString("nombre_cliente"),
resultado.getLong("telefono_cliente"),
resultado.getString("correo_cliente"),
resultado.getString("direccion_cliente"),
resultado.getString("genero_cliente"),
resultado.getString("fechanacimiento_cliente")      
});

}     } catch (Exception ex) {
ex.printStackTrace();

JOptionPane.showMessageDialog(null, "ERROR AL CARGAR CLIENTES DESDE LA BASE DE DATOS");
}
        
    }//GEN-LAST:event_btneditarActionPerformed

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
           
            String Mostrar = ("SELECT * FROM clientes WHERE cedula_cliente = ?");
            
              search = conect.prepareStatement(Mostrar);
              
              long CedulaBuscar = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese la Cedula para buscar", "Buscar", JOptionPane.INFORMATION_MESSAGE));
              search.setLong(1, CedulaBuscar);
              
           rs= search.executeQuery();
            
           if(rs.next()){
               cedula.setText(rs.getString("cedula_cliente"));
               nombre.setText(rs.getString("nombre_cliente"));
               telefono.setText(rs.getString("telefono_cliente"));
               correo.setText(rs.getString("correo_cliente"));
               direccion.setText(rs.getString("direccion_cliente"));
               fecha.setDate(rs.getDate("fechanacimiento_cliente"));
               
               
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
               Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped

        try {
            String nm= busqueda.getText();
            tb.setRowCount(0);
            
            
            Conexion conex = new Conexion("postgres","1986","localhost","5432","cafeteriasenita");
            conex.ConexionPostgres();
            String query = "SELECT * FROM clientes WHERE \"nombre_cliente\" LIKE '%"+nm+"%'";
            ResultSet rs = conex.consultar(query);
            
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getLong("cedula_cliente"),
                    rs.getString("nombre_cliente"),
                    rs.getLong("telefono_cliente"),
                    rs.getString("correo_cliente"),
                    rs.getString("direccion_cliente"),
                    rs.getString("genero_cliente"),
                    rs.getDate("fechanacimiento_cliente")
                });
                
                conex.cerrar();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_busquedaKeyTyped

    private void cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyReleased
       
               
          //validar tipo de dato
          
        String texto = cedula.getText().trim();
        
        //validar campo vacio
        
        if(texto.isEmpty()){
            label_cedula.setForeground(Color.red);
            label_cedula.setText("¡EL CAMPO NO PUEDE ESTAR VACIO!");
            cedula.requestFocus();
            return;
        }
             
        //validar si es texto o numero
        for (char c : texto.toCharArray()){
            if(!Character.isDigit(c)){
                label_cedula.setForeground(Color.red);
                label_cedula.setText("¡SOLO DEBE INGRESAR NUMEROS!");
                cedula.requestFocus();
                return;
            }
        }
        
        //limpiar
        label_cedula.setText("");
        
    }//GEN-LAST:event_cedulaKeyReleased

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

    private void telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyReleased
       
         //validar tipo de dato
          
        String texto = telefono.getText().trim();
        
        //validar campo vacio
        
        if(texto.isEmpty()){
            label_telefono.setForeground(Color.red);
            label_telefono.setText("¡EL CAMPO NO PUEDE ESTAR VACIO!");
            telefono.requestFocus();
            return;
        }
             
        //validar si es texto o numero
        for (char c : texto.toCharArray()){
            if(!Character.isDigit(c)){
                label_telefono.setForeground(Color.red);
                label_telefono.setText("¡SOLO DEBE INGRESAR NUMEROS!");
                telefono.requestFocus();
                return;
            }
        }
        
        //limpiar
        label_telefono.setText("");
        
    }//GEN-LAST:event_telefonoKeyReleased

    private void correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyReleased
        
        
        //validar tipo de dato
          
        String texto = correo.getText().trim();
        
        //validar campo vacio
           if(texto.isEmpty()){
               label_correo.setForeground(Color.red);
               label_correo.setText("¡EL CAMPO NO PUEDE ESTAR VACIO!");
               correo.requestFocus();
               return;
           }
           
           //limpiar
           label_correo.setText("");
    }//GEN-LAST:event_correoKeyReleased

    private void direccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyReleased
        
        
        //validar tipo de dato
          
        String texto = direccion.getText().trim();
        
        //validar campo vacio
           if(texto.isEmpty()){
               label_direccion.setForeground(Color.red);
               label_direccion.setText("¡EL CAMPO NO PUEDE ESTAR VACIO!");
               direccion.requestFocus();
               return;
           }
           
           //limpiar
           label_direccion.setText("");
    }//GEN-LAST:event_direccionKeyReleased

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
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_barra_like;
    private javax.swing.JLabel label_cedula;
    private javax.swing.JLabel label_correo;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables

}

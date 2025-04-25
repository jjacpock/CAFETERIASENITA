package FORMULARIOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Panel_Notificaciones extends javax.swing.JPanel {

    DefaultTableModel tb = new DefaultTableModel();

    public Panel_Notificaciones() {
        try {
            initComponents();
            
            String columns[] = {"Notificación"};
            
            tb.setColumnIdentifiers(columns);
            
            Tabla_Notificaciones.setModel(tb);
            
            Connection conect = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            Conexion con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
            
            String query_llamar = "SELECT*FROM notificaciones";
            
            rs = con.consultar(query_llamar);
            
            while(rs.next()){
                String cn_ = rs.getString("contenido_notificacion");
                String estado_noti = rs.getString("estado_notificacion");
                
                tb.addRow(new Object[]{cn_});
                
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Panel_Notificaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Notificaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Panel_Notificaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Panel_Notificaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Notificaciones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        Tabla_Notificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Notificaciones);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("ELIMINAR NOTIFICACION X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        int confirmacion;
        
        int fila= Tabla_Notificaciones.getSelectedRow();
        
        if(fila==-1){
            
            JOptionPane.showMessageDialog(null, "Seleccione una fila primero","Seleccionar fila",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
         confirmacion= JOptionPane.showConfirmDialog(null,"¿Esta Seguro de Eliminar la linea seleccionada?","Confirmación Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
            if(confirmacion==JOptionPane.YES_OPTION){
                
                

             try {
                 String noti_con = Tabla_Notificaciones.getValueAt(fila, 0).toString();
                 
                 Conexion  con= new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
                 
                 con.ConexionPostgres();
                 
                 String query_delete = "DELETE FROM notificaciones WHERE contenido_notificacion= '"+noti_con+"'";
                 
                 
                 
                 int FilasAfectadas = con.actualizar1(query_delete);
                 
                 if(FilasAfectadas > 0 ){
                     JOptionPane.showMessageDialog(null, "Notificación eliminada con exíto");
                    
                 }
                 else{
                     
                     JOptionPane.showMessageDialog(null, "No Hay dicha notificación en la base de Datos");
                 }
                 con.cerrar();
                 
                 tb.removeRow(Tabla_Notificaciones.getSelectedRow());
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
        
        
        
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Notificaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

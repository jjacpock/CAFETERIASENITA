
package REGISTROS;

import FORMULARIOS.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Inicio_De_Sesion extends javax.swing.JFrame {

    int Intentos;
   
   
    public Inicio_De_Sesion() {
        initComponents();
                registrar.setForeground(Color.BLACK);
        setSize(1150,470);
        usuario.setPlaceholder("INGRESAR USUARIO");
        contraseña.setPlaceholder("INGRESAR CONTRASEÑA");
           
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new LIB.FSTexFieldMD();
        contraseña = new LIB.FSPasswordFieldMD();
        iniciarsesion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(112, 138, 147));
        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BIENVENIDO A TU CAFETERIA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ids.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 470));

        usuario.setBackground(new java.awt.Color(209, 235, 247));
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setBordeColorFocus(new java.awt.Color(209, 235, 247));
        usuario.setBordeColorNoFocus(new java.awt.Color(209, 235, 247));
        usuario.setCaretColor(new java.awt.Color(209, 235, 247));
        usuario.setPlaceholder("INGRESAR USUARIO");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        contraseña.setBackground(new java.awt.Color(209, 235, 247));
        contraseña.setForeground(new java.awt.Color(0, 0, 0));
        contraseña.setBordeColorFocus(new java.awt.Color(209, 235, 247));
        contraseña.setBordeColorNoFocus(new java.awt.Color(209, 235, 247));
        contraseña.setCaretColor(new java.awt.Color(209, 235, 247));
        contraseña.setPlaceholder("INGRESAR CONTRASEÑA");
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaMouseClicked(evt);
            }
        });
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, -1, -1));

        iniciarsesion.setBackground(new java.awt.Color(209, 235, 247));
        iniciarsesion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        iniciarsesion.setForeground(new java.awt.Color(0, 0, 0));
        iniciarsesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iniciarsesion.setText("INICIAR SESION");
        iniciarsesion.setOpaque(true);
        iniciarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarsesionMouseClicked(evt);
            }
        });
        jPanel1.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 260, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("INGRESA A TU MENÚ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        registrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 0, 0));
        registrar.setText("¿ERES UN USUARIO NUEVO? REGISTRATE AQUI!!");
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarMouseExited(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 460, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarsesionMouseClicked

        String Usuario = usuario.getText().trim();
        String Contraseña = contraseña.getText().trim();
        
        Connection conect = null;
       PreparedStatement loguin = null;
       ResultSet rs = null;
       
         try{
             
            Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
           
           con.ConexionPostgres();
           
           conect=con.getConnection();
           
            String query = ("Select * From usuarios Where usuario= ? And contraseña= ?");
            
              loguin = conect.prepareStatement(query);
              
            loguin.setString(1, Usuario );
            loguin.setString(2, Contraseña);
              
              rs = loguin.executeQuery();
              
              if(rs.next()){
                  
                  String Rol_= rs.getString("rol_usuario");
                  System.out.println("Rol del usuario: "+Rol_);
                  
                  if(Rol_.equals("ADMINISTRADOR")){
                      
                      Menu_Cafeteria FormIni = new Menu_Cafeteria();
                      FormIni.setVisible(true);
                      this.dispose();
                  }else if(Rol_.equals("EMPLEADO")){
                      
                      Menu_Cafeteria_1 Formini1 = new Menu_Cafeteria_1();
                      Formini1.setVisible(true);
                      this.dispose();

                  }             
              }else{
                  JOptionPane.showMessageDialog(null, "Nombre de Usuario o Contraseña Incorrectos."+"\n"+" Vuelva a intentarlo", "Credenciales incorrectas", JOptionPane.ERROR_MESSAGE);
              }
              
                 if (Usuario.equals(usuario) && Contraseña.equals(contraseña)){
            
            JOptionPane.showMessageDialog(null, "BIENVENIDO");
        
        }else if(Intentos == 3){
    
            JOptionPane.showMessageDialog(this, "Intentos agotados");
            System.exit(0);
        }
////        } else if(!Usuario.equals(usuario) || !Contraseña.equals(contraseña)){
////        
////            Intentos++;
////            JOptionPane.showMessageDialog(this, "Intentos " + Intentos);
////        
////        }
        
       
              
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Ingrese un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
       }
        catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error en la base de Datos", "Error", JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error inesperado", "Error", JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
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
        
    }//GEN-LAST:event_iniciarsesionMouseClicked

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked

        new Registrar_Nuevos_Usuarios().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_registrarMouseClicked

    private void registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseEntered
        
         Font fuenteoriginal = registrar.getFont();     
        registrar.setForeground(Color.BLUE);
        Font fuenteaumentada = fuenteoriginal.deriveFont(fuenteoriginal.getSize()+2.0f);
        registrar.setFont(fuenteaumentada);

    }//GEN-LAST:event_registrarMouseEntered

    private void registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseExited
      
        Font fuenteaumentada = registrar.getFont();
        registrar.setForeground(Color.BLACK);
        Font fuenteoriginal = fuenteaumentada.deriveFont(fuenteaumentada.getSize()-2.0f);
        registrar.setFont(fuenteoriginal);
        
       
    }//GEN-LAST:event_registrarMouseExited

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
      usuario.setPlaceholder("");
    }//GEN-LAST:event_usuarioMouseClicked

    private void contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseClicked
       contraseña.setPlaceholder("");
    }//GEN-LAST:event_contraseñaMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio_De_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_De_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_De_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_De_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_De_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSPasswordFieldMD contraseña;
    private javax.swing.JLabel iniciarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel registrar;
    private LIB.FSTexFieldMD usuario;
    // End of variables declaration//GEN-END:variables
}

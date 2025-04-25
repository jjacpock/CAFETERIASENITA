
package HILOS;

import FORMULARIOS.Conexion;
import FORMULARIOS.Panel_Notificaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Monitor_De_Cantidad_De_Producto implements Runnable{

    Thread Hilo_Monitor;
    
    public Monitor_De_Cantidad_De_Producto(){
        
    }
    
    public void inicio() throws Exception{
        
        if(Hilo_Monitor == null){
            Hilo_Monitor = new Thread(this);
            Hilo_Monitor.start();
        }
    }
    
    public void stop(){
        Hilo_Monitor=null;
    }
    
    public enum EstadoNoti {
        ACTIVA, INACTIVA
    }
    
    @Override
    public void run() {
        
        try {
            
            
            Connection conect = null;
            PreparedStatement ps = null;        
            ResultSet temp;
            ResultSet rs;
            
            Thread HiloActual = Thread.currentThread();
            
            Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
              
            while(Hilo_Monitor==HiloActual){
                
// 1. Desactivar notificaciones activas de productos que ya tienen suficiente stock
String desactivar = """
    UPDATE notificaciones
    SET estado_notificacion = 'Inactivo'
    WHERE contenido_notificacion LIKE 'Debe Surtir El Producto %'
    AND contenido_notificacion IN (
        SELECT contenido_notificacion
        FROM notificaciones
        WHERE estado_notificacion = 'Activo'
    )
    AND NOT EXISTS (
        SELECT 1 FROM productos p
        WHERE ('Debe Surtir El Producto ' || p.nombre_producto || ' ¡LAS UNIDADES ESTAN A PUNTO DE AGOTARSE!') = notificaciones.contenido_notificacion
        AND p.cantidad_producto < 40
    )
""";

PreparedStatement psDesactivar = con.getConnection().prepareStatement(desactivar);
int desactivadas = psDesactivar.executeUpdate();

if (desactivadas > 0) {
    System.out.println("🔕 " + desactivadas + " notificaciones se marcaron como Inactivo.");
}


                       
                String Query = "Select * From productos where cantidad_producto<40";
                
                temp = con.consultar(Query);
                
                try{
                        
                    while(temp.next()){
              
                        
                        boolean noti_exi = false;
                        
                        conect = con.getConnection();
                        
                        String nom_pro = temp.getString("nombre_producto");
                        int cantidades = Integer.parseInt(temp.getString("cantidad_producto"));
                        
                        String  info_noti = "Debe Surtir El Producto "+nom_pro+" ¡LAS UNIDADES ESTAN A PUNTO DE AGOTARSE!";
                        
                        String validar = "SELECT COUNT (*) FROM notificaciones WHERE contenido_notificacion = ?";
                        
                        ps= conect.prepareStatement(validar);
                        
                        ps.setString(1, info_noti);
                        
                        rs= ps.executeQuery();
                        
                        if(rs.next()){
                            noti_exi = rs.getInt(1)>0;
                            
                            JOptionPane.showMessageDialog(null, "Debe Surtir El Producto "+nom_pro+"\n"+"¡LAS UNIDADES ("+cantidades+") ESTAN A PUNTO DE AGOTARSE!", "Surtir Producto", JOptionPane.WARNING_MESSAGE);
                        System.out.println("Debe Surtir El Producto "+nom_pro+"\n"+"¡LAS UNIDADES ESTAN A PUNTO DE AGOTARSE!");
                        
                        
                        if(noti_exi){
                                        
                        }else{
                            String query_noti = "insert into notificaciones (contenido_notificacion, estado_notificacion) values (?,?)";
                         
                        ps = conect.prepareStatement(query_noti);

                        ps.setString(1, info_noti);
                        ps.setString(2, "Activo");
                        
                        ps.executeUpdate();
                                            
                        }    
                         
                        pausa(30000);
                        }
                                                     
                   }                                    
                }catch(SQLException e){}           
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Monitor_De_Cantidad_De_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Monitor_De_Cantidad_De_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Monitor_De_Cantidad_De_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Monitor_De_Cantidad_De_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void pausa (int time){
        try{
            Thread.sleep(time);
            
        }catch(InterruptedException ignorada){}
    }
    
    
}

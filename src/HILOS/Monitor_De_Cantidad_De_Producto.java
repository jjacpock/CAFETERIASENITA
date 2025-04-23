
package HILOS;

import FORMULARIOS.Conexion;
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
    
    @Override
    public void run() {
        
        try {
            
            ResultSet temp;
            
            Thread HiloActual = Thread.currentThread();
            
            Conexion  con = new Conexion("postgres", "1986", "localhost", "5432", "cafeteriasenita");
            
            con.ConexionPostgres();
              
            while(Hilo_Monitor==HiloActual){
                
                String Query = "Select * From productos where cantidad_producto<40";
                
                temp = con.consultar(Query);
                
                try{
                    
                    while(temp.next()){
                        
                        String nom_pro = temp.getString("nombre_producto");
                        int cantidades = Integer.parseInt(temp.getString("cantidad_producto"));
                        
                        JOptionPane.showMessageDialog(null, "Debe Surtir El Producto "+nom_pro+"\n"+"¡LAS UNIDADES ("+cantidades+") ESTAN A PUNTO DE AGOTARSE!", "Surtir Producto", JOptionPane.WARNING_MESSAGE);
                        System.out.println("Debe Surtir El Producto "+nom_pro+"\n"+"¡LAS UNIDADES ESTAN A PUNTO DE AGOTARSE!");
                        pausa(30000);
                        
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

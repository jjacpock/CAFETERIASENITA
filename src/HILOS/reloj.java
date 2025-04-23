
package HILOS;

import java.util.*;

public class reloj extends javax.swing.JPanel implements Runnable{

    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread Hiloreloj;

    public reloj() {
        initComponents();
        Hiloreloj = new Thread(this);
        Hiloreloj.start();
        
        
        
        setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblreloj = new javax.swing.JLabel();

        lblreloj.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        lblreloj.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblreloj, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblreloj, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblreloj;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
        Thread ct = Thread.currentThread();
        
        while(ct==Hiloreloj){
            calcula();
            lblreloj.setText(hora+" : "+minutos+" : "+segundos+" "+ampm);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
             
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoracatual = new Date();
        
        calendario.setTime(fechaHoracatual);
        ampm = calendario.get(Calendar.AM_PM)== Calendar.AM?"AM":"PM";
        
        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
            
        }else{
            
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}

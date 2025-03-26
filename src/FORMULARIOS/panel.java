/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FORMULARIOS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class panel extends JFrame {
    private JTable miJTable;
    private JPanel panelTabla;
    private JButton botonMostrar;

    public panel() {
        // Configuración del JFrame
        setTitle("Ocultar y Mostrar JTable");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el JPanel que contendrá la JTable
        panelTabla = new JPanel();
        panelTabla.setLayout(new BorderLayout());

        // Crear la tabla con algunos datos de ejemplo
        String[][] datos = {{"1", "Juan"}, {"2", "Ana"}};
        String[] columnas = {"ID", "Nombre"};
        miJTable = new JTable(datos, columnas);

        // Agregar la JTable al panelTabla (en un JScrollPane)
        JScrollPane scrollPane = new JScrollPane(miJTable);
        panelTabla.add(scrollPane, BorderLayout.CENTER);

        // Ocultar la tabla al principio
        panelTabla.setVisible(false);

        // Crear el botón para mostrar la tabla
        botonMostrar = new JButton("Mostrar Tabla");
        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la tabla al presionar el botón
                panelTabla.setVisible(true);

                // Actualizar la interfaz (revalidate y repaint)
                revalidate();
                repaint();
            }
        });

        // Configurar el layout del JFrame
        setLayout(new BorderLayout());
        add(botonMostrar, BorderLayout.NORTH);  // Botón arriba
        add(panelTabla, BorderLayout.CENTER);   // Panel con JTable al centro
    }

    public static void main(String[] args) {
        // Crear e iniciar la ventana
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new panel().setVisible(true);
            }
        });
    }
}

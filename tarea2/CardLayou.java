package tarea2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayou extends JFrame implements ActionListener {

    private JPanel panelContenedor;
    private CardLayout cardLayout;

    public CardLayou() {
        super("Clasificación de carros");

        // Crear el panel contenedor y el CardLayout
        panelContenedor = new JPanel();
        cardLayout = new CardLayout();
        panelContenedor.setLayout(cardLayout);

        // Crear los paneles para las clasificaciones
        JPanel panelMarcas = new JPanel();
        panelMarcas.setLayout(new GridLayout(5, 1));
        panelMarcas.add(new JLabel("Marcas de carros:"));
        panelMarcas.add(new JLabel("Toyota"));
        panelMarcas.add(new JLabel("Honda"));
        panelMarcas.add(new JLabel("Ford"));
        panelMarcas.add(new JLabel("Chevrolet"));

        JPanel panelModelos = new JPanel();
        panelModelos.setLayout(new GridLayout(5, 1));
        panelModelos.add(new JLabel("Modelos de carros:"));
        panelModelos.add(new JLabel("Camry"));
        panelModelos.add(new JLabel("Civic"));
        panelModelos.add(new JLabel("F-150"));
        panelModelos.add(new JLabel("Silverado"));

        // Agregar los paneles al panel contenedor
        panelContenedor.add(panelMarcas, "MARCAS");
        panelContenedor.add(panelModelos, "MODELOS");

        // Crear el botón para cambiar de clasificación
        JButton botonCambiar = new JButton("Cambiar clasificación");
        botonCambiar.addActionListener(this);

        // Agregar los componentes al frame
        getContentPane().add(panelContenedor, BorderLayout.CENTER);
        getContentPane().add(botonCambiar, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        cardLayout.next(panelContenedor);
    }

    public static void main(String[] args) {
        new CardLayou();
    }
}

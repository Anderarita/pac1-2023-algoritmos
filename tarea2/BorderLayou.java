package tarea2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayou extends JFrame implements ActionListener {
    private JTextField campo1, campo2, campo3;
    private JButton botonSumar, botonRestar, botonMultiplicar, botonDividir;

    public BorderLayou() {
        super("Calculadora");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        campo1 = new JTextField(10);
        campo2 = new JTextField(10);
        campo3 = new JTextField(10);

        botonSumar = new JButton("SUMAR");
        botonRestar = new JButton("RESTAR");
        botonMultiplicar = new JButton("MULTIPLICAR");
        botonDividir = new JButton("DIVIDIR");

        botonSumar.addActionListener(this);
        botonRestar.addActionListener(this);
        botonMultiplicar.addActionListener(this);
        botonDividir.addActionListener(this);

        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(3, 1));
        panelCampos.add(campo1);
        panelCampos.add(campo2);
        panelCampos.add(campo3);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 4));
        panelBotones.add(botonSumar);
        panelBotones.add(botonRestar);
        panelBotones.add(botonMultiplicar);
        panelBotones.add(botonDividir);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelCampos, BorderLayout.CENTER);
        getContentPane().add(panelBotones, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) {
        String valor1 = campo1.getText();
        String valor2 = campo2.getText();
        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        if (evento.getSource() == botonSumar) {
            double resultado = num1 + num2;
            campo3.setText(Double.toString(resultado));
        }
        else if (evento.getSource() == botonRestar) {
            double resultado = num1 - num2;
            campo3.setText(Double.toString(resultado));
        }
        else if (evento.getSource() == botonMultiplicar) {
            double resultado = num1 * num2;
            campo3.setText(Double.toString(resultado));
        }
        else if (evento.getSource() == botonDividir) {
            double resultado = num1 / num2;
            campo3.setText(Double.toString(resultado));
        }
    }

    public static void main(String[] args) {
        BorderLayou calc = new BorderLayou();
    }
}

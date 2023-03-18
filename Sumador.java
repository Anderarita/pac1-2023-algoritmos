/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

    
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sumador extends JFrame {
    private JTextField num1Field, num2Field, resultadoField;
    private JButton sumarButton;

    public Sumador() {
        // Configurar la ventana principal
        setTitle("Sumador");
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultadoField = new JTextField(10);
        resultadoField.setEditable(false);
        sumarButton = new JButton("Sumar");
        sumarButton.addActionListener(new SumarListener());

        // Crear panel y agregar componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Número 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Número 2:"));
        panel.add(num2Field);
        panel.add(sumarButton);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultadoField);

        // Agregar panel a la ventana principal
        add(panel);
        setVisible(true);
    }

    private class SumarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // Obtener números ingresados por el usuario
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Realizar suma y mostrar resultado
                int resultado = num1 + num2;
                resultadoField.setText(Integer.toString(resultado));
            } catch (NumberFormatException ex) {
                // Mostrar mensaje de error si los números ingresados no son válidos
                JOptionPane.showMessageDialog(Sumador.this, "Ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Sumador();
    }
}

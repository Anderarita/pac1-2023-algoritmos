
package tarea2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio4 extends JFrame implements ActionListener {
    private JLabel lblNombre, lblApellido, lblEdad;
    private JTextField txtNombre, txtApellido, txtEdad;
    private JButton btnGuardar, btnMostrar;
    private JPanel panel;
    private String nombre, apellido, edad;

    public Ejercicio4() {
        super("Datos de Usuario");
        setLayout(new GridLayout(4, 2));
        panel = new JPanel(new GridLayout(1, 2));

        lblNombre = new JLabel("Nombre: ");
        add(lblNombre);
        txtNombre = new JTextField(20);
        add(txtNombre);

        lblApellido = new JLabel("Apellido: ");
        add(lblApellido);
        txtApellido = new JTextField(20);
        add(txtApellido);

        lblEdad = new JLabel("Edad: ");
        add(lblEdad);
        txtEdad = new JTextField(20);
        add(txtEdad);

        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this);
        panel.add(btnGuardar);

        btnMostrar = new JButton("Mostrar");
        btnMostrar.addActionListener(this);
        panel.add(btnMostrar);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {
            nombre = txtNombre.getText();
            apellido = txtApellido.getText();
            edad = txtEdad.getText();
            //JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
        } else if (e.getSource() == btnMostrar) {
            JOptionPane.showMessageDialog(this, "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad);
        }
    }

    public static void main(String[] args) {
        Ejercicio4 datos = new Ejercicio4();
        datos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        datos.setSize(400, 200);
        datos.setVisible(true);
    }
}


/*En este programa, se crean tres etiquetas JLabel para los campos de 
"Nombre", "Apellido" y "Edad". Luego, se crean tres campos de texto JTextField
para que el usuario ingrese su información y se agregan a la ventana con add(). 
También se crean dos botones JButton para "Guardar" y "Mostrar", y se agregan a
un panel que se agrega a la ventana.

En el método actionPerformed(), se utiliza el método getSource() para determinar
cuál botón fue presionado por el usuario. Si 
el botón "Guardar" fue presionado, se guarda la información ingresada por el 
usuario en tres variables (nombre, apellido y edad). Si el botón "Mostrar" fue 
presionado, se muestra la información guardada utilizando un JOptionPane.

Finalmente, en el método main(), se crea una instancia de la clase DatosUsuario
y se establecen sus propiedades (tamaño, visibilidad, etc.). Cuando se cierra 
la ventana, se termina el programa utilizando System.exit().*/
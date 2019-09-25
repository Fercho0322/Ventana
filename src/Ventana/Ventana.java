package Ventana;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    //CONSTRUCTOR
    public Ventana() {

        this.setSize(350, 400); //establecemos tamaño de la ventana.
        //setLocation (500,140);//ESTABLECER POSICIÓN INICIAL DE LA VENTANA
        setTitle("          FORMULARIO CLASE PERSONA    "); // ESTABLECEMOS EL TITULO DE LA VENTANA
        //setBounds(100, 200, 300, 500); //POSICION INICAL Y TAMAÑO DE LA PANTALLA
        setLocationRelativeTo(null); //ESTABLECEMOS LA VENTANA EN EL CENTRO
        this.getContentPane().setBackground(Color.white); //establecer color 
        //setResizable(false); //establecemos si la ventana pude cambiar de color
        // setMininumSize(new Dimension(200,200)); //establecemos el tamaño minimo
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JLabel etiqueta = new JLabel("NOMBRES");
        JTextField texto = new JTextField(20);
        JLabel etiqueta2 = new JLabel("APELLIDO");
        JTextField texto2 = new JTextField(20);
        JLabel etiqueta3 = new JLabel("TELEFONO");
        JTextField texto3 = new JTextField(20);
        JLabel etiqueta4 = new JLabel("IDENTIFICACION");
        JTextField texto4 = new JTextField(18);
        JLabel etiqueta5 = new JLabel("FECHA DE NACIMIENTO");
        JTextField texto5 = new JTextField(15);
        JLabel etiqueta6 = new JLabel("DIRECCION");
        JTextField texto6 = new JTextField(20);
        JLabel etiqueta7 = new JLabel("TIPO DE SANGRE");
        JTextField texto7 = new JTextField(20);
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(etiqueta2);
        cp.add(texto2);
        cp.add(etiqueta3);
        cp.add(texto3);
        cp.add(etiqueta4);
        cp.add(texto4);
        cp.add(etiqueta5);
        cp.add(texto5);
        cp.add(etiqueta6);
        cp.add(texto6);
        cp.add(etiqueta7);
        cp.add(texto7);

        JButton botong = new JButton("Guardar");
        cp.add(botong);
        JButton botons = new JButton("Salir");
        cp.add(botons);

    }

}

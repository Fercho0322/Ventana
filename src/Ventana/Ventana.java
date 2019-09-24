package Ventana;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    //CONSTRUCTOR
    public Ventana() {

        this.setSize(350,600); //establecemos tamaño de la ventana.
        //setLocation (500,140);//ESTABLECER POSICIÓN INICIAL DE LA VENTANA
        setTitle("          FORMULARIO CLASE PERSONA    "); // ESTABLECEMOS EL TITULO DE LA VENTANA
        //setBounds(100, 200, 300, 500); //POSICION INICAL Y TAMAÑO DE LA PANTALLA
        setLocationRelativeTo(null); //ESTABLECEMOS LA VENTANA EN EL CENTRO
        //this.getContentPane().setBackground(Color.GRAY); //establecer color 
        //setResizable(false); //establecemos si la ventana pude cambiar de color
        // setMininumSize(new Dimension(200,200)); //establecemos el tamaño minimo
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JLabel etiqueta = new JLabel("NOMBRES");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("ESCRIBIR");   
        cp.add(etiqueta);
        cp.add(texto);
        //cp.add(boton);

        JLabel etiqueta2 = new JLabel("APELLIDO");
        JTextField texto2 = new JTextField(20);
        JButton boton1 = new JButton("ESCRIBIR");   
        cp.add(etiqueta2);
        cp.add(texto2);
        //cp.add(boton1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel etiqueta3 = new JLabel("TELEFONO");
        JTextField texto3 = new JTextField(20);
        JButton boton2 = new JButton("ESCRIBIR");   
        cp.add(etiqueta3);
        cp.add(texto3);
        //cp.add(boton2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel etiqueta4 = new JLabel("IDENTIFICACION");
        JTextField texto4 = new JTextField(18);
        JButton boton3 = new JButton("ESCRIBIR");   
        cp.add(etiqueta4);
        cp.add(texto4);
        //cp.add(boton3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel etiqueta5 = new JLabel("DIRECCION");
        JTextField texto5 = new JTextField(20);
        JButton boton4 = new JButton("ESCRIBIR");   
        cp.add(etiqueta5);
        cp.add(texto5);
        //cp.add(boton4);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

    }
}

package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

    //CONSTRUCTOR
    public Ventana() {

        //this.setSize(500, 500); //establecemos tamaño de la ventana.
        //setLocation (500,140);//ESTABLECER POSICIÓN INICIAL DE LA VENTANA
        setTitle("EL MEJOR TITULO");// ESTABLECEMOS EL TITULO DE LA VENTANA
        setBounds(100, 200, 500, 500);//POSICION INICAL Y TAMAÑO DE LA PANTALLA
        setLocationRelativeTo(null);//ESTABLECEMOS LA VENTANA EN EL CENTRO
        //this.getContentPane().setBackground(Color.BLUE);//establecer color 
        //setResizable(false);//establecemos si la ventana pude cambiar de color
        // setMininumSize(new Dimension(200,200));//establecemos el tamaño minimo
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    //constructor panel

    private void IniciarComponentes() {

        JPanel paneles = new JPanel();//creación de un panel
        this.getContentPane().add(paneles);//agregamos panel a la ventana
        paneles.setBackground(Color.red);

        JLabel etiqueta = new JLabel("Hola"); // creamos una etiqueta
        etiqueta.setText("HOLA");
        paneles.add(etiqueta);//agregamos etiqueta al panel

    }

}

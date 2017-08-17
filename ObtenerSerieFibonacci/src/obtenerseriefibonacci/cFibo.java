/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obtenerseriefibonacci;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class cFibo extends JFrame implements ActionListener {
    public Image _imagenFondo;
    public URL _fondo;
    private JFrame _ventana;
    private JTextField _fac , _resul ;
    private JButton _salir,_obtener;
    private Container _cont;
    private JLabel _titulo,_ni , _ins , _re;
    Panel p;
    
    public cFibo(){
        _ventana= new JFrame("Obtener Factorial");
        _ventana.setBounds(400, 100, 600, 450);
        _ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _ventana.setLocationRelativeTo(null);
        _ventana.setResizable(false);
        _ventana.setLayout(null);
        _ventana.setContentPane(new JLabel(new ImageIcon("flores.jpg")));
        _cont= _ventana.getContentPane();
        
    }
    private void componentes(){
        _titulo= new JLabel("Serie Fibonacci");
        _titulo.setBounds(200, 40, 300, 30);
        _titulo.setForeground(Color.white);
        _titulo.setFont( new Font("Cambria Math", Font.BOLD, 20));
        _cont.add(_titulo);
        
        _ins= new JLabel("No se aceptan números muy grandes. El primer término es 1");
        _ins.setBounds(60, 90, 600, 30);
        _ins.setForeground(Color.white);
        _ins.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_ins);
        
        _ni= new JLabel("Hasta qué número?");
        _ni.setBounds(150, 150, 300, 30);
        _ni.setForeground(Color.white);
        _ni.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_ni);
        
        _fac= new JTextField(10);
        _fac.setBounds(330, 150, 200, 30);
        _cont.add(_fac);
        _fac.addActionListener(this);
        
        _re= new JLabel("Resultado");
        _re.setBounds(150, 200, 300, 30);
        _re.setForeground(Color.white);
        _re.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_re);
        
        _resul= new JTextField(10);
        _resul.setBounds(150, 250, 400, 30);
        _cont.add(_resul);
        _resul.disable();
        _resul.setText("Resultado");
        _resul.addActionListener(this);
        
        _obtener= new JButton();
        _obtener.setBounds(250, 300, 100, 40);
        _obtener.setText("<html><font face=Cambria Math> Fibonacci </font></html>");
        _obtener.addActionListener(this);
        _cont.add(_obtener);
        
        _salir= new JButton();
        _salir.setBounds(400, 300, 100, 40);
        _salir.setText("<html><font face=Cambria Math>Salir</font></html>");
        _salir.addActionListener(this);
        _cont.add(_salir);
    }
    
    public void prendeApaga(Boolean prendeApaga){
        componentes();
        _ventana.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== _salir){
            JOptionPane.showMessageDialog(this, "Gracias Por Usarme :)");
            System.exit(0);
        }
        else
        {
          if(e.getSource()==_obtener){
               long num1 = 0;
               long num2 = 0;
               long numx = 0;
               String numero = _fac.getText();
               long nume = Integer.parseInt(numero);
               long fac = nume;
              num2 = 1;
            for(int i=1; i <= fac; i++) 
            {
               num1 = num1 +num2;
               numx = num1 - num2;
               i++;
               if(i <= fac){
                 num1 = num1 + numx;
                 num2 =  num1 - numx;
               }
                 _resul.setText(Long.toString(num1));
            }
           
        }
	
              }  
        }
    }
    

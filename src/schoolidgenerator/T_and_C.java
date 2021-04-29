/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolidgenerator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ankit suwalka
 */
public class T_and_C  extends JFrame{
     JTextField jfl;
     JLabel jl1,jl2,jl3;
     String str;
     JPanel jp1,jp2;
     ImageIcon img;
     ImageIcon img1;
     T_and_C()
     {
      super("Terms and Conditions");
     img = new ImageIcon(ClassLoader.getSystemResource("images/login.png"));
     setIconImage(img.getImage());
     
      jp1 = new JPanel();
      jp2 = new JPanel();
     
     
     setLayout(new BorderLayout());
     jp1.setPreferredSize(new Dimension(600,400));
      jl1 = new JLabel();
      img1 = new ImageIcon(ClassLoader.getSystemResource("images/T_and_C.jpg"));
      jl1.setIcon(img1);
      jp1.add(jl1);
      jp1.setBackground(Color.BLUE);
     jp2.setPreferredSize(new Dimension(240,60));
     jp1.setBackground(Color.CYAN);
      jp2.setLayout(new GridLayout(1,3,10,10));
     add(jp1,BorderLayout.NORTH);
     add(jp2,BorderLayout.SOUTH);
     
//     
//     jl2 = new JLabel();
//     jl2.setIcon(img1);
//     
//     
//    
    
     JButton b1 = new JButton("image must be in 100*100 Pixel");
     JButton b2 = new JButton("Please Enter A Valid Number ");
     JButton b3 = new JButton("Address Length must be in 30 character");
     
     b1.setEnabled(false);
     b2.setEnabled(false);
     b3.setEnabled(false);
     
     jp2.add(b1);
     jp2.add(b2);
     jp2.add(b3);
     
//     add(jl4);
     
     setSize(840,480);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setResizable(false);
     setVisible(true);
     
     }
      public static void main(String []args)
    {
    new  T_and_C();
    
    }
}

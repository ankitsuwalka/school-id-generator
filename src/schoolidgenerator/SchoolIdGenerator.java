/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolidgenerator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ankit suwalka
 */
 
/**
 *
 * @author Ankit suwalka
 */
public class  SchoolIdGenerator extends JFrame implements ActionListener {
    JPanel p1,p2,p3,p4,centre;
    JLabel l1,l2,l3,l4,l5,l6,l1_1,l2_2,l3_3,l4_4,l5_5;
    JTextField tf1,tf2,tf3,tf4,tf5;
    JButton top,b1,b2,b3,b4;
    JFileChooser jf1;
    JLabel Limage;
    ImageIcon image;
    JLabel jl_1,jl_2,jl_3,jl_4;
    
     SchoolIdGenerator()
    {
    p1 = new JPanel();
//    p1.setBackground(Color.BLUE);
    p1.setLayout(new GridLayout(8,2,5,30));
    ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/login.png"));
    this.setIconImage(img.getImage());
    
    l1 = new JLabel("FullName");
    p1.add(l1);
    tf1 = new JTextField(20);
    p1.add(tf1);
    
    
    
    
    l2 = new JLabel("Address");
    p1.add(l2);
    tf2 = new JTextField(30);
    p1.add(tf2);
    
    l3 = new JLabel("Class");
    p1.add(l3);
    tf3 = new JTextField(20);
    p1.add(tf3);
    
    l4 = new JLabel("MobileNo");
    p1.add(l4);
    tf4 = new JTextField(20);
    p1.add(tf4);
    
    l5 = new JLabel("Choose photo");
    p1.add(l5);
    
    tf5 = new JTextField(20);
    p1.add(tf5);
    
    b1 = new JButton("Attach");
    b2 = new JButton("Cancel");
    b3 = new JButton("GenerateID");
    b4 = new JButton("Print ID card");
    
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
  
    
    
    setLayout(new BorderLayout(0,10));
    add(p1,BorderLayout.WEST);
    p3 = new JPanel();
    p4 = new JPanel();    
    p4.setBackground(Color.MAGENTA);
    p3.setLayout(new GridLayout());
    top = new JButton("ID Card Geneator");
    p3.add(top);
    
    add(p3,BorderLayout.NORTH);
    
    add(p4,BorderLayout.SOUTH);
    
    p2 = new JPanel();
    
    JButton warn = new JButton(" * Terms and Conditon");
    warn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        new T_and_C().setVisible(true);
    }
    }
    
    );
    p4.add(warn);
    
    
    
    //p2.setBackground(Color.DARK_GRAY);
    
    p1.setPreferredSize(new Dimension(240,180));
    p2.setPreferredSize(new Dimension(380,180));
    p3.setPreferredSize(new Dimension(40,20));
    p4.setPreferredSize(new Dimension(40,30));
            
    add(p2,BorderLayout.EAST);
    
    
    //Code for Panel2;
   
    p2.setLayout(new BorderLayout(0,3));
   
    JPanel p2_1,p2_2,p2_3;
    p2_1 = new JPanel();
    p2_2 = new JPanel();
    p2_3 = new JPanel();
    
    
    p2_1.setBackground(Color.BLUE);
    p2_3.setBackground(Color.BLUE);
    
    
    
    p2_1.setPreferredSize(new Dimension(20,20));
    p2_2.setPreferredSize(new Dimension(340,140));
    p2_3.setPreferredSize(new Dimension(20,20));
   
    
    p2.add(p2_1,BorderLayout.NORTH);
    p2.add(p2_2,BorderLayout.CENTER);
    p2.add(p2_3,BorderLayout.SOUTH);
    
    
    p2_2.setLayout(new BorderLayout());
    JPanel p2_2_1,p2_2_2,p2_2_3;
    p2_2_1 = new JPanel();
    p2_2_2 = new JPanel();
    p2_2_3 = new JPanel();
           
    p2_2_1.setPreferredSize(new Dimension(260,20));
    p2_2_2.setPreferredSize(new Dimension(100,100));

    
    p2_2_1.setLayout(new GridLayout(1,1));
    p2_2_2.setLayout(null);
    p2_2_3.setLayout(new GridLayout(5,2,2,2));
    p2_2.add(p2_2_1,BorderLayout.NORTH);
    p2_2.add(p2_2_2,BorderLayout.CENTER);
    p2_2.add(p2_2_3,BorderLayout.SOUTH);
    // for panel p2_2_1;
    
    JButton schoolLabel = new JButton("SVN_PUBLIC_SCHOOL_PANDER");
    schoolLabel.setEnabled(false);
    schoolLabel.setBackground(Color.BLACK);
    Limage = new JLabel(); 
    Limage.setBounds(150,30,100,100);
    p2_2_1.add(schoolLabel);
    p2_2_2.add(Limage);
    
   
    JLabel jl1 = new JLabel("Full Name");
    JLabel jl2 = new JLabel("Address");
    JLabel jl3 = new JLabel("Class");
    JLabel jl4 = new JLabel("MobileNo");
    JLabel jl5 = new JLabel("Principle Sign");
    
    
    
    jl_1 = new JLabel();
    jl_2 = new JLabel();
    jl_3 = new JLabel();
    jl_4 = new JLabel();
    
     
    p2_2_3.add(jl1);
    p2_2_3.add(jl_1);
    
    p2_2_3.add(jl2);
    p2_2_3.add(jl_2);
    
    p2_2_3.add(jl3);
    p2_2_3.add(jl_3);
    
    p2_2_3.add(jl4);
    p2_2_3.add(jl_4);
    
    p2_2_3.add(jl5);
    
    
    
    
    
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    
    super.setTitle("ID CARD GENERATOR");
    setSize(900,500);
    setLocation(400,100);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    
    
    }
   public static void main(String []args)
    {
    SchoolIdGenerator idGenerator = new  SchoolIdGenerator();  
    
    }

    public void actionPerformed(ActionEvent ae) {
    try
    {
        String com = ae.getActionCommand();
        if(com.equals("Attach") )
        {
        JFileChooser jf = new JFileChooser();
        int r = jf.showSaveDialog(null);
        if(r == JFileChooser.APPROVE_OPTION)
        {
        tf5.setText(jf.getSelectedFile().getAbsolutePath());
        
        
        
        BufferedImage img = null;
                try {
                    
             img = ImageIO.read(new File(tf5.getText()));
                    
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                
                Image dimg = img.getScaledInstance(Limage.getWidth(), Limage.getHeight(),
                Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(dimg);
                Limage.setIcon(imageIcon);
        
            
        
        
        
        
        
        
        
        
        
        }
        }
        else if(com.equals("Print ID card"))
        {
          PrinterJob pj = PrinterJob.getPrinterJob();
          pj.setJobName(" Print Component ");

          pj.setPrintable (new Printable() {    
            public int print(Graphics pg, PageFormat pf, int pageNum){
              if (pageNum > 0){
              return Printable.NO_SUCH_PAGE;
              }

              Graphics2D g2 = (Graphics2D) pg;
              g2.translate(pf.getImageableX(), pf.getImageableY());
              p2.paint(g2);
              return Printable.PAGE_EXISTS;
            }
          });
          if (pj.printDialog() == false)
          return;

          try {
                pj.print();
          } catch (Exception ex) {
                // handle exception
          }


        }
        else if(com.equals("GenerateID"))
        {
                String name = tf1.getText();
                String address = tf2.getText();
                String Class = tf3.getText();
                String mobileNo = tf4.getText();
                jl_1.setText(name);
                jl_2.setText(address);
                jl_3.setText(Class);
                jl_4.setText(mobileNo);
        }
        else
        {
        
        JOptionPane.showMessageDialog(this,"Abort");
        setVisible(false);
        }
 
    
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
      
    
    }

    private void setIcon(ImageIcon img) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
         
}

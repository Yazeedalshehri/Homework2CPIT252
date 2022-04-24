/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.homework2cpit252;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
/**
 *
 * @author yaaz4
 */
public class Draw extends JPanel{

   
   
  public void paintComponent(Graphics g)
 {
    
    super.paintComponent(g);
     this.setBackground(Color.WHITE);
        g.setColor(Color.RED);
     g.fillOval(200, 200, 150, 150);
     g.setColor(Color.BLACK);
     g.drawString("O", 200, 200);
      
  
 
        g.setColor(Color.BLUE);
     g.fillOval(400, 200, 150, 150);
     g.setColor(Color.WHITE);
     g.drawString("H", 400, 200);
 
      g.setColor(Color.BLUE);
     g.fillOval(400, 400, 150, 150);
     g.setColor(Color.BLACK);
     g.drawString("H", 400, 200);
   
     g.setColor(Color.BLACK);
     g.drawLine(450, 250, 250, 250);
     g.setColor(Color.BLACK);
     g.drawLine(450, 450, 250, 250);
       
}
    
}

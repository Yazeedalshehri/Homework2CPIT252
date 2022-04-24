/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.homework2cpit252;

import javax.swing.*;
import java.awt.Graphics;
/**
 *
 * @author yaaz4
 */
public class App {

    public static void main(String[] args) {
     
           
           JFrame Frame = new JFrame("Compound simulation");
           Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
       
       Compound element1 = new hydrogen("H");
       Compound element2 = new Oxygen("O"); 
       element1.draw();
       element2.draw();
  
       Draw draw = new Draw();
     
      Frame.add(draw);
     
        
        Frame.setSize(1080, 720);
          Frame.setVisible(true);

    
        
    }
    
}

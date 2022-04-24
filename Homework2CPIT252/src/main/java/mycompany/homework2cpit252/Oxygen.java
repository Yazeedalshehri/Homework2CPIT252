package mycompany.homework2cpit252;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import mycompany.homework2cpit252.Compound;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yaaz4
 */
public class Oxygen implements Compound  {

     String element;
    
    
    
    public Oxygen(String element) {
     this.element = element;
      
    }

    public Oxygen() {
        
    }

@Override   
public String getElement()
{
 return this.element;
} 


 @Override
 public void draw()
{
    System.out.println("we draw oxygen");
   
  
}

 
  
}

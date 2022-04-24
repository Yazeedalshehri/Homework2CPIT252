package mycompany.homework2cpit252;


import mycompany.homework2cpit252.Compound;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yaaz4
 */
public class hydrogen implements Compound{


  String element;
    public hydrogen(String element) {
     this.element = element;
    }


@Override   
public String getElement()
{
 return this.element;
} 
@Override
public void draw()
{
     System.out.println("we draw hydrogen");
}
}

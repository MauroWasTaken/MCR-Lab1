package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class DisplayerSwing extends JFrame implements Displayer  {
    public DisplayerSwing(){
        super("");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);
        this.setVisible(true);
    }

    public int getWidth(){
        return super.getWidth();
    }
    public int getHeight(){
        return super.getHeight();
    }
    public Graphics2D getGraphics(){
        return (Graphics2D) super.getGraphics();
    }
    public void repaint(){
        super.repaint();
    }
    public void setTitle(String title){
        super.setTitle(title);
    }

}

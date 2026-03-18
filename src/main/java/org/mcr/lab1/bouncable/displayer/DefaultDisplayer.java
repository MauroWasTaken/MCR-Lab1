package org.mcr.lab1.bouncable.displayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferStrategy;

public class DefaultDisplayer extends JFrame implements Displayer  {
    private BufferStrategy bufferStrategy;

    public DefaultDisplayer(){
        super("");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public int getWidth(){
        return Math.max(1, super.getWidth());
    }

    public int getHeight(){
        return Math.max(1, super.getHeight());
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

    public void addKeyListener(KeyAdapter keyAdapter) {
        super.addKeyListener(keyAdapter);
    }

}

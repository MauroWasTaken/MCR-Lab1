package org.mcr.lab1.bouncable.displayer;

import org.mcr.lab1.bouncable.Bouncable;
import org.mcr.lab1.bouncable.BouncerPanel;
import org.mcr.lab1.renderer.Renderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.util.List;

public class DefaultDisplayer extends JFrame implements Displayer  {

    private final BouncerPanel panel;

    public DefaultDisplayer(List<Bouncable> bouncers, Renderer renderer) {
        super("");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new BouncerPanel(bouncers, renderer);
        setContentPane(panel);

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
        panel.repaint();
    }

    public void setTitle(String title){
        super.setTitle(title);
    }

    public void addKeyListener(KeyAdapter keyAdapter) {
        super.addKeyListener(keyAdapter);
    }

}

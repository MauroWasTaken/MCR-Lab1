package org.mcr.lab1.bouncable.displayer;

import org.mcr.lab1.bouncable.BouncerPanel;

import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;

public class DefaultDisplayer extends JFrame implements Displayer  {

    private final BouncerPanel panel;

    public DefaultDisplayer(BouncerPanel panel) {
        super("");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = panel;
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

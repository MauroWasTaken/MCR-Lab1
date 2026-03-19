package org.mcr.lab1.bouncable;

import org.mcr.lab1.renderer.DefaultRenderer;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BouncerPanel extends JPanel {
    private final List<Bouncable> bouncers;

    public BouncerPanel(List<Bouncable> bouncers) {
        this.bouncers = bouncers;
        setDoubleBuffered(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (Bouncable bouncer : bouncers) {
            bouncer.draw();
            new DefaultRenderer().display(g2, bouncer);
        }
    }
}
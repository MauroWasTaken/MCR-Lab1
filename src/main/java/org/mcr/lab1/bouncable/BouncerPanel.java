package org.mcr.lab1.bouncable;

import org.mcr.lab1.renderer.Renderer;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

public class BouncerPanel extends JPanel {
    private final List<Bouncable> bouncers;
    private final Renderer renderer;

    public BouncerPanel(List<Bouncable> bouncers, Renderer renderer) {
        this.bouncers = bouncers;
        this.renderer = renderer;
        setDoubleBuffered(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (Bouncable bouncer : bouncers) {
            this.renderer.display(g2, bouncer);
        }
    }
}
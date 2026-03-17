package org.mcr.lab1.bouncable.circle;

import org.mcr.lab1.bouncable.displayer.Displayer;

import javax.swing.*;
import java.awt.*;

public class CircleFull extends Circle {
    private final Color color = Color.BLUE;
    public CircleFull(Displayer displayer) {
        super(displayer);

        this.panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(color);
                g.fillOval(0,0, getWidth(), getHeight());

            }
        };
        this.draw();
        this.panel.setOpaque(false);
        this.frame.add(panel);
    }

    public void draw() {
        super.draw();
        // TODO
        final Image image = this.frame.createImage(getHeight(), getWidth());
        this.renderer.display((Graphics2D) image.getGraphics(), this);
        this.frame.getGraphics().drawImage(image, position.getX(), position.getY(), null);
    }

    public void move() {
        super.move();
    }

    public Color getColor() {
        return this.color;
    }

    public Shape getShape() {
        return this.shape;
    }
}

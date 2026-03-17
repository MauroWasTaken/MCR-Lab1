package org.mcr.lab1.boucable.square;

import org.mcr.lab1.boucable.displayer.Displayer;

import javax.swing.*;
import java.awt.*;

public class SquareStroke extends Square {
    private final Color color = Color.ORANGE;
    public SquareStroke(Displayer displayer) {
        super(displayer);

        this.panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(color);
                ((Graphics2D) g).setStroke(new BasicStroke(2));
                g.drawRect(0, 0, getWidth(), getHeight());
            }
        };
        this.draw();
        this.panel.setOpaque(false);
        this.frame.add(panel);
    }

    public void draw() {
        super.draw();
    }

    public Color getColor() {
        return this.color;
    }

    public Shape getShape() {
        return this.shape;
    }
}

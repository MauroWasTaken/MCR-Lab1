package org.example;

import javax.swing.*;
import java.awt.*;

public class SquareFull extends Square {
    private final Color color = Color.ORANGE;
    public SquareFull(Displayer displayer) {
        super(displayer);

        this.panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(color);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        this.draw();
        this.panel.setOpaque(false);
        this.frame.add(panel);
    }

    public void draw() {
        super.draw();
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

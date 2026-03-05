package org.example;

import javax.swing.*;
import java.awt.*;

public class CircleSwing extends Circle {
    JPanel panel;
    public CircleSwing(Displayer displayer) {
        super(displayer);
        JFrame frame;
        if(displayer instanceof JFrame) {
            frame = (JFrame) displayer;
        } else {
            throw new IllegalArgumentException("Displayer must be an instance of JFrame");
        }
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.ORANGE);
                g.fillOval(0,0, getWidth(), getHeight());

            }
        };
        draw(displayer);
        panel.setOpaque(false);
        frame.add(panel);
    }

    public void draw(Displayer displayer) {
       panel.setBounds((int) (getPosition().getX() - 0.5 * getWidth()), (int) (getPosition().getY() - 0.5 * getHeight()), getWidth(), getHeight());
    }
}

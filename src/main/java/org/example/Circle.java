package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public abstract class Circle extends Bouncer {
    protected JPanel panel;
    protected JFrame frame;

    protected final Shape shape;

    public Circle(Displayer displayer) {
        super(displayer);
        Random rand = new Random();
        int size = rand.nextInt(50) + 10;
        setWidth(size);
        setHeight(size);
        getPosition().setY(rand.nextInt(displayer.getHeight() - 2 * getHeight()) + getHeight());
        getPosition().setX(rand.nextInt(displayer.getWidth() - 2 * getWidth()) + getWidth());

        // TODO: find a way to couple shape with move() method (to update shape's coordinates)
        this.shape = new Ellipse2D.Double(getPosition().getX(), getPosition().getY(), size, size);

        if(displayer instanceof JFrame) {
            this.frame = (JFrame) displayer;
        } else {
            throw new IllegalArgumentException("Displayer must be an instance of JFrame");
        }
    }

    public void draw() {
        this.panel.setBounds((int) (getPosition().getX() - 0.5 * getWidth()), (int) (getPosition().getY() - 0.5 * getHeight()), getWidth(), getHeight());
    }

    public void move() {
        super.move();
    }
}

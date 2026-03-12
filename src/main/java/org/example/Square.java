package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Square extends Bouncer {
    protected JPanel panel;
    protected JFrame frame;

    protected final Shape shape;

    public Square(Displayer displayer) {
        super(displayer);
        Random rand = new Random();
        int size = rand.nextInt(50) + 10;
        setWidth(size);
        setHeight(size);
        getPosition().setY(rand.nextInt(displayer.getHeight() - getHeight()) + getHeight() / 2);
        getPosition().setX(rand.nextInt(displayer.getWidth() - getWidth()) + getWidth() / 2);
        getPosition().setY(rand.nextInt(displayer.getHeight() - 2 * getHeight()) + getHeight());
        getPosition().setX(rand.nextInt(displayer.getWidth() - 2 * getWidth()) + getWidth());

        this.shape = new Rectangle(getPosition().getX(), getPosition().getY(), size, size);

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

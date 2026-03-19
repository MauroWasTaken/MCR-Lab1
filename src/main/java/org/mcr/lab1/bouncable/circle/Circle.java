package org.mcr.lab1.bouncable.circle;

import org.mcr.lab1.bouncable.Bouncer;
import org.mcr.lab1.bouncable.displayer.Displayer;

import java.awt.geom.Ellipse2D;
import java.util.Random;

public abstract class Circle extends Bouncer {
    protected final Ellipse2D.Double shape;

    public Circle(Displayer displayer) {
        super(displayer);
        Random rand = new Random();
        int size = rand.nextInt(50) + 10;
        setWidth(size);
        setHeight(size);
        getPosition().setY(rand.nextInt(displayer.getHeight() - 2 * getHeight()) + getHeight());
        getPosition().setX(rand.nextInt(displayer.getWidth() - 2 * getWidth()) + getWidth());

        this.shape = new Ellipse2D.Double(getPosition().getX(), getPosition().getY(), size, size);
        //draw();
    }

    public void draw() {
        shape.setFrame(
                getPosition().getX() - 0.5 * getWidth(),
                getPosition().getY() - 0.5 * getHeight(),
                getWidth(),
                getHeight()
        );
    }
}

package org.mcr.lab1.bouncable.square;

import org.mcr.lab1.bouncable.Bouncer;
import org.mcr.lab1.bouncable.displayer.Displayer;

import java.awt.Rectangle;
import java.util.Random;

public abstract class Square extends Bouncer {
    protected final Rectangle shape;

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
        //draw();
    }

    public void draw(){
        shape.setBounds(
                (int) (getPosition().getX() - 0.5 * getWidth()),
                (int) (getPosition().getY() - 0.5 * getHeight()),
                getWidth(),
                getHeight()
        );
    }
}

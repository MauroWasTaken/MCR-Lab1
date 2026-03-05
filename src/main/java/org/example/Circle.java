package org.example;

import java.awt.*;
import java.util.Random;

public abstract class Circle extends Bouncer {

    public Circle(Displayer displayer) {
        super(displayer);
        Random rand = new Random();
        int size = rand.nextInt(50) + 10;
        setWidth(size);
        setHeight(size);
        getPosition().setY(rand.nextInt(displayer.getHeight() - 2 * getHeight()) + getHeight());
        getPosition().setX(rand.nextInt(displayer.getWidth() - 2 * getWidth()) + getWidth());
    }
}

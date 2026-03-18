package org.mcr.lab1.bouncable.circle;

import org.mcr.lab1.bouncable.displayer.Displayer;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CircleFull extends Circle {
    private final Color color = Color.BLUE;
    Image image;
    public CircleFull(Displayer displayer) {super(displayer);}

    public void draw() {super.draw();}

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

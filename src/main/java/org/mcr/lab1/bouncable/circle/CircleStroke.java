package org.mcr.lab1.bouncable.circle;

import org.mcr.lab1.bouncable.displayer.Displayer;

import javax.swing.*;
import java.awt.*;

public class CircleStroke extends Circle {
    private final Color color = Color.GREEN;
    public CircleStroke(Displayer displayer) {super(displayer);}

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

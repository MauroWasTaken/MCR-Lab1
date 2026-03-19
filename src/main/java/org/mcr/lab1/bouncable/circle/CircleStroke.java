package org.mcr.lab1.bouncable.circle;

import org.mcr.lab1.bouncable.displayer.Displayer;

import java.awt.Color;
import java.awt.Shape;

public class CircleStroke extends Circle {
    private final Color color = Color.GREEN;
    public CircleStroke(Displayer displayer) {super(displayer);}

    public Color getColor() {
        return this.color;
    }

    public Shape getShape() {
        return this.shape;
    }
}

package org.mcr.lab1.bouncable.circle;

import org.mcr.lab1.bouncable.displayer.Displayer;

import java.awt.*;

public class CircleFull extends Circle {
    private final Color color = Color.BLUE;
    public CircleFull(Displayer displayer) {super(displayer);}

    public Color getColor() {
        return this.color;
    }

    public Shape getShape() {
        return this.shape;
    }
}

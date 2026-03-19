package org.mcr.lab1.bouncable.square;

import org.mcr.lab1.bouncable.displayer.Displayer;

import java.awt.Color;
import java.awt.Shape;

public class SquareFull extends Square {
    private final Color color = Color.ORANGE;

    public SquareFull(Displayer displayer) { super(displayer); }

    public Color getColor() {
        return this.color;
    }

    public Shape getShape() {
        return this.shape;
    }
}

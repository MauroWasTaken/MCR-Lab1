package org.mcr.lab1.renderer;

import org.mcr.lab1.bouncable.Bouncable;
import org.mcr.lab1.bouncable.circle.CircleStroke;
import org.mcr.lab1.bouncable.square.SquareStroke;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class DefaultRenderer implements Renderer {
    public void display(Graphics2D graphics, Bouncable bouncable) {
        bouncable.draw();
        graphics.setColor(bouncable.getColor());
        if (bouncable instanceof CircleStroke || bouncable instanceof SquareStroke) {
            graphics.setStroke(new BasicStroke(2f));
            graphics.draw(bouncable.getShape());
        } else {
            graphics.fill(bouncable.getShape());
        }
    }
}

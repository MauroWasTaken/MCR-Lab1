package org.mcr.lab1.renderer;

import org.mcr.lab1.boucable.Bouncable;

import java.awt.*;

public class DefaultRenderer implements Renderer {
    public void display(Graphics2D graphics, Bouncable bouncable) {
        // FIXME/TODO
        //graphics.draw(bouncable.getShape());
        //graphics.setColor(bouncable.getColor());
        //if (bouncable instanceof SquareFull || bouncable instanceof CircleFull) {
        //    graphics.fill(bouncable.getShape());
        //}

        graphics.fill(bouncable.getShape());
        graphics.setColor(bouncable.getColor());


    }
}

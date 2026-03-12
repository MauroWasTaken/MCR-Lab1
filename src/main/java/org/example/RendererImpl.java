package org.example;

import java.awt.*;

public class RendererImpl implements Renderer {
    public void display(Graphics2D graphics, Bouncable bouncable) {
        // FIXME/TODO
        graphics.draw(bouncable.getShape());
        graphics.fill(bouncable.getShape());
    }
}

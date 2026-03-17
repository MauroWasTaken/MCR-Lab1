package org.mcr.lab1.renderer;

import org.mcr.lab1.bouncable.Bouncable;

import java.awt.Graphics2D;

public interface Renderer {
    void display(Graphics2D graphics, Bouncable bouncable);
}

package org.mcr.lab1.boucable.displayer;

import java.awt.*;

public interface Displayer {
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String title);
}

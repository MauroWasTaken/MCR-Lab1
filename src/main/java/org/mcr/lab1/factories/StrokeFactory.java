package org.mcr.lab1.factories;

import org.mcr.lab1.boucable.Bouncer;
import org.mcr.lab1.boucable.circle.CircleStroke;
import org.mcr.lab1.boucable.displayer.Displayer;
import org.mcr.lab1.boucable.square.SquareStroke;

public class StrokeFactory implements BouncersFactory {
    private static StrokeFactory instance;
    public static StrokeFactory getInstance(){
        if (instance == null)
            instance = new StrokeFactory();
        return instance;
    }
    @Override
    public Bouncer createSquare(Displayer displayer) {
        return new SquareStroke(displayer);
    }

    @Override
    public Bouncer createCircle(Displayer displayer) {
        return new CircleStroke(displayer);
    }
}

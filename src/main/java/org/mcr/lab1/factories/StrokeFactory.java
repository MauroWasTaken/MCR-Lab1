package org.mcr.lab1.factories;

import org.mcr.lab1.bouncable.Bouncer;
import org.mcr.lab1.bouncable.circle.CircleStroke;
import org.mcr.lab1.bouncable.displayer.Displayer;
import org.mcr.lab1.bouncable.square.SquareStroke;

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

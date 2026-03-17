package org.mcr.lab1.factories;

import org.mcr.lab1.boucable.Bouncer;
import org.mcr.lab1.boucable.circle.CircleFull;
import org.mcr.lab1.boucable.displayer.Displayer;
import org.mcr.lab1.boucable.square.SquareFull;

public class FullFactory implements BouncersFactory {
    private static FullFactory instance;
    public static FullFactory getInstance(){
        if (instance == null)
            instance = new FullFactory();
        return instance;
    }
    @Override
    public Bouncer createSquare(Displayer displayer) {
        return new SquareFull(displayer);
    }

    @Override
    public Bouncer createCircle(Displayer displayer) {
        return new CircleFull(displayer);
    }
}

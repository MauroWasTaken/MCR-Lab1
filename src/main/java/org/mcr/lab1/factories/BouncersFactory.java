package org.mcr.lab1.factories;

import org.mcr.lab1.boucable.Bouncer;
import org.mcr.lab1.boucable.displayer.Displayer;

public interface BouncersFactory {
    Bouncer createSquare(Displayer displayer);
    Bouncer createCircle(Displayer displayer);
}

package org.mcr.lab1.factories;

import org.mcr.lab1.bouncable.Bouncer;
import org.mcr.lab1.bouncable.displayer.Displayer;

public interface BouncersFactory {
    Bouncer createSquare(Displayer displayer);
    Bouncer createCircle(Displayer displayer);
}

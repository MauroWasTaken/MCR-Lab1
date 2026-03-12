package org.example;

public interface BouncersFactory {
    Bouncer createSquare(Displayer displayer);
    Bouncer createCircle(Displayer displayer);
}

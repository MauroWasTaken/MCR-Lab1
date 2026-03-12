package org.example;

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

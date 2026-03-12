package org.example;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BouncersApp {
    private final LinkedList<Bouncable> bouncers = new LinkedList<>();
    Displayer displayer;
    int number = 10;
    public BouncersApp() {
        displayer = new DisplayerSwing();
        displayer.setTitle("Bouncers");
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            Bouncer bouncer;
            switch(rand.nextInt(2)){
                case 0:
                    bouncer = new SquareFull(displayer);
                    break;
                default:
                    bouncer = new CircleFull(displayer);
                    break;
            }
            bouncers.add(bouncer);
        }
        displayer.repaint();
    }
    public void run() throws InterruptedException {
        while (true) {
            for (Bouncable bouncer : bouncers) {
                bouncer.move();
                bouncer.draw();
            }
            TimeUnit.MILLISECONDS.sleep(16); // a bit more than 60fps
            displayer.repaint();
        }

    }
    public static void main(String[] args) throws InterruptedException {
        new BouncersApp().run();
    }
}

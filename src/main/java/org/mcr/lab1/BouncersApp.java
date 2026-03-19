package org.mcr.lab1;

import org.mcr.lab1.bouncable.Bouncable;
import org.mcr.lab1.bouncable.displayer.DefaultDisplayer;
import org.mcr.lab1.bouncable.displayer.Displayer;
import org.mcr.lab1.factories.BouncersFactory;
import org.mcr.lab1.factories.FullFactory;
import org.mcr.lab1.factories.StrokeFactory;

import java.awt.event.KeyAdapter;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BouncersApp {
    private final List<Bouncable> bouncers = new ArrayList<>();
    Displayer displayer;
    KeyAdapter keyAdapter;

    private void addBouncers(BouncersFactory factory){
        for (int i = 0; i < 10; i++) {
            bouncers.add(factory.createCircle(displayer));
            bouncers.add(factory.createSquare(displayer));
        }
    }
    private void clearBouncers(){
        bouncers.clear();
        displayer.repaint();
    }
    private void quit(){
        System.exit(0);
    }

    public BouncersApp (){
        displayer = new DefaultDisplayer(bouncers);
        displayer.setTitle("Bouncers");
        keyAdapter = new KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                switch (e.getKeyCode()) {
                    case java.awt.event.KeyEvent.VK_Q -> quit();
                    case java.awt.event.KeyEvent.VK_E -> clearBouncers();
                    case java.awt.event.KeyEvent.VK_F -> addBouncers(FullFactory.getInstance());
                    case java.awt.event.KeyEvent.VK_B -> addBouncers(StrokeFactory.getInstance());
                }
            }
        };
        displayer.addKeyListener(keyAdapter);
    }
    public void run() {
        new Timer(16, event -> {
            for (Bouncable bouncer : bouncers) {
                bouncer.move();
            }
            displayer.repaint();
        }).start();
    }

    public static void main(String[] args) {
        new BouncersApp().run();
    }
}

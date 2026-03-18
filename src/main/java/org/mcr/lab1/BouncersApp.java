package org.mcr.lab1;

import org.mcr.lab1.bouncable.Bouncable;
import org.mcr.lab1.bouncable.displayer.DefaultDisplayer;
import org.mcr.lab1.bouncable.displayer.Displayer;
import org.mcr.lab1.factories.BouncersFactory;
import org.mcr.lab1.factories.FullFactory;
import org.mcr.lab1.factories.StrokeFactory;
import org.mcr.lab1.renderer.DefaultRenderer;
import org.mcr.lab1.renderer.Renderer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import javax.swing.SwingUtilities;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class BouncersApp {
    private final CopyOnWriteArrayList<Bouncable> bouncers = new CopyOnWriteArrayList<>();
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
        displayer = new DefaultDisplayer();
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
    public void run() throws InterruptedException {
        Renderer renderer = new DefaultRenderer();
        while (true) {
            Graphics2D g = displayer.getGraphics();
            if (g != null) {
                try {
                    g.setColor(Color.WHITE);
                    g.fillRect(0, 0, displayer.getWidth(), displayer.getHeight());
                    for (Bouncable bouncer : bouncers) {
                        bouncer.move();
                        bouncer.draw();
                        renderer.display(g, bouncer);
                    }
                } finally {
                    g.dispose();
                }
            }
            TimeUnit.MILLISECONDS.sleep(16);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new BouncersApp().run();
    }
}

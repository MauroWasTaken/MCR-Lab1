package org.mcr.lab1.bouncable;

import org.mcr.lab1.bouncable.displayer.Displayer;

import javax.swing.JPanel;
import java.util.Random;

public abstract class Bouncer extends JPanel implements Bouncable {
    private int width,height;
    protected Vector2d position; //middle point
    protected Vector2d direction;
    protected final Displayer displayer;

    public Bouncer(Displayer displayer) {
        this.displayer = displayer;

        Random rand = new Random();
        position = new Vector2d(0,0);
        direction = new Vector2d(0,0);
        direction.setY((rand.nextInt(10) + 1) * rand.nextInt(2) - 1);
        direction.setX((rand.nextInt(10) + 1) * rand.nextInt(2) - 1);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Vector2d getPosition() {
        return position;
    }

    public void setPosition(Vector2d position) {
        this.position = position;
    }

    public Vector2d getDirection() {
        return direction;
    }

    public void setDirection(Vector2d direction) {
        this.direction = direction;
    }

    public void move() {
        int newX = position.getX() + direction.getX();
        int newY = position.getY() + direction.getY();
        //left right wall
        if (newX + 0.5 * width > displayer.getWidth()){
            newX = (int) (displayer.getWidth() - 0.5 * width);
            direction.setX(-direction.getX());
        } else if (newX - 0.5 * width < 0) {
            newX = (int) (0 + 0.5 * width);
            direction.setX(-direction.getX());
        }
        //top bottom wall
        if (newY + 0.5 * height > displayer.getHeight()){
            newY = (int) (displayer.getHeight() - 0.5 * height);
            direction.setY(-direction.getY());
        } else if (newY - 0.5 * height < 0) {
            newY = (int) (0 + 0.5 * height);
            direction.setY(-direction.getY());
        }
        position.setX(newX);
        position.setY(newY);
    }

    public abstract void draw();
}

package main.java.com.kupets.entities.creatures;

import main.java.com.kupets.Point;
import main.java.com.kupets.entities.creatures.Creature;

public class Herbivore extends Creature {
    public Herbivore(Point point, int speed, int healthPoint) {
        super(point, speed, healthPoint);
        super.typeOfEntity = "\uD83D\uDC07"; // Emoji code of rabbit 🐇
    }
    @Override
    public String toString() {
        return "Class: " + getClass().getSimpleName() +
                "\nType of Entity: " + typeOfEntity +
                "\nCoordinates: (" + getPoint().getX() + ", " + getPoint().getY() + ")" +
                "\nSpeed: " + getSpeed() +
                "\nHealth Points: " + getHealthPoint();
    }
}

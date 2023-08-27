package main.java.com.kupets.entities.creatures;

import main.java.com.kupets.Map;
import main.java.com.kupets.Point;
import main.java.com.kupets.entities.Entity;
import main.java.com.kupets.entities.Grass;
import main.java.com.kupets.entities.creatures.Creature;

import java.util.ArrayList;
import java.util.List;

public class Herbivore extends Creature {

    public Herbivore(Point point, int speed, int healthPoint) {
        super(point, speed, healthPoint);
        super.typeOfEntity = "\uD83D\uDC07"; // Emoji code of rabbit 🐇
    }

    @Override
    public List<Entity> getTargetList(Map map) {
        List<Entity> grassTarget = new ArrayList<>();
        for (Entity entity : map.getMap().values()){
            if (entity instanceof Grass){
                grassTarget.add(entity);
            }
        }
        return grassTarget;
    }

    @Override
    public void makeMove(Map map) {

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

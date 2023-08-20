package main.java.com.kupets.entities;

import main.java.com.kupets.Point;
import main.java.com.kupets.entities.Entity;

public class Grass extends Entity {
    public Grass(Point point) {
        super(point);
        super.typeOfEntity = "\uD83C\uDF3E"; // Emoji code of grass 🌾
    }

}

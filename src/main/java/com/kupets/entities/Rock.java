package main.java.com.kupets.entities;

import main.java.com.kupets.Point;
import main.java.com.kupets.entities.Entity;

public class Rock extends Entity {
    public Rock(Point point) {
        super(point);
        super.typeOfEntity = "\uD83D\uDDFB"; // Emoji code of rock 🗻
    }


    public Entity spawnEntity() {
        return new Rock(new Point(0,0));
    }
}

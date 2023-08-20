package main.java.com.kupets.entities;

import main.java.com.kupets.Point;
import main.java.com.kupets.entities.Entity;

public class Tree extends Entity {
    public Tree(Point point) {
        super(point);
        super.typeOfEntity = "\uD83C\uDF33"; // Emoji code of tree 🌳
    }
}

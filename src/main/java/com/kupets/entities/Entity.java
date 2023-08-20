package main.java.com.kupets.entities;

import main.java.com.kupets.Point;

public abstract class Entity {
    protected String typeOfEntity;
    protected Point point;
    public Entity(Point point){
        this.point = point;
    }
    public Point getPoint() {
        return point;
    }
    public String getTypeOfEntity(){ return typeOfEntity; }
    public void setPoint(Point point) {
        this.point = point;
    }
    @Override
    public String toString() {
        return "Class: " + getClass().getSimpleName() +
                "\nType of Entity: " + typeOfEntity +
                "\nCoordinates: (" + getPoint().getX() + ", " + getPoint().getY() + ")";
    }
}

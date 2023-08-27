package main.java.com.kupets.entities.creatures;

import main.java.com.kupets.Map;
import main.java.com.kupets.Point;
import main.java.com.kupets.entities.Entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Creature extends Entity {
    protected int speed;
    protected int healthPoint;
    public Creature(Point point, int speed, int healthPoint) {
        super(point);
        this.speed = speed;
        this.healthPoint = healthPoint;
    }
    public Point getPointTarget(Map map, List<Creature> targetList){
        Point creaturePoint = point;
        Point nearestPoint = targetList.get(0).getPoint();
        double nearestPointLenght = lengthCalculation(creaturePoint, nearestPoint);

        for (Creature creature : targetList){
            double targetLenght = lengthCalculation(creaturePoint, creature.getPoint());
            if (nearestPointLenght > targetLenght){
                nearestPoint = creature.getPoint();
                nearestPointLenght = targetLenght;
            }
        }
        return creaturePoint;
    }
    private double lengthCalculation(Point creaturePoint, Point targetListPoint){
        return Math.sqrt(Math.pow((targetListPoint.getX() - creaturePoint.getX()),2)+(Math.pow((targetListPoint.getY() - creaturePoint.getY()),2)));
    }

    public abstract List<Entity> getTargetList(Map map);
    public abstract void makeMove(Map map);
    public int getSpeed(){
        return speed;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

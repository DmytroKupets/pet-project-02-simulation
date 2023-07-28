package main.java.com.kupets;

public abstract class Creature extends Entity {
    protected int speed;
    protected int healthPoint;
    public Creature(Point point, int speed, int healthPoint) {
        super(point);
        this.speed = speed;
        this.healthPoint = healthPoint;
    }
    public void makeMove() {};
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

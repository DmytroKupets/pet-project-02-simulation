package main.java.com.kupets;

public class Predator extends Creature {
    private int attackPower;

    public Predator(Point point, int speed, int healthPoint, int attackPower) {
        super(point, speed, healthPoint);
        super.typeOfEntity = "\uD83D\uDC3A"; // Emoji code of wolf 🐺
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public String toString() {
        return "Class: " + getClass().getSimpleName() +
                "\nType of Entity: " + typeOfEntity +
                "\nCoordinates: (" + getPoint().getX() + ", " + getPoint().getY() + ")" +
                "\nSpeed: " + getSpeed() +
                "\nHealth Points: " + getHealthPoint() +
                "\nAttack Power: " + attackPower;
    }
}

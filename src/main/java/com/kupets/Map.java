package main.java.com.kupets;

import main.java.com.kupets.entities.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Map {

    private HashMap<Point, Entity> map = new HashMap();
    private List<Point> emptyPointsForEntity = new ArrayList<>();
    private int width;
    private int height;
    public Map(int width, int height){
        setEmptyPointsForList(width,height);
        this.width = width;
        this.height = height;
    }
    private void setEmptyPointsForList(int width, int height){
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                emptyPointsForEntity.add(new Point(i,j));
            }
        }
    }
    public Point getRandomPointFromMap(){
        Point point = emptyPointsForEntity.get(new Random().nextInt(emptyPointsForEntity.size()));
        emptyPointsForEntity.remove(point);
        return point;
    }
    /** public void setRandomMap(Entity entity){
        Point point = new Point(getRandomNumberForMap(widths),getRandomNumberForMap(heights));
        entity.setPoint(point);
        map.put(point,entity);
    } */
    public void entityPut(Point point, Entity entity){
        entity.setPoint(point);
        map.put(point,entity);
    }
    public String getDisplayEntity(Point keyToFind){
        Entity value = map.get(keyToFind);
        return value != null ? value.getTypeOfEntity() : "\uD83D\uDFEB";
    }

    public boolean isEmpty(Point keyToFind) {
        return map.get(keyToFind) == null ? true : false;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

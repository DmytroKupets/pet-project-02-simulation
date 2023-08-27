package main.java.com.kupets;

import main.java.com.kupets.actions.Actions;
import main.java.com.kupets.actions.initAction.*;
import main.java.com.kupets.entities.creatures.Creature;
import main.java.com.kupets.entities.creatures.Herbivore;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private int stepCounter = 0;
    private Map map;
    List<Actions> initActions = new ArrayList<>();
    List<Actions> turnActions = new ArrayList<>();
    Simulation(){
        map = new Map(10,10);
    }
    public void nextTurn(){

    }
    public void startSimulation(){
        createActions(map,initActions);
        for (Actions entity : initActions){
            entity.perform(map);
        }
        drowMap(map);


    }
    public void pauseSimulation(){

    }
    private void createActions(Map map, List<Actions> initActions){
        initActions.add(new GrassSpawn(map));
        initActions.add(new RockSpawn(map));
        initActions.add(new PredatorSpawn(map));
        initActions.add(new HerbivoreSpawn(map));
        initActions.add(new TreeSpawn(map));
    }

    private void drowMap(Map map){
        StringBuilder line = new StringBuilder();
        line.append("\n");
        for (int i = 0; i < map.getWidth(); i++){
            for (int j = 0; j < map.getHeight(); j++){
                line.append(map.getDisplayEntity(new Point(i,j)));
            }
            line.append("\n");
        }
        System.out.println(line);
    }
}

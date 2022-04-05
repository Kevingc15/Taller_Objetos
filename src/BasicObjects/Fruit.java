package BasicObjects;

import java.util.ArrayList;

public class Fruit {
    //PROPERTIES
    private int id;
    private String name;
    private float averageWeight;
    private ArrayList<String> colors;

    public Fruit(int id, String name){
        this.id = id;
        this.name = name;
    }

    //GETTERS
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}

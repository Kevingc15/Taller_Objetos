package NewObjects;

import java.util.ArrayList;
import java.util.Date;

public class User {
    //PROPERTIES
    private int id;
    private String name;
    private String lastName;
    private ArrayList<String> favoriteFoods;

    public User(int id, String name, String lastName, ArrayList<String> favoriteFoods) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.favoriteFoods = favoriteFoods;
    }

    //GETERS

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    //SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFavoriteFoods(ArrayList<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }
}

package NewObjects;

import java.util.ArrayList;

public class Restaurant {
    //PROPERTIES
    private int id;
    private String name;
    private String address;

    //CONSTRUCTOR
    public Restaurant(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

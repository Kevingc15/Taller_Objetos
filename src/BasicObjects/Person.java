package BasicObjects;

import java.util.Date;

public class Person {
    //PROPERTIES
    private int id;
    private String name;
    private String lastName1;
    private String lastName2;
    private Date dateBirth;
    private float height;

    //CONSTRUCTOR
    public Person(int id, String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.id = id;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    //GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public float getHeight() {
        return height;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

package NewObjects;

public class Product {
    //PROPERTIES
    private int id;
    private String name;
    protected String category;

    //CONSTRUCTOR
    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    //GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }


    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

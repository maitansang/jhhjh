package model;

public class Product {
    private int id;
    private String name;
    private String function;

    public Product(String name, String id, String function) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Product(int id, String name, String function) {
        this.id = id;
        this.name = name;
        this.function = function;
    }
}


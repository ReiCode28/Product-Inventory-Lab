package models;

public class Whiskey {
    private int id;
    private String name;
    private String brand;
    private Double alcLevel;
    private Double size;
    private int qty;
    private float price;

    public Whiskey(){}

    public Whiskey(int id, String name, String brand, Double alcLevel, Double size,
                   int qty, float price){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.alcLevel = alcLevel;
        this.size = size;
        this.qty = qty;
        this.price = price;

    }


    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setAlcLevel(Double alcLevel) {
        this.alcLevel = alcLevel;
    }

    public Double getAlcLevel() {
        return alcLevel;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getSize() {
        return size;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty(){
        return qty;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }


}

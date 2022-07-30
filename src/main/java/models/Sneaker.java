package models;

public class Sneaker {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private float price;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty(){
        return qty;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

}

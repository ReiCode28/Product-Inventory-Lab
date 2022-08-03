package services;

import models.Whiskey;

import java.util.HashMap;
import java.util.Map;

public class WhiskeyService {

    private int nextId = 1;

    private Map<Integer, Whiskey> inventory = new HashMap<>();

    public Whiskey create(String name, String brand, Double alcLevel, Double size,
                          int quantity, float price) {

        Whiskey createdWhiskey = new Whiskey(nextId++, name, brand, alcLevel, size, quantity, price);

        inventory.put(createdWhiskey.getID(), createdWhiskey);

        return createdWhiskey;

    }

    public Whiskey[] findAll(){
        return inventory.values().toArray(new Whiskey[inventory.size()]);
    }

    public boolean delete(int id) {
        Whiskey whiskey = inventory.remove(id);
        return whiskey!= null;
    }

}

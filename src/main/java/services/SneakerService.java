package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SneakerService {
    //This class will create, read, update and delete objects

    //Static member that i will use to create id numbers for new objects
    private int nextId = 1;
    //Using nextId to assign id numbers to new objects and increment it by 1.

    //This is the collection that will hold all of the objects
    private Map<Integer, Sneaker> inventory = new HashMap<>();

    //(1)
    //Created a method that will accept arguments and return a new Sneaker instance
    public  Sneaker create(String name, String brand, String sport, Double size, int quantity, float price) {

        //(2)
        //Created a new Sneaker instance and passed the values received from the lines above into the constructor
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);

        //(3)
        //Added new sneaker to the ArrayList to be managed
        inventory.put(createdSneaker.getID(), createdSneaker);

        //(4)
        //Returned the new object to the caller
        return createdSneaker;

    }

    public Sneaker findSneaker(int id) {
        return inventory.get(id);
    }

    public Sneaker[] findAll() {
        return inventory.values().toArray(new Sneaker[inventory.size()]);
    }

    public boolean delete(int id) {
        Sneaker sneaker = inventory.remove(id);
        return sneaker != null;
    }


}

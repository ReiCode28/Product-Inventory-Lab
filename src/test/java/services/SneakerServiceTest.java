package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerServiceTest {

    @Test
    public void createTest(){

        //(1)
        //I create test data that I will use to create test Sneaker below
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        Double expectedSize = 10.5;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        //(2)
        //First I instantiate a SneakerService object.Then I will use create(arg1, arg2, arg3...)
        //to have the service create and return a new sneaker object
        SneakerService sneakerService = new SneakerService(); //instantiate SneakerService object called sneakerService
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        //(3)
        //Use accessor methods to capture data from the newly created sneaker object
        int actualId = testSneaker.getID();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        Double actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        //4
        //Checking and Asserting that the data passed into the SneakerService was
        //properly  assigned to the new sneaker object returned
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void findSneakerTest() {



        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker1 = sneakerService.create("Kris Younger", "Adidas", "Tennis", 10.5, 10, 80.00f);
        Sneaker testSneaker2 = sneakerService.create("Dolio", "Nike", "Running", 10.0, 4, 200.00f);
    }

    @Test
    public void findAllTest() {

        SneakerService sneakerService2 = new SneakerService();
        Sneaker testSneaker = sneakerService2.create("Kris Younger", "Adidas", "Tennis", 10.5, 10, 80.00f);
        Sneaker testSneaker2 = sneakerService2.create("Dolio", "Nike", "Running", 10.0, 4, 200.00f);
        Sneaker[] expectedArr = sneakerService2.findAll();

        Assertions.assertEquals(2, expectedArr.length);
    }

    @Test
    public void deleteSneakerTest() {
        SneakerService sneakerService1 = new SneakerService();
        Sneaker testSneaker = sneakerService1.create("Kris Younger", "Adidas", "Tennis", 10.5, 10, 80.00f);
        Sneaker testSneaker2 = sneakerService1.create("Dolio", "Nike", "Running", 10.0, 4, 200.00f);

        Assertions.assertTrue(sneakerService1.delete(2));

    }

}

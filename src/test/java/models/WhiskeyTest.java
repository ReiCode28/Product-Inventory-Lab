package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyTest {

    @Test
    public void setID() {

        int expected = 1;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setID(expected);

        Assertions.assertEquals(expected, testWhiskey.getID());
    }

    @Test
    public void setName(){

        String expected = "VSOP";

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setName(expected);

        Assertions.assertEquals(expected, testWhiskey.getName());

    }

    @Test
    public void setBrand() {

        String expected = "Hennesy";

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBrand(expected);

        Assertions.assertEquals(expected, testWhiskey.getBrand());
    }

    @Test
    public void setAlcLevel() {

        Double expected = 40.00;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setAlcLevel(expected);

        Assertions.assertEquals(expected, testWhiskey.getAlcLevel());
    }

    @Test
    public void setSize() {

        Double expected = 700.00;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setSize(expected);

        Assertions.assertEquals(expected, testWhiskey.getSize());
    }

    @Test
    public void setQty() {

        int expected = 10;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setQty(expected);

        Assertions.assertEquals(expected, testWhiskey.getQty());
    }
    @Test
    public void setPrice(){

        float expected = 60;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setPrice(expected);

        Assertions.assertEquals(expected, testWhiskey.getPrice());
    }

    public void WhiskeyConstructorTest(){

        int expectedId = 1;
        String expectedName = "VSOP";
        String expectedBrand = "Hennesy";
        Double expectedAlcLevel = 40.00;
        Double expectedSize = 700.00;
        int expectedQty = 10;
        float expectedPrice = 60;

        Whiskey testWhiskey = new Whiskey(expectedId, expectedName, expectedBrand,expectedAlcLevel,
                expectedSize, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedId, testWhiskey.getID());
        Assertions.assertEquals(expectedName, testWhiskey.getName());
        Assertions.assertEquals(expectedBrand, testWhiskey.getBrand());
        Assertions.assertEquals(expectedAlcLevel, testWhiskey.getAlcLevel());
        Assertions.assertEquals(expectedSize, testWhiskey.getSize());
        Assertions.assertEquals(expectedQty, testWhiskey.getQty());


    }


}

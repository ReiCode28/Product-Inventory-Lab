package services;

import models.Sneaker;
import models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyServiceTest {

    @Test
    public void createTest(){

        int expectedId = 1;
        String expectedName = "VSOP";
        String expectedBrand = "Hennesy";
        Double expectedAlcLevel = 40.00;
        Double expectedSize = 700.00;
        int expectedQty = 10;
        float expectedPrice = 60;

        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create(expectedName, expectedBrand, expectedAlcLevel, expectedSize, expectedQty, expectedPrice);

        int actualId = testWhiskey.getID();
        String actualName = testWhiskey.getName();
        String actualBrand = testWhiskey.getBrand();
        Double actualAlcLevel = testWhiskey.getAlcLevel();
        Double actualSize = testWhiskey.getSize();
        int actualQty = testWhiskey.getQty();
        float actualPrice = testWhiskey.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedAlcLevel, actualAlcLevel);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
    @Test
    public void findWhiskeyTest() {

        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey1 = whiskeyService.create("VSOP", "Hennesy", 40.00, 700.0, 10, 60);
        Whiskey testWhiskey2 = whiskeyService.create("Black Label", "Johnny Walker", 40.00, 700.0, 5, 55);
    }

    @Test
    public void findAllWhiskeyTest() {

        WhiskeyService whiskeyService2 = new WhiskeyService();
        Whiskey testWhiskey1 = whiskeyService2.create("VSOP", "Hennesy", 40.00, 700.0, 10, 60);
        Whiskey testWhiskey2 = whiskeyService2.create("Black Label", "Johnny Walker", 40.00, 700.0, 5, 55);
        Whiskey[] expectedArr = whiskeyService2.findAll();

        Assertions.assertEquals(2, expectedArr.length);
    }

    @Test
    public void deleteWhiskeyTest() {

        WhiskeyService whiskeyService1 = new WhiskeyService();
        Whiskey testWhiskey1 = whiskeyService1.create("VSOP", "Hennesy", 40.00, 700.0, 10, 60);
        Whiskey testWhiskey2 = whiskeyService1.create("Black Label", "Johnny Walker", 40.00, 700.0, 5, 55);

        Assertions.assertTrue(whiskeyService1.delete(2));
    }

}

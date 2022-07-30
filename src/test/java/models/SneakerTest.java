package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    @Test
    public void setNameTest() {
        //given (1)
        //This is our test data that we will compare to the actual values returned from the object.
        String expected = "Air Max";

        //when (2)
        //We create a new Sneaker object for testing. Then we invoke setName() passing in the test data.
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        //then (3)
        //Retrieve the objects 'name' value with getName() and compare with the value that is expected.
        Assertions.assertEquals(expected, testSneaker.getName());
    }
    @Test
    public void setIDTest() {

        int expected = 28;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setID(expected);

        Assertions.assertEquals(expected, testSneaker.getID());

    }

    @Test
    public void setBrandTest() {

        String expected = "Nike";

        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        Assertions.assertEquals(expected, testSneaker.getBrand());

    }

    @Test
    public void setSportTest() {

        String expected = "Running";

        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        Assertions.assertEquals(expected, testSneaker.getSport());
    }
    @Test
    public void setSize() {

        int expected = 9;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        Assertions.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    public void setQty() {

        int expected = 2;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);

        Assertions.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPrice() {

        float expected = 199;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        Assertions.assertEquals(expected, testSneaker.getPrice());
    }


}

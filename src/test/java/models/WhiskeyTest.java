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

        String expected = "Hennesy";


    }

}

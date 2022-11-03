import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTestTest {
    @Test
    public void testLength() {
        String message = "Hello";
        //
        Assert.assertEquals(5, message.length());
        Assert.assertTrue(5 == message.length());
    }

    @Test
    public void testUpperCase() {
        String message = "Hello";
        //
        Assert.assertEquals("HELLO", message.toUpperCase());
    }
}
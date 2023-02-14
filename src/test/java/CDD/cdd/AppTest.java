package CDD.cdd;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends App
{
    
  App a = new App();
  
    @Test
    public void testSum()
    {
        assertEquals(5, a.sum(2,3) );
    }
}
package mco232;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestUtilities {
    
    @Test
    public void test1(){
        boolean actual = Utilities.testCode();
        assertTrue(actual);     
    }
    
}

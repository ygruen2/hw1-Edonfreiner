package mco232;

import org.junit.Assert;
import org.junit.Test;
//import static org.junit.Assert.*;

public class TestUtilities {
    
    @Test
    public void fahrenheitToCelsius(){
        Assert.assertEquals(0, Utilities.fahrenheitToCelsius(32),99);
    } 
    @Test
    public void celsiusToFahrenheit(){
        Assert.assertEquals(32, Utilities.celsiusToFahrenheit(0),2);
    }
     @Test
    public void kelvinToCelsius(){
        Assert.assertEquals(-273.15, Utilities.kelvinToCelsius(0),2);
    }
     
     @Test
    public void celsiusToKelvin(){
        Assert.assertEquals(273.15, Utilities.celsiusToKelvin(0),2);
    }
     
     @Test
    public void fahrenheitToKelvin(){
        Assert.assertEquals(273.15, Utilities.fahrenheitToKelvin(32),2);
    }
    @Test
    public void kelvinToFahrenheit(){
        Assert.assertEquals(32, Utilities.kelvinToFahrenheit(273.15),2);
    }
     
     
    
    
}

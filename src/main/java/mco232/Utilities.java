package mco232;

public class Utilities {
    
public static double fahrenheitToCelsius(double temp){
    return (temp - 32) * (5/9);
    
}
public static double celsiusToFahrenheit(double temp){
    return (temp * (9/5)) + 32;
}
public static double kelvinToCelsius(double temp){
    return temp - 273.15;
}
public static double celsiusToKelvin(double temp){
        return temp + 273.15;

}
public static double fahrenheitToKelvin(double temp){
    return ((temp - 32) * (5 / 9)) + 273.15;
}
public static double kelvinToFahrenheit(double temp){
        return (temp * (9/5)) + 32 - 273.15;

}
    
   
}

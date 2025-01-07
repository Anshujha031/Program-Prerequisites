import java.util.*;
import java.lang.*;
import java.io.*;

class CelsiusToFahrenheitConversion{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Tell the temperature in Celsius :");
   double x = sc.nextInt();
   
   double y = (x * 1.8)+32;
    
   System.out.println("Temperature in Fahrenheit is : " + y );
}
}
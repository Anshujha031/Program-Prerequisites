import java.lang.*;
import java.io.*;
import java.util.*;

class KiloToMiles{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);

   System.out.println("Tell the distance in kilometers :");
   double x = sc.nextInt();
   
   double result = x * 0.621371 ;
    
   System.out.println("The Distance in Mile is : " + result );
}
}
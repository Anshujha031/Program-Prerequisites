import java.util.*;
import java.lang.*;
import java.io.*;

class PowerCalculation{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);

   System.out.println("Tell the base :");
   int x = sc.nextInt();
   
   System.out.println("Tell the exponent:");
   int y = sc.nextInt();
    
   System.out.println("The Power  is : " + Math.pow(x,y) );
}
}
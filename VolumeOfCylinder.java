import java.util.*;
import java.lang.*;
import java.io.*;

class VolumeOfCylinder{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Tell the radius of cylinder :");
   double x = sc.nextInt();
   
   System.out.println("Tell the Height of cylinder :");
   double y = sc.nextInt();

   double result = 3.14 * (x * 2)* y ;
    
   System.out.println("Volume of Cylinder is : " + result );
}
}
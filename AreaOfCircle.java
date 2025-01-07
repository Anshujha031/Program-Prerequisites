import java.util.*;
import java.lang.*;
import java.io.*;

class AreaOfCircle{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Tell the radius of circle :");
   double x = sc.nextInt();
   
   double y = 3.14 * (x * x);
    
   System.out.println("Area of circle is : " + y );
}
}
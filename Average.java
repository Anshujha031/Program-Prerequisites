import java.util.*;
import java.lang.*;
import java.io.*;

class Average{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);

   System.out.println("Tell the num1 :");
   int x = sc.nextInt();
   
   System.out.println("Tell the num2 :");
   int y = sc.nextInt();
   
   System.out.println("Tell the num3 :");
   int z = sc.nextInt();


   int result = (x  + y + z) / 3 ;
    
   System.out.println("The Average of three number are : " + result );
}
}
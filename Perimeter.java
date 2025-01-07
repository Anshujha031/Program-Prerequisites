import java.util.*;
import java.lang.*;
import java.io.*;

class Perimeter{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);

   System.out.println("Tell the length of the rectangle :");
   int x = sc.nextInt();
   
   System.out.println("Tell the width of the rectangle :");
   int y = sc.nextInt();
   
   int result = 2 * (x+y);
    
   System.out.println("The Perimeter of rectangle  is : " + result );
}
}
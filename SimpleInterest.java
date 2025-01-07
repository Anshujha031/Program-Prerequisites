import java.util.*;
import java.lang.*;
import java.io.*;

class SimpleInterest{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);

   System.out.println("Tell the Principal :");
   int x = sc.nextInt();
   
   System.out.println("Tell the Rate :");
   int y = sc.nextInt();
   
   System.out.println("Tell the Time :");
   int z = sc.nextInt();


   int result = (x * y * z) / 100 ;
    
   System.out.println("Simple Interest is : " + result );
}
}
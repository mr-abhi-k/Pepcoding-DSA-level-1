import java.io.*;
import java.util.*;

public class Power_logarithmic {

  public static void main(String[] args) throws Exception
    {
        // write your code here
        Scanner in=new Scanner(System.in);
        int x,n;
        x=in.nextInt();
        n=in.nextInt();
        int result=power(x,n);
        System.out.println(result);
    }

    public static int power(int x, int n)
    {
       if(n==0)
       return 1;
       
       int xn=power(x,n/2); //faith
       int result=xn*xn;
       
       if(n%2!=0)
       {
           result=result*x;
       }
       
       
       return result;
    }
    

}
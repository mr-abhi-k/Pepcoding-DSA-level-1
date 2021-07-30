import java.io.*;
import java.util.*;

public class Power_linear {

    public static void main(String[] args) throws Exception
    {
        // write your code here
        Scanner in=new Scanner(System.in);
        int x,n;
        x=in.nextInt();
        n=in.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n)
    {
        if(n==0)
        return 1;
        
        return x*power(x,n-1);
    }

}
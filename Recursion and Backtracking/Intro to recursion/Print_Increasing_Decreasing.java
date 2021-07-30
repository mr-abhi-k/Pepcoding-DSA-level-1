import java.io.*;
import java.util.*;

public class Print_Increasing_Decreasing 
{
    public static void main(String[] args) throws Exception 
    {
        // write your code here
        // write your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pdi(n);
    }

    public static void pdi(int n)
    {
        if(n==0)
        return;
        
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
    
}

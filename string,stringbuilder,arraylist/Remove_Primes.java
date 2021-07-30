import java.io.*;
import java.util.*;

public class Remove_Primes
{
    public static Boolean checkPrime(int x)
    {
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    //1st method:
    /*
	public static void solution(ArrayList<Integer> al)
	{
		// write your code here
		for(int i=0;i<al.size();)
		{
		    if(checkPrime(al.get(i))==true)
		    {
		        al.remove(i);
		    }
		    else
		    i++;
		}
	}
	*/
	
	//2nd method
	public static void solution(ArrayList<Integer> al)
	{
		// write your code here
		for(int i=al.size()-1;i>=0;i--)
		{
		   if(checkPrime(al.get(i))==true)
		   {
		       al.remove(i);
		   }
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
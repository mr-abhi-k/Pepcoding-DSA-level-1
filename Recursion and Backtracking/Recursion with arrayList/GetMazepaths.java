import java.io.*;
import java.util.*;

public class GetMazepaths 
{

    public static void main(String[] args) throws Exception 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) 
    {
        if(sr>dr|| sc>dc )
        {
            ArrayList<String> a=new ArrayList<>();
            return a;
        }

        if(sr==dr && sc==dc)
        {
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> hori=getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> vert=getMazePaths(sr+1, sc, dr, dc);
        
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<hori.size();i++)
        {
            ans.add("h"+hori.get(i));
        }
        for(int i=0;i<vert.size();i++)
        {
            ans.add("v"+vert.get(i));
        }

        return ans;
    }
}
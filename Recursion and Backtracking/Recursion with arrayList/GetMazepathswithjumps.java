import java.io.*;
import java.util.*;

public class GetMazepathswithjumps{

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
        //it will not go to neagative base as being limited by loops
        if(sr==dr && sc==dc)
        {
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        
        ArrayList<String> ans=new ArrayList<>();
        
        //for horizontal direction
        for(int jump=1;jump<=dc-sc;jump++)
        {
            ArrayList<String> hori =getMazePaths(sr,sc+jump,dr,dc);
            for(int i=0;i<hori.size();i++)
            ans.add("h"+jump+hori.get(i));
        }
        
        //for vertical direction
        for(int jump=1;jump<=dr-sr;jump++)
        {
            ArrayList<String> vert =getMazePaths(sr+jump,sc,dr,dc);
            for(int i=0;i<vert.size();i++)
            ans.add("v"+jump+vert.get(i));
        }
        
        //for diagonal
        for(int jump=1;jump<=Math.min(dr-sr,dc-sc);jump++)
        {
            ArrayList<String> diag =getMazePaths(sr+jump,sc+jump,dr,dc);
            for(int i=0;i<diag.size();i++)
            ans.add("d"+jump+diag.get(i));
        }
        return ans;
    }

}
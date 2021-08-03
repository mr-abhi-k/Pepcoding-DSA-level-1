#include<bits/stdc++.h>
using namespace std;

vector<string> gmpwithjumps(int sr,int sc,int dr,int dc)
{
    if(sr==dr && sc==dc)
    {
        vector<string> v;
        v.push_back("");
        return v;
    }

    vector<string> ans;
    for(int jump=1;jump<=dc-sc;jump++)
        {
           vector<string> hori =gmpwithjumps(sr,sc+jump,dr,dc);
            for(int i=0;i<hori.size();i++)
            ans.push_back("h"+to_string(jump)+hori[i]);
        }
        
        //for vertical direction
        for(int jump=1;jump<=dr-sr;jump++)
        {
         vector<string> vert =gmpwithjumps(sr,sc+jump,dr,dc);
            for(int i=0;i<vert.size();i++)
            ans.push_back("v"+to_string(jump)+vert[i]);
        }
        
        //for diagonal
        for(int jump=1;jump<=min(dr-sr,dc-sc);jump++)
        {
          vector<string> diag =gmpwithjumps(sr,sc+jump,dr,dc);
            for(int i=0;i<diag.size();i++)
            ans.push_back("d"+to_string(jump)+diag[i]);
        }
        return ans;
}

int main()
{
    int n,m;
    cin>>n>>m;
    vector<string> v=gmpwithjumps(0,0,n-1,m-1);

    cout<<'[';
    int cnt=0;
    for(string s:v)
    {
        if(cnt!=v.size()-1)
        cout<<s<<",";
        else
        cout<<s;
        cnt++;
    }
    cout<<']';
}
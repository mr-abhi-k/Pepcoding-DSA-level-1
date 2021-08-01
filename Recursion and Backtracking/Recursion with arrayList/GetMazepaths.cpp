#include<bits/stdc++.h>
using namespace std;

vector<string> getmazepaths(int sr,int sc,int dr,int dc)
{
    if(sr>dr || sc>dc)
    {
        vector<string> v;
        return v;
    }

    if(sr==dr && sc==dc)
    {
        vector<string> v;
        v.push_back("");
        return v;
    }

    vector<string> hori=getmazepaths(sr,sc+1,dr,dc);
    vector<string> vert=getmazepaths(sr+1,sc,dr,dc);

    vector<string> ans;
    for(int i=0;i<hori.size();i++)
    ans.push_back("h"+hori[i]);

    for(int i=0;i<vert.size();i++)
    ans.push_back("v"+vert[i]);

    return ans;
}

int main()
{
    int n,m;
    cin>>n>>m;
    vector<string> ans = getmazepaths(0,0,n-1,m-1);
    int cnt = 0;
    
    cout << '[';
    for (string str : ans)
    {
        if (cnt != ans.size() - 1)
            cout << str << ", ";
        else
            cout << str;
        cnt++;
    }
    cout << ']';
}
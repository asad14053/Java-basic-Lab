#include<bits/stdc++.h>
using namespace std;

int main()
{
    int a,b,c;
    while(cin>>a>>b>>c)
    {
        int x=c;
        if(x%2)
        {
            x++;
        }
        x/=2;
        int co=1;
            while(x>b)
            {
                x-=b;
                co++;
            }

            cout<<co<<" "<<x<<" ";
            if(c%2)
                cout<<"L"<<endl;
            else    cout<<"R"<<endl;

        }

    return 0;
}


/*


4 3 9
4 3 10
4 3 24
4 3 23
2 4 3 9
4 3 10
4 3 24
4 3 23
2 4 4
2 4 3


*/

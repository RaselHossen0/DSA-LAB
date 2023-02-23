#include <bits/stdc++.h>
#define ll long long int
#define endl "\n"
using namespace std;
int N=1e9+7;

int main()
{
int mat[100][100];
int r,c;
cin >> r >> c;
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        cin >> mat[i][j];
    }
}
        // int r=mat.size();
        // int c=mat[0].size();
       
        for(int i=0;i<r;i++){
            int j=0;
            int k=i;
            vector<int>v;
            while(j<c){
                if(i>=r)
                break;
                v.push_back(mat[i][j]);
                j++;
                i++;
            }
            
            sort(v.begin(),v.end());

            //print(v);
            i=k;
            int jj=0;
            int s=0;
            while(jj<c){
                if(i>=r)
                break;
                mat[i][jj]=v[s];
                i++,jj++,s++;
            }
             i=k;


        }
        
        for(int j=1;j<c;j++){
            int i=0;
            int k=j;
            vector<int>v;
            while(i<r){
                if(j>=c)
                break;
                v.push_back(mat[i][j]);
                j++;
                i++;
            }
            j=k;
            sort(v.begin(),v.end());
           // print(v);
            int ii=0;
            int s=0;
          
            while(ii<r){
                if(j>=c)
                break;
                mat[ii][j]=v[s];
                j++;
                ii++;
                s++;
            }
            j=k;
            

        }
          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                cout<<mat[i][j]<<" ";
            }
            cout<<endl;
        }
        // prinM(mat);
        //return mat;
    }
    // void print(vector<int>vec){
    //     for(int i=0;i<vec.size();i++){
    //         cout<<vec[i]<<" ";
    //     }
    //     cout<<endl;
    // }
  


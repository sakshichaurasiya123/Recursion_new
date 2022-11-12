/*Time Complexity of this solution is O(n2)*/

#include <iostream>
using namespace std;
int main() {
    int a[]={1,-4,1,3,-2,6,2,-8,-9,4};
    int n=sizeof(a)/sizeof(a[0]);
    int cumSum[100]={0};
    cumSum[0]=a[0];
    for(int i=1; i<n; i++){
        cumSum[i]=cumSum[i-1]+a[i];
    }

    int currSum=0;
    int maxSum=0;
    int left=-1,right=-1;
    for(int i=1; i<n; i++){
        for(int j=i; j<n; j++){
            currSum=0;
            currSum=cumSum[j] - cumSum[i-1];
            if(currSum>maxSum){
                maxSum=currSum;
                left=i,right=j;
            }
        }
    }
    
    for(int i=left; i<=right; i++){
        cout<<a[i]<<" ";
    }
    cout<<"\n"<<maxSum;
    cout<<"\n"<<"cumSum=  ";
    for(int i=0; i<(sizeof(cumSum)/sizeof(cumSum[0])); i++){
        cout<<" "<<cumSum[i]<<" ";
    }
    return 0;
}

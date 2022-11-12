
/* The time Complexity of this solution is O(n) */
#include <iostream>
using namespace std;
int main() {
    int a[]={1,-4,1,3,-2,6,2,-8,-9,4};
    int n=sizeof(a)/sizeof(a[0]);
    int currSum=0;
    int maxSum=0;
    for(int i=0; i<n; i++){
        currSum+=a[i];
        maxSum=max(currSum,maxSum);
        if(currSum<0)
            currSum=0;
    }
    cout<<"\n"<<maxSum;
    return 0;
}

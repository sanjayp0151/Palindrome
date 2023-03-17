#include <iostream>
using namespace std;

int main()
{
   int no,real,rev=0;
   cout<<"\nEnter no to check Palindrome : ";
   cin>>no;
   real = no;
   while (no>0)
   {
      int rem = no%10;
      no/=10;
      rev=rev*10+rem;
   }
   if(rev==real) cout<<"Yes";
   else    cout<<"NO";

return 0;
}
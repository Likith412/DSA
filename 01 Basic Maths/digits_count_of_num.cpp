#include <bits/stdc++.h>
using namespace std;

int main()
{
   int n;
   cout << "Enter a Number: ";
   cin >> n;

   int count = 0;
   while (n != 0)
   {
      count++;
      n = n / 10;
   }
   cout << count << endl;

   return 0;
}
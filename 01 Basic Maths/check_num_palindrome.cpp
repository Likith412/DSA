#include <bits/stdc++.h>
using namespace std;

int main()
{
   int n;
   cout << "Enter a Number: ";
   cin >> n;

   int duplicate_n = n;

   // x is reversed number
   int x = 0, last_digit;
   while (n != 0)
   {
      last_digit = n % 10;
      x = (x * 10) + last_digit;
      n = n / 10;
   }

   if (x == duplicate_n)
   {
      cout << "true" << endl;
   }
   else
   {
      cout << "false" << endl;
   }

   return 0;
}
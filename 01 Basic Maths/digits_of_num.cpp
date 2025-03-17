#include <bits/stdc++.h>
using namespace std;

int main()
{
   int n;
   cout << "Enter a Number: ";
   cin >> n;

   int last_digit;
   while (n != 0)
   {
      last_digit = n % 10;
      cout << last_digit << endl;
      n = n / 10;
   }

   return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main()
{
   int n;
   cout << "Enter a Number: ";
   cin >> n;

   int x = 0, last_digit;
   while (n != 0)
   {
      last_digit = n % 10;
      x = (x * 10) + last_digit;
      n = n / 10;
   }

   cout << "Reversed Number: " << x << endl;

   return 0;
}
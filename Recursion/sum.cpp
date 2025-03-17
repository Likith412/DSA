#include <bits/stdc++.h>
using namespace std;

int n = 100;
void final_res(int sum, int i)
{
  if (i == n + 1)
  {
    cout << sum << endl;
    return;
  }
  final_res(sum + i, i + 1);
}

int main()
{
  final_res(0, 1);
}
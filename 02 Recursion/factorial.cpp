#include <bits/stdc++.h>
using namespace std;

int recursion_factorial(int n)
{
	if (n == 0 || n == 1)
		return 1;
	return recursion_factorial(n - 1) * n;
}

int main()
{
	int n;
	cin >> n;
	cout << recursion_factorial(n) << endl;
	return 0;
}
#include <bits/stdc++.h>
using namespace std;

// METHOD 1

// int main()
// {
// 	int n;
// 	cin >> n; // Input - 5
// 	int a[n];
// 	for (int i = 0; i < n; i++)
// 	{
// 		cin >> a[i]; // Input - 5 7 6 4 1
// 	}
// 	int j = n - 1;
// 	for (int i = 0; i < n; i++)
// 	{
// 		swap(a[i], a[j]); // swap elements
// 		j = j - 1;
// 		if (i >= j)
// 		{
// 			break;
// 		}
// 	}
// 	for (int i = 0; i < n; i++)
// 	{
// 		cout << a[i] << " "; // Output - 1 4 6 7 5
// 	}
// 	return 0;
// }

// METHOD 2

// #include <iostream>
// using namespace std;

// int main()
// {
// 	int n;
// 	cin >> n; // 5
// 	int a[n];
// 	for (int i = 0; i < n; i++)
// 	{
// 		cin >> a[i]; // Input - 5 7 6 4 1
// 	}
// 	for (int i = 0; i < n / 2; i++)
// 	{
// 		swap(a[i], a[n - i - 1]); // swap elements
// 	}
// 	for (int i = 0; i < n; i++)
// 	{
// 		cout << a[i] << " "; // Output - 1 4 6 7 5
// 	}
// 	return 0;
// }

// METHOD 3 - Recursion

#include <bits/stdc++.h>
using namespace std;
void reverse(int i, int a[], int n)
{
	if (i >= n / 2)
	{ // base condition
		return;
	}
	swap(a[i], a[n - i - 1]);
	reverse(i + 1, a, n); // recursive call
}
int main()
{
	int n;
	cin >> n; // 5
	int a[n];
	for (int i = 0; i < n; i++)
	{
		cin >> a[i]; // Input - 5 7 6 4 1
	}
	reverse(0, a, n); // calling the reverse function
	for (int i = 0; i < n; i++)
	{
		cout << a[i] << " "; // Output - 1 4 6 7 5
	}
	return 0;
}
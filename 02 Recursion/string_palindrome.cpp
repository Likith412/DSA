#include <bits/stdc++.h>
using namespace std;
bool check(int i, string s)
{
	int n = s.size();
	if (i >= n / 2)
	{
		return true;
	}
	if (s[i] != s[n - i - 1])
	{
		return false;
	}
	return check(i + 1, s);
}
int main()
{
	string s;
	getline(cin, s); // Input - LEVEL
	if (check(0, s))
	{
		cout << "Palindrome" << endl; // Output - Palindrome
	}
	else
	{
		cout << "Not a Palindrome" << endl;
	}
	return 0;
}
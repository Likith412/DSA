#include <bits/stdc++.h>
using namespace std;
void selectionsort(int arr[], int n)
{
	int min_index;
	for (int i = 0; i <= n - 2; i++)
	{
		// Calculate the minimum element
		min_index = i;
		for (int j = i; j <= n - 1; j++)
		{
			if (arr[j] < arr[min_index])
			{
				min_index = j;
			}
		}
		// swap arr[i] and arr[min_index]
		int temp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index] = temp;
	}
}
int main()
{
	int n;
	cin >> n;
	int arr[n];
	for (int i = 0; i < n; i++)
		cin >> arr[i];
	selectionsort(arr, n);
	for (auto x : arr)
	{
		cout << x << " ";
	}
	return 0;
}
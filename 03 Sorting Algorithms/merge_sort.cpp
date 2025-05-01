#include <bits/stdc++.h>
using namespace std;

// Function to merge two sorted subarrays into a single sorted subarray
void merge(int arr[], int left, int mid, int right)
{
  int i = left, j = mid + 1;       // Pointers for the two subarrays
  int k = 0, m = right - left + 1; // Temporary array size
  int new_arr[m];                  // Temporary array to store merged elements

  // Merge elements from both subarrays in sorted order
  while (i <= mid && j <= right)
  {
    if (arr[i] < arr[j])
    {
      new_arr[k++] = arr[i]; // Add smaller element from left subarray
      i++;
    }
    else
    {
      new_arr[k++] = arr[j]; // Add smaller element from right subarray
      j++;
    }
  }

  // Copy remaining elements from the right subarray, if any
  while (j <= right)
  {
    new_arr[k++] = arr[j];
    j++;
  }

  // Copy remaining elements from the left subarray, if any
  while (i <= mid)
  {
    new_arr[k++] = arr[i];
    i++;
  }

  // Copy the merged elements back to the original array
  for (int z = 0; z < m; z++)
  {
    arr[left + z] = new_arr[z];
  }
}

// Recursive function to perform merge sort
void merge_sort(int arr[], int left, int right)
{
  if (left == right) // Base case: single element is already sorted
  {
    return;
  }
  int mid = (left + right) / 2;    // Find the middle index
  merge_sort(arr, left, mid);      // Recursively sort the left half
  merge_sort(arr, mid + 1, right); // Recursively sort the right half
  merge(arr, left, mid, right);    // Merge the two sorted halves
}

int main()
{
  int n;
  cout << "Enter the number of elements in the array: ";
  cin >> n;
  int arr[n];
  cout << "Enter the elements of the array: ";
  for (int i = 0; i < n; i++)
    cin >> arr[i];
  merge_sort(arr, 0, n - 1);
  cout << "Sorted Array:" << endl;
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  return 0;
}
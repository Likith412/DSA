#include <bits/stdc++.h>
using namespace std;

void print(int i, int n)
{
    if (i == n + 1)
    {
        return;
    }
    cout << i << endl;
    print(i + 1, n);
}

int main()
{
    int n;
    cin >> n;
    print(1, n);
    return 0;
}

// With Global Variable

// int i = 1, n;
// void print()
// {
//     cout << i << endl;
//     if (i == n)
//     {
//         return;
//     }
//     i++;
//     print();
// }

// int main()
// {
//     cout << "Enter n value: ";
//     cin >> n;
//     print();
//     return 0;
// }
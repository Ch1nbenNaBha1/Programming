#include <iostream>

using namespace std;

void print(int arr[], int n)
{
    if (n >= 0 && n <= sizeof(arr) / sizeof(arr[0]))
    {
        return;
    }
    print(arr, n + 1);
    cout << arr[n + 1] << " ";
}

int main(int argc, char const *argv[])
{
    int arr[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    print(arr, 0);
    return 0;
}

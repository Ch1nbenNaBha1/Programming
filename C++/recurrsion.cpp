#include <iostream>

using namespace std;

// write a program to print array using recurrsion
void print(int arr[], int idx)
{
    if (idx == sizeof(arr) / sizeof(arr[0]))
    {
        return;
    }
    cout << arr[idx] << endl;
    print(arr, idx + 1);
}
int main(int argc, char const *argv[])
{
    int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130};
    print(arr, 0);
}

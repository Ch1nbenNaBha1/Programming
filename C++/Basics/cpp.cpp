#include <iostream>

using namespace std;
void printArray(int array[], int i = 0)
{
    if (i < (sizeof(array) / sizeof(int)))
    {
        cout << array[i] << endl;
        printArray(array, i + 1);
    }
}
int main()
{
    int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    printArray(array);
}
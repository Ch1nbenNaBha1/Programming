#include <iostream>
using namespace std;

int Add(int firstValue, int secondValue)
{
    return (firstValue + secondValue);
}

int Sub(int firstValue, int secondValue)
{
    return (firstValue - secondValue);
}

int Multiply(int firstValue, int secondValue)
{
    return (firstValue * secondValue);
}

float Devide(int firstValue, int secondValue)
{
    return (firstValue / secondValue);
}

int main()
{
    string oparation;
    int firstValue, secondValue;
    cout << "What do you want to do ?" << endl;
    cin >> oparation;
    cout << "Enter the numbers :" << endl;
    cin >> firstValue >> secondValue;

    if (oparation == "+" || oparation == "Add" || oparation == "add")
    {
        cout << Add(firstValue, secondValue);
    }
    else if (oparation == "-" || oparation == "sub" || oparation == "Sub")
    {
        cout << Sub(firstValue, secondValue);
    }
    else if (oparation == "*" || oparation == "Multiply" || oparation == "multiply")
    {
        cout << Multiply(firstValue, secondValue);
    }
    else
    {
        cout << Devide(firstValue, secondValue);
    }
}

#include <iostream>
using namespace std;

void task1_A()
{
    int intialValueA = 24;
    for (int i = 0; i < 6; i++)
    {
        cout << intialValueA << endl;
        intialValueA -= 6;
    }
};
void task1_B()
{
    int intialValueB = -10;
    for (int i = 0; i < 7; i++)
    {
        cout << intialValueB << endl;
        intialValueB += 5;
    }
};
void task1_C()
{
    int intialValueC = 18;
    while (intialValueC < 64)
    {
        cout << intialValueC << endl;
        intialValueC += 9;
    }
};
void Task1_D()
{
    int intialValueD = 18;
    while (intialValueD < 64)
    {
        if (intialValueD % 2 == 0)
        {
            cout << intialValueD << endl;
        }
        else
        {
            cout << -1 * (intialValueD) << endl;
        }

        intialValueD += 9;
    }
}

void task2()
{
    string input;
    int times;
    cout << "Enter Your favorite car company: " << endl;
    cin >> input;
    cout << "Enter the number of times you want to print: " << endl;
    cin >> times;
    for (int i = 0; i < times; i++)
    {
        cout << input << endl;
    }
}
int Task3()
{
    int sum;
    for (int i = 0; i < 601; i++)
    {
        if (i % 7 == 0 && i % 9 == 0)
        {
            sum += i;
        }
    }
    return sum;
}
int Task4()
{
    int sum;
    for (int i = 0; i < 601; i++)
    {
        if (i % 7 == 0 || i % 9 == 0)
        {
            // Check if the number is not a multiple of 63
            if (i % 63 != 0)
            {
                sum += i;
            }
        }
    }
    return sum;
}
void oddNumbers()
{
    for (int i = 10; i < 51; i++)
    {
        if (i % 2 != 0)
        {
            cout << i << " ";
        }
    }
}
int valueOfY(int n)
{
    int sum = 0;
    int square;
    for (int i = 0; i <= n; i++)
    {
        square = i * i;
        sum += (i % 2 == 0) ? -square : square;
    }
    return sum;
}

int main(int argc, char const *argv[])
{
    // Task 1 a
    task1_A();
    cout << "=================" << endl;
    // Task 1 b
    task1_B();
    cout << "=================" << endl;
    // Task 1 c
    task1_C();
    cout << "=================" << endl;
    // Task 1 d
    Task1_D();
    cout << "=================" << endl;
    // Task 2
    // task2();
    cout << "=================" << endl;
    // Task 3
    cout << Task3() << endl;

    cout << "=================" << endl;

    // task 4
    cout << Task4() << endl;
    cout << "=================" << endl;

    // task 5
    oddNumbers();
    cout << "=================" << endl;

    // task6
    cout << valueOfY(17000) << endl;
}
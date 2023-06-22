#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    // Task 1 a 
    int intialValueA = 24;
    for(int i = 0; i < 6; i++)
    {
        cout << intialValueA << endl;
        intialValueA -=6;
        
    }
    cout << "=================" << endl;
    // Task 1 b
    int intialValueB = -10 ;
    for(int i = 0; i < 7; i++)
    {
        cout << intialValueB << endl;
        intialValueB += 5;
        
    }
    cout << "=================" << endl;
    // Task 1 c
    int intialValueC = 18 ;
    while (intialValueC < 64)
    {
        cout << intialValueC << endl;
        intialValueC += 9;
    }
    

    return 0;

    cout << "=================" << endl;
    // Task 1 d 
    int intialValueD = 18;
    while (intialValueD < 64)
    {
        if (intialValueD % 2 == 0)
        {
            cout << intialValueD << endl;
        }else{
            cout << -1*(intialValueD) << endl;
        }
        intialValueD += 9;
    }
    cout << "=================" << endl;
    
}

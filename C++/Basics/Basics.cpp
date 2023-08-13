#include <iostream>

using namespace std;

class Calculator
{
private:
    int num1, num2;

public:
    Calculator(int num1, int num2)
    {
        this->num1 = num1;
        this->num2 = num2;
    }

    int add()
    {
        return num1 + num2;
    }

    int subtract()
    {
        return num1 - num2;
    }

    int multiply()
    {
        return num1 * num2;
    }

    int divide()
    {
        return num1 / num2;
    }
};

int main()
{
    // Let the program untill prompted to exit
    while (true)
    {
        // Get the user input
        int num1, num2;
        cout << "Enter the first number: ";
        cin >> num1;
        cout << "Enter the second number: ";
        cin >> num2;

        // Create a calculator object
        Calculator calculator(num1, num2);

        // Get the user input for the operation
        int operation;
        cout << "Enter the operation to perform: ";
        cout << "\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit\n";
        cin >> operation;

        // Perform the operation
        switch (operation)
        {
        case 1:
            cout << "The sum is: " << calculator.add() << endl;
            break;
        case 2:
            cout << "The difference is: " << calculator.subtract() << endl;
            break;
        case 3:
            cout << "The product is: " << calculator.multiply() << endl;
            break;
        case 4:
            cout << "The quotient is: " << calculator.divide() << endl;
            break;
        case 5:
            cout << "Exiting..." << endl;
            exit(0);
        default:
            cout << "Invalid operation" << endl;
            break;
        }
    }
}
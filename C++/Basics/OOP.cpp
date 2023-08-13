#include <iostream>
using namespace std;
class Paitent
{
public:
    int id, age;
    string name, bloodgroup;
    Paitent *next;
    Paitent *prev;

    Paitent(int id, string name, int age, string bloodgroup)
    {
        this->id = id;
        this->age = age;
        this->name = name;
        this->bloodgroup = bloodgroup;
    }

    void display()
    {
        cout << "ID: " << id << endl;
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Blood Group: " << bloodgroup << endl;
    }
};

class WRM
{
public:
    Paitent head = Paitent(0, "head", 0, "head");

    void addPaitent(int id, string name, int age, string bloodgroup)
    {
        Paitent toBeRegistered = Paitent(id, name, age, bloodgroup);

        Paitent *temp = &head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = &toBeRegistered;
        toBeRegistered.prev = temp;
    }

    void ServePaitent()
    {
        if (head.next == NULL)
        {
            cout << "No Paitent to Serve" << endl;
            return;
        }
        Paitent *toBeServed = head.next;
        head.next = toBeServed->next;
        toBeServed->next->prev = &head;
        toBeServed->next = NULL;
        toBeServed->prev = NULL;
        cout << "Paitent Served" << endl;

        delete toBeServed;
    }

    void CancelAll()
    {
        if (head.next == NULL)
        {
            cout << "No Paitent to Cancel" << endl;
            return;
        }
        Paitent *temp = head.next;
        while (temp != NULL)
        {
            temp->prev->next = NULL;
            temp->prev = NULL;
            temp = temp->next;
        }
        cout << "All Paitents Cancelled" << endl;
    }

    bool CanDoctorGoHome()
    {
        if (head.next == NULL)
        {
            return true;
        }
        return false;
    }

    void ShowAllPaitents()
    {
        if (head.next == NULL)
        {
            cout << "No Paitent to Show" << endl;
            return;
        }
        Paitent *temp = head.next;
        while (temp != NULL)
        {
            temp->display();
            temp = temp->next;
        }
    }
};

int main(int argc, char const *argv[])
{
    WRM wrm = WRM();
    wrm.addPaitent(1, "Ali", 20, "A+");
    wrm.addPaitent(2, "Ahmed", 21, "B+");
    wrm.addPaitent(3, "Asad", 22, "AB+");
    wrm.addPaitent(4, "Ahsan", 23, "O+");
    wrm.addPaitent(5, "Aqeel", 24, "A-");
    wrm.addPaitent(6, "Aamir", 25, "B-");
    wrm.addPaitent(7, "Azeem", 26, "AB-");
    wrm.addPaitent(8, "Ahsan", 27, "O-");
    wrm.addPaitent(9, "Aqeel", 28, "A+");
    wrm.addPaitent(10, "Aamir", 29, "B+");

    wrm.ShowAllPaitents();
    wrm.ServePaitent();
    wrm.ServePaitent();
    wrm.ServePaitent();
    wrm.ServePaitent();
    wrm.ServePaitent();

    wrm.ShowAllPaitents();
    wrm.CancelAll();
    wrm.ShowAllPaitents();

    return 0;
}

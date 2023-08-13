#include <iostream>
using namespace std;

// Linked List

struct Node
{
    /* data */
    int data;
    Node *next;
};

Node *head = NULL;

void insert(int data)
{
    Node *temp = new Node();
    temp->data = data;
    temp->next = NULL;

    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        Node *temp1 = head;
        while (temp1->next != NULL)
        {
            temp1 = temp1->next;
        }
        temp1->next = temp;
    }
}

void insertRecurssve(Node *temp, int data)
{
    if (temp->next == NULL)
    {
        Node *temp1 = new Node();
        temp1->data = data;
        temp1->next = NULL;
        temp->next = temp1;
    }
    else
    {
        insertRecurssve(temp->next, data);
    }
}
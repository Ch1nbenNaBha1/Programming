#include<iostream>

using namespace std;


class Node {
    public:
        int data;
        Node* next;
};

class LinkedList{
    private:
        Node* head;
    public:
        LinkedList(){
            head = NULL;
        };

        int lenOfArray(int A[]){
            return (sizeof(A)/sizeof(A[0]));
        };
        void CreateList(int A[]){
            for (int i = 0; i < lenOfArray(A); i++)
            {
                /* code */
                Node* t = new Node;
                t->data = A[i];
                t->next = NULL;
                if (head == NULL)
                {
                    /* code */
                    head = t;
                }else{
                    Node* p = head;
                    while (p->next != NULL)
                    {
                        /* code */
                        p = p->next;
                    }
                    p->next = t;
                }
            }
            printf("List Created");
        };

        void PrintList(){
            Node* p = head;
            while (p != NULL)
            {
                /* code */
                printf("%d", p->data);
                p = p->next;
            }
        };
};

int main(){
    //Create a linked list
    int A[] = {3, 5, 7, 10, 15};
    LinkedList l;
    l.CreateList(A);
    l.PrintList();
}
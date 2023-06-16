package Java.practiceCodes;

public class Week3 {
    //We are talking about Liked Lists this week

    //defining a Node class
    public static class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

    }
    static class LinkedList {
        Node head = new Node( 0,null);

        void PrintList(){
            Node temp = head;
            while(temp.next != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        //Inserting elements in the linked list
        void Insert(int data){
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data,null);
        }
        // Removing elements from the linked list
        void RemoveFromlist(int data){
            Node temp = head;
            while(temp.next != null){
                if(temp.next.data == data){
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
        void nodeAt(int index){
            Node temp = head;
            int count = 0;
            while(temp.next != null){
                if(count == index){
                    System.out.println(temp.data);
                    break;
                }
                count++;
                temp = temp.next;
            }
        }
        void InsertAt(int index, int data){
            Node temp = head;
            int count = 0;
            while(temp.next != null){
                if(count == index){
                    Node newNode = new Node(data,temp.next);
                    temp.next = newNode;
                    break;
                }
                count++;
                temp = temp.next;
            }
        }
    }

    public static void  main(String[] args) {
        LinkedList list = new LinkedList();
        list.Insert(1);
        list.Insert(2);
        list.Insert(3);
        list.Insert(4);
        list.Insert(5);
        list.Insert(6);
        list.Insert(7);
        list.Insert(8);
        list.Insert(9);
        list.Insert(10);
        list.PrintList();
        System.out.println("Removing 5 from the list");
        list.RemoveFromlist(5);
        list.PrintList();
        System.out.println("Printing the node at index 3");
        list.nodeAt(3);
        System.out.println("Inserting 5 at index 3");
        list.InsertAt(3,5);
        list.PrintList();
    }
}



public class Lab6 {
    public static class Node {
        private int data;
        private Node next;

        public Node(int x, Node next) {
            data = x;
            next = null;
        }

    }

    public static class Stack {
        private Node top;

        public Stack() {
            top = null;
        }

        public void push(int x) {
            Node newNode = new Node(x, null);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

        public int pop() {
            if (top == null) {
                return -1;
            } else {
                int temp = top.data;
                top = top.next;
                return temp;
            }
        }

        public int peek() {
            if (top == null) {
                return -1;
            } else {
                return top.data;
            }
        }

        public boolean isEmpty() {
            if (top == null) {
                return true;
            } else {
                return false;
            }
        }
    }

    void printStack(Stack st) {
        Node temp = st.top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static boolean balance_parenthesis(String s) {
        Stack st = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '(') || (s.charAt(i) == '{') || s.charAt(i) == '[') {
                st.push(1);
            } else if ((s.charAt(i) == ')') || (s.charAt(i) == '}') || s.charAt(i) == ']') {
                if (st.isEmpty()) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static int diamondCount(Stack s, String k) {
        int count = 0;

        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) == '<') {
                s.push(1);
            } else if (k.charAt(i) == '>') {
                if (s.isEmpty()) {
                    continue;
                } else {
                    s.pop();
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Checking Stack implementation: " + "\n");

        Stack st = new Stack();
        st.push(4);
        st.push(3);
        st.push(5);
        st.push(1);
        st.push(9);
        System.out.println("Peeked Element: " + st.peek());
        System.out.println("Popped Element: " + st.pop());
        System.out.println("Popped Element: " + st.pop());
        System.out.println("Popped Element: " + st.pop());
        System.out.println("Peeked Element: " + st.peek());
        System.out.println("Popped Element: " + st.pop());
        System.out.println("Popped Element: " + st.pop());
        System.out.println("Peeked Element: " + st.peek());
        System.out.println("Popped Element: " + st.pop());
        System.out.println(st.isEmpty());

        System.out.println("\n" + "Checking balance parenthesis: " + "\n");

        String test = "1+*(3/4)";
        boolean returned_value = balance_parenthesis(test);

        System.out.println("The string " + test + " is balanced: " + returned_value);

        System.out.println("========================================================");

        test = "1+2*[3*3+{4\u20135(6(7/8/9)+10)\u201311+(12*8)]+14";
        returned_value = balance_parenthesis(test);

        System.out.println("The string " + test + " is balanced: " + returned_value);

        System.out.println("========================================================");

        test = "[10*[3-(5-2)]";
        returned_value = balance_parenthesis(test);

        System.out.println("The string " + test + " is balanced: " + returned_value);

        System.out.println("========================================================");

        test = "(A+B)-C)";
        returned_value = balance_parenthesis(test);

        System.out.println("The string " + test + " is balanced: " + returned_value);

        System.out.println("========================================================");

        test = "([A+B]-C)/{D*E}+[2*[(2A+5){5B}]-{7C-9AB}]";
        returned_value = balance_parenthesis(test);

        System.out.println("The string " + test + " is balanced: " + returned_value);

        System.out.println("========================================================");

        System.out.println("\n" + "Checking diamond count: " + "\n");

        Stack st2 = new Stack();
        test = "<..><.<..>>";
        int returnedValue = diamondCount(st2, test);
        System.out.println(returnedValue);

        System.out.println("========================================================");

        test = "<<<..<......<<<<....>";
        returnedValue = diamondCount(st2, test);
        System.out.println(returnedValue);

        System.out.println("========================================================");

        String test3 = ">>><...<<..>>...>...>>>";
        returnedValue = diamondCount(st2, test3);
        System.out.println(returnedValue);

        System.out.println("========================================================");

    }

}

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.top=None

    def push(self, data):
        if self.top is None:
            self.top = Node(data)
        else:
            newNode = Node(data)
            newNode.next = self.top
            self.top = newNode

    def pop(self):
        if self.top is None:
            return None
        else:
            poppedNode = self.top
            self.top = self.top.next
            poppedNode.next = None
            return poppedNode.data

    def peek(self):
        if self.top is None:
            return None
        else:
            return self.top.data

    def isEmpty(self):
        if self.top is None:
            return True
        else:
            return False

def LabMidTask (array , numberOfTrucks):
    for i in range(len(array)):
            if i < len(array)-1:
                if array[i] > array[i+1]:
                    st.push(array[i])
                    
                else:
                    continue
            if i == len(array)-1 :
                while st.peek() != None and array[i] < st.peek():
                    array[i]=st.pop()
                    

        #Check if the array is sorted
        for i in range(len(array)):
            if i < len(array)-1:
                if array[i] > array[i+1]:
                    print("No")
                    
                    break
                else:
                    continue
            if i == len(array)-1:
                print("Yes")
                break
st = Stack()
inputArray = [5,1,2,4,3]
truckNumber = 5
LabMidTask(inputArray,truckNumber)
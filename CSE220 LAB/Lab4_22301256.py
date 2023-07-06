class Paitent:
    def __init__(self , id, name , age , bloodGroup) -> None:
        self.id , self.name, self.age , self.bloodGroup = id , name , age , bloodGroup
        self.next = None
        self.prev = None

    def __str__(self) -> str:
        return f"ID: {self.id} Name: {self.name}"


class WRM:

    def __init__(self) -> None:
        self.dummy = Paitent(None , None , None , None)
        
    def RegisterPaitent(self , id , name , age , bloodGroup):
        toBeRegistered = Paitent(id , name , age , bloodGroup)

        if self.dummy.next == None:
            self.dummy.next = toBeRegistered
            self.dummy.prev = toBeRegistered
            
        else:
            lastPaitent = self.dummy.prev
            lastPaitent.next = toBeRegistered
            toBeRegistered.prev = lastPaitent
            self.dummy.prev = toBeRegistered

        print(f"Succesfully Registerd patient {name}")
    
    def ServePaitent(self):
        
        if self.dummy.next == None:
            print("No paitent is in the queue")
        else:
            print(f'{self.dummy.next.name} is served')
            self.dummy.next = self.dummy.next.next
            

    def CancelAll(self):
        self.dummy.next = None
        print("All appointments are cancelled")
    
    def CanDoctorGoHome(self):
        if self.dummy.next == None:
            return True
        return False

    def ShowAllPaitents(self):
        
        if self.dummy.next == None:
            print("No paitent is in the queue")
        else:
            current = self.dummy.next
            while current != None:
                print(current)
                current = current.next


# Test

waitingRoom = WRM()

while True:
    print("1. Register Paitent")
    print("2. Serve Paitent")
    print("3. Cancel All")
    print("4. Can Doctor Go Home")
    print("5. Show All Paitents")
    print("6. Exit")
    choice = int(input("Enter your choice: "))

    if choice == 1:
        __id = int(input("Enter ID: "))
        __name = input("Enter Name: ")
        __age = int(input("Enter Age: "))
        __bloodGroup = input("Enter Blood Group: ")
        waitingRoom.RegisterPaitent(__id , __name , __age , __bloodGroup)
    elif choice == 2:
        waitingRoom.ServePaitent()
    elif choice == 3:
        waitingRoom.CancelAll()
    elif choice == 4:
        print(waitingRoom.CanDoctorGoHome())
    elif choice == 5:
        waitingRoom.ShowAllPaitents()
    elif choice == 6:
        break
    else:
        print("Invalid Choice")
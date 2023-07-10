import javax.naming.Name;

public class lab4 {
    public static class  Paitent{
        int id , age ;
        String bloodGroup , name;
        Paitent next , prev ;
        Paitent( int id, String name , int age , String bloodGroup) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.bloodGroup = bloodGroup;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "id: " + id +
                    "Name: " + name;
        }
    }

    public static class WRM{
        Paitent dummy = new Paitent(0000,null,0000,null);
        WRM() {
            this.dummy = dummy;
        }

        public void RegisterPaitent(int id, String name , int age , String bloodGroup ){
            Paitent NewPaitent = new Paitent(id , name, age , bloodGroup);

            if(this.dummy.next ==null){
                this.dummy.next =NewPaitent;
                this.dummy.prev = NewPaitent;
            }
            else{
                Paitent lastPaitent = this.dummy.prev ;
                lastPaitent.next = NewPaitent;
                NewPaitent.prev = lastPaitent;
                this.dummy.prev = lastPaitent;
            }
            System.out.println(name +" Has been registered as a paitent.");
        }

        public void ServePaitent(){
            if (this.dummy.next == null){
                System.out.println("No paitent is in queue");
            }else{
                System.out.println(this.dummy.next.name + "is served! ");
                this.dummy.next = this.dummy.next.next;
            }
        }
        public void CancelAll(){
            this.dummy.next = null;
            System.out.printf("All Appointments are cancelled ");
        }
        public boolean CanDoctorGoHome(){
            if (this.dummy.next == null)
                return true;
            return false;
        }
        public void ShowAllPaitents(){
            if(this.dummy.next == null){
                System.out.println("No paitent is in queue! ");
            }else{
                Paitent current = this.dummy.next;
                while (current != null){
                    System.out.print(current);
                    current = current.next;
                }
            }
        }

    }

    public static void main(String[] args) {
        WRM waitingRoom = new WRM();

        waitingRoom.RegisterPaitent(1 , "Junaid" , 20 , "A+");
        waitingRoom.RegisterPaitent(2 , "Kafi" , 22 , "B+");
        waitingRoom.RegisterPaitent(3 , "Ayon" , 24 , "AB+");
        waitingRoom.RegisterPaitent(4 , "Moin" , 26 , "O+");
        waitingRoom.RegisterPaitent(5 , "Mahib" , 28 , "A-");
        waitingRoom.RegisterPaitent(6 , "Likhon" , 30 , "B-");
        waitingRoom.RegisterPaitent(7 , "IDK WHO" , 32 , "AB-");

        waitingRoom.ShowAllPaitents();

        waitingRoom.ServePaitent();
        waitingRoom.ServePaitent();
        waitingRoom.ServePaitent();

        System.out.println(waitingRoom.CanDoctorGoHome());
        waitingRoom.CancelAll();
        waitingRoom.ShowAllPaitents();
        System.out.println(waitingRoom.CanDoctorGoHome());

    }
}

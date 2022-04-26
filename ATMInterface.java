//the user name is Aman@123 and password is 123
import java.util.Scanner;
class Transaction{
    public static void print(){
        System.out.println("\nDate    \tParticulars\tWithdrawal\tDeposit\tBalance");
        System.out.println("\n05/12/21\tCOR SSH    \t10000     \t-      \t340090");
        System.out.println("06/12/21\tPOS TXN    \t323       \t-      \t339767");
        System.out.println("07/12/21\tPAYTM      \t1200      \t-      \t338567");
        System.out.println("08/12/21\tBY INTT    \t-         \t10000  \t348567");
        System.out.println("09/12/21\tPOS TXN    \t3000      \t-      \t345567");
        System.out.println("10/12/21\tSBICOLLECT \t4500      \t-      \t341067");
        System.out.println("11/12/21\tDEPOSITE   \t-         \t20000  \t361067");
        System.out.println("12/12/21\tWITHDRAWL  \t2000      \t-      \t359067");
        System.out.println("13/12/21\tDUTY       \t102       \t-      \t358965");
    }
}

class Withdraw{
    int withd ;
    public void print(){
        System.out.println("\nEnter amount here");
    }
    public void with(int withd){
        this.withd = withd;
    }
    public void print2(){
        System.out.println(withd + " has been debited");
    }
}

class Deposit{
    int depo ;
    public void print(){
        System.out.println("\nEnter amount here");
    }
    public void depo(int depo){
        this.depo = depo;
    }
    public void print2(){
        System.out.println(depo + " has been creditade");
    }
}

class Transfer{
    
    public void print(){
        System.out.println("\nEnter bank name");
    }
    public void print2(){
        System.out.println("Enter account nuumber");
    }
   
    public void print4(){
        System.out.println("Enter amount");
    }
}

class Quite{
    public void print(){
        System.out.println("Thanks for coming");
    }
}

public class ATMInterface{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n**Wellcome to ATM**");
        System.out.print("\nLogin");
      
        int chanches = 3;
        while(chanches>=1){

        System.out.println("\nEnter your Username");
        String username = sc.nextLine();
        System.out.println("\nEnter your password");
        String password = sc.nextLine();
        String user = "Aman@123";
        String pass = "123";

        if(username.equals(user) && password.equals(pass)){
            System.out.println("\n\nWhat you want to do\n");
            System.out.println("1 Transaction history");
            System.out.println("2 Withdraw");
            System.out.println("3 Deposit");
            System.out.println("4 Transfer");
            System.out.println("5 Quite");
            String choice = sc.nextLine();

            if(choice.equals("1")){
                Transaction trance = new Transaction();
                trance.print();
            }
            else if(choice.equals("2")){
                Withdraw wit = new Withdraw();
                wit.print();
                int amount = sc.nextInt();
                wit.with(amount);
                wit.print2();
            }
            else if(choice.equals("3")){
                Deposit dip = new Deposit();
                dip.print();
                int amount = sc.nextInt();
                dip.depo(amount);
                dip.print2();
            }
            else if(choice.equals("4")){
                Transfer transfer = new Transfer();

                transfer.print();
                String bname = sc.nextLine();
                
                transfer.print2();
                int account = sc.nextInt();
                
                transfer.print4();
                int amount = sc.nextInt();
                
                System.out.println(amount + " has been sent to " + account + " with " +  bname);
            }
            else if(choice.equals("5")){
                Quite quite = new Quite();
                quite.print();
            }
            else{
                System.out.println("You enter wrong input \nplease select abow option");
            }


            break;
        }
        else{
            System.out.println("Username or Password is incorrect");
            chanches--;
            System.out.println("Now you hava " + chanches + " attempts left");
        }
    }
    }
}
//the user name is Aman@123 and password is 123`
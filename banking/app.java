package banking;
import java.util.*;

public class app {

    public  static  void Create(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name :- ");
        String name = sc.nextLine();
        String un;
        while(true){
            System.out.print("username :- ");
            un = sc.nextLine();
            if(auth.unchecker(un) == false ){
               
                break;
            }
            else if(un == "exit"){
                return;
            }
            else{
                 System.err.println("Username already exist , Enter exit for exit");
            }
        }
        System.out.print("Password :- ");
        String pas = sc.nextLine();
        System.out.print("Ammount :- ");
        int a = sc.nextInt();
        // sc.close();
        auth.register(name,a,un,pas);

    }
    
    public static user log(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Username :- ");
        String un = sc.nextLine();
        System.out.print("Password :-");
        String pass = sc.nextLine();
        user i = auth.login(un, pass);
        // sc.close();
        return i;
    }
// =========================================================================
// =========================================================================
// Last baar yha se choda tha
    public static void Dashboard(user i){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. For account checkup");
        System.out.println("2. For withdraw");
        System.out.println("3. For deposit");
        System.out.println("Any other key. for Exit");
        System.out.print("Enter your option:- ");
        int a = sc.nextInt();
        if( a == 1 ){
            i.Ammount();
        }
        else if( a == 2 ){
            System.out.print("How much ammount:- ");
            int z = sc.nextInt();
            i.withdraw(z);
        }else if( a == 3){
            System.out.println("how much ammount:- ");
            int z = sc.nextInt();
            i.deposit(z);
        }
        else{
            System.out.println("Thanks for visitation");
        }
        
        
    }
// =========================================================================    
// =========================================================================
    public static void serv(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Create new account");
            System.out.println("2. Already have an account");
            System.out.println("Any another. Exit");
            int i = sc.nextInt();
            if(i == 1){
                Create();
            }
            else if( i == 2){
                user a = log();
                if(a == null ){
                    System.out.print("Fuck you");
            }
                else{
                    Dashboard(a);
            }

            }
            else{
                sc.close();
                return;
            }
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Thanks for using our servecis");
        serv();
        System.out.println("Thanks for using our services");
    }

}


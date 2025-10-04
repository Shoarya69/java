
import java.util.*;
public class user {
    String username;
    String name;
    String pass;
    int ammont;
    static int users =0;
    static int totalAmmount=0;    

    public user(String n,int a,String ue,String p){
        Random rd = new Random();
        this.name=n;
        this.username=ue;
        this.pass=p;
        this.users++;
        this.ammont=a;
        this.totalAmmount+=a;

    }
    
    public void Ammount() {
        System.out.println("Your account id is :- " + this.username);
        System.out.println("The amount in your bank Mr./Mrs. " + this.name + " is Rs." + this.ammont);
        System.out.println("Thank you for visit");
    }

    public void withdraw(int a){
        if(this.ammont<a){
            System.err.println("Unsufficent Ammount");
        }
        else{
            this.ammont -= a;
            System.out.println("Succfulluy creadited Rs."+a+" ammount your total money is "+this.ammont);
            this.totalAmmount-=a;
        }
    }
    
    public void deposit(int a) {
        this.ammont+=a;
        System.out.println("Successfully added Rs."+a +"ammont your total money is "+this.ammont);
        this.totalAmmount+=a;
    }
    
    public void bankAdmin(){
        System.out.println("Total customer = "+users);
        System.out.println("Total ammount = "+totalAmmount);

    }

}

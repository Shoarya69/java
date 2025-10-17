import java.util.*;
public class userinputexc {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter any Number:- ");
        s = sc.next();
        try {
            int g = Integer.parseInt(s);
            System.out.println("your number is :- "+g);
        } catch (Exception e) {
            System.out.println(e.getMessage()+" error");
        }
        System.out.print("++++++++++end++++++++++++++");
    }
}

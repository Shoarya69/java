import java.util.*;
public class same_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a program to check two strings are anagrams ");
        System.out.print("Enter First string:- ");
        String a =sc.nextLine();
        char[] a1 = a.toCharArray();
        System.out.print("Enter 2nd String:- ");
        String b = sc.nextLine();
        char[] b1 = b.toCharArray();
        HashMap<Character,Integer> freq= new HashMap<>();
        HashMap<Character,Integer> freq2= new HashMap<>();
        for(char i:a1){
            if(freq.containsKey(i)){
                freq.put(i,freq.get(i)+1);
            }
            else{
                freq.put(i,1);
            }
        }
        for(char i:b1){
            if(freq2.containsKey(i)){
                freq2.put(i,freq2.get(i)+1);
            }
            else{
                freq2.put(i,1);
            }
        }
        if(freq.equals(freq2)){
            System.out.print("The strings are anagrams");
        }
        else{
            System.out.println("The strings are not anagrams");
        }
        

    }
}

import java.util.*;
public class char_calcl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is an Programm to calculate number of freq of each char in an String:-  ");
        System.out.print("Enter the string = ");
        String a = sc.nextLine();

        char[] c = a.toCharArray();

        HashMap<Character, Integer> freq = new HashMap<>();
        for(char i:c){
            if(freq.containsKey(i)){
                freq.put(i,freq.get(i)+1);
            }else{
                freq.put(i,1);
            }
        }
        System.out.println("Character Frequences::--");
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        sc.close();
    }
}

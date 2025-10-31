import java.util.*;

public class collection {
    public static void main(String[] args){
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        for(int i=0;i<rd.nextInt(3,10);i++){
            list.add(rd.nextInt(100));
        }
        // System.out.println(list.get(3));
        System.out.println("sizr of array is:- "+list.size());
        list.remove(1);
        list.add(1,67);
        list.set(2,45);
        for(int i : list ){
                System.out.println(i);
        }
        list.get(3);
        
        System.out.println(list);
        System.out.println(list.contains(67));
        System.out.println(list.indexOf(67));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        
    }
}

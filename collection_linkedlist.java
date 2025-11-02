
import java.util.*;
public class collection_linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.addLast(3);
        list.addFirst(4);
        Integer a = list.peek();
        boolean b = list.isEmpty();
        list.add(1,3);
        System.out.println(list);
        list.remove();
        list.removeIf(x -> x%2==0);
        System.out.println(list);
        int s = list.size();
        list.get(2);
    }
}

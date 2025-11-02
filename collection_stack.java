import java.util.*;
public class collection_stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.pop();
        s.push(2);
        s.peek();
        s.search(2);
        System.out.print(s);
    }
}

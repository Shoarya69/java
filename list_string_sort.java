import java.util.*;

public class list_string_sort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Shoarya");
        list.add("Banana");
        list.add("Bansal");
        list.add("This");
        list.add("How i am");
        list.add("There it is");
        list.add("I am iron man");

        System.out.println("Original list: " + list);

        // Normal sorting (A → Z)
        list.sort(null);
        System.out.println("Normal sort: " + list);

        // Reverse sorting (Z → A)
        list.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println("Reverse sort: " + list);

        // Length-based sorting (shorter first)
        list.sort((o1, o2) -> o1.length() - o2.length());
        System.out.println("Length-based sort: " + list);

        // Reverse of length-based sorting (longer first)
        list.sort((o1, o2) -> o2.length() - o1.length());
        System.out.println("Reverse length-based sort: " + list);
    }
}

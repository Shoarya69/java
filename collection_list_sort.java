import java.util.*;
public class collection_list_sort {
    public static void main(String[] arg){
        Random rd = new Random();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<rd.nextInt(3,10);i++){
            list.add(rd.nextInt(100));
        }
        list.sort((o1,o2) -> (int) (o2-o1));
        System.out.println(list);
    }
}

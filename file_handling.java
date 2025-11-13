
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_handling{
     public static void main(String[] args) {
        File any_file = new File("Shoarya.txt");
        try {
            any_file.createNewFile();
        } catch (Exception e) {
            System.out.println("There is Some error");
            System.exit(0);
        }
        try {
            FileWriter fileWriter = new FileWriter(any_file);
            fileWriter.write("This is someThing i want to say that i am Iron man");
            fileWriter.close();
            System.out.println("Complete op");
        } catch (Exception e) {
            System.out.println("Some error in opening file");
            System.exit(0);
        }
        try{
            Scanner sc = new Scanner(any_file);    
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                
            }
        }catch(Exception t){
            System.out.println("There is somting went Wrong");
        }


    }
    
}

import java.util.*;
public class auth {
    private static Map<String,user> userdb = new HashMap<>();

    public static  void register(String name,int ammont,String username,String pass){
        if(userdb.containsKey(username)){
            System.err.println("This usernmae already exist use another");
        }
        else{
            user u = new user(name,ammont,username,pass);
            userdb.put(username,u);
            System.out.println("Successfully aadded");
        }
    }

    public static boolean  unchecker(String username){
        if(userdb.containsKey(username)){
            return true;
        }
        else{
            return false;
        }
    }

    public static user login(String username,String password){
        if(!userdb.containsKey(username)){
            System.err.println("Wrong username");
            return null;
        }
        user u = userdb.get(username);
        if(u.pass.equals(password)){
            System.out.println("login sucess");
            return u;
        }
        else{
            System.err.println("Wrong password Try again");
            return null;
        }
    }



}

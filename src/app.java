import java.util.ArrayList;
import java.util.HashMap;

public class app {


    public static void main(String[] args){
        ArrayList<String> strings= new ArrayList<String>();
        strings.add("cat");
        strings.add("dogs");
        strings.add("buffallo");
        String animal= strings.get(1);
        System.out.println(animal);
        HashMap<Integer,String > map=new HashMap<Integer,String>();
        map.put(5,"hello thi is 5");
        map.put(5,"hello this is lala");
        System.out.println(map.get(1));



    }
}

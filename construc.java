//class machine{
//    private String name;
//    private int code;
//    public machine(){
//        this("nandu");
//        System.out.println("constructor running");
//    }
//    public machine(String name){
//        this(name,0);
//        System.out.println("second constructor running");
//        this.name=name;
//    }
//    public machine(String name, int code){
//        System.out.println("Third constructor running");
//        this.name=name;
//        this.code=code;
//    }
//}
//public class construc {
//    public static void main(String[] args){
//    machine machine1= new machine();
//    machine machine2=new machine("lalaland");
//    machine machine3= new machine("titanic", 7);
//    }
//
//}

class thing {
    public final static int lucky_number= 4;
    public String name;
    public static String description;
    public static int count=0;
    public int id;
    public thing(){

        id=count;
        count++;
    }

    public void showname() {
        System.out.println("object id"+id+description+" "+name);
    }

    public static void showinfo() {

        System.out.println(description);

    }
}
public class construc{
    public static void main(String[] args){
        thing.description="I am a thing";
        thing.showinfo();
        System.out.println(
                "Before creating the objects the count is "+thing.count);

        System.out.println(thing.description);
        thing thing1 =new thing();
        thing thing2=new thing();
        thing1.name="vivek";
        thing2.name="reddy";
        thing1.showname();
        thing2.showname();
        thing1.showinfo();

        System.out.println(thing.lucky_number);
    }
}
class Person{

    private String name;
    private int age;
    public void setname(String name){
       this.name= name;

    }public void setage(int age){
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public void setinfo(String name,int age){

        setname(name);
        setage(age);
    }
}
public class classei {
public static void main(String[] args){

Person frog1=new Person();
//frog1.name="vivek";
//frog1.age=1;
frog1.setname("vivek");
frog1.setage(1);
System.out.println(frog1.getname());




}
}

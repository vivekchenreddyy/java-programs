import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class app1

{
    public static void main(String[] args) throws FileNotFoundException {
        String filename="/home/nineleaps/IdeaProjects/Project1/src/one.txt";
        File textfile=new File(filename);
        Scanner in =new Scanner(textfile);
        int value=in.nextInt();
        System.out.println(value);
        int count=2;
        while(in.hasNextLine()){
            String line=in.nextLine();
            System.out.println(line+"and the count is"+count);
            count++;
        }
        in.close();


    }
}

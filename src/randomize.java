import java.util.Random;

public class randomize
{
    public static void main( String[] args){
        int k=10;
        int count=0;
        int[] array= new int[k];
        Random rand = new Random();

        for (int i=0;i<10;i++){
            int n =rand.nextInt(10);

            array[i]=n;
//            System.out.println(n);

            System.out.print(array[i]);

        }
        System.out.println("\t And the max number is");
        int max=array[0];

        for (int i=0;i<10;i++){
            if(max<array[i]) {
                                 max=array[i];
                            }

        }
        System.out.println(max);
        for(int i=0;i<10;i++){
            if(max==array[i]);
            {

                count=count+1;

            }


        }
        System.out.printf("And the number of times the number appeared is %d",count);


//
      }
    }


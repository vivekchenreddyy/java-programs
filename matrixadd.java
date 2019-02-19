import java.util.Scanner;

public class matrixadd {
    public static void main (String[] args){
        int m,n,i,j;
        Scanner input =  new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        m= input.nextInt();
        n=input.nextInt();
        int first[][]=new int[m][n];
        int second[][]=new int[m][n];
        int sum[][]=new int [m][n];
        System.out.println("enter the elements of first matrix");

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                first[i][j]= (int) (Math.random()*100);
            }
        }

        for(i=0;i<m;i++) {
            for (j = 0; j < n; j++) {
                second[i][j]= (int) (Math.random()*100);
            }
        }
        for(i=0;i<m;i++) {
            for (j = 0; j < n; j++) {
                sum[i][j]=first[i][j]+second[i][j];

            }
        }
        for(i=0;i<m;i++) {
            for (j = 0; j < n; j++) {
                System.out.printf(sum[i][j]+"\t");

            }
            System.out.printf("\n");
        }



            }
        }


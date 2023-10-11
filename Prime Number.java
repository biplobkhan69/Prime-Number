import java.util.Scanner;
/**
 * Prime
 */
public class Prime {

    public static void main(String[] args) {
       int i,j;
       Scanner input =new Scanner(System.in);
       for(i=2;i<=100;i++) 
       {
        for(j=2;j<=i;j++)
        {
            if(i%j==0)
             break;
        }
        if(i==j)
        {
            System.out.println(i+",");
        }


       }                     
    }
}
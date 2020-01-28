
import java.util.*;
public class Primeornot {
    public static void main(String args[])
    {
        int j=0;
        int n =Integer.parseInt( args[0]);
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                System.out.println("given number is not prime number");
                j=1;
                break;
            }
            
        }
        if(j==0){
            System.out.println("give number is prime number");
        }
    }
}
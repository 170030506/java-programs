import java.util.*;
import java.io.*;
public class Factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    int sum=1;
    int i=1;
    do{
       
    
        sum=sum*i;
        i=i+1;
    }while(i<=n);
      System.out.println(sum);
    }
}
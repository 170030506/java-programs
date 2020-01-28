import java.util.*;
import java.io.*;
public class Palindrone{
    public static void main(String args[]){
        int n;
        int sum=0;
        int j;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        j=n;
        while(n!=0){
            int p= n%10;
            sum=sum*10+p;
            n=n/10;
        }
    
    if(sum==j){
        System.out.println("it is a palindrone");
    }
    else{
        System.out.println("no it is not a palindrone");
        
    }
}
}
import java.util.Scanner;
public class Hand{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int h= (n*(n - 1))/2;
        System.out.println("The maximum number of handshakes is " + h);
    }
}

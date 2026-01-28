
import java.util.Scanner ;
class SmallestFirst{
public static void main(String[] args ) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  number 1 " ) ;
int number1 =  sc.nextInt() ;
System.out.println("Enter the  number 2 " ) ;
int number2 =  sc.nextInt() ;
System.out.println("Enter the  number 3 " ) ;
int number3 =  sc.nextInt() ;

if ( number1 < number2 && number1 < number3) {
System.out.println("The First Number " +number1+ " Is Smallest " ) ; }
else {
System.out.println("The First Number " +number1+ " Is Not The Smallest ") ;
}
}
}
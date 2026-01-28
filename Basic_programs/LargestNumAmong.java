
import java.util.Scanner ;
class LargestNumAmong{
public static void main(String[] args ) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  number 1 " ) ;
int number1 =  sc.nextInt() ;
System.out.println("Enter the  number 2 " ) ;
int number2 =  sc.nextInt() ;
System.out.println("Enter the  number 3 " ) ;
int number3 =  sc.nextInt() ;

if ( number1 > number2 && number1 > number3) {
System.out.println("The First Number " +number1+ " Is Largest " ) ; }
else if  ( number1 < number2 && number2 > number3) {
System.out.println("The Second Number " +number2+ " Is Largest ") ; }
else if ( number3 > number2 && number1 < number3) {
System.out.println("The Third Number " +number3+ " Is Largest ") ; }

}
}
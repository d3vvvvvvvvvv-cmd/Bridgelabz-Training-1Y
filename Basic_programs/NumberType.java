
import java.util.Scanner ;
class NumberType {
public static void main(String[] args ) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  number " ) ;
int number =  sc.nextInt() ;


if ( number > 0 ) {
System.out.println("positive") ; }
else if  ( number < 0) {
System.out.println("negative") ; }
else if ( number == 0) {
System.out.println("zero") ; }

}
}
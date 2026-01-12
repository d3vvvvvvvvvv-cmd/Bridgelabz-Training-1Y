import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle ");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.printf("Area of the circle is %.2f " ,area);

       
    }
}

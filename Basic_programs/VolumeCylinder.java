import java.util.Scanner;
class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius ");
        double r = sc.nextDouble();
        System.out.print("Enter height ");
        double h = sc.nextDouble();
        System.out.println("Volume = " + 3.14 * r * r * h);
        
    }
}

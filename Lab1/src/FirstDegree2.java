import java.util.Scanner;
// Nhu Xuan Vinh 20215170
// Giai he pt
public class FirstDegree2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lay he so
        System.out.println("Enter a1, b1, c1");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        System.out.println("Enter a1, b1, c1");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        // Tinh d, d1, d2
        double d = a1 * b2 - a2 * b1;
        double d1 = c1 * b2 - c2 * b1;
        double d2 = a1 * c2 - a2 * c1;
        if (d == 0) {
            if (a1 * c2 - a2 * c1 == 0 && a1 * c2 - a2 * c1 == 0) {
                System.out.println("Co vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        } else {
            double x = d1 / d;
            double y = d2/ d;
            System.out.println("Nghiem cua pt la: x = " + x + ", y = " + y);
        }

}
}

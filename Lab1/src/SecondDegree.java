import java.util.Scanner;
// Nhu Xuan Vinh
// Giai pt bac 2
public class SecondDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lay he so
        System.out.println("Nhap a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        // Kiem tra dieu kien he so a, b, c
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Pt co vo so nghiem");
                } else {
                    System.out.println("Pt vo nghiem");
                }
            } else {
                double solution = -c / b;
                System.out.println("Nghiem cua pt la: x=" + solution);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Pt vo nghiem");
            } else if (delta == 0) {
                double solution = -b / (2 * a);
                System.out.println("The co nghiem kep: x=" + solution);
            } else {
                double solution1 = (-b + Math.sqrt(delta)) / (2 * a);
                double solution2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Pt co 2 nghiem: x1=" + solution1 + " ,x2=" + solution2);
            }
        }
}
}

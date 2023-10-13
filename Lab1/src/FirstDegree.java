import java.util.Scanner;

public class FirstDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();

        if (a == 0) {
            if(b==0){
                System.out.println("Pt co vo so nghiem");
            }
            else{
                System.out.println("Pt vo nghiem");
            }
        } else {
            double solution = -b / a;
            System.out.println("Nghiem cua pt: x=" + solution);
        }
    }
}

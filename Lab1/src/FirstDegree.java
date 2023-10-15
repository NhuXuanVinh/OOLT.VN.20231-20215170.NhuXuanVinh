import java.util.Scanner;
// NhuXuanVinh 20215170
public class FirstDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhap he so
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        // Kiem tra dieu kien a, b
        if (a == 0) {
            if(b==0){
                // Neu a va b bang 0
                System.out.println("Pt co vo so nghiem");
            }
            else{
                // Neu a=0 va b != 0
                System.out.println("Pt vo nghiem");
            }
        } else {
            // Tinh va in ket qua
            double solution = -b / a;
            System.out.println("Nghiem cua pt: x=" + solution);
        }
    }
}

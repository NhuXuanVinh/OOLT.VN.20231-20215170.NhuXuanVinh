import java.util.Scanner;
// Nhu Xuan Vinh 20215170
public class Triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Lay chieu cao cua tam giac
        System.out.println("Enter the height of the triangle:");
        int n = scanner.nextInt();
        // In tam giac
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

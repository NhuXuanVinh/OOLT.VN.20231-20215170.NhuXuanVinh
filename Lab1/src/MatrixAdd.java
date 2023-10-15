import java.util.Scanner;
//Nhu Xuan Vinh 20215170
public class MatrixAdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,m;
        System.out.println("Nhap n va m:");
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] matrix1 = new int[50][50];
        int[][] matrix2 = new int[50][50];
        System.out.println("Nhap phan tu cua ma tran 1:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhap phan tu cua ma tran 2:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] res = new int[50][50];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Ket qua cong ma tran la:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(res[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

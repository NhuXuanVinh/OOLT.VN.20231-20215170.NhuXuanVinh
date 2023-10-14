import java.util.Scanner;
public class Sort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = scanner.nextInt();
        int[] a= new int[1000];
        System.out.println("Enter array: ");
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }

    }
}

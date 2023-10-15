import java.util.HashMap;
import java.util.Scanner;
// Nhu Xuan Vinh 20215170
public class DaysOfMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Lay thang va nam
        System.out.println("Month:");
        String month = scanner.nextLine();
        System.out.println("Year:");
        int year = scanner.nextInt();
        // Tao HashMap de luu thang va ngay tuong ung
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Jan", 31);
        map.put("Feb", 28);
        map.put("Mar", 31);
        map.put("Apr", 30);
        map.put("May", 31);
        map.put("Jun", 30);
        map.put("Jul", 31);
        map.put("Aug", 31);
        map.put("Sep", 30);
        map.put("Oct", 31);
        map.put("Nov", 30);
        map.put("Dec", 31);
        map.put("January", 31);
        map.put("February", 28);
        map.put("March", 31);
        map.put("April", 30);
        map.put("June", 30);
        map.put("July", 31);
        map.put("August", 31);
        map.put("September", 30);
        map.put("October", 31);
        map.put("November", 30);
        map.put("December", 31);
        map.put("Jan.", 31);
        map.put("Feb.", 28);
        map.put("Mar.", 31);
        map.put("Apr.", 30);
        map.put("May.", 31);
        map.put("Jun.", 30);
        map.put("Jul.", 31);
        map.put("Aug.", 31);
        map.put("Sep.", 30);
        map.put("Oct.", 31);
        map.put("Nov.", 30);
        map.put("Dec.", 31);
        // Kiem tra dieu kiem nam
        if(year % 4 != 0){
            // Nam thuong
            System.out.println(map.get(month));
        }
        else {
            if (month.equals("Feb")) {
                if (year % 100 == 0 && year % 400 != 0){
                    System.out.println(map.get(month));
                } else {
                System.out.println("29");
                }
            }
            else{
                System.out.println(map.get(month));
            }
        }
    }

}

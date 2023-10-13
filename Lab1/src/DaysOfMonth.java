import java.util.HashMap;
import java.util.Scanner;
public class DaysOfMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month:");
        String month = scanner.nextLine();
        System.out.println("Year:");
        int year = scanner.nextInt();
        month = month.substring(0, 3);
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

        if(year % 4 != 0){
            System.out.println(map.get(month));
        }
        else{
            if(month.equals("Feb")){
                if(year % 100 == 0 && year %400 !=0){
                    System.out.println(map.get(month));
                }
                else{
                    System.out.println("29");
                }
            }
        }



    }
}

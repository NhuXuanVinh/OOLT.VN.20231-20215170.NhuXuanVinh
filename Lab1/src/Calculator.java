import javax.swing.JOptionPane;
//Nhu Xuan Vinh 20215170
public class Calculator {
    public static void main(String[] args) {
        // Lay bien tu nguoi dung
        String snum1 = JOptionPane.showInputDialog("Enter first number: ");
        String snum2 = JOptionPane.showInputDialog("Enter second number: ");

        // Chuyen tu String sang double
        double num1 = Double.parseDouble(snum1);
        double num2= Double.parseDouble(snum2);
        //In ket qua
        System.out.println("Sum: " +  (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1*num2));
        // Neu num2 = 0 hien thi loi
        if (num2 != 0) {
            System.out.println("Quotient: " + (num1/num2));
        }
        else {
            System.out.println("Cannot divide by zero");
        }
        System.exit(0);
    }
}

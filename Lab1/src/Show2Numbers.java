import javax.swing.JOptionPane;
// Nhu Xuan Vinh 20215170
public class Show2Numbers {
    public static void main(String[] args) {
        // Khai bao bien
        String strNum1,strNum2;
        String strNotification = "you've just entered: ";
        // Nguoi dung nhap bien
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number:",
                "Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Please in put the second number",
                "Input the second number",JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        // Hien thi ket qua
        JOptionPane.showMessageDialog(null, strNotification, "Show two number", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
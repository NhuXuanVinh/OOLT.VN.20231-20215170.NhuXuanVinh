import javax.swing.JOptionPane;
//Nhu Xuan Vinh 20215170
public class HelloNameDialog{
    public static void main(String[] args){
        // Khai bao bien
        String name;
        // Hien thi Input Dialog
        name = JOptionPane.showInputDialog("Enter your name: ");
        // Hien thi Message Dialog
        JOptionPane.showMessageDialog(null, "Hi " + name + "!");
        System.exit(0);
    }
}
import javax.swing.JOptionPane;
// Nhu Xuan Vinh 20215170
public class ChoosingOption {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to chane to the first ticket");
        JOptionPane.showMessageDialog(null, "You've chosen: "
        + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}

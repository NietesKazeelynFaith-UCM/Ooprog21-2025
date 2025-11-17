import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {

    public static void main(String[] args) {
        while (true) {
                       String name = JOptionPane.showInputDialog("Enter your name:");

                        if (name == null || name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No name entered. Let's try again.");
                          continue;
                            }
                              
                       int response = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown?", 
                                                          "Confirm Name Display", JOptionPane.YES_NO_OPTION);
                           
           
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break;
            }
                       else {
                JOptionPane.showMessageDialog(null, "Let's try again.");
            }
        }
    }
}
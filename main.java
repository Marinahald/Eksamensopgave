import javax.swing.ImageIcon;
import org.json.simple.JSONObject;

public class Main{
public static void main(String[] args) {    
       /*SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                desktopPet pet = new desktopPet();
                pet.setVisible(true);
                AssignmentReminder ar = new AssignmentReminder();

                pet.setIcon(new ImageIcon("angycat.png"));
            }
        }); */
        JSONObject
        desktopPet pet = new desktopPet();
        pet.setVisible(true);
        AssignmentReminder ar = new AssignmentReminder();

        pet.setIcon(new ImageIcon("angycat.png"));

}}
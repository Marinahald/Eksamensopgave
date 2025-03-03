import javax.swing.*;
import java.awt.*;




public class desktopPet{
   // private JFrame f;
   Container c;
    BackgroundPanel pet;

    public desktopPet() {
        c = getContentPane();
       // setUndecorated(true);
	//	setBackground(new Color(0,0,0,0));

        pet = new BackgroundPanel(image("tempcat.png"));

        setSize(260, 260);
		setLocation(650, 350);
        /* 
        f = new JFrame();
        f.isUndecorated();
       f.setSize(200, 300);
       f.setVisible(true);
       f.setBackground(null);
       */

      
    }
}
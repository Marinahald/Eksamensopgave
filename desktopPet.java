import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;




public class desktopPet extends JFrame{
   // private JFrame f;
   
    Container c;
    BackgroundPanel pet;

    public desktopPet() {
        c = getContentPane();
        setUndecorated(true);
		setBackground(new Color(0,0,0,0));

        pet = new BackgroundPanel(new ImageIcon("tempcat.png"));
        pet.setBackground(new Color(0,0,0,0));

        setSize(260, 260);
		setLocation(650, 350);
        /* 
        f = new JFrame();
        f.isUndecorated();
       f.setSize(200, 300);
       f.setVisible(true);
       f.setBackground(null);
       */
      c.add(pet);
      
    }

    class BackgroundPanel extends JPanel{
		ImageIcon icon;
		
		public BackgroundPanel(ImageIcon icon) {
			this.icon = icon;
		}

		public void setIcon(ImageIcon icon) {
			this.icon = icon;
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (this.icon != null) {
				g.drawImage(icon.getImage(),0,0,this);
			}
			
			
		}
		
		
	}
}
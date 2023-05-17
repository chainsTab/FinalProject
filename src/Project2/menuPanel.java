package Project2;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class menuPanel extends JFrame {
    JLabel menu = new JLabel();
    JLabel images = new JLabel();
    JLabel images2 = new JLabel();
    JLabel images3 = new JLabel();
    ImageIcon icon = new ImageIcon("logo.png");
    ImageIcon image = new ImageIcon("image-removebg-preview (2).png");
    ImageIcon image1 = new ImageIcon("Food3.jpg");
    ImageIcon image5 = new ImageIcon("Food6.jpg");

    menuPanel() {
        menuBar buttons = new menuBar();

        this.images3.setIcon(this.image5);
        this.images3.setVerticalAlignment(1);
        this.images3.setHorizontalAlignment(0);
        this.images3.setBounds(750, 150, 290, 465);
        this.images3.setVisible(true);

        this.images2.setIcon(this.image1);
        this.images2.setVerticalAlignment(1);
        this.images2.setHorizontalAlignment(0);
        this.images2.setBounds(25, 150, 325, 465);
        this.images2.setVisible(true);

        this.images.setIcon(this.image);
        this.images.setVerticalAlignment(1);
        this.images.setHorizontalAlignment(0);
        this.images.setBounds(230, 150, 636, 465);
        this.images.setVisible(true);

        this.menu.setVisible(true);
        this.menu.setIcon(this.icon);
        this.menu.setVerticalAlignment(1);
        this.menu.setHorizontalAlignment(0);
        this.menu.setBounds(230, 0, 636, 425);
        this.setIconImage(this.icon.getImage());
        this.setTitle("Event.io");
        this.setVisible(true);
        this.setSize(1080, 720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(buttons);
        this.add(this.menu);
        this.add(this.images);
        this.add(this.images2);
        this.add(this.images3);
        this.getContentPane().setBackground(new Color(1193046));
        this.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(3);
    }
}


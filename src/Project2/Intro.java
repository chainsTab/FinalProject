package Project2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Intro extends JLabel {

    Intro() {
        ImageIcon logo = new ImageIcon("logo.png");
        this.setText("Your Choice, Our Move");
        this.setIcon(logo);
        this.setVerticalAlignment(1);
        this.setHorizontalAlignment(0);
        this.setVerticalTextPosition(3);
        this.setHorizontalTextPosition(0);
        this.setForeground(new Color(16777215));
        this.setFont(new Font("Times New Roman", 1, 45));
        this.setIconTextGap(0);
        this.setBounds(230, 150, 636, 500);
        this.setVisible(true);
    }
}

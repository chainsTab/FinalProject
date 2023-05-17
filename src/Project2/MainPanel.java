package Project2;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainPanel extends JFrame implements ActionListener {
    JButton button = new JButton();
    Intro intro = new Intro();
    JLabel label =new JLabel();

    MainPanel(Color bg,int W, int H) {

        button.setBounds(225, 400, 650, 100);
        button.setHorizontalAlignment(0);
        button.setText("Book Reservation");
        button.setFont(new Font("Times New Roman", 1, 40));
        button.setForeground(new Color(250, 250, 250));
        button.setBackground(new Color(178, 34, 34));
        button.setFocusable(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.addActionListener(this);
        this.setTitle("Event.io");
        this.setVisible(true);
        this.setSize(W, H);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(button);
        this.add(intro);
        this.add(label);
        this.getContentPane().setBackground(bg);
        this.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button) {
//            ADMINCHECKER checker = new ADMINCHECKER();
//            checker.check();
            this.dispose();
            new menuPanel();

        }
    }
}
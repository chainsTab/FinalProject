import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

public class Date {

    public static void main(String[] args) {

        JDateChooser date = new JDateChooser();

        JFrame frame = new JFrame();

        date.setBounds(10,10,100,20);
        date.setVisible(true);
        frame.add(date);

        frame.setSize(1080,740);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout((LayoutManager) null);
        frame.setVisible(true);

    }
}
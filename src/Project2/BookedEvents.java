package Project2;

import javax.swing.*;
import java.util.Arrays;

public class BookedEvents {

    static String[] names = new String[]{"Number of Costumers", "Name", "Address", "Email", "Contact Number", "Type of Event", "Date"};
    String[][] datas = new String[1000][7];
    BookedEvents(){

        JTable table = new JTable(datas, names);
        JFrame frame = new JFrame();

        frame.add(new JScrollPane(table));

       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1080,740);
       frame.setLocationRelativeTo(null);
    }

}

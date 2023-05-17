package Project2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class menuBar extends JPanel implements ActionListener {
    JButton about = new JButton("About us");
    JButton book = new JButton("Book Reservation");
    JButton events = new JButton("Booked Events");
    JButton cancel = new JButton("Cancel Plans");

    menuBar() {
        this.about.setVisible(true);
        this.about.setFocusable(false);
        this.about.addActionListener(this);
        this.book.setVisible(true);
        this.book.setFocusable(false);
        this.book.addActionListener(this);
        this.events.setVisible(true);
        this.events.setFocusable(false);
        this.events.addActionListener(this);

        this.cancel.setVisible(true);
        this.cancel.setFocusable(false);
        this.cancel.addActionListener(this);
        this.setVisible(true);
        this.setBackground((Color)null);
        this.add(this.about);
        this.add(this.book);
        this.add(this.events);
        this.add(this.cancel);
        this.setBounds(0, 150, 1080, 100);
        this.setLayout(new FlowLayout(1, 10, 10));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.about) {
            new aboutus();
        }
        else if(e.getSource() == this.cancel){

            new Cancellation();

        }
        else if(e.getSource() == this.book){
//                new BookReservation();
            new Contact_Details();
        }
        else if(e.getSource() == this.events){
            new BookedEvents();
        }
    }

}

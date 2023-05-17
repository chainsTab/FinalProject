package Project2;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.GlyphVector;

public class Contact_Details implements ActionListener{

    JFrame frame = new JFrame();
    JButton button_proceed = new JButton();


    JTextField text_name = new JTextField();
    JTextField text_address = new JTextField();
    JTextField text_email = new JTextField();
    JTextField text_contact = new JTextField();
    JTextField text_dateEvent = new JTextField();


    JDateChooser date = new JDateChooser();

    Contact_Details(){

            /********************* label set-up *********************/
            JLabel label_1m = new JLabel();
            JLabel label_2m = new JLabel();
            JLabel label_3m = new JLabel();
            JLabel label_name = new JLabel();
            JLabel label_address = new JLabel();
            JLabel label_email = new JLabel();
            JLabel label_contact = new JLabel();
            JLabel label_eventType = new JLabel();
            JLabel label_dateEvent = new JLabel();

            label_1m.setText("EVENT");
            label_1m.setForeground(new Color(0XFFFFFF));
            label_1m.setBounds(420, 15, 1000, 100);
            label_1m.setFont(new Font("Times New Roman", Font.PLAIN, 40));

            label_2m.setText("IO");
            label_2m.setForeground(new Color(0XFFFFFF));
            label_2m.setBounds(549, 10, 1000, 100);
            label_2m.setFont(new Font("Times New Roman", Font.BOLD, 60));

            label_3m.setText("Contact Details");
            label_3m.setBounds(463, 59, 1000, 100);
            label_3m.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            label_3m.setForeground(Color.white);

            label_name.setText(" Name: ");
            label_name.setForeground(new Color(0XFFFFFF));
            label_name.setBounds(50, 110, 1000, 100);
            label_name.setFont(new Font("Times New Roman", Font.PLAIN, 20));


            label_address.setText(" Address: ");
            label_address.setForeground(new Color(0XFFFFFF));
            label_address.setBounds(50, 190, 1000, 100);
            label_address.setFont(new Font("Times New Roman", Font.PLAIN, 20));

            label_email.setText(" Email: ");
            label_email.setForeground(new Color(0XFFFFFF));
            label_email.setBounds(50, 270, 1000, 100);
            label_email.setFont(new Font("Times New Roman", Font.PLAIN, 20));

            label_contact.setText(" Contact Number: ");
            label_contact.setForeground(new Color(0XFFFFFF));
            label_contact.setBounds(50, 348, 1000, 100);
            label_contact.setFont(new Font("Times New Roman", Font.PLAIN, 20));

            label_eventType.setText(" Event Type: ");
            label_eventType.setForeground(new Color(0XFFFFFF));
            label_eventType.setBounds(50, 425, 1000, 100);
            label_eventType.setFont(new Font("Times New Roman", Font.PLAIN, 20));

            label_dateEvent.setText(" Date of Event[dd-MMM-yyyy HH:mm]: ");
            label_dateEvent.setForeground(new Color(0XFFFFFFF));
            label_dateEvent.setBounds(50, 502, 1000, 100);
            label_dateEvent.setFont(new Font("Times New Roman", Font.PLAIN, 20));

            /********************* Text set-up *********************/

            text_name.setBounds(50, 176, 980, 40);
            text_name.setBackground(Color.WHITE);
            text_name.setFont(new Font(" Arial", Font.BOLD, 20));
            text_name.setForeground(Color.BLACK);
            String name = text_name.getText();
            System.out.println("Name: " + name);

            text_address.setBounds(50, 254, 980, 40);
            text_address.setBackground(Color.WHITE);
            text_address.setFont(new Font(" Arial", Font.BOLD, 20));
            text_address.setForeground(Color.BLACK);


            text_email.setBounds(50, 334, 980, 40);
            text_email.setBackground(Color.WHITE);
            text_email.setFont(new Font(" Arial", Font.BOLD, 20));
            text_email.setForeground(Color.BLACK);


            text_contact.setBounds(50, 414, 980, 40);
            text_contact.setBackground(Color.WHITE);
            text_contact.setFont(new Font(" Arial", Font.BOLD, 20));
            text_contact.setForeground(Color.BLACK);

            date.setBounds(50, 568, 980, 40);
            date.setBackground(Color.WHITE);
            date.setFont(new Font(" Arial", Font.BOLD, 20));

            /********************* Panel set-up 3rd message *********************/
            JPanel panel_3m = new JPanel();
            panel_3m.setBounds(420, 89, 200, 40);
            panel_3m.setBackground(new Color(221, 75, 75));

            /********************* Panel set-up of Event Type *********************/
            JPanel panel_EventType = new JPanel();
            panel_EventType.setBounds(50, 490, 980, 40);
            panel_EventType.setBackground(Color.lightGray);
            panel_EventType.setLayout(new BorderLayout());

            String[] eventTypes = {" ", "Birthday Event", "Wedding Event", "Corporate Event", "Anniversary Event",
                    "Corporate Event"};

            JComboBox<String> comboBox_eventype = new JComboBox<String>(eventTypes);
            comboBox_eventype.setSize(990, 45);
            comboBox_eventype.setFont(new Font(" Arial", Font.BOLD, 20));
            comboBox_eventype.setForeground(Color.BLACK);
            comboBox_eventype.setBackground(Color.white);

            panel_EventType.add(comboBox_eventype, BorderLayout.CENTER);

            /********************* Panel set-up Date Event *********************/


            /********************* Button set-up *********************/

            button_proceed.addActionListener(this);
            button_proceed.setBounds(382, 640, 300, 40);
            button_proceed.setText("Proceed");
            button_proceed.setFont(new Font("Arial", Font.BOLD, 22));
            button_proceed.setBackground(Color.lightGray);
            frame.add(button_proceed);

            /********************* Frame set-up *********************/

            frame.getContentPane().setBackground(new Color(1193046));
            frame.setSize(1080, 740); // dimension
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            //********************* Add to frame set-up *********************/
            //labels
            frame.add(label_1m);
            frame.add(label_2m);
            frame.add(label_3m);
            frame.add(label_name);
            frame.add(label_address);
            frame.add(label_email);
            frame.add(label_contact);
            frame.add(label_eventType);
            frame.add(label_dateEvent);

            //panels
            frame.add(panel_3m);
            frame.add(panel_EventType);

            //text
            frame.add(text_name);
            frame.add(text_address);
            frame.add(text_email);
            frame.add(text_contact);
            frame.add(date);


            //button

            frame.setLayout(null);
            frame.setVisible(true);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_proceed){
                        frame.dispose();
                        new Overview();
                }
        }

        public class Overview implements ActionListener{

            static int total1 = 23434;
            static int percent50 = (int) (23434 * 0.50);
        JFrame frame = new JFrame();
            JLabel event = new JLabel("EVENT");
            JLabel io = new JLabel("IO");
            JLabel overview = new JLabel("Overview");
            JLabel pay = new JLabel("Total Payment: ");
            JLabel fiftyPercent = new JLabel("<html><br/>Upon booking costumers are required to pay 50% of the total amount <br/><br/>" +
                                "50% total amount worth:  ");
            JLabel payment = new JLabel("Payment Options: ");

            JButton total = new JButton("P " + total1);
            JButton percent = new JButton("P " + percent50);

            JPanel panel = new JPanel();
            JPanel panel1 = new JPanel();

            JScrollPane scroll = new JScrollPane();
            JTextArea textArea = new JTextArea();

            JComboBox paymentList;
            Overview(){

                payment.setBounds(575,400,1000,40);
                payment.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                payment.setForeground(new Color(0xFFFFFF));
                frame.add(payment);

                String[] lists = {"Paymaya", "GCash"};

                paymentList = new JComboBox(lists);
                paymentList.setBounds(575,450,400,50);
                paymentList.addActionListener(this);
                frame.add(paymentList);

                percent.setBounds(710, 325,200, 40);
                frame.add(percent);

                fiftyPercent.setBounds(575,225,1000,100);
                fiftyPercent.setFont(new Font("Arial", Font.PLAIN, 15));
                fiftyPercent.setForeground(new Color(0xFFFFFF));
                frame.add(fiftyPercent);

                total.setBounds(710,200,200,40);
                frame.add(total);

                pay.setBounds(720,150, 1000,50);
                pay.setFont(new Font("Times New Roman", Font.PLAIN,30));
                pay.setForeground(new Color(0xFFFFFF));
                frame.add(pay);

                scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                scroll.setBounds(20,175,500,400);
                scroll.getViewport().setBackground(Color.LIGHT_GRAY);

                textArea.setBounds(20,175,500,400);
                textArea.setBorder(new LineBorder(Color.BLACK));

                scroll.getViewport().add(textArea);

                frame.add(scroll);

                event.setText("EVENT");
                event.setForeground(new Color(0XFFFFFF));
                event.setBounds(420, 10, 1000, 100);
                event.setFont(new Font("Times New Roman", Font.PLAIN, 40));
                frame.add(event);

                io.setText("IO");
                io.setForeground(new Color(0XFFFFFF));
                io.setBounds(549, 5, 1000, 100);
                io.setFont(new Font("Times New Roman", Font.BOLD, 60));
                frame.add(io);

                overview.setText("Overview");
                overview.setBounds(478, 54, 1000, 100);
                overview.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                overview.setForeground(Color.white);
                frame.add(overview);

                panel.setBounds(420, 84, 200, 40);
                panel.setBackground(new Color(221, 75, 75));
                frame.add(panel);

                panel1.setBackground(new Color(0x5C469C));
                panel1.setBounds(550,150,500,550);
                panel1.setVisible(true);
                frame.add(panel1);

                frame.setSize(1080, 740);
                frame.setLocationRelativeTo(null);
                frame.getContentPane().setBackground(new Color(1193046));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(null);
                frame.setVisible(true);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == paymentList){
                    if(paymentList.getSelectedIndex() == 0) {
                        new Payment1();

                    }else if(paymentList.getSelectedIndex() == 1){
                        String CashNumber = JOptionPane.showInputDialog(null, "Enter Number: ", "Payment " + paymentList.getSelectedItem(), JOptionPane.QUESTION_MESSAGE);
                    }

                }
            }
        }

    public static class Payment1 extends JFrame{

        JLabel label1 = new JLabel();
        JPanel panel1 = new JPanel();
        JTextField number = new JTextField();
        Payment1(){

            number.setBounds(120,80,300,40);
            number.setText("# ");
            this.add(number);

            label1.setText("Enter Number");
            label1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
            label1.setForeground(new Color(0xFFFFFF));
            panel1.add(label1);

            panel1.setBounds(20,20,490,160);
            panel1.setBackground(Color.GRAY);
            panel1.setVisible(true);
            this.add(panel1);

            this.setTitle("Payment Type: PAYMAYA");
            this.setSize(540,240);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setVisible(true);


        }

    }
}

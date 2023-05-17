//package Project2;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class BookReservation {
//    JButton next = new JButton("Next");
//
//    JPanel catering = new JPanel();
//    JPanel addons = new JPanel();
//    JPanel destination = new JPanel();
//    JLabel logo = new JLabel();
//    ImageIcon icon = new ImageIcon("EVENTIOicon.png");
//
//    JTextField ratecost;
//    JTextField Tfees;
//
//    JComboBox rates;
//    JComboBox fees;
//    private int pax;
//
//    BookReservation(){
//
//            //start of catering Panel
//            JLabel subtitle = new JLabel("Catering");
//            JLabel description = new JLabel("<html><p>Inclusions:<br>" + "Your choice of<br>" + "1 soup w/ FREE croutons<br>" +
//                    "5 main dishes<br>" + "1 Dessert or Salad<br>" + "Package with rice and one round of softdrink<p><html>");
//            JLabel pax = new JLabel("PAX(Person per serving)");
//            JLabel cost = new JLabel("Rate cost:");
//
//            cost.setBounds(10, 150, 200, 100);
//            cost.setFont(new Font("Times New Roman", Font.BOLD,18));
//            cost.setForeground(Color.yellow);
//
//            pax.setBounds(10, 70, 200, 100);
//            pax.setFont(new Font("Times New Roman", Font.BOLD,18));
//            pax.setForeground(Color.yellow);
//
//            description.setBounds(10, 250, 200, 200);
//            description.setFont(new Font("Times New Roman",Font.BOLD,18));
//            description.setForeground(Color.yellow);
//
//            subtitle.setFont(new Font("Times New Roman",Font.BOLD,30));
//            subtitle.setForeground(Color.yellow);
//            subtitle.setBounds(100, 10, 120, 50);
//
//            //combobox
//            Integer[] CRates = {0,30,50,75,100};
//            rates = new JComboBox(CRates);
//            rates.setFont(new Font("Time New Roman",Font.PLAIN,18));
//            rates.setBounds(10, 130, 100, 30);
//            rates.addActionListener(this);
//            //JTextField
//            ratecost = new JTextField();
//            ratecost.setEditable(false);
//            ratecost.setPreferredSize(new Dimension(250,40));
//            ratecost.setBounds(10, 210, 100, 30);
//            ratecost.setFont(new Font("Time New Roman",Font.PLAIN,18));
//            ratecost.setText("₱0.00");
//            ratecost.setBackground(Color.black);
//            ratecost.setForeground(Color.yellow);
//
//            catering.add(cost);
//            catering.add(pax);
//            catering.add(ratecost);
//            catering.add(subtitle);
//            catering.add(description);
//            catering.add(rates);
//            catering.setLayout(null);
//            catering.setVisible(true);
//            catering.setBounds(50, 150, 300, 450);
//            catering.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.yellow)));
//            catering.setBackground(Color.black);
//            //end of catering Panel
//
//            //start of destination Panel
//            JLabel subtitle3 = new JLabel("Destination Rates:");
//            subtitle3.setFont(new Font("Times New Roman", Font.BOLD, 30));
//            subtitle3.setForeground(Color.white);
//            subtitle3.setBounds(30, 0, 250, 30);
//
//            JLabel location = new JLabel("Event Location:");
//            location.setFont(new Font("Times New Roman", Font.BOLD,18));
//            location.setForeground(Color.white);
//            location.setBounds(10, 100, 200, 30);
//
//            JLabel Tcharge = new JLabel("Transportation Charge:");
//            Tcharge.setBounds(10, 150, 200, 100);
//            Tcharge.setFont(new Font("Times New Roman", Font.BOLD,18));
//            Tcharge.setForeground(Color.white);
//
//            //comboBox
//            String[] loc = {"(SELECT AREA)", "Lapu-Lapu Area", "Mandaue Area", "Cebu City Area", "Consolacion Area", "Talisay Area"};
//            fees = new JComboBox(loc);
//            fees.setFont(new Font("Time New Roman",Font.PLAIN,18));
//            fees.setBounds(10, 130, 200, 30);
//            fees.addActionListener(this);
//
//            Tfees = new JTextField();
//            Tfees.setEditable(false);
//            Tfees.setPreferredSize(new Dimension(250,40));
//            Tfees.setBounds(10, 210, 100, 30);
//            Tfees.setFont(new Font("Time New Roman",Font.PLAIN,18));
//            Tfees.setText("₱0.00");
//            Tfees.setBackground(Color.pink);
//            Tfees.setForeground(Color.white);
//
//            JLabel description2 = new JLabel("<html><p>Note*<br>" + "Venue is discussed over the phone<p><html>");
//            description2.setBounds(10, 250, 200, 200);
//            description2.setFont(new Font("Times New Roman",Font.BOLD,18));
//            description2.setForeground(Color.white);
//
//            destination.add(description2);
//            destination.add(Tfees);
//            destination.add(fees);
//            destination.add(Tcharge);
//            destination.add(location);
//            destination.add(subtitle3);
//            destination.setLayout(null);
//            destination.setVisible(true);
//            destination.setBounds(380, 150, 300, 450);
//            destination.setBackground(Color.pink);
//
//            //addons Panel
//            JLabel subtitle2 = new JLabel("Optional Add-ons");
//
//            subtitle2.setFont(new Font("Times New Roman",Font.BOLD,30));
//            subtitle2.setForeground(Color.black);
//
//            addons.add(subtitle2);
//            addons.setVisible(true);
//            addons.setBounds(716, 150, 300, 450);
//            addons.setBackground(Color.white);
//
//
//            logo.setVisible(true);
//            logo.setIcon(icon);
//            logo.setVerticalAlignment(JLabel.TOP);
//            logo.setHorizontalAlignment(JLabel.CENTER);
//            logo.setBounds(230, 0, 636, 425);
//
//            next.addActionListener(this);
//            next.setFont(new Font("Times New Roman",Font.BOLD,30));
//            next.setBounds(460, 620, 100, 30);
//            next.setEnabled(false);
//
//            this.setIconImage(icon.getImage());
//            this.setTitle("Event.io");
//            this.setVisible(true);
//            this.setSize(1080, 720);
//            this.setResizable(false);
//            this.getContentPane().setBackground(new Color(0x123456));
//            this.add(next);
//            this.add(addons);
//            this.add(destination);
//            this.add(catering);
//            this.add(logo);
//            this.setLayout(null);
//            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        }
//        //next window
//        public void booking2(){
//
//        }
//
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            //actions performed combobox inside the catering Panel
//            if(e.getSource()==rates)
//            {
//                //CATERING COMBOBOX
//                if(30 == (int)rates.getSelectedItem())
//                {
//                    ratecost.setText("₱18,000.00");
//                    next.setEnabled(true);
//                }
//                if(50 == (int)rates.getSelectedItem())
//                {
//                    ratecost.setText("₱23,000.00");
//                    next.setEnabled(true);
//                }
//                if(75 == (int)rates.getSelectedItem())
//                {
//                    ratecost.setText("₱28,000.00");
//                    next.setEnabled(true);
//                }
//                if(100 == (int)rates.getSelectedItem())
//                {
//                    ratecost.setText("₱35,000.00");
//                    next.setEnabled(true);
//                }
//                if(0 == rates.getSelectedIndex())
//                {
//                    ratecost.setText("₱0.00");
//                    next.setEnabled(false);
//
//                }
//            }
//
//            //actions performed inside the Destinatin Panel
//            if(e.getSource() == fees)
//            {
//                //Destination
//                if("Lapu-Lapu Area" == fees.getSelectedItem())
//                {
//                    Tfees.setText("₱1,500.00");
//                    next.setEnabled(true);
//                }
//                if("Mandaue Area" == fees.getSelectedItem())
//                {
//                    Tfees.setText("₱2,500.00");
//                    next.setEnabled(true);
//                }
//                if("Cebu City Area" == fees.getSelectedItem())
//                {
//                    Tfees.setText("₱3,000.00");
//                    next.setEnabled(true);
//                }
//                if("Consolacion Area" == fees.getSelectedItem())
//                {
//                    Tfees.setText("₱4,000.00");
//                    next.setEnabled(true);
//                }
//                if("Talisay Area" == fees.getSelectedItem())
//                {
//                    Tfees.setText("₱2,500.00");
//                    next.setEnabled(true);
//
//                }
//                if(0 == fees.getSelectedIndex())
//                {
//                    Tfees.setText("₱0.00");
//                    next.setEnabled(false);
//                }
//            }
//
//            if(e.getSource()== next){
//                //DATABASE INSERT DATA
//                try {
//                    Databasehandler submit = new Databasehandler();
//                    submit.insertData();
//                } catch (SQLException ex) {
//                    Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
////        /***********  Label setting ***********/
////        JLabel label_1m = new JLabel();
////        label_1m .setText(" EVENT ");
////        label_1m .setBounds(390, 15,1000,100);
////        label_1m .setFont(new Font( "Times New Roman", Font.PLAIN, 40));
////
////        JLabel label_2m = new JLabel();
////        label_2m .setText(" IO ");
////        label_2m .setBounds(549, 10,1000,100);
////        label_2m .setFont(new Font("Times New Roman", Font.BOLD, 60));
////
////        JLabel label_3m = new JLabel();
////        label_3m.setText(" Service Offer ");
////        label_3m .setBounds(460, 59,1000,100);
////        label_3m .setFont(new Font("Times New Roman", Font.PLAIN, 20));
////        label_3m.setForeground(Color.white);
////
////        JLabel label_rates = new JLabel();
////        label_rates.setText(" Rate:");
////        label_rates.setBounds(105, 207, 670, 60);
////        label_rates.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        JLabel label_Inclusion = new JLabel();
////        label_Inclusion.setText(" Inclusion:");
////        label_Inclusion.setBounds(105, 267, 670, 60);
////        label_Inclusion.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        JLabel label_Styling = new JLabel();
////        label_Styling.setText(" Styling:");
////        label_Styling.setBounds(105, 327, 670, 60);
////        label_Styling.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        JLabel label_LightSound = new JLabel();
////        label_LightSound.setText(" Light & Sound:");
////        label_LightSound.setBounds(105, 386, 670, 60);
////        label_LightSound.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        JLabel label_OtherRental = new JLabel();
////        label_OtherRental.setText(" Other Rental:");
////        label_OtherRental.setBounds(105, 448, 670, 60);
////        label_OtherRental.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        /***********  Panel setting ***********/
////        JPanel panel_3m = new JPanel();
////        panel_3m.setBounds(415, 89,200,40);
////        panel_3m.setBackground(new Color(221,75, 75));
////
////        JPanel panel_messages = new JPanel();
////        panel_messages.setBounds(100, 200, 870, 300 );
////        panel_messages.setBackground(new Color(255, 255, 153));
////
////        /***********  Textfield setting ***********/
////        JTextField textField_rate = new JTextField();
////        textField_rate.setBounds(260, 200, 709, 60);
////        textField_rate.setBackground(new Color(255, 255, 153));
////        textField_rate.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        JTextField textField_Inclusion = new JTextField();
////        textField_Inclusion.setBounds(260, 260, 709, 60);
////        textField_Inclusion.setBackground(new Color(255, 255, 153));
////        textField_Inclusion.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        JTextField textField_Styling = new JTextField();
////        textField_Styling.setBounds(260, 320, 709, 60);
////        textField_Styling.setBackground(new Color(255, 255, 153));
////        textField_Styling.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        JTextField textField_LightSound = new JTextField();
////        textField_LightSound.setBounds(260, 380, 709, 60);
////        textField_LightSound.setBackground(new Color(255, 255, 153));
////        textField_LightSound.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        JTextField textField_OtherRental = new JTextField();
////        textField_OtherRental.setBounds(260, 440, 709, 60);
////        textField_OtherRental.setBackground(new Color(255, 255, 153));
////        textField_OtherRental.setFont(new Font( "Times New Roman", Font.PLAIN, 24));
////
////        /***********  Button setting ***********/
////        JButton button_proceed = new JButton();
////        button_proceed.setBounds(105, 558, 350, 40);
////        button_proceed.setText("Proceed");
////        button_proceed.setFont(new Font("Arial", Font.BOLD, 22));
////        button_proceed.setBackground(new Color(0, 242, 222));
////
////        JButton button_return = new JButton();
////        button_return.setBounds(623, 558, 350, 40);
////        button_return.setText("Return");
////        button_return.setFont(new Font("Arial", Font.BOLD, 22));
////        button_return.setBackground(Color.lightGray);
////
////
////
////        /***********  Frame setting ***********/
////        JFrame frame_serviceOffer = new JFrame();
////        frame_serviceOffer.setSize(1080, 740);
////        frame_serviceOffer.setLocationRelativeTo(null);
////        frame_serviceOffer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame_serviceOffer.setLayout(null);
////
////        frame_serviceOffer.add(label_1m);
////        frame_serviceOffer.add(label_2m);
////        frame_serviceOffer.add(label_3m);
////        frame_serviceOffer.add(label_rates);
////        frame_serviceOffer.add(label_Inclusion);
////        frame_serviceOffer.add(label_Styling);
////        frame_serviceOffer.add(label_LightSound);
////        frame_serviceOffer.add(label_OtherRental);
////
////        frame_serviceOffer.add(panel_3m);
////        frame_serviceOffer.add(panel_messages);
////
////        frame_serviceOffer.add(textField_rate);
////        frame_serviceOffer.add(textField_Inclusion);
////        frame_serviceOffer.add(textField_Styling);
////        frame_serviceOffer.add(textField_LightSound);
////        frame_serviceOffer.add(textField_OtherRental);
////
////        frame_serviceOffer.add(button_proceed);
////        frame_serviceOffer.add(button_return);
////        frame_serviceOffer.setVisible(true);
//    }
//}

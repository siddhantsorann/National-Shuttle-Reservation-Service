package project_gomo_updating;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * project_gomo_3.java
 *
 * Created on Jul 25, 2013, 1:07:10 PM
 */
/**
 *
 * @author Student
 */
import project_gomo_updating.project_gomo_2;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class project_gomo_3 extends javax.swing.JFrame {
 String address;
    /** Creates new form project_gomo_3 */
    public project_gomo_3() {
        initComponents();
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            cd.setVisible(false);
            cm.setVisible(false);
            t1.setVisible(false);
            t2.setVisible(false);
            t4.setVisible(false);
            t5.setVisible(false);
            r1.setVisible(false);
            r2.setVisible(false);
            jButton6.setVisible(false);
            jButton5.setVisible(false);
            jLabel18.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            jLabel14.setVisible(false);
            jLabel15.setVisible(false);
            jLabel17.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        rb2 = new javax.swing.JRadioButton();
        ca = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cd1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        d3 = new javax.swing.JComboBox();
        rb1 = new javax.swing.JRadioButton();
        d2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        d1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        r1 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t5 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        cm = new javax.swing.JComboBox();
        t4 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        cd = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        r2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1365, 710));

        jPanel1.setLayout(null);

        jTabbedPane2.setMinimumSize(new java.awt.Dimension(1365, 701));

        jInternalFrame2.getContentPane().setLayout(null);

        jPanel4.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Departure Station:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 10, 120, 20);

        buttonGroup3.add(rb2);
        rb2.setText("I-Ticket");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        jPanel4.add(rb2);
        rb2.setBounds(310, 110, 90, 23);

        ca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delhi", "Mumbai", "Bangalore", "Chennai", "Hyderabad", "Kolkata" }));
        ca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                caFocusLost(evt);
            }
        });
        jPanel4.add(ca);
        ca.setBounds(170, 40, 196, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Date of travel:");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(30, 80, 110, 17);

        cd1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delhi", "Mumbai", "Bangalore", "Chennai", "Hyderabad", "Kolkata" }));
        jPanel4.add(cd1);
        cd1.setBounds(170, 10, 196, 20);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Arrival Station:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(30, 30, 120, 30);

        jButton7.setText("See Trains");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(120, 150, 150, 23);

        d3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2013", "2014" }));
        jPanel4.add(d3);
        d3.setBounds(320, 80, 60, 20);

        buttonGroup3.add(rb1);
        rb1.setText("E-Ticket");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        jPanel4.add(rb1);
        rb1.setBounds(180, 110, 100, 23);

        d2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        jPanel4.add(d2);
        d2.setBounds(170, 80, 70, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Address :");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(50, 210, 57, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("House Number :");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(50, 240, 110, 17);
        jPanel4.add(jTextField2);
        jTextField2.setBounds(230, 240, 223, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText("Street/ Colony :");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(50, 270, 100, 20);

        d1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" }));
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });
        jPanel4.add(d1);
        d1.setBounds(250, 80, 60, 20);
        jPanel4.add(jTextField3);
        jTextField3.setBounds(230, 270, 223, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("City:");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(50, 300, 70, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("State:");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(50, 337, 60, 20);
        jPanel4.add(jTextField4);
        jTextField4.setBounds(230, 300, 223, 20);
        jPanel4.add(jTextField5);
        jTextField5.setBounds(230, 330, 223, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setText("* In case of I-Ticket , the ticket will be delivered within 25 days. So book the ticket accordingly.");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(10, 390, 780, 30);

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/kolkata.jpg"))); // NOI18N
        jPanel4.add(l1);
        l1.setBounds(680, 240, 340, 150);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/bangalore.jpg"))); // NOI18N
        jPanel4.add(jLabel19);
        jLabel19.setBounds(460, 20, 250, 170);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/delhi.jpg"))); // NOI18N
        jPanel4.add(jLabel20);
        jLabel20.setBounds(860, 30, 320, 160);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Bangalore (B)");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(540, 200, 90, 17);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Delhi (D)");
        jPanel4.add(jLabel29);
        jLabel29.setBounds(990, 210, 60, 17);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Kolkata (K)");
        jPanel4.add(jLabel30);
        jLabel30.setBounds(1030, 370, 70, 17);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/Mumbai.jpg"))); // NOI18N
        jPanel4.add(jLabel31);
        jLabel31.setBounds(30, 430, 260, 160);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Mumbai (M)");
        jPanel4.add(jLabel32);
        jLabel32.setBounds(300, 567, 80, 20);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/hyderabad.jpg"))); // NOI18N
        jPanel4.add(jLabel33);
        jLabel33.setBounds(420, 420, 260, 170);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Hyderabad (H)");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(700, 570, 90, 17);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/chennai.jpg"))); // NOI18N
        jPanel4.add(jLabel35);
        jLabel35.setBounds(800, 400, 270, 190);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Chennai (C)");
        jPanel4.add(jLabel36);
        jLabel36.setBounds(1100, 554, 120, 20);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/hfodsfds.png"))); // NOI18N
        jPanel4.add(jLabel26);
        jLabel26.setBounds(0, 0, 1340, 610);

        jInternalFrame2.getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1350, 610);

        jTabbedPane2.addTab("New Booking", jInternalFrame2);

        jInternalFrame3.getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departure", "Arrival", "Date_Of_Journey", "Form Of Ticket", "Coach", "Train Name", "Name of traveller"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(44, 67, 858, 380);
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 61, 0, 0);

        jButton1.setText("Please Click Here For Checking Your Bookings");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(280, 30, 440, 23);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/images.jpg"))); // NOI18N
        jPanel2.add(jLabel21);
        jLabel21.setBounds(950, 50, 278, 181);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/images (1).jpg"))); // NOI18N
        jPanel2.add(jLabel25);
        jLabel25.setBounds(920, 300, 280, 220);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/Backgrounds-modern-wallpapers-hd-modern-wallpaper-06.jpg"))); // NOI18N
        jLabel22.setMinimumSize(new java.awt.Dimension(1365, 710));
        jPanel2.add(jLabel22);
        jLabel22.setBounds(0, 0, 1340, 610);

        jInternalFrame3.getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1340, 610);

        jTabbedPane2.addTab("Bookings", jInternalFrame3);

        jInternalFrame4.setForeground(new java.awt.Color(0, 0, 0));
        jInternalFrame4.getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jButton4.setText("Continue");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(190, 90, 120, 23);

        buttonGroup1.add(r1);
        r1.setText("M");
        jPanel3.add(r1);
        r1.setBounds(160, 310, 40, 23);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(150, 30, 180, 20);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/indian-railway (1).jpg"))); // NOI18N
        jPanel3.add(jLabel27);
        jLabel27.setBounds(740, 280, 450, 280);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/train-lux.jpg"))); // NOI18N
        jPanel3.add(jLabel24);
        jLabel24.setBounds(380, 20, 460, 290);

        t2.setText("Year");
        t2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t2FocusLost(evt);
            }
        });
        jPanel3.add(t2);
        t2.setBounds(310, 280, 50, 20);
        jPanel3.add(t5);
        t5.setBounds(160, 370, 150, 20);
        jPanel3.add(jPasswordField1);
        jPasswordField1.setBounds(150, 60, 180, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER USERNAME");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 30, 130, 14);

        jLabel7.setText("PASSWORD");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 340, 90, 14);
        jPanel3.add(t1);
        t1.setBounds(160, 250, 150, 20);

        cm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov ", "Dec" }));
        cm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmFocusLost(evt);
            }
        });
        jPanel3.add(cm);
        cm.setBounds(230, 280, 80, 20);
        jPanel3.add(t4);
        t4.setBounds(160, 340, 150, 20);

        jLabel3.setText("NAME");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 254, 60, 20);

        cd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(cd);
        cd.setBounds(160, 280, 70, 20);

        jButton5.setText("DELETE YOUR ACCOUNT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(160, 430, 200, 23);

        r2.setText("F");
        jPanel3.add(r2);
        r2.setBounds(210, 310, 31, 23);

        jLabel5.setText("GENDER");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 320, 80, 14);

        jButton6.setText("UPDATE YOUR ACCOUNT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(160, 400, 200, 23);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ENTER PASSWORD");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 60, 130, 14);

        jLabel4.setText("DOB");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 290, 60, 14);

        jLabel8.setText("RE-ENTER PASSWORD");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 370, 130, 14);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/Backgrounds-modern-wallpapers-hd-modern-wallpaper-04.jpg"))); // NOI18N
        jPanel3.add(jLabel23);
        jLabel23.setBounds(0, 0, 1350, 610);

        jInternalFrame4.getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1340, 610);

        jTabbedPane2.addTab("Account Settings", jInternalFrame4);

        jPanel1.add(jTabbedPane2);
        jTabbedPane2.setBounds(20, 30, 1260, 660);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/Black.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -6, 1370, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Username= project_gomo_updating.Main.username;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT Departure,Arrival,Date,Form_of_Ticket,Coach,Train_Name,Name FROM booking where Username = '"+Username+"';";
            ResultSet r= s.executeQuery(query);
            while(r.next()) {
                int i=0;i+=1;
                String Dept = r.getString(1);
                String Arrival = r.getString(2);
                String Date = r.getString(3);
                String Ticket = r.getString(4);
                String Coach = r.getString(5);
                String Train = r.getString(6);
                String name = r.getString(7);
                System.out.println(i);
                model.addRow(new Object[]{Dept,Arrival,Date,Ticket,Coach,Train,name});
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String c_username = jTextField1.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement stmt = (Statement) con.createStatement();
            String query1 = "SELECT Username FROM signups where Username = '" + c_username + "';";
            ResultSet rs = stmt.executeQuery(query1);
            if (rs.next()) {
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jLabel7.setVisible(true);
                jLabel8.setVisible(true);
                cd.setVisible(true);
                cm.setVisible(true);
                t1.setVisible(true);
                t2.setVisible(true);
                t4.setVisible(true);
                t5.setVisible(true);
                r1.setVisible(true);
                r2.setVisible(true);
                jButton6.setVisible(true);
                jButton5.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Usename or Password !!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jButton4ActionPerformed

    private void t2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t2FocusGained
        // TODO add your handling code here:
        t2.setText("");
}//GEN-LAST:event_t2FocusGained

    private void t2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t2FocusLost
        // TODO add your handling code here:
        int year = Integer.parseInt(t2.getText());
        if (year < 1913 || year > 2013) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid year");
        }
        int a = cm.getSelectedIndex();
        int b = cd.getSelectedIndex();
        if ((b == 31 && (a == 2 || a == 4 || a == 6 || a == 9 || a == 11)) || (a == 2 && (b == 30)) || ((year % 4 != 0) && (a == 2 && b == 29))) {
            JOptionPane.showMessageDialog(null, "Entered an invalid date.Please Enter a valid one.");
            cm.setSelectedIndex(0);
            cd.setSelectedIndex(0);
        }
}//GEN-LAST:event_t2FocusLost

    private void cmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_cmFocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String c_username = jTextField1.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement stmt = (Statement) con.createStatement();
            String query = "DELETE FROM signups WHERE username = '"+c_username+"';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Your account has been deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String c_username = jTextField1.getText();
        String Name, dob = "", Gender = "",Password, R_Password, C_Password = "",date, month;
        Password = new String(t4.getPassword());
        R_Password = new String(t5.getPassword());
        if (Password.equals(R_Password)) {

            Name = t1.getText();
            C_Password = Password;
            int year = Integer.parseInt(t2.getText());
            int a = cm.getSelectedIndex();
            int b = cd.getSelectedIndex();

            if (!((b == 31 && (a == 2 || a == 4 || a == 6 || a == 9 || a == 11)) || (a == 2 && (b == 30)) || ((year % 4 != 0) && (a == 2 && b == 29)))) {
                if (a / 10 == 0) {
                    dob = year + "-0" + a + "-" + b;
                } else {
                    dob = year + "-" + a + "-" + b;
                }
            }
            {
                if (r1.isSelected()) {
                    Gender = "M";
                } else if (r2.isSelected()) {
                    Gender = "F";
                }
            }
            try {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
                Statement stmt = (Statement) con.createStatement();
                String query = "UPDATE signups SET Name = '"+Name+"',Dob = '"+dob+"',Gender ='"+Gender+"',Password = '"+C_Password+"' WHERE Username = '"+c_username+"';";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Your account has been updated");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }}
}//GEN-LAST:event_jButton6ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
        jLabel18.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel17.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
}//GEN-LAST:event_rb2ActionPerformed

    private void caFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caFocusLost
        // TODO add your handling code here:
        String departure = (String) cd1.getSelectedItem();
        String arrival = (String) ca.getSelectedItem();
        if(departure.equals(arrival)) {
            JOptionPane.showMessageDialog(this,"The Place of departure is same as the place of arrival.");
            cd1.setSelectedIndex(0);ca.setSelectedIndex(0);d2.setSelectedIndex(0);d1.setSelectedIndex(0);d3.setSelectedIndex(0);
        }
}//GEN-LAST:event_caFocusLost

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String abcd = "2";
        if(d1.getSelectedIndex()==0||d2.getSelectedIndex()==0||d3.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this,"Please select your date of journey to check the availability.");} else {
            String mon = (String) d1.getSelectedItem();
            String day = (String) d2.getSelectedItem();
            String year = (String) d3.getSelectedItem();
            if ((day.equals("31")&& (mon.equals("Feb")|| mon.equals("April") || mon.equals("June") || mon.equals("Sept") ||mon.equals("Nov")) || (mon.equals("Feb") && (day.equals("30"))) || ((year.equals("2013")) && (mon.equals("Feb") && day.equals("29"))))) {
                JOptionPane.showMessageDialog(null, "Entered an invalid date.Please Enter a valid one.");
                d2.setSelectedIndex(0);d1.setSelectedIndex(0);d3.setSelectedIndex(0);
            } else {
                project_gomo_updating.Main.dep = (String) cd1.getSelectedItem();
                project_gomo_updating.Main.arr = (String) ca.getSelectedItem();
                project_gomo_updating.Main.dat = day + "-" + mon + "-2013";

                String departure = (String) cd1.getSelectedItem();
                String arrival = (String) ca.getSelectedItem();
                String date = day + "-" + mon + "-"+year;
                project_gomo_updating.Main.availability = date ;

                {if (rb1.isSelected()) {
                     project_gomo_updating.Main.ticket = rb1.getText();
                     System.out.println(rb1.getText());
                     address=" ";} else if (rb2.isSelected()) {
                         project_gomo_updating.Main.ticket = rb2.getText();
                         address = jTextField2.getText() +"," + jTextField3.getText() +"," + jTextField4.getText() +"," + jTextField5.getText();
                     } else {
                     JOptionPane.showMessageDialog(this, "Please choose a 'form of ticket' option!");}
                }
                System.out.println(" "+address);
                project_gomo_updating.Main.add = address;
                new project_gomo_2(abcd).setVisible(true);
                this.dispose();}}
}//GEN-LAST:event_jButton7ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
        jLabel18.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel17.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
}//GEN-LAST:event_rb1ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_d2ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_d1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new project_gomo_3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox ca;
    private javax.swing.JComboBox cd;
    private javax.swing.JComboBox cd1;
    private javax.swing.JComboBox cm;
    private javax.swing.JComboBox d1;
    private javax.swing.JComboBox d2;
    private javax.swing.JComboBox d3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JPasswordField t4;
    private javax.swing.JPasswordField t5;
    // End of variables declaration//GEN-END:variables
}

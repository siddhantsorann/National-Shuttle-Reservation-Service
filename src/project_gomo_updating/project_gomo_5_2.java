package project_gomo_updating;


import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;
public class project_gomo_5_2 extends javax.swing.JFrame {
String dep;
String arr;
String sab;
    /** Creates new form project_gomo_5 */

    public project_gomo_5_2() {
        initComponents();
        int abcd =project_gomo_updating.Main.abc;
        if(abcd==0)
        {
         project_gomo_updating.Main.abc=1;
        }
        char d= project_gomo_updating.Main.dep.charAt(0);
        char a= project_gomo_updating.Main.arr.charAt(0);
        switch(d)
        {
            case 'D':
            {
                switch (a)
          {
           case 'M':{ a1.setEnabled(true);a2.setEnabled(true); a3.setEnabled(true);a4.setEnabled(true);n1.setEnabled(true);n2.setEnabled(true); n3.setEnabled(true);n4.setEnabled(true);f1.setEnabled(true);f2.setEnabled(true); f3.setEnabled(true);f4.setEnabled(true);}break;
           case 'B':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'C':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'K':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'H':{ a1.setEnabled(true);a2.setEnabled(true); a3.setEnabled(true);a4.setEnabled(true);n1.setEnabled(true);n2.setEnabled(true); n3.setEnabled(true);n4.setEnabled(true);f1.setEnabled(true);f2.setEnabled(true); f3.setEnabled(true);f4.setEnabled(true);}break;
          }} break;
           case 'M':
           {
               switch (a)
          {case 'D':{ a1.setEnabled(true);a2.setEnabled(true); a3.setEnabled(true);a4.setEnabled(true);n1.setEnabled(true);n2.setEnabled(true); n3.setEnabled(true);n4.setEnabled(true);f1.setEnabled(true);f2.setEnabled(true); f3.setEnabled(true);f4.setEnabled(true);}break;
           case 'B':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'C':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'K':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'H':{ a1.setEnabled(true);a2.setEnabled(true); a3.setEnabled(true);a4.setEnabled(true);n1.setEnabled(true);n2.setEnabled(true); n3.setEnabled(true);n4.setEnabled(true);f1.setEnabled(true);f2.setEnabled(true); f3.setEnabled(true);f4.setEnabled(true);}break;
          }}break;
           case 'H':
           {
               switch (a)
          {case 'D':{ a1.setEnabled(true);a2.setEnabled(true); a3.setEnabled(true);a4.setEnabled(true);n1.setEnabled(true);n2.setEnabled(true); n3.setEnabled(true);n4.setEnabled(true);f1.setEnabled(true);f2.setEnabled(true); f3.setEnabled(true);f4.setEnabled(true);}break;
           case 'M':{ a1.setEnabled(true);a2.setEnabled(true); a3.setEnabled(true);a4.setEnabled(true);n1.setEnabled(true);n2.setEnabled(true); n3.setEnabled(true);n4.setEnabled(true);f1.setEnabled(true);f2.setEnabled(true); f3.setEnabled(true);f4.setEnabled(true);}break;
           case 'C':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'K':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'B':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
          }
           }break;
           case 'B':
           {
               switch (a)
          {case 'D':{ a1.setEnabled(true); a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true); f3.setEnabled(true);}break;
           case 'M':{ a1.setEnabled(true); a3.setEnabled(true);n1.setEnabled(true);n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'C':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'K':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'H':{ a1.setEnabled(true); a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;

           }}break;
                case 'C':
                {
                    switch (a)
          {case 'D':{ a1.setEnabled(true); a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true); f3.setEnabled(true);}break;
           case 'M':{ a1.setEnabled(true); a3.setEnabled(true);n1.setEnabled(true);n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'B':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'K':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'H':{ a1.setEnabled(true); a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;

           }}break;
                case 'K':
                {
                    switch (a)
          {case 'D':{ a1.setEnabled(true); a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true); f3.setEnabled(true);}break;
           case 'M':{ a1.setEnabled(true); a3.setEnabled(true);n1.setEnabled(true);n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'B':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'C':{ a1.setEnabled(true);a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;
           case 'H':{ a1.setEnabled(true); a3.setEnabled(true);n1.setEnabled(true); n3.setEnabled(true);f1.setEnabled(true);f3.setEnabled(true);}break;

           }}break;}
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
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        f2 = new javax.swing.JRadioButton();
        c1 = new javax.swing.JLabel();
        a3 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JLabel();
        a2 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JLabel();
        n2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        f1 = new javax.swing.JRadioButton();
        n3 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        f3 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        f4 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        n1 = new javax.swing.JRadioButton();
        n4 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JRadioButton();
        a4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        s2.setText("D,M,H,D");
        s2.setEnabled(false);
        jPanel2.add(s2);
        s2.setBounds(218, 61, 90, 14);

        s3.setText("D,K,H,C,B,M,D");
        s3.setEnabled(false);
        jPanel2.add(s3);
        s3.setBounds(218, 86, 110, 14);

        s4.setText("D,H,M,D");
        s4.setEnabled(false);
        jPanel2.add(s4);
        s4.setBounds(218, 111, 100, 14);

        t1.setText("10:00");
        t1.setEnabled(false);
        jPanel2.add(t1);
        t1.setBounds(160, 36, 40, 14);

        t4.setText("16:30");
        t4.setEnabled(false);
        jPanel2.add(t4);
        t4.setBounds(160, 111, 40, 14);

        s1.setText("D,M,B,C,H,K,D");
        s1.setEnabled(false);
        jPanel2.add(s1);
        s1.setBounds(218, 36, 100, 14);

        t3.setText("12:30");
        t3.setEnabled(false);
        jPanel2.add(t3);
        t3.setBounds(160, 86, 40, 14);

        t2.setText("08:30");
        t2.setEnabled(false);
        jPanel2.add(t2);
        t2.setBounds(160, 61, 40, 14);

        b1.setText("100");
        b1.setEnabled(false);
        jPanel2.add(b1);
        b1.setBounds(14, 36, 40, 14);

        buttonGroup1.add(f2);
        f2.setEnabled(false);
        f2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                f2MouseMoved(evt);
            }
        });
        jPanel2.add(f2);
        f2.setBounds(463, 56, 21, 21);

        c1.setText("Express One");
        c1.setEnabled(false);
        jPanel2.add(c1);
        c1.setBounds(61, 36, 80, 14);

        buttonGroup1.add(a3);
        a3.setEnabled(false);
        a3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a3MouseMoved(evt);
            }
        });
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        jPanel2.add(a3);
        a3.setBounds(331, 80, 21, 21);

        b2.setText("200");
        b2.setEnabled(false);
        jPanel2.add(b2);
        b2.setBounds(14, 61, 40, 14);

        buttonGroup1.add(a2);
        a2.setEnabled(false);
        a2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a2MouseMoved(evt);
            }
        });
        jPanel2.add(a2);
        a2.setBounds(331, 56, 21, 21);

        c2.setText("Express Two");
        c2.setEnabled(false);
        jPanel2.add(c2);
        c2.setBounds(61, 61, 80, 14);

        buttonGroup1.add(n2);
        n2.setEnabled(false);
        n2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                n2MouseMoved(evt);
            }
        });
        jPanel2.add(n2);
        n2.setBounds(386, 56, 21, 21);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(160, 180, 220, 30);

        jLabel15.setText("Train name");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(63, 12, 70, 14);

        c3.setText("Express Three");
        c3.setEnabled(false);
        jPanel2.add(c3);
        c3.setBounds(59, 86, 90, 14);

        ta1.setColumns(20);
        ta1.setEditable(false);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(508, 12, 260, 170);

        buttonGroup1.add(f1);
        f1.setEnabled(false);
        f1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                f1MouseMoved(evt);
            }
        });
        jPanel2.add(f1);
        f1.setBounds(463, 28, 21, 21);

        buttonGroup1.add(n3);
        n3.setEnabled(false);
        n3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                n3MouseMoved(evt);
            }
        });
        jPanel2.add(n3);
        n3.setBounds(386, 80, 21, 21);

        b4.setText("400");
        b4.setEnabled(false);
        jPanel2.add(b4);
        b4.setBounds(14, 111, 40, 14);

        b3.setText("300");
        b3.setEnabled(false);
        jPanel2.add(b3);
        b3.setBounds(14, 86, 40, 14);

        buttonGroup1.add(f3);
        f3.setEnabled(false);
        f3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                f3MouseMoved(evt);
            }
        });
        jPanel2.add(f3);
        f3.setBounds(463, 80, 21, 21);

        jLabel16.setText("Train No.");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 12, 44, 14);

        jLabel17.setText("AC");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(332, 12, 20, 14);

        buttonGroup1.add(f4);
        f4.setEnabled(false);
        f4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                f4MouseMoved(evt);
            }
        });
        jPanel2.add(f4);
        f4.setBounds(463, 104, 21, 21);

        jLabel19.setText("First Class");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(438, 12, 60, 14);

        jLabel18.setText("Non-AC");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(370, 12, 50, 14);

        jLabel14.setText("Time");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(154, 11, 40, 14);

        jLabel13.setText("Stops");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(218, 11, 80, 14);

        c4.setText("Express Four");
        c4.setEnabled(false);
        jPanel2.add(c4);
        c4.setBounds(63, 111, 80, 14);

        buttonGroup1.add(n1);
        n1.setEnabled(false);
        n1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                n1MouseMoved(evt);
            }
        });
        jPanel2.add(n1);
        n1.setBounds(386, 28, 21, 21);

        buttonGroup1.add(n4);
        n4.setEnabled(false);
        n4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                n4MouseMoved(evt);
            }
        });
        jPanel2.add(n4);
        n4.setBounds(386, 104, 21, 21);

        buttonGroup1.add(a1);
        a1.setEnabled(false);
        a1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a1MouseMoved(evt);
            }
        });
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel2.add(a1);
        a1.setBounds(331, 28, 21, 21);

        buttonGroup1.add(a4);
        a4.setEnabled(false);
        a4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a4MouseMoved(evt);
            }
        });
        jPanel2.add(a4);
        a4.setBounds(331, 104, 21, 21);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 20, 780, 230);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/india-railway.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(810, 10, 540, 680);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/train1.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 260, 780, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gomo_updating/fnodsnods.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1360, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2MouseMoved
        if(a2.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Two' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Two' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Two' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_f2MouseMoved

    private void a3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseMoved
         if(a3.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Three' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Three' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Three' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }// TODO add your handling code here:
}//GEN-LAST:event_a3MouseMoved

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_a3ActionPerformed

    private void a2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseMoved
        if(a2.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Two' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Two' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Two' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_a2MouseMoved

    private void n2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MouseMoved
        if(a2.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Two' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Two' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Two' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_n2MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(a1.isSelected()||n1.isSelected()||f1.isSelected()) {
            project_gomo_updating.Main.train_name="Express One";
        } else if (a2.isSelected()||n2.isSelected()||f2.isSelected()) {
            project_gomo_updating.Main.train_name="Express Two";
        } else if (a3.isSelected()||n3.isSelected()||f3.isSelected()) {
            project_gomo_updating.Main.train_name="Express Three";
        } else if (a4.isSelected()||n4.isSelected()||f4.isSelected()) {
            project_gomo_updating.Main.train_name="Express Four";
        }
        if(a1.isSelected()||a2.isSelected()||a3.isSelected()|a4.isSelected()) {
            project_gomo_updating.Main.Coach="AC";
        } else if(n1.isSelected()||n2.isSelected()||n3.isSelected()|n4.isSelected()) {
            project_gomo_updating.Main.Coach="Non-AC";
        } else if(f1.isSelected()||f2.isSelected()||f3.isSelected()|f4.isSelected()) {
            project_gomo_updating.Main.Coach="First Class";
        }

        project_gomo_6 c = new project_gomo_6();
        c.setVisible(true);
        this.dispose();
}//GEN-LAST:event_jButton1ActionPerformed

    private void f1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1MouseMoved
        if(a1.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express One' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express One' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express One' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_f1MouseMoved

    private void n3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n3MouseMoved
        if(a3.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Three' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Three' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Three' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_n3MouseMoved

    private void f3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3MouseMoved
         if(a3.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Three' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Three' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Three' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_f3MouseMoved

    private void f4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4MouseMoved
         if(a4.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Four' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Four' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Four' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_f4MouseMoved

    private void n1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseMoved
       if(a1.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express One' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express One' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express One' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_n1MouseMoved

    private void n4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n4MouseMoved
         if(a4.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Four' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Four' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Four' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_n4MouseMoved

    private void a1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseMoved


       if(a1.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express One' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express One' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express One' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_a1MouseMoved

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_a1ActionPerformed

    private void a4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseMoved
         if(a4.isEnabled()==true) {
            ta1.setText(" ");
            ta1.append("Total Seats: 275");
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Four' Group by coach Having coach='AC' ;";
            ResultSet r1= s.executeQuery(query);
            if(r1.next()) {
                          int AC = r1.getInt(1);
                          int Avail_AC = 150 - AC;
                          int WLAC = -Avail_AC;
                          if(Avail_AC > 0)
                          {
                              ta1.append("\n Seats Available in AC: "+Avail_AC+"/150");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in AC: W/L "+WLAC+"/150");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in AC: 150/150");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Four' Group by coach Having coach='Non-AC' ;";
            ResultSet r2= s.executeQuery(query);
            if(r2.next()) {
                          int Non_AC = r2.getInt(1);
                          int Avail_NA = 75 - Non_AC;
                          int WLNA = -Avail_NA;
                          if(Avail_NA > 0)
                          {
                              ta1.append("\n Seats Available in Non-AC: "+Avail_NA+"/75");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in Non-AC: W/L "+WLNA+"/75");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in Non-AC: 75/75");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
             try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gomo","root","DPS");
            Statement s = (Statement) con.createStatement();
            String query="SELECT count(coach) from Booking where Date = '"+project_gomo_updating.Main.dat+"' and train_name = 'Express Four' Group by coach Having coach='First Class' ;";
            ResultSet r3= s.executeQuery(query);
            if(r3.next()) {
                          int FC = r3.getInt(1);
                          int Avail_FC = 50 - FC;
                          int WLFC = -Avail_FC;
                          if(Avail_FC > 0)
                          {
                              ta1.append("\n Seats Available in First Class: "+Avail_FC+"/50");
                          }
                          else
                          {
                              ta1.append("\n Seats Available in First Class: W/L "+WLFC+"/50");
                          }
                         }
            else
            {
                 ta1.append("\n Seats Available in First Class: 50/50");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
}//GEN-LAST:event_a4MouseMoved

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project_gomo_5_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f3;
    private javax.swing.JRadioButton f4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton n1;
    private javax.swing.JRadioButton n2;
    private javax.swing.JRadioButton n3;
    private javax.swing.JRadioButton n4;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables

}

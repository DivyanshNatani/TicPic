package Booking;


import javax.swing.JOptionPane;

import java.sql.*;
import javax.swing.JToggleButton;



public class M_Book extends javax.swing.JFrame {


public int no_of_seats=0;
protected int no_of_seats_booked=0;
  
    public M_Book() {
        initComponents();
    }
    public String lkjhg="";
    String tablename="";

int qwe=0,qwep=0;
int rty=0,rtyp=0;
int uio=0,uiop=0;

      void choice(int k, String S_No, String hall,String MovieName,String time,String b) {
          no_of_seats=Integer.parseInt(b);
          tablename="t"+S_No+k;
          System.out.print(tablename);
M_name.setText(MovieName);
M_time.setText(time);
M_hName.setText(hall);
        String str="";
        int i=0;
try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","sps");
            Statement stmt=con.createStatement();
            String q="Select First_show, Second_Show, Third_Show from hall_detail h, movie_detail m where " +
                    "m.sr_no=h.Movie_no and hall_name='"+hall+"' and movie_name='"+MovieName+"';";
            ResultSet r=stmt.executeQuery(q);
            while(r.next()){
                if(time.equals(r.getString(1))){
                    i=0;
                } else if(time.equals(r.getString(2))){
                    i=1;
                } else if(time.equals(r.getString(3))){
                    i=2;
                }    break;
                }
                
        switch(i){
            case 0: str="F";
                    break;
            case 1: str="S";
                    break;
            case 2: str="T";
                    break;
            default: str="F";
        }
        String s1="Price1_"+str, s2="Price2_"+str, s3="Price3_"+str;

            
            String query1="Select "+s1+", "+s2+","+s3+" from hall_detail h, movie_detail m where h.Movie_no=m.Sr_No " +
               "and Movie_Name='"+MovieName+"' and hall_name='"+hall+"';";
            ResultSet rs1=stmt.executeQuery(query1);
            while(rs1.next()){
                qwep=rs1.getInt(1);
                rtyp=rs1.getInt(2);
                uiop=rs1.getInt(3);
}
            jLabel5.setText("Platinum : Rs. "+qwep+"/-");
            jLabel7.setText("Gold : Rs. "+rtyp+"/-");
            jLabel8.setText("Silver : Rs. "+uiop+"/-");

       String query="Select * from "+ tablename+";";
ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                String Seat=rs.getString(1);
                String Status=rs.getString(2);
                if(Seat.equals("A1") && Status.equals("B")){
                    A1.setEnabled(false);
                }
                
                if(Seat.equals("A2") && Status.equals("B")){
                    A2.setEnabled(false);
                }if(Seat.equals("A3") && Status.equals("B")){
                    A3.setEnabled(false);
                }if(Seat.equals("A4") && Status.equals("B")){
                    A4.setEnabled(false);
                }if(Seat.equals("A5") && Status.equals("B")){
                    A5.setEnabled(false);
                }if(Seat.equals("A6") && Status.equals("B")){
                    A6.setEnabled(false);
                }if(Seat.equals("A7") && Status.equals("B")){
                    A7.setEnabled(false);
                }if(Seat.equals("A8") && Status.equals("B")){
                    A8.setEnabled(false);
                }if(Seat.equals("A9") && Status.equals("B")){
                    A9.setEnabled(false);
                }if(Seat.equals("B1") && Status.equals("B")){
                    B1.setEnabled(false);
                }if(Seat.equals("B2") && Status.equals("B")){
                    B2.setEnabled(false);
                }if(Seat.equals("B3") && Status.equals("B")){
                    B3.setEnabled(false);
                }if(Seat.equals("B4") && Status.equals("B")){
                    B4.setEnabled(false);
                }if(Seat.equals("B5") && Status.equals("B")){
                    B5.setEnabled(false);
                }if(Seat.equals("B6") && Status.equals("B")){
                    B6.setEnabled(false);
                }if(Seat.equals("B7") && Status.equals("B")){
                    B7.setEnabled(false);
                }if(Seat.equals("B8") && Status.equals("B")){
                    B8.setEnabled(false);
                }if(Seat.equals("B9") && Status.equals("B")){
                    B9.setEnabled(false);
                }if(Seat.equals("C1") && Status.equals("B")){
                    C1.setEnabled(false);
                }

                if(Seat.equals("C2") && Status.equals("B")){
                    C2.setEnabled(false);
                }if(Seat.equals("C3") && Status.equals("B")){
                    C3.setEnabled(false);
                }if(Seat.equals("C4") && Status.equals("B")){
                    C4.setEnabled(false);
                }if(Seat.equals("C5") && Status.equals("B")){
                    C5.setEnabled(false);
                }if(Seat.equals("C6") && Status.equals("B")){
                    C6.setEnabled(false);
                }if(Seat.equals("C7") && Status.equals("B")){
                    C7.setEnabled(false);
                }if(Seat.equals("C8") && Status.equals("B")){
                    C8.setEnabled(false);
                }if(Seat.equals("C9") && Status.equals("B")){
                    C9.setEnabled(false);
                }if(Seat.equals("D1") && Status.equals("B")){
                    D1.setEnabled(false);
                }

                if(Seat.equals("D2") && Status.equals("B")){
                    D2.setEnabled(false);
                }if(Seat.equals("D3") && Status.equals("B")){
                    D3.setEnabled(false);
                }if(Seat.equals("D4") && Status.equals("B")){
                    D4.setEnabled(false);
                }if(Seat.equals("D5") && Status.equals("B")){
                    D5.setEnabled(false);
                }if(Seat.equals("D6") && Status.equals("B")){
                    D6.setEnabled(false);
                }if(Seat.equals("D7") && Status.equals("B")){
                    D7.setEnabled(false);
                }if(Seat.equals("D8") && Status.equals("B")){
                    D8.setEnabled(false);
                }if(Seat.equals("D9") && Status.equals("B")){
                    D9.setEnabled(false);
                }
                if(Seat.equals("D10") && Status.equals("B")){
                    D10.setEnabled(false);
                }if(Seat.equals("D11") && Status.equals("B")){
                    D11.setEnabled(false);
                }if(Seat.equals("E1") && Status.equals("B")){
                    E1.setEnabled(false);
            }
                if(Seat.equals("E2") && Status.equals("B")){
                    E2.setEnabled(false);
            }if(Seat.equals("E3") && Status.equals("B")){
                    E3.setEnabled(false);
            }if(Seat.equals("E4") && Status.equals("B")){
                    E4.setEnabled(false);
            }if(Seat.equals("E5") && Status.equals("B")){
                    E5.setEnabled(false);
            }if(Seat.equals("E6") && Status.equals("B")){
                    E6.setEnabled(false);
            }if(Seat.equals("E7") && Status.equals("B")){
                    E7.setEnabled(false);
            }if(Seat.equals("E8") && Status.equals("B")){
                    E8.setEnabled(false);
            }if(Seat.equals("E9") && Status.equals("B")){
                    E9.setEnabled(false);
            }if(Seat.equals("E10") && Status.equals("B")){
                    E10.setEnabled(false);
            }if(Seat.equals("E11") && Status.equals("B")){
                    E11.setEnabled(false);
            }
             if(Seat.equals("F1") && Status.equals("B")){
                    F1.setEnabled(false);
            }
                if(Seat.equals("F2") && Status.equals("B")){
                    F2.setEnabled(false);
            }
                if(Seat.equals("F3") && Status.equals("B")){
                    F3.setEnabled(false);
            }
                if(Seat.equals("F4") && Status.equals("B")){
                    F4.setEnabled(false);
            }
                if(Seat.equals("F5") && Status.equals("B")){
                    F5.setEnabled(false);
            }
                if(Seat.equals("F6") && Status.equals("B")){
                    F6.setEnabled(false);
            }if(Seat.equals("F7") && Status.equals("B")){
                    F7.setEnabled(false);
            }if(Seat.equals("F8") && Status.equals("B")){
                    F8.setEnabled(false);
            }if(Seat.equals("F9") && Status.equals("B")){
                    F9.setEnabled(false);
            }if(Seat.equals("F10") && Status.equals("B")){
                    F10.setEnabled(false);
            }if(Seat.equals("F11") && Status.equals("B")){
                    F11.setEnabled(false);
            }if(Seat.equals("G1") && Status.equals("B")){
                    G1.setEnabled(false);
            }
             if(Seat.equals("G2") && Status.equals("B")){
                    G2.setEnabled(false);
            }if(Seat.equals("G3") && Status.equals("B")){
                    G3.setEnabled(false);
            }if(Seat.equals("G4") && Status.equals("B")){
                    G4.setEnabled(false);
            }if(Seat.equals("G5") && Status.equals("B")){
                    G5.setEnabled(false);
            }if(Seat.equals("G6") && Status.equals("B")){
                    G6.setEnabled(false);
            }if(Seat.equals("G7") && Status.equals("B")){
                    G7.setEnabled(false);
            }if(Seat.equals("G8") && Status.equals("B")){
                    G8.setEnabled(false);
            }if(Seat.equals("G9") && Status.equals("B")){
                    G9.setEnabled(false);
            }if(Seat.equals("G10") && Status.equals("B")){
                    G10.setEnabled(false);
            }if(Seat.equals("G11") && Status.equals("B")){
                    G11.setEnabled(false);
            }if(Seat.equals("H1") && Status.equals("B")){
                    H1.setEnabled(false);
            }
                if(Seat.equals("H2") && Status.equals("B")){
                    H2.setEnabled(false);
            }  if(Seat.equals("H3") && Status.equals("B")){
                    H3.setEnabled(false);
            }  if(Seat.equals("H4") && Status.equals("B")){
                    H4.setEnabled(false);
            }  if(Seat.equals("H5") && Status.equals("B")){
                    H5.setEnabled(false);
            }  if(Seat.equals("H6") && Status.equals("B")){
                    H6.setEnabled(false);
            }  if(Seat.equals("H7") && Status.equals("B")){
                    H7.setEnabled(false);
            }
               if(Seat.equals("I1") && Status.equals("B")){
                    I1.setEnabled(false);
            }
                 if(Seat.equals("I2") && Status.equals("B")){
                    I2.setEnabled(false);
            }  if(Seat.equals("I3") && Status.equals("B")){
                    I3.setEnabled(false);
            }  if(Seat.equals("I4") && Status.equals("B")){
                    I4.setEnabled(false);
            }  if(Seat.equals("I5") && Status.equals("B")){
                    I5.setEnabled(false);
            }  if(Seat.equals("I6") && Status.equals("B")){
                    I6.setEnabled(false);
            }  if(Seat.equals("I7") && Status.equals("B")){
                    I7.setEnabled(false);
            }  if(Seat.equals("J1") && Status.equals("B")){
                    J1.setEnabled(false);
            }  if(Seat.equals("J2") && Status.equals("B")){
                    J2.setEnabled(false);
            }  if(Seat.equals("J3") && Status.equals("B")){
                    J3.setEnabled(false);
            }  if(Seat.equals("J4") && Status.equals("B")){
                    J4.setEnabled(false);
            }  if(Seat.equals("J5") && Status.equals("B")){
                    J5.setEnabled(false);
            }  if(Seat.equals("J6") && Status.equals("B")){
                    J6.setEnabled(false);
            }  if(Seat.equals("J7") && Status.equals("B")){
                    J7.setEnabled(false);
            }
            }
         }
            catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
    System.out.print(e);
            }

    }public static String s="";
     // public String seatsbo[];
      void fun()
    {
     JToggleButton[] l={A1,A2,A3,A4,A5,A6,A7,A8,A9,
                        B1,B2,B3,B4,B5,B6,B7,B8,B9,
                        C1,C2,C3,C4,C5,C6,C7,C8,C9,
                        D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,
                        E1,E2,E3,E4,E5,E6,E7,E8,E9,E10,E11,
                        F1,F2,F3,F4,F5,F6,F7,F8,F9,F10,F11,
                        G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,G11,
                        H1,H2,H3,H4,H5,H6,H7,
                        I1,I2,I3,I4,I5,I6,I7,
                        J1,J2,J3,J4,J5,J6,J7
                       };
        s="";
        int k=0;
        while(k!=8)
        {
            if(l[k].isSelected())
            {
                s=s+"'"+l[k].getText()+"',";
                
            }
            k++;
        }
        s=s.substring(0, (s.length()-1));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirm = new javax.swing.JDialog();
        warn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1111 = new javax.swing.JLabel();
        A3 = new javax.swing.JToggleButton();
        G5 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        A8 = new javax.swing.JToggleButton();
        D2 = new javax.swing.JToggleButton();
        E2 = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        D7 = new javax.swing.JToggleButton();
        J4 = new javax.swing.JToggleButton();
        D6 = new javax.swing.JToggleButton();
        J7 = new javax.swing.JToggleButton();
        I4 = new javax.swing.JToggleButton();
        G2 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        J2 = new javax.swing.JToggleButton();
        A5 = new javax.swing.JToggleButton();
        B8 = new javax.swing.JToggleButton();
        M_name = new javax.swing.JLabel();
        B1 = new javax.swing.JToggleButton();
        A1 = new javax.swing.JToggleButton();
        F11 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        G8 = new javax.swing.JToggleButton();
        F2 = new javax.swing.JToggleButton();
        F6 = new javax.swing.JToggleButton();
        B9 = new javax.swing.JToggleButton();
        A2 = new javax.swing.JToggleButton();
        F10 = new javax.swing.JToggleButton();
        B7 = new javax.swing.JToggleButton();
        J5 = new javax.swing.JToggleButton();
        D9 = new javax.swing.JToggleButton();
        G4 = new javax.swing.JToggleButton();
        H4 = new javax.swing.JToggleButton();
        I3 = new javax.swing.JToggleButton();
        E7 = new javax.swing.JToggleButton();
        M_time = new javax.swing.JLabel();
        E5 = new javax.swing.JToggleButton();
        A7 = new javax.swing.JToggleButton();
        G10 = new javax.swing.JToggleButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        E3 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        E6 = new javax.swing.JToggleButton();
        F5 = new javax.swing.JToggleButton();
        G7 = new javax.swing.JToggleButton();
        J6 = new javax.swing.JToggleButton();
        A4 = new javax.swing.JToggleButton();
        E9 = new javax.swing.JToggleButton();
        C1 = new javax.swing.JToggleButton();
        E8 = new javax.swing.JToggleButton();
        C2 = new javax.swing.JToggleButton();
        D5 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        H6 = new javax.swing.JToggleButton();
        D8 = new javax.swing.JToggleButton();
        H1 = new javax.swing.JToggleButton();
        I7 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        C9 = new javax.swing.JToggleButton();
        E4 = new javax.swing.JToggleButton();
        C7 = new javax.swing.JToggleButton();
        J3 = new javax.swing.JToggleButton();
        E1 = new javax.swing.JToggleButton();
        H5 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        C8 = new javax.swing.JToggleButton();
        G9 = new javax.swing.JToggleButton();
        J1 = new javax.swing.JToggleButton();
        D10 = new javax.swing.JToggleButton();
        H3 = new javax.swing.JToggleButton();
        F9 = new javax.swing.JToggleButton();
        H7 = new javax.swing.JToggleButton();
        I2 = new javax.swing.JToggleButton();
        C4 = new javax.swing.JToggleButton();
        D4 = new javax.swing.JToggleButton();
        I6 = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        A9 = new javax.swing.JToggleButton();
        E11 = new javax.swing.JToggleButton();
        I5 = new javax.swing.JToggleButton();
        B3 = new javax.swing.JToggleButton();
        G3 = new javax.swing.JToggleButton();
        l1 = new javax.swing.JLabel();
        B5 = new javax.swing.JToggleButton();
        E10 = new javax.swing.JToggleButton();
        F8 = new javax.swing.JToggleButton();
        B6 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();
        G6 = new javax.swing.JToggleButton();
        dn = new javax.swing.JLabel();
        B4 = new javax.swing.JToggleButton();
        A6 = new javax.swing.JToggleButton();
        M_date = new javax.swing.JLabel();
        D3 = new javax.swing.JToggleButton();
        F7 = new javax.swing.JToggleButton();
        C5 = new javax.swing.JToggleButton();
        D11 = new javax.swing.JToggleButton();
        F3 = new javax.swing.JToggleButton();
        M_hName = new javax.swing.JLabel();
        F1 = new javax.swing.JToggleButton();
        C6 = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        G11 = new javax.swing.JToggleButton();
        F4 = new javax.swing.JToggleButton();
        G1 = new javax.swing.JToggleButton();
        H2 = new javax.swing.JToggleButton();
        C3 = new javax.swing.JToggleButton();
        I1 = new javax.swing.JToggleButton();
        D1 = new javax.swing.JToggleButton();

        confirm.setMinimumSize(new java.awt.Dimension(450, 300));

        warn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warn.setMinimumSize(new java.awt.Dimension(750, 250));

        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Select Any Other Time");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout confirmLayout = new javax.swing.GroupLayout(confirm.getContentPane());
        confirm.getContentPane().setLayout(confirmLayout);
        confirmLayout.setHorizontalGroup(
            confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmLayout.createSequentialGroup()
                .addGroup(confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(warn, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(confirmLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton1))
                    .addGroup(confirmLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        confirmLayout.setVerticalGroup(
            confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(warn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Pic -Seat Selection");

        jLabel1111.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1111.setOpaque(true);

        A3.setText("A3");
        A3.setFocusable(false);
        A3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        G5.setText("G5");
        G5.setFocusable(false);
        G5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        A8.setText("A8");
        A8.setFocusable(false);
        A8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        D2.setText("D2");
        D2.setFocusable(false);
        D2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        E2.setText("E2");
        E2.setFocusable(false);
        E2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        D7.setText("D7");
        D7.setFocusable(false);
        D7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        J4.setText("J4");
        J4.setFocusable(false);
        J4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        D6.setText("D6");
        D6.setFocusable(false);
        D6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        J7.setText("J7");
        J7.setFocusable(false);
        J7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        I4.setText("I4");
        I4.setFocusable(false);
        I4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        G2.setText("G2");
        G2.setFocusable(false);
        G2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel7.setText("Gold : Rs.250/-");

        jLabel4.setText("Hall Name :");

        J2.setText("J2");
        J2.setFocusable(false);
        J2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        A5.setText("A5");
        A5.setFocusable(false);
        A5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        B8.setText("B8");
        B8.setFocusable(false);
        B8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B1.setText("B1");
        B1.setFocusable(false);
        B1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        A1.setText("A1");
        A1.setFocusable(false);
        A1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        F11.setText("F11");
        F11.setFocusable(false);
        F11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setText("Movie Name :");

        G8.setText("G8");
        G8.setFocusable(false);
        G8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        F2.setText("F2");
        F2.setFocusable(false);
        F2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        F6.setText("F6");
        F6.setFocusable(false);
        F6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        B9.setText("B9");
        B9.setFocusable(false);
        B9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        A2.setText("A2");
        A2.setFocusable(false);
        A2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        F10.setText("F10");
        F10.setFocusable(false);
        F10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        B7.setText("B7");
        B7.setFocusable(false);
        B7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        J5.setText("J5");
        J5.setFocusable(false);
        J5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        D9.setText("D9");
        D9.setFocusable(false);
        D9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D9ActionPerformed(evt);
            }
        });

        G4.setText("G4");
        G4.setFocusable(false);
        G4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        H4.setText("H4");
        H4.setFocusable(false);
        H4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        I3.setText("I3");
        I3.setFocusable(false);
        I3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        E7.setText("E7");
        E7.setFocusable(false);
        E7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        E5.setText("E5");
        E5.setFocusable(false);
        E5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        A7.setText("A7");
        A7.setFocusable(false);
        A7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        G10.setText("G10");
        G10.setFocusable(false);
        G10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        E3.setText("E3");
        E3.setFocusable(false);
        E3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel8.setText("Silver : Rs.150/-");

        E6.setText("E6");
        E6.setFocusable(false);
        E6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        F5.setText("F5");
        F5.setFocusable(false);
        F5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        G7.setText("G7");
        G7.setFocusable(false);
        G7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        J6.setText("J6");
        J6.setFocusable(false);
        J6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        A4.setText("A4");
        A4.setFocusable(false);
        A4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        E9.setText("E9");
        E9.setFocusable(false);
        E9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        C1.setText("C1");
        C1.setFocusable(false);
        C1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        E8.setText("E8");
        E8.setFocusable(false);
        E8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        C2.setText("C2");
        C2.setFocusable(false);
        C2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        D5.setText("D5");
        D5.setFocusable(false);
        D5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Date :");

        H6.setText("H6");
        H6.setFocusable(false);
        H6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        D8.setText("D8");
        D8.setFocusable(false);
        D8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        H1.setText("H1");
        H1.setFocusable(false);
        H1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        I7.setText("I7");
        I7.setFocusable(false);
        I7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("SCREEN THIS SIDE");

        C9.setText("C9");
        C9.setFocusable(false);
        C9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        E4.setText("E4");
        E4.setFocusable(false);
        E4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        C7.setText("C7");
        C7.setFocusable(false);
        C7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        J3.setText("J3");
        J3.setFocusable(false);
        J3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        E1.setText("E1");
        E1.setFocusable(false);
        E1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        H5.setText("H5");
        H5.setFocusable(false);
        H5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        C8.setText("C8");
        C8.setFocusable(false);
        C8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        G9.setText("G9");
        G9.setFocusable(false);
        G9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        J1.setText("J1");
        J1.setFocusable(false);
        J1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        D10.setText("D10");
        D10.setFocusable(false);
        D10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D10ActionPerformed(evt);
            }
        });

        H3.setText("H3");
        H3.setFocusable(false);
        H3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        F9.setText("F9");
        F9.setFocusable(false);
        F9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        H7.setText("H7");
        H7.setFocusable(false);
        H7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        I2.setText("I2");
        I2.setFocusable(false);
        I2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        C4.setText("C4");
        C4.setFocusable(false);
        C4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        D4.setText("D4");
        D4.setFocusable(false);
        D4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        I6.setText("I6");
        I6.setFocusable(false);
        I6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        A9.setText("A9");
        A9.setFocusable(false);
        A9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        E11.setText("E11");
        E11.setFocusable(false);
        E11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        I5.setText("I5");
        I5.setFocusable(false);
        I5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        B3.setText("B3");
        B3.setFocusable(false);
        B3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        G3.setText("G3");
        G3.setFocusable(false);
        G3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        B5.setText("B5");
        B5.setFocusable(false);
        B5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        E10.setText("E10");
        E10.setFocusable(false);
        E10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        F8.setText("F8");
        F8.setFocusable(false);
        F8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        B6.setText("B6");
        B6.setFocusable(false);
        B6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B2.setText("B2");
        B2.setFocusable(false);
        B2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        G6.setText("G6");
        G6.setFocusable(false);
        G6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        B4.setText("B4");
        B4.setFocusable(false);
        B4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        A6.setText("A6");
        A6.setFocusable(false);
        A6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        M_date.setText("27/03/2017");

        D3.setText("D3");
        D3.setFocusable(false);
        D3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        F7.setText("F7");
        F7.setFocusable(false);
        F7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        C5.setText("C5");
        C5.setFocusable(false);
        C5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        D11.setText("D11");
        D11.setFocusable(false);
        D11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D11ActionPerformed(evt);
            }
        });

        F3.setText("F3");
        F3.setFocusable(false);
        F3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        F1.setText("F1");
        F1.setFocusable(false);
        F1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        C6.setText("C6");
        C6.setFocusable(false);
        C6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        jLabel5.setText("Platinum : Rs. 350/-");

        jLabel2.setText("Time :");

        G11.setText("G11");
        G11.setFocusable(false);
        G11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        F4.setText("F4");
        F4.setFocusable(false);
        F4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        G1.setText("G1");
        G1.setFocusable(false);
        G1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        H2.setText("H2");
        H2.setFocusable(false);
        H2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        C3.setText("C3");
        C3.setFocusable(false);
        C3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        I1.setText("I1");
        I1.setFocusable(false);
        I1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        D1.setText("D1");
        D1.setFocusable(false);
        D1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1111, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(110, 110, 110)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(E1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E11))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(F1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F11))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(G1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G11))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(D1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(D2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(D3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(D4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(D5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(D6)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D11))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(149, 149, 149)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(B1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B4)
                                            .addGap(6, 6, 6)
                                            .addComponent(B5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B9))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(C1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C4)
                                            .addGap(6, 6, 6)
                                            .addComponent(C5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C9))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(A1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(A4)
                                                    .addGap(6, 6, 6)
                                                    .addComponent(A5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(A6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(A7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(A8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(A9))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(91, 91, 91)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(322, 322, 322)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(185, 185, 185)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(H1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(H2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(H3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(H4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(H5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(H6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(H7)
                                            .addGap(45, 45, 45))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(J1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(J2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(J3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(J4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(J5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(J6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(J7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(I1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(I2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(I3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(I4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(I5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(I6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(I7))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dn))))
                            .addGap(38, 38, 38))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(M_name, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(M_time, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(30, 30, 30)
                                    .addComponent(M_date, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(M_hName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1111, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(M_name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(M_time, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(M_date, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(M_hName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(31, 31, 31)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(dn)
                            .addGap(133, 133, 133)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(A1)
                                .addComponent(A2)
                                .addComponent(A3)
                                .addComponent(A4)
                                .addComponent(A5)
                                .addComponent(A6)
                                .addComponent(A7)
                                .addComponent(A8)
                                .addComponent(A9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B1)
                                .addComponent(B2)
                                .addComponent(B3)
                                .addComponent(B4)
                                .addComponent(B5)
                                .addComponent(B6)
                                .addComponent(B7)
                                .addComponent(B8)
                                .addComponent(B9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(C1)
                                .addComponent(C2)
                                .addComponent(C3)
                                .addComponent(C4)
                                .addComponent(C5)
                                .addComponent(C6)
                                .addComponent(C7)
                                .addComponent(C8)
                                .addComponent(C9))))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7)
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(D1)
                        .addComponent(D2)
                        .addComponent(D3)
                        .addComponent(D4)
                        .addComponent(D5)
                        .addComponent(D6)
                        .addComponent(D7)
                        .addComponent(D8)
                        .addComponent(D9)
                        .addComponent(D10)
                        .addComponent(D11))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(E1)
                        .addComponent(E2)
                        .addComponent(E3)
                        .addComponent(E4)
                        .addComponent(E5)
                        .addComponent(E6)
                        .addComponent(E7)
                        .addComponent(E8)
                        .addComponent(E9)
                        .addComponent(E10)
                        .addComponent(E11))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(F1)
                        .addComponent(F2)
                        .addComponent(F3)
                        .addComponent(F4)
                        .addComponent(F5)
                        .addComponent(F6)
                        .addComponent(F7)
                        .addComponent(F8)
                        .addComponent(F9)
                        .addComponent(F10)
                        .addComponent(F11))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(G1)
                        .addComponent(G2)
                        .addComponent(G3)
                        .addComponent(G4)
                        .addComponent(G5)
                        .addComponent(G6)
                        .addComponent(G7)
                        .addComponent(G8)
                        .addComponent(G9)
                        .addComponent(G10)
                        .addComponent(G11))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel8)
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(H1)
                        .addComponent(H2)
                        .addComponent(H3)
                        .addComponent(H4)
                        .addComponent(H5)
                        .addComponent(H6)
                        .addComponent(H7))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(I1)
                        .addComponent(I2)
                        .addComponent(I3)
                        .addComponent(I4)
                        .addComponent(I5)
                        .addComponent(I6)
                        .addComponent(I7))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(J1)
                        .addComponent(J2)
                        .addComponent(J3)
                        .addComponent(J4)
                        .addComponent(J5)
                        .addComponent(J6)
                        .addComponent(J7))
                    .addGap(36, 36, 36)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(36, 36, 36)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String mname=M_name.getText();
this.dispose();
confirm.dispose();

M_Time mt=new M_Time();
mt.name(mname);
mt.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
M_BS mb=new M_BS();
String SName=l1.getText();
int ad=qwe*qwep;
int fh=rty*rtyp;
int jl=uio*uiop;
int q=qwe+rty+uio;
int p=ad+fh+jl;
System.out.print(q);
String Name=M_name.getText();
String D = null;
String Time=M_time.getText();
String HName=M_hName.getText();
mb.details(Name,D,Time,HName,SName,q,p,tablename);
this.dispose();
confirm.dispose();
mb.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed

        if(A3.isSelected()==true) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(A3.isSelected()==false) {
                qwe-=1;no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);

        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_A3ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        if(A8.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(A8.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }

        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_A8ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        if(D2.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D2.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D2ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        if(D7.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D7.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D7ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        if(D6.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D6.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D6ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        if(A5.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            qwe-=1;
            if(A5.isSelected()==false) {
                no_of_seats_booked--;
            }
        }

        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_A5ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        if(B8.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(B8.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_B8ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if(B1.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(B1.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_B1ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        if(A1.isSelected()) {
            no_of_seats_booked++;
            qwe+=1;
        } else {
            if(A1.isSelected()==false) {
                no_of_seats_booked--;
                qwe-=1;
            }
        }

        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_A1ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        if(B9.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(B9.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_B9ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        if(A2.isSelected()==true) {
            no_of_seats_booked++;
            qwe+=1;
        } else {
            if(A2.isSelected()==false) {

                qwe-=1;no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_A2ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        if(B7.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(B7.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_B7ActionPerformed

    private void D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D9ActionPerformed
        if(D9.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D1.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D9ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        if(A7.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(A7.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }

        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_A7ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        if(A4.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(A4.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }

        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);


        }
        fun();
        l1.setText(s);
    }//GEN-LAST:event_A4ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        if(C1.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(C1.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        if(C2.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(C2.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_C2ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        if(D5.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D5.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D5ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        if(D8.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D1.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D8ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed

}//GEN-LAST:event_H1ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        if(C9.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;

        } else {
            if(C9.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_C9ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        if(C7.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(C7.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        if(C8.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(C8.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_C8ActionPerformed

    private void D10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D10ActionPerformed
        if(D10.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D10.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D10ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        if(C4.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(C4.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_C4ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        if(D4.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D4.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D4ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        if(A9.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(A9.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_A9ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if(B3.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(B3.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_B3ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if(B5.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(B5.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if(B6.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(B6.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_B6ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if(B2.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(B2.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_B2ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if(B4.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(B4.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_B4ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        if(A6.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(A6.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }

        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_A6ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        if(D3.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D3.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D3ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        if(C5.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(C5.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_C5ActionPerformed

    private void D11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D11ActionPerformed
        if(D11.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D11.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D11ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        if(C6.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(C6.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_C6ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        if(C3.isSelected()) {
            qwe+=1;
            no_of_seats_booked++;
        } else {
            if(C3.isSelected()==false) {
                qwe-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_C3ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        if(D1.isSelected()){
            rty+=1;
            no_of_seats_booked++;

        } else {
            if(D1.isSelected()==false) {
                rty-=1;
                no_of_seats_booked--;
            }
        }
        if(no_of_seats_booked>=no_of_seats){
            warn.setText("You have selected "+no_of_seats_booked+" seats. Click Continue to Book.");
            confirm.setVisible(true);
            confirm.setLocationRelativeTo(this);


        }
        fun();
        l1.setText(s);
}//GEN-LAST:event_D1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton A1;
    private javax.swing.JToggleButton A2;
    private javax.swing.JToggleButton A3;
    private javax.swing.JToggleButton A4;
    private javax.swing.JToggleButton A5;
    private javax.swing.JToggleButton A6;
    private javax.swing.JToggleButton A7;
    private javax.swing.JToggleButton A8;
    private javax.swing.JToggleButton A9;
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B2;
    private javax.swing.JToggleButton B3;
    private javax.swing.JToggleButton B4;
    private javax.swing.JToggleButton B5;
    private javax.swing.JToggleButton B6;
    private javax.swing.JToggleButton B7;
    private javax.swing.JToggleButton B8;
    private javax.swing.JToggleButton B9;
    private javax.swing.JToggleButton C1;
    private javax.swing.JToggleButton C2;
    private javax.swing.JToggleButton C3;
    private javax.swing.JToggleButton C4;
    private javax.swing.JToggleButton C5;
    private javax.swing.JToggleButton C6;
    private javax.swing.JToggleButton C7;
    private javax.swing.JToggleButton C8;
    private javax.swing.JToggleButton C9;
    private javax.swing.JToggleButton D1;
    private javax.swing.JToggleButton D10;
    private javax.swing.JToggleButton D11;
    private javax.swing.JToggleButton D2;
    private javax.swing.JToggleButton D3;
    private javax.swing.JToggleButton D4;
    private javax.swing.JToggleButton D5;
    private javax.swing.JToggleButton D6;
    private javax.swing.JToggleButton D7;
    private javax.swing.JToggleButton D8;
    private javax.swing.JToggleButton D9;
    private javax.swing.JToggleButton E1;
    private javax.swing.JToggleButton E10;
    private javax.swing.JToggleButton E11;
    private javax.swing.JToggleButton E2;
    private javax.swing.JToggleButton E3;
    private javax.swing.JToggleButton E4;
    private javax.swing.JToggleButton E5;
    private javax.swing.JToggleButton E6;
    private javax.swing.JToggleButton E7;
    private javax.swing.JToggleButton E8;
    private javax.swing.JToggleButton E9;
    private javax.swing.JToggleButton F1;
    private javax.swing.JToggleButton F10;
    private javax.swing.JToggleButton F11;
    private javax.swing.JToggleButton F2;
    private javax.swing.JToggleButton F3;
    private javax.swing.JToggleButton F4;
    private javax.swing.JToggleButton F5;
    private javax.swing.JToggleButton F6;
    private javax.swing.JToggleButton F7;
    private javax.swing.JToggleButton F8;
    private javax.swing.JToggleButton F9;
    private javax.swing.JToggleButton G1;
    private javax.swing.JToggleButton G10;
    private javax.swing.JToggleButton G11;
    private javax.swing.JToggleButton G2;
    private javax.swing.JToggleButton G3;
    private javax.swing.JToggleButton G4;
    private javax.swing.JToggleButton G5;
    private javax.swing.JToggleButton G6;
    private javax.swing.JToggleButton G7;
    private javax.swing.JToggleButton G8;
    private javax.swing.JToggleButton G9;
    private javax.swing.JToggleButton H1;
    private javax.swing.JToggleButton H2;
    private javax.swing.JToggleButton H3;
    private javax.swing.JToggleButton H4;
    private javax.swing.JToggleButton H5;
    private javax.swing.JToggleButton H6;
    private javax.swing.JToggleButton H7;
    private javax.swing.JToggleButton I1;
    private javax.swing.JToggleButton I2;
    private javax.swing.JToggleButton I3;
    private javax.swing.JToggleButton I4;
    private javax.swing.JToggleButton I5;
    private javax.swing.JToggleButton I6;
    private javax.swing.JToggleButton I7;
    private javax.swing.JToggleButton J1;
    private javax.swing.JToggleButton J2;
    private javax.swing.JToggleButton J3;
    private javax.swing.JToggleButton J4;
    private javax.swing.JToggleButton J5;
    private javax.swing.JToggleButton J6;
    private javax.swing.JToggleButton J7;
    private javax.swing.JLabel M_date;
    private javax.swing.JLabel M_hName;
    private javax.swing.JLabel M_name;
    private javax.swing.JLabel M_time;
    private javax.swing.JDialog confirm;
    private javax.swing.JLabel dn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1111;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel warn;
    // End of variables declaration//GEN-END:variables

}

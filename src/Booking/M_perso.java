package Booking;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * M_perso.java
 *
 * Created on Jul 17, 2017, 12:46:21 PM
 */

/**
 *
 * @author lab-2-user-4
 */
public class M_perso extends javax.swing.JFrame {

    /** Creates new form M_perso */
    public M_perso() {
        initComponents();

    }
public int ytre=0;
public String poiu="";
    void choice1(int k, String S_No, String hall, String MovieName, String time) {
        M_name.setText(MovieName);
        M_time.setText(time);
        M_hName.setText(hall);
ytre=k;
poiu=S_No;

System.out.println(ytre+"");
System.out.println(poiu+"");
System.out.println(S_No+"");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        M_name = new javax.swing.JLabel();
        M_time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        M_date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        M_hName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicPic - No. of Seats\n");
        setMinimumSize(new java.awt.Dimension(511, 410));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 164, 511, 10);

        jLabel1.setText("Movie Name :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(48, 78, 65, 14);

        jLabel2.setText("Time :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(48, 119, 29, 14);
        getContentPane().add(M_name);
        M_name.setBounds(119, 78, 98, 14);
        getContentPane().add(M_time);
        M_time.setBounds(119, 119, 98, 14);

        jLabel3.setText("Date :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(293, 78, 30, 14);

        M_date.setText("27/03/2017");
        getContentPane().add(M_date);
        M_date.setBounds(353, 79, 98, 14);

        jLabel4.setText("Hall Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(293, 119, 54, 14);
        getContentPane().add(M_hName);
        M_hName.setBounds(365, 119, 98, 14);

        jLabel5.setText("How Many Persons :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(207, 279, 98, 14);

        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        getContentPane().add(n1);
        n1.setBounds(86, 324, 39, 23);

        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        getContentPane().add(n2);
        n2.setBounds(131, 324, 39, 23);

        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });
        getContentPane().add(n3);
        n3.setBounds(176, 324, 39, 23);

        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        getContentPane().add(n4);
        n4.setBounds(221, 324, 39, 23);

        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });
        getContentPane().add(n5);
        n5.setBounds(266, 324, 39, 23);

        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });
        getContentPane().add(n6);
        n6.setBounds(311, 324, 39, 23);

        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });
        getContentPane().add(n7);
        n7.setBounds(356, 324, 39, 23);

        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });
        getContentPane().add(n8);
        n8.setBounds(401, 324, 39, 23);

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Tickpick_black_flat.png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(27, 11, 181, 46);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 68, 491, 10);

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 520, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        String b=n1.getText();
        connectToM_book(b);
}//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        String b=n2.getText();
        connectToM_book(b);      // TODO add your handling code here:
}//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        String b=n3.getText();
        connectToM_book(b);// TODO add your handling code here:
}//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        String b=n4.getText();
        connectToM_book(b);// TODO add your handling code here:
}//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        String b=n5.getText();
        connectToM_book(b);// TODO add your handling code here:
}//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        String b=n6.getText();
        connectToM_book(b);
}//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        String b=n7.getText();
        connectToM_book(b);
}//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        String b=n8.getText();
        connectToM_book(b);
}//GEN-LAST:event_n8ActionPerformed
void connectToM_book(String b){
        M_Book mb=new M_Book();
       mb.choice(ytre, poiu, M_hName.getText(), M_name.getText(), M_time.getText(),b);
        mb.setVisible(true);
        this.dispose();
}
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_perso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel M_date;
    private javax.swing.JLabel M_hName;
    private javax.swing.JLabel M_name;
    private javax.swing.JLabel M_time;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    // End of variables declaration//GEN-END:variables

}

package Booking;

import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * M_Login.java
 *
 * Created on 29 Jun, 2017, 4:35:40 PM
 */

/**
 *
 * @author Praj
 */
public class M_Login extends javax.swing.JFrame {
public String type="M_Login";
    /** Creates new form M_Login */
    public M_Login() {
        initComponents();
    }

    void setType(String Ltype) {
        type=Ltype;
    }

    void type(String id, String Type) {
        idTF1.setText(id);
    type=Type;
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
        icon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        idTF1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passTF1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel1111 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login-TickPick");
        setMinimumSize(new java.awt.Dimension(480, 480));
        getContentPane().setLayout(null);

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Tickpick_black_flat.png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(10, 11, 181, 46);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Click Here");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(316, 387, 78, 22);

        jLabel1.setText("Forgot Password ? Click Here");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(214, 291, 201, 23);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setText("User ID");

        jLabel6.setText("Password");

        passTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTF1ActionPerformed(evt);
            }
        });

        jButton2.setText("Log In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passTF1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButton2)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passTF1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(65, 100, 356, 180);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 79, 443, 10);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("New User?");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(246, 391, 64, 17);

        jLabel1111.setBackground(new java.awt.Color(102, 0, 102));
        jLabel1111.setOpaque(true);
        getContentPane().add(jLabel1111);
        jLabel1111.setBounds(0, 0, 470, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        makeID m=new makeID();
        m.setVisible(true);
        m.setType(type, "ticpic_Login");
        this.dispose();// TODO add your handling code here:
}//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Forgot_Password fp=new Forgot_Password();
        fp.setVisible(true);
        fp.setType(type, "ticpic_Login");
        this.dispose();// TODO add your handling code here:
        // TODO add your handling code here:
}//GEN-LAST:event_jLabel1MouseClicked

    private void passTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTF1ActionPerformed
        jButton2.doClick();        // TODO add your handling code here:
}//GEN-LAST:event_passTF1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id=idTF1.getText();
        String pass=new String(passTF1.getPassword());
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","sps");
            Statement stmt=con.createStatement();
            String query= "Select * from ticpic_login where ID='"+id+"' and password='"+pass+"' ;" ;
            ResultSet rs=stmt.executeQuery(query);

            if(rs.next()){
                String name=rs.getString(3);
                if(type.equals("M_Login")){
                    String query1= "Update rough set Login_ID='"+id+"';" ;
                    stmt.executeUpdate(query1);
                    Payment_confirmation bs=new Payment_confirmation();
                    bs.setVisible(true);


                } else if(type.equals("Login")){
                    manage_login ml=new manage_login();
                    ml.info(id , name);
                    ml.setVisible(true);
                } else  if(type.equals("Event")){
                    String query1= "Update rough1 set Login_ID='"+id+"';" ;
                    stmt.executeUpdate(query1);
                    E_pay bs=new E_pay();
                    bs.setVisible(true);
                }

                this.dispose();
            }

            else{
                JOptionPane.showMessageDialog(this, "Incorrect UserID / Password");
                idTF1.setText("");
                passTF1.setText("");
            }

        }

        catch(Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField idTF1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1111;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passTF1;
    // End of variables declaration//GEN-END:variables

}

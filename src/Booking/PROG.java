package Booking;


import javax.swing.JOptionPane;
import java.sql.*;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PROG.java
 *
 * Created on Jul 3, 2017, 1:27:56 PM
 */

/**
 *
 * @author lab-2-user-4
 */
public class PROG extends javax.swing.JFrame {

    /** Creates new form PROG */
    public PROG() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        TF1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(120, 120, 120)
                .addComponent(jButton2)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton2)))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jButton2.doClick();
        int count=1;
int k;
String table="t", seat, tblname;


for(int i=1;i<=3;i++){
    for(int j=1;j<=9;j++){
        tblname=(table+i+j);
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","sps");
            Statement stmt=con.createStatement();
           
          char row='A';
            outer : for(;row<='J';row++){
                for(k=1;k<=11;k++){
                    TF1.setText(k+"");
                    String s=TF1.getText();
                    
                    if(k>9){
                        if(row=='A' || row=='B' || row=='C' )
                    {
                        continue outer;
                    }}
                    if(k>7){
                        if(row=='H' || row=='I' || row=='J')
                    {
                       continue outer;
                    }}
                    seat=row+s;
 String query="Insert into "+tblname+" values('"+seat+"','NB');";
                    stmt.executeUpdate(query);
                    System.out.println(count+" "+seat);
                    count++;

                }
            }

            }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);

    }

}

}
System.out.println(count+"");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int count=1;
        char t='t';
String table="";
        for(int i=1;i<=3;i++){
for(int a=1;a<=9;a++){
    table=t+Integer.toString(i)+Integer.toString(a);
  try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","sps");
            Statement stmt=con.createStatement();
            String query="Delete from "+table+";";
            stmt.executeUpdate(query);
            count++;
  }
  catch(Exception e){
JOptionPane.showMessageDialog(this, e);
  }
}

}
System.out.println(count);
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author divyam
 */
public class book extends javax.swing.JFrame {
int xmouse;
int ymouse;

    /**
     * Creates new form book
     */
    public book() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ttname = new javax.swing.JTextField();
        txtad = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        txtp = new javax.swing.JTextField();
        txte = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        txtr = new javax.swing.JTextField();
        amttot = new javax.swing.JTextField();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        framedrag = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(925, 640));
        setMinimumSize(new java.awt.Dimension(925, 640));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(925, 640));
        getContentPane().setLayout(null);

        ttname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ttname.setOpaque(false);
        getContentPane().add(ttname);
        ttname.setBounds(170, 200, 250, 30);

        txtad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtad.setOpaque(false);
        getContentPane().add(txtad);
        txtad.setBounds(170, 280, 250, 30);

        txtc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtc.setOpaque(false);
        txtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcActionPerformed(evt);
            }
        });
        getContentPane().add(txtc);
        txtc.setBounds(170, 340, 250, 30);

        txtp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtp.setOpaque(false);
        getContentPane().add(txtp);
        txtp.setBounds(170, 380, 250, 30);

        txte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txte.setOpaque(false);
        getContentPane().add(txte);
        txte.setBounds(170, 420, 260, 30);

        txtd.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        txtd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtd.setOpaque(false);
        getContentPane().add(txtd);
        txtd.setBounds(240, 460, 120, 30);

        txtr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtr.setOpaque(false);
        getContentPane().add(txtr);
        txtr.setBounds(240, 500, 120, 30);

        amttot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        amttot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 4, true));
        amttot.setOpaque(false);
        getContentPane().add(amttot);
        amttot.setBounds(780, 490, 130, 40);

        cb1.setBackground(java.awt.SystemColor.activeCaption);
        cb1.setText("jCheckBox1");
        cb1.setBorderPainted(true);
        cb1.setOpaque(false);
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1);
        cb1.setBounds(620, 200, 20, 25);

        cb2.setText("jCheckBox2");
        cb2.setBorderPainted(true);
        cb2.setOpaque(false);
        getContentPane().add(cb2);
        cb2.setBounds(620, 240, 20, 25);

        cb3.setText("jCheckBox3");
        cb3.setBorderPainted(true);
        cb3.setOpaque(false);
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        getContentPane().add(cb3);
        cb3.setBounds(620, 280, 20, 25);

        jLabel2.setBackground(java.awt.SystemColor.activeCaption);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 50, 40);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 480, 200, 50);

        txtid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtid.setOpaque(false);
        getContentPane().add(txtid);
        txtid.setBounds(170, 240, 250, 30);

        jButton2.setBackground(java.awt.SystemColor.activeCaption);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("calculate amt");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 550, 130, 40);

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(850, 0, 80, 90);

        framedrag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        framedrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                framedragMouseDragged(evt);
            }
        });
        framedrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                framedragMousePressed(evt);
            }
        });
        getContentPane().add(framedrag);
        framedrag.setBounds(0, 0, 930, 60);

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(760, 10, 80, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/dVM 4.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 925, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
 try
        {
       
            Class.forName("java.sql.Driver");
             Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/test");
               Statement stmt= null;
              ResultSet rs=null;
              String SQL ="select * from dvm";
              stmt=con.createStatement();
              rs=stmt.executeQuery(SQL);
             
             while(rs.next())
             {
                 System.out.println(rs.getString("name")+":"+ rs.getString("address"));
             }
              String name= ttname.getText();
                String id= txtid.getText();
                  String address= txtad.getText();
                    String city= txtc.getText();
                      String phone= txtp.getText();
                        String email= txte.getText();
                   String days= txtd.getText();
                     String room= txtr.getText();
                      String amt= amttot.getText(); 
String strSQL="INSERT INTO dvm (name,id,address,city,phone,email,days,room,amt)"
        + "values('"+(name)+"','"+(id)+"','"+(address)+"','"+(city)+"','"+(phone)+"','"+(email)+"','"+(days)+"','"+(room)+"','"+(amt)+"')";
 
               System.out.print("insert new record :");
 int rowsEffected=stmt.executeUpdate(strSQL);
 System.out.println(rowsEffected+"rows effected");
 dev n2=new dev();
n2.setVisible(true);
this.setVisible(false);
        }
 catch (Exception e)

 
 
 {
     JOptionPane.showMessageDialog(this,e.getMessage());
     e.printStackTrace();
 }


        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
hotel n2=new hotel();
n2.setVisible(true);
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed



        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int r,d,tot;
String s;
s=txtd.getText();
d=Integer.parseInt(s);
s=txtr.getText();
r=Integer.parseInt(s);

if (cb1.isSelected())
{
    tot=r*2000+d*20000;
    amttot.setText(""+tot);
}
if (cb2.isSelected())
{
    tot=r*2500+d*25000;
    amttot.setText(""+tot);
}
if (cb3.isSelected())
{
    if (cb1.isSelected())
{
    tot=r*2000+d*20000+4000;
    amttot.setText(""+tot);
}
 else   if (cb2.isSelected())
{
    tot=r*2500+d*25000+4000;
    amttot.setText(""+tot);
}
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MousePressed

    private void framedragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMousePressed

        xmouse=evt.getX();
        ymouse=evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_framedragMousePressed

    private void framedragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMouseDragged
        int x =evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse,y-ymouse);
        // TODO add your handling code here:
    }//GEN-LAST:event_framedragMouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
           this.setState(book.ICONIFIED );
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amttot;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JLabel framedrag;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField ttname;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtp;
    private javax.swing.JTextField txtr;
    // End of variables declaration//GEN-END:variables
}

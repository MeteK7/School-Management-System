
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeteK
 */
public class LecturerLogForm extends javax.swing.JFrame {

    /**
     * Creates new form LecturerLogForm
     */
    public LecturerLogForm() {
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

        jLabel2 = new javax.swing.JLabel();
        btnStudEnter = new javax.swing.JButton();
        pswLecturerPass = new javax.swing.JPasswordField();
        lblStudWarning = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLecturerTc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("PASSWORD:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(85, 126, 90, 43);

        btnStudEnter.setIcon(new javax.swing.ImageIcon("C:\\Users\\MeteK\\Desktop\\Lessons\\Java Programming\\SchoolManagementSystem\\User-Interface-Login-icon.png")); // NOI18N
        btnStudEnter.setText("ENTER");
        btnStudEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudEnter);
        btnStudEnter.setBounds(188, 187, 140, 73);
        getContentPane().add(pswLecturerPass);
        pswLecturerPass.setBounds(188, 126, 139, 43);

        lblStudWarning.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblStudWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblStudWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStudWarning);
        lblStudWarning.setBounds(25, 266, 591, 45);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("T.C NUM:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(85, 65, 61, 43);
        getContentPane().add(txtLecturerTc);
        txtLecturerTc.setBounds(188, 65, 139, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MeteK\\Desktop\\Lessons\\Java Programming\\SchoolManagementSystem\\Abstract-business-background-newsroom-geometric-futuristic-field-white-with-black-lines-2-HD-img.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 640, 400);

        setSize(new java.awt.Dimension(657, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudEnterActionPerformed
        String host ="jdbc:derby://localhost:1527/SchoolDataBase";
        String userName="school";
        String userPass="123456";

        try{
            String pw=new String(pswLecturerPass.getPassword());
            boolean enter=false;
            Connection con=DriverManager.getConnection(host, userName,userPass);
            String sql="SELECT * FROM LECTURERINFO WHERE TCNUM = '" + txtLecturerTc.getText() +"'";
            /*Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);*/
            PreparedStatement stmt=con.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            String dept="null";
            String tcN="null";
            int supervisor=0;
            while (rs.next()) {
                String pass = rs.getString("PASSWORD");
                dept=rs.getString("DEPARTMENT");
                supervisor=rs.getInt("SUPERVISOR");

                if (pass == null ? pw == null : pass.equals(pw)) { //PLEASE IMPROVE HERE IF NECESSARY TO PUT BREAK OR NOT!!
                    enter=true;
                }
            }

            String tc=txtLecturerTc.getText();
            
            if(enter==true){
                this.setVisible(false);
                LecturerForm lecturerFrame=new LecturerForm(tc,dept,supervisor);
                lecturerFrame.setVisible(true);
            }

            else
            {
                lblStudWarning.setText("You've entered something uncorrect!");
            }

        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnStudEnterActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerLogForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerLogForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerLogForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerLogForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerLogForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblStudWarning;
    private javax.swing.JPasswordField pswLecturerPass;
    private javax.swing.JTextField txtLecturerTc;
    // End of variables declaration//GEN-END:variables
}

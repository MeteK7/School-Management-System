import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class StudentRegForm extends javax.swing.JFrame {
    
    public StudentRegForm() {
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

        txtStudName = new javax.swing.JTextField();
        txtStudSurname = new javax.swing.JTextField();
        txtStudEmail = new javax.swing.JTextField();
        txtStudPhoneNum = new javax.swing.JTextField();
        txtStudAddress = new javax.swing.JTextField();
        pswStudPass = new javax.swing.JPasswordField();
        txtStudCity = new javax.swing.JTextField();
        txtStudDistrict = new javax.swing.JTextField();
        txtStudRegYear = new javax.swing.JTextField();
        txtStudSchoolNum = new javax.swing.JLabel();
        btnStudReg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblStudDept = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbStudDept = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtStudTcNum = new javax.swing.JTextField();
        lblStudSchoolNum = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbStudFaculty = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Register");

        pswStudPass.setText("jPasswordField1");

        txtStudSchoolNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtStudSchoolNum.setForeground(new java.awt.Color(204, 0, 0));

        btnStudReg.setText("REGISTER");
        btnStudReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudRegActionPerformed(evt);
            }
        });

        jLabel1.setText("NAME");

        jLabel2.setText("SURNAME");

        jLabel3.setText("E-MAIL");

        jLabel4.setText("PHONE");

        lblStudDept.setText("DEPARTMENT");

        jLabel6.setText("PASSWORD");

        jLabel5.setText("Register Year");

        jLabel7.setText("CITY");

        jLabel8.setText("DISTRICT");

        jLabel9.setText("ADDRESS");

        jLabel10.setText("TC Number");

        lblStudSchoolNum.setText("School Num:");

        jLabel11.setText("FACULTY");

        cmbStudFaculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty of Engineering", "Faculty of Economics Administrative and Social Sciences", "Faculty of Fine Arts, Design and Architecture", " " }));
        cmbStudFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStudFacultyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btnStudReg, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pswStudPass, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 201, Short.MAX_VALUE)
                                .addComponent(lblStudSchoolNum, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudSchoolNum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(txtStudDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtStudEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStudSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtStudName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtStudRegYear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudCity, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudTcNum, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStudDept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbStudDept, 0, 267, Short.MAX_VALUE)
                    .addComponent(cmbStudFaculty, 0, 0, Short.MAX_VALUE))
                .addGap(308, 308, 308))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStudName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudRegYear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtStudSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtStudCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtStudEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(txtStudDistrict, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtStudPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(pswStudPass, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStudTcNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblStudSchoolNum, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbStudFaculty, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtStudAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(txtStudSchoolNum, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudDept, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStudDept, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnStudReg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(701, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudRegActionPerformed
        String query="INSERT INTO STUDENTINFO (NAME, SURNAME, EMAIL, PHONENUM, DEPARTMENT, PASSWORD, REGYEAR, CITY, DISTRICT, ADDRESS, SCHOOLNUM,TCNUM,FACULTY) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String host ="jdbc:derby://localhost:1527/SchoolDataBase";
        String userName="school";
        String userPass="123456";
        boolean rec=true;

        
        try{
            Connection con = DriverManager.getConnection(host,userName,userPass);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT TCNUM FROM STUDENTINFO");
            
            while ( rs.next() ) {
                String studTcFromSQL = rs.getString("TCNUM");
                String studTc = txtStudTcNum.getText();
                
                if (studTc == null ? studTcFromSQL == null : studTc.equals(studTcFromSQL)) {
                    rec=false;
                    JOptionPane.showInputDialog("There is already such student!");
                    break;
                }
            }
            con.close();
        } 
        
        catch (Exception e) 
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }        
        
        if (rec==true) {
            try{
                int studNum=0;
                generateStudNum(host,userName,userPass,studNum);            
                String schoolNum=txtStudRegYear.getText()+Integer.toString(studNum);
                String pw=new String(pswStudPass.getPassword());
                String cmbDept = String.valueOf(cmbStudDept.getSelectedItem());   
                String cmbFac = String.valueOf(cmbStudFaculty.getSelectedItem());    
                Connection con = DriverManager.getConnection(host,userName,userPass);
                PreparedStatement st=con.prepareStatement(query);
                st.setString(1,txtStudName.getText());
                st.setString(2,txtStudSurname.getText());
                st.setString(3,txtStudEmail.getText());
                st.setString(4,txtStudPhoneNum.getText());          
                st.setString(5,cmbDept);
                st.setString(6,pw);
                JOptionPane.showInputDialog(cmbFac);
                st.setString(7,txtStudRegYear.getText());
                st.setString(8,txtStudCity.getText());
                st.setString(9,txtStudDistrict.getText());
                st.setString(10,txtStudAddress.getText());
                st.setString(11,schoolNum);
                st.setString(12,txtStudTcNum.getText());
                st.setString(13,cmbFac);
                JOptionPane.showInputDialog(cmbFac);

                st.executeUpdate();
                con.close();
                JOptionPane.showInputDialog("Successful!");
                txtStudSchoolNum.setText(schoolNum);
            }
            catch ( SQLException err ) {
            System.err.println("Got an exception! ");
            System.err.println(err.getMessage());
            }
        }
    }//GEN-LAST:event_btnStudRegActionPerformed

    private void cmbStudFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudFacultyActionPerformed
        if (cmbStudFaculty.getSelectedItem().toString().equals("Faculty of Engineering")) {
            String[] dept = {"Computer-Software Enginering", "Civil Engineering", "Electrical-Electronic Engineering"};
            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(dept);
            cmbStudDept.setModel(defaultComboBoxModel);
        }
        else if(cmbStudFaculty.getSelectedItem().toString().equals("Faculty of Economics Administrative and Social Sciences")){
            String[] dept = {"Department of Business", "Psychology Department", "International Trade and Logistics Department"};
            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(dept);
            cmbStudDept.setModel(defaultComboBoxModel);        
        }
        else{
            String[] dept = {"Department of Architecture", "Department of Interior Architecture", "Department of Urban and Regional Planning"};
            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(dept);
            cmbStudDept.setModel(defaultComboBoxModel);         
        }
    }//GEN-LAST:event_cmbStudFacultyActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegForm().setVisible(true);
            }
        });
    }
    
    public static void generateStudNum(String host,String userName,String userPass,int studNum){
                try
            {
                Connection con = DriverManager.getConnection(host,userName,userPass);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT STUDAMOUNT FROM INDEX");
                while ( rs.next() ) {
                    studNum = rs.getInt("STUDAMOUNT");
                    studNum=studNum+1;
                }
                con.close();
            } 
        
            catch (Exception e) 
            {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
            try
            {
                Connection con = DriverManager.getConnection(host,userName,userPass);
                Statement st = con.createStatement();
                st.executeUpdate("UPDATE INDEX SET STUDAMOUNT="+studNum);
            }
            catch (SQLException ex)
            {
                System.err.println(ex.getMessage());
            }
    
    
    
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudReg;
    private javax.swing.JComboBox<String> cmbStudDept;
    private javax.swing.JComboBox<String> cmbStudFaculty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblStudDept;
    private javax.swing.JLabel lblStudSchoolNum;
    private javax.swing.JPasswordField pswStudPass;
    private javax.swing.JTextField txtStudAddress;
    private javax.swing.JTextField txtStudCity;
    private javax.swing.JTextField txtStudDistrict;
    private javax.swing.JTextField txtStudEmail;
    private javax.swing.JTextField txtStudName;
    private javax.swing.JTextField txtStudPhoneNum;
    private javax.swing.JTextField txtStudRegYear;
    private javax.swing.JLabel txtStudSchoolNum;
    private javax.swing.JTextField txtStudSurname;
    private javax.swing.JTextField txtStudTcNum;
    // End of variables declaration//GEN-END:variables
}

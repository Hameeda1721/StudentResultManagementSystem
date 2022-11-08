package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JFrame
{
    public AddStudent() 
    {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name = new javax.swing.JLabel();
        RollNo = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        FatherName = new javax.swing.JLabel();
        Course = new javax.swing.JLabel();
        Branch = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        EnterStudentName = new javax.swing.JTextField();
        EnterRollNo = new javax.swing.JTextField();
        StudentGender = new javax.swing.JComboBox<>();
        StudentCourse = new javax.swing.JComboBox<>();
        StudentBranch = new javax.swing.JComboBox<>();
        EnterFathername = new javax.swing.JTextField();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Name.setText("Name");
        Name.setMaximumSize(new java.awt.Dimension(180, 70));
        Name.setMinimumSize(new java.awt.Dimension(180, 70));
        Name.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, 40));

        RollNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RollNo.setText("Roll No");
        RollNo.setMaximumSize(new java.awt.Dimension(180, 70));
        RollNo.setMinimumSize(new java.awt.Dimension(180, 70));
        RollNo.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(RollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 100, 40));

        Gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Gender.setText("Gender");
        Gender.setMaximumSize(new java.awt.Dimension(180, 70));
        Gender.setMinimumSize(new java.awt.Dimension(180, 70));
        Gender.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, 40));

        FatherName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FatherName.setText("Father's Name");
        FatherName.setMaximumSize(new java.awt.Dimension(180, 70));
        FatherName.setMinimumSize(new java.awt.Dimension(180, 70));
        FatherName.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(FatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 140, 30));

        Course.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Course.setText("Course");
        Course.setMaximumSize(new java.awt.Dimension(180, 70));
        Course.setMinimumSize(new java.awt.Dimension(180, 70));
        Course.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, 30));

        Branch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Branch.setText("Branch");
        Branch.setMaximumSize(new java.awt.Dimension(180, 70));
        Branch.setMinimumSize(new java.awt.Dimension(180, 70));
        Branch.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(Branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 100, 30));

        Submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-submit-document-32.png"))); // NOI18N
        Submit.setText("Submit");
        Submit.setMaximumSize(new java.awt.Dimension(180, 70));
        Submit.setMinimumSize(new java.awt.Dimension(180, 70));
        Submit.setPreferredSize(new java.awt.Dimension(180, 70));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 40));

        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-24.png"))); // NOI18N
        Cancel.setText("Cancel");
        Cancel.setMaximumSize(new java.awt.Dimension(180, 70));
        Cancel.setMinimumSize(new java.awt.Dimension(180, 70));
        Cancel.setPreferredSize(new java.awt.Dimension(180, 70));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 110, 30));

        Clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clear.setText("Clear");
        Clear.setMaximumSize(new java.awt.Dimension(180, 70));
        Clear.setMinimumSize(new java.awt.Dimension(180, 70));
        Clear.setPreferredSize(new java.awt.Dimension(180, 70));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 90, 30));
        getContentPane().add(EnterStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 140, -1));
        getContentPane().add(EnterRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 150, -1));

        StudentGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(StudentGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 150, -1));

        StudentCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTech" }));
        getContentPane().add(StudentCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 150, 20));

        StudentBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "Civil", "Chemical", "Electrical", "Mechanical" }));
        getContentPane().add(StudentBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 150, 20));
        getContentPane().add(EnterFathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 150, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        image.setText("jLabel7");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
         int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
         if(flag==0)
         {
             setVisible(false);
         }
    }//GEN-LAST:event_CancelActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String name = EnterStudentName.getText();
        String rollNo = EnterRollNo.getText();
        String gender = (String)StudentGender.getSelectedItem();
        String fatherName = EnterFathername.getText();
        String course = (String)StudentCourse.getSelectedItem();
        String branch = (String)StudentBranch.getSelectedItem();
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st= con.createStatement();
            st.executeUpdate("INSERT INTO student VALUES('"+name+"','"+rollNo+"','"+gender+"','"+fatherName+"','"+course+"','"+branch+"')");
            JOptionPane.showMessageDialog(null,"Successfully added");
            setVisible(false);
            AddStudent frame = new AddStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);           
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
            setVisible(false);
            AddStudent frame = new AddStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);  
    }//GEN-LAST:event_ClearActionPerformed
        public static void main(String args[])
        {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Branch;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel Course;
    private javax.swing.JTextField EnterFathername;
    private javax.swing.JTextField EnterRollNo;
    private javax.swing.JTextField EnterStudentName;
    private javax.swing.JLabel FatherName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel RollNo;
    private javax.swing.JComboBox<String> StudentBranch;
    private javax.swing.JComboBox<String> StudentCourse;
    private javax.swing.JComboBox<String> StudentGender;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}

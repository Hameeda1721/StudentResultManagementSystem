package ManagementSystem;
import javax.swing.JOptionPane;

public class AdminHomePage extends javax.swing.JFrame
{
    public AdminHomePage()
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddStudent = new javax.swing.JButton();
        AddResult = new javax.swing.JButton();
        ListStudents = new javax.swing.JButton();
        UpdateStudent = new javax.swing.JButton();
        ListStudentResults = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-student.png"))); // NOI18N
        AddStudent.setText("Add Student");
        AddStudent.setMaximumSize(new java.awt.Dimension(180, 70));
        AddStudent.setMinimumSize(new java.awt.Dimension(180, 70));
        AddStudent.setPreferredSize(new java.awt.Dimension(180, 70));
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(AddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, 60));

        AddResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-grade-24.png"))); // NOI18N
        AddResult.setText("Add Result");
        AddResult.setMaximumSize(new java.awt.Dimension(180, 70));
        AddResult.setMinimumSize(new java.awt.Dimension(180, 70));
        AddResult.setPreferredSize(new java.awt.Dimension(180, 70));
        AddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddResultActionPerformed(evt);
            }
        });
        getContentPane().add(AddResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, 40));

        ListStudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-checklist-30.png"))); // NOI18N
        ListStudents.setText("List Students");
        ListStudents.setMaximumSize(new java.awt.Dimension(180, 70));
        ListStudents.setMinimumSize(new java.awt.Dimension(180, 70));
        ListStudents.setPreferredSize(new java.awt.Dimension(180, 70));
        ListStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 180, 40));

        UpdateStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-edit student.png"))); // NOI18N
        UpdateStudent.setText("Update Student");
        UpdateStudent.setMaximumSize(new java.awt.Dimension(180, 70));
        UpdateStudent.setMinimumSize(new java.awt.Dimension(180, 70));
        UpdateStudent.setPreferredSize(new java.awt.Dimension(180, 70));
        UpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 190, 40));

        ListStudentResults.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListStudentResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-checklist-30.png"))); // NOI18N
        ListStudentResults.setText("List Student Results");
        ListStudentResults.setMaximumSize(new java.awt.Dimension(180, 70));
        ListStudentResults.setMinimumSize(new java.awt.Dimension(180, 70));
        ListStudentResults.setPreferredSize(new java.awt.Dimension(180, 70));
        ListStudentResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentResultsActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudentResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 200, 40));

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-submit-document-32.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setMaximumSize(new java.awt.Dimension(180, 70));
        Logout.setMinimumSize(new java.awt.Dimension(180, 70));
        Logout.setPreferredSize(new java.awt.Dimension(180, 70));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 130, 50));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        image.setText("jLabel1");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudentActionPerformed
        UpdateStudent frame= new UpdateStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_UpdateStudentActionPerformed

    private void AddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddResultActionPerformed
        AddResults frame= new AddResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_AddResultActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            setVisible(false);
             Home frame = new Home();
             frame.setVisible(true);
             frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        AddStudent frame= new AddStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_AddStudentActionPerformed

    private void ListStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentsActionPerformed
        // TODO add your handling code here:
        ListStudents frame= new ListStudents();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListStudentsActionPerformed

    private void ListStudentResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentResultsActionPerformed
        ListstudentResults frame= new ListstudentResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListStudentResultsActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddResult;
    private javax.swing.JButton AddStudent;
    private javax.swing.JButton ListStudentResults;
    private javax.swing.JButton ListStudents;
    private javax.swing.JButton Logout;
    private javax.swing.JButton UpdateStudent;
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}

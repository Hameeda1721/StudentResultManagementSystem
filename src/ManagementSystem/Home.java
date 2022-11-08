package ManagementSystem;
public class Home extends javax.swing.JFrame
{
     public Home()
     {
        initComponents();
     }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Student = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Student.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Desktop\\project\\StudentResultManagementSystem\\Icon\\icons8-schoolboy-at-a-desk-30.png")); // NOI18N
        Student.setText("Student");
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        getContentPane().add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 50));

        Admin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-admin-settings-male-30.png"))); // NOI18N
        Admin.setText("Admin");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 50));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        image.setText("jLabel1");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        setVisible(false);
        AdminHomePage frame= new AdminHomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_AdminActionPerformed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        setVisible(false);
        StudentHomePage frame= new StudentHomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_StudentActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Home frame = new Home();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Student;
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}

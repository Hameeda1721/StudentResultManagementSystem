package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class StudentHomePage extends javax.swing.JFrame 
{
    public StudentHomePage()
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentResultPage = new javax.swing.JLabel();
        RollNo = new javax.swing.JLabel();
        EnterRollNo = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StudentResultPage.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        StudentResultPage.setText("Student Result page");
        getContentPane().add(StudentResultPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 350, 60));

        RollNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RollNo.setText("Roll Number");
        getContentPane().add(RollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, 40));
        getContentPane().add(EnterRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, 30));

        Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-search-30.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 130, 40));

        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-24.png"))); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 130, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        background.setText("jLabel3");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
       
        String rollNo = EnterRollNo.getText();
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= st.executeQuery("SELECT * FROM result WHERE rollNo='"+rollNo+"'");
            if(!rs.first())
            {
                JOptionPane.showMessageDialog(null, "Roll no doesn't exit");
            }
            else
            {
                StudentResultPage frame = new StudentResultPage(rollNo);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null); 
            }  
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
         int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
         if(flag==0)
         {
             setVisible(false);
         }
    }//GEN-LAST:event_CancelActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new StudentHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField EnterRollNo;
    private javax.swing.JLabel RollNo;
    private javax.swing.JButton Search;
    private javax.swing.JLabel StudentResultPage;
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}

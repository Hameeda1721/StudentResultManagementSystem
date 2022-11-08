package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateStudent extends javax.swing.JFrame
{
      public UpdateStudent()
      {
        initComponents();
      }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RollNo = new javax.swing.JLabel();
        EnterRollNo = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Physics = new javax.swing.JLabel();
        Maths = new javax.swing.JLabel();
        Chemistry = new javax.swing.JLabel();
        Electrical = new javax.swing.JLabel();
        Biology = new javax.swing.JLabel();
        PhyMarks = new javax.swing.JTextField();
        MathsMarks = new javax.swing.JTextField();
        ChemistryMarks = new javax.swing.JTextField();
        ElectricalMarks = new javax.swing.JTextField();
        BiologyMarks = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RollNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RollNo.setText("Roll No");
        getContentPane().add(RollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 80, 20));
        getContentPane().add(EnterRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, -1));

        Search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-search-30.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 130, 30));

        Physics.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Physics.setText("Physics-1");
        getContentPane().add(Physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, 30));

        Maths.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Maths.setText("Maths");
        getContentPane().add(Maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 100, 30));

        Chemistry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Chemistry.setText("Chemitry");
        getContentPane().add(Chemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 90, 30));

        Electrical.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Electrical.setText("Electrical");
        getContentPane().add(Electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 100, 30));

        Biology.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Biology.setText("Biology");
        getContentPane().add(Biology, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 100, 30));
        getContentPane().add(PhyMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 92, 130, 30));

        MathsMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MathsMarksActionPerformed(evt);
            }
        });
        getContentPane().add(MathsMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 152, 130, 30));
        getContentPane().add(ChemistryMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 202, 130, 30));
        getContentPane().add(ElectricalMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 262, 130, 30));
        getContentPane().add(BiologyMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 322, 130, 30));

        Save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-submit-document-32.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 100, -1));

        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-24.png"))); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, 40));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        image.setText("jLabel1");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MathsMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MathsMarksActionPerformed

    }//GEN-LAST:event_MathsMarksActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String rollNo = BiologyMarks.getText();
        int physicsMarks = Integer.parseInt(EnterRollNo.getText());
        int mathsMarks = Integer.parseInt(PhyMarks.getText());
        int chemistryMarks = Integer.parseInt(MathsMarks.getText());
        int electricalMarks = Integer.parseInt(ChemistryMarks.getText());
        int biologyMarks = Integer.parseInt(ElectricalMarks.getText());
        int result=0;
        result=physicsMarks+mathsMarks+chemistryMarks+electricalMarks+biologyMarks;
        try
        {
            Connection con =ConnectionProvider.getCon();
            Statement st= con.createStatement();
            st.executeUpdate("UPDATE result SET physics="+physicsMarks+",maths="+mathsMarks+",chemical="+chemistryMarks+",electrical="+ electricalMarks+",biology="+biologyMarks+",result="+result+" WHERE rollNo='"+rollNo+"'");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
             setVisible(false);
            UpdateStudent frame = new UpdateStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
         String rollNo = EnterRollNo.getText();
        try
        {
            Connection con = ConnectionProvider.getCon();
             Statement st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs= st.executeQuery("SELECT * FROM result WHERE rollNo='"+rollNo+"'");
             if(!rs.first())
             {
                JOptionPane.showMessageDialog(null, "Roll No doesn't exit");
             }
             else
             {
                  PhyMarks.setText(rs.getString(2));
                  MathsMarks.setText(rs.getString(3));
                  ChemistryMarks.setText(rs.getString(4));
                  ElectricalMarks.setText(rs.getString(5));
                  BiologyMarks.setText(rs.getString(6));
                  EnterRollNo.setEditable(false);  
             } 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
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
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Biology;
    private javax.swing.JTextField BiologyMarks;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel Chemistry;
    private javax.swing.JTextField ChemistryMarks;
    private javax.swing.JLabel Electrical;
    private javax.swing.JTextField ElectricalMarks;
    private javax.swing.JTextField EnterRollNo;
    private javax.swing.JLabel Maths;
    private javax.swing.JTextField MathsMarks;
    private javax.swing.JTextField PhyMarks;
    private javax.swing.JLabel Physics;
    private javax.swing.JLabel RollNo;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}

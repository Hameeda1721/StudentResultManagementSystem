package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class StudentResultPage extends javax.swing.JFrame
{

    public StudentResultPage()
    {
        initComponents();
    }
     public StudentResultPage(String rollNo)
     {
        initComponents();
        EnterRollNo.setText(rollNo);
      }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RollNo = new javax.swing.JLabel();
        EnterRollNo = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        FatherName = new javax.swing.JLabel();
        Course = new javax.swing.JLabel();
        Branch = new javax.swing.JLabel();
        EnterName = new javax.swing.JTextField();
        Entergender = new javax.swing.JTextField();
        EnterFatherName = new javax.swing.JTextField();
        EnterCourse = new javax.swing.JTextField();
        EnterBranch = new javax.swing.JTextField();
        Physics = new javax.swing.JLabel();
        Maths = new javax.swing.JLabel();
        Chemistry = new javax.swing.JLabel();
        Electrical = new javax.swing.JLabel();
        Biology = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        TotalMarks = new javax.swing.JLabel();
        PassingMarks = new javax.swing.JLabel();
        MarksObtained = new javax.swing.JLabel();
        TotalMarksPhy = new javax.swing.JLabel();
        TotalMarksMaths = new javax.swing.JLabel();
        TotalMarksChemistry = new javax.swing.JLabel();
        TotalMarksElectrical = new javax.swing.JLabel();
        TotalMarksBiology = new javax.swing.JLabel();
        PhysicsforPass = new javax.swing.JLabel();
        MathsforPass = new javax.swing.JLabel();
        ChemistryforPass = new javax.swing.JLabel();
        ElectricalforPass = new javax.swing.JLabel();
        BiologyforPass = new javax.swing.JLabel();
        Verdict = new javax.swing.JLabel();
        PhysicsMarks = new javax.swing.JTextField();
        MathsMarks = new javax.swing.JTextField();
        ChemistryMarks = new javax.swing.JTextField();
        ElectricalMarks = new javax.swing.JTextField();
        BiologyMarks = new javax.swing.JTextField();
        TotalMarksGot = new javax.swing.JTextField();
        PassorFail = new javax.swing.JTextField();
        Logout = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RollNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RollNo.setText("Roll No");
        getContentPane().add(RollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 60, -1));
        getContentPane().add(EnterRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 120, 30));

        Name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Name.setText("Name");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 20));

        Gender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Gender.setText("Gender");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, 20));

        FatherName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FatherName.setText("FatherName");
        getContentPane().add(FatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, 20));

        Course.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Course.setText("Course");
        getContentPane().add(Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 80, 20));

        Branch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Branch.setText("Branch");
        getContentPane().add(Branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 70, 20));
        getContentPane().add(EnterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));
        getContentPane().add(Entergender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 110, 30));
        getContentPane().add(EnterFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 110, 30));
        getContentPane().add(EnterCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 120, 30));
        getContentPane().add(EnterBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 120, 30));

        Physics.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Physics.setText("Physics ");
        getContentPane().add(Physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 226, 80, 20));

        Maths.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Maths.setText("Maths");
        getContentPane().add(Maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 20));

        Chemistry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Chemistry.setText("Chemistry");
        getContentPane().add(Chemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 316, 80, 20));

        Electrical.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Electrical.setText("Electrical");
        getContentPane().add(Electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 366, 80, 20));

        Biology.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Biology.setText("Biology");
        getContentPane().add(Biology, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 416, 80, 20));

        Total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Total.setText("Total");
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 70, 20));

        TotalMarks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TotalMarks.setText("Total Marks");
        getContentPane().add(TotalMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        PassingMarks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PassingMarks.setText("Passing Marks");
        getContentPane().add(PassingMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        MarksObtained.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MarksObtained.setText("Marks Obtained");
        getContentPane().add(MarksObtained, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        TotalMarksPhy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TotalMarksPhy.setText("100");
        getContentPane().add(TotalMarksPhy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        TotalMarksMaths.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TotalMarksMaths.setText("100");
        getContentPane().add(TotalMarksMaths, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        TotalMarksChemistry.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TotalMarksChemistry.setText("100");
        getContentPane().add(TotalMarksChemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        TotalMarksElectrical.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TotalMarksElectrical.setText("100");
        getContentPane().add(TotalMarksElectrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        TotalMarksBiology.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TotalMarksBiology.setText("100");
        getContentPane().add(TotalMarksBiology, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        PhysicsforPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PhysicsforPass.setText("30");
        getContentPane().add(PhysicsforPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        MathsforPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MathsforPass.setText("30");
        getContentPane().add(MathsforPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        ChemistryforPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChemistryforPass.setText("30");
        getContentPane().add(ChemistryforPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        ElectricalforPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ElectricalforPass.setText("30");
        getContentPane().add(ElectricalforPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        BiologyforPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BiologyforPass.setText("30");
        getContentPane().add(BiologyforPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        Verdict.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Verdict.setText("Verdict");
        getContentPane().add(Verdict, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 60, -1));
        getContentPane().add(PhysicsMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 130, -1));
        getContentPane().add(MathsMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 130, -1));
        getContentPane().add(ChemistryMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 130, -1));
        getContentPane().add(ElectricalMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 130, -1));
        getContentPane().add(BiologyMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 130, -1));
        getContentPane().add(TotalMarksGot, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 110, -1));
        getContentPane().add(PassorFail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 110, -1));

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        image.setText("jLabel27");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        String rollNo = EnterRollNo.getText();
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
              ResultSet rs= st.executeQuery("SELECT * FROM student INNER JOIN result WHERE student.rollNo='"+rollNo+"' AND result.rollNo='"+rollNo+"'");
               if(!rs.first())
               {
                JOptionPane.showMessageDialog(null, "Roll No doesn't exit");
               }
               else
               {
                   EnterName.setText(rs.getString(2));
                   Entergender.setText(rs.getString(3));
                   EnterFatherName.setText(rs.getString(4));
                   EnterCourse.setText(rs.getString(5));
                   EnterBranch.setText(rs.getString(6));
                   
                   PhysicsMarks.setText(rs.getString(8));
                   MathsMarks.setText(rs.getString(9));
                   ChemistryMarks.setText(rs.getString(10));
                   ElectricalMarks.setText(rs.getString(11));
                   BiologyMarks.setText(rs.getString(12));
                   
                   TotalMarksGot.setText(rs.getString(13));
                   
                   int m1 =Integer.parseInt(rs.getString(8));
                   int m2 =Integer.parseInt(rs.getString(9));
                   int m3 =Integer.parseInt(rs.getString(10));
                   int m4 =Integer.parseInt(rs.getString(11));
                   int m5 =Integer.parseInt(rs.getString(12));
                   
                   if(m1<30 || m2<30 || m3<30 || m4<30 || m5<30)
                   {
                       PassorFail.setText("Fail");
                   }
                   else
                   {
                        PassorFail.setText("Pass");
                   }
                   EnterRollNo.setEditable(false);
                   EnterName.setEditable(false);
                   Entergender.setEditable(false);
                   EnterFatherName.setEditable(false);
                   EnterCourse.setEditable(false);
                   EnterBranch.setEditable(false);
                   PhysicsMarks.setEditable(false);
                   MathsMarks.setEditable(false);
                   ChemistryMarks.setEditable(false);
                   ElectricalMarks.setEditable(false);
                   BiologyMarks.setEditable(false);
                   TotalMarksGot.setEditable(false);
                   PassorFail.setEditable(false);  
               }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
         int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
         if(flag==0)
         {
             setVisible(false);
         }
    }//GEN-LAST:event_LogoutActionPerformed
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Biology;
    private javax.swing.JTextField BiologyMarks;
    private javax.swing.JLabel BiologyforPass;
    private javax.swing.JLabel Branch;
    private javax.swing.JLabel Chemistry;
    private javax.swing.JTextField ChemistryMarks;
    private javax.swing.JLabel ChemistryforPass;
    private javax.swing.JLabel Course;
    private javax.swing.JLabel Electrical;
    private javax.swing.JTextField ElectricalMarks;
    private javax.swing.JLabel ElectricalforPass;
    private javax.swing.JTextField EnterBranch;
    private javax.swing.JTextField EnterCourse;
    private javax.swing.JTextField EnterFatherName;
    private javax.swing.JTextField EnterName;
    private javax.swing.JTextField EnterRollNo;
    private javax.swing.JTextField Entergender;
    private javax.swing.JLabel FatherName;
    private javax.swing.JLabel Gender;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel MarksObtained;
    private javax.swing.JLabel Maths;
    private javax.swing.JTextField MathsMarks;
    private javax.swing.JLabel MathsforPass;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel PassingMarks;
    private javax.swing.JTextField PassorFail;
    private javax.swing.JLabel Physics;
    private javax.swing.JTextField PhysicsMarks;
    private javax.swing.JLabel PhysicsforPass;
    private javax.swing.JLabel RollNo;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalMarks;
    private javax.swing.JLabel TotalMarksBiology;
    private javax.swing.JLabel TotalMarksChemistry;
    private javax.swing.JLabel TotalMarksElectrical;
    private javax.swing.JTextField TotalMarksGot;
    private javax.swing.JLabel TotalMarksMaths;
    private javax.swing.JLabel TotalMarksPhy;
    private javax.swing.JLabel Verdict;
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}

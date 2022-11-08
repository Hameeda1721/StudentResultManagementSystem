package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class AddResults extends javax.swing.JFrame{
  public AddResults(){
        initComponents();
    }
   private void initComponents(){
        rollno = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InformationTable = new javax.swing.JTable();
        physics = new javax.swing.JLabel();
        maths = new javax.swing.JLabel();
        chemistry = new javax.swing.JLabel();
        electrical = new javax.swing.JLabel();
        biology = new javax.swing.JLabel();
        PhysicsMarks = new javax.swing.JTextField();
        MathsMarks = new javax.swing.JTextField();
        ChemistryMarks = new javax.swing.JTextField();
        ElectricalMarks = new javax.swing.JTextField();
        BiologyMarks = new javax.swing.JTextField();
        EnterRollNo = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rollno.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        rollno.setText("Roll No");
        getContentPane().add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        search.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-search-30.png"))); 
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 120, 30));

        InformationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "name", "rollNo", "gender", " fatherName", "course", "branch"
            }
        ));
        jScrollPane1.setViewportView(InformationTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 530, 100));

        physics.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        physics.setText("Physics-1");
        getContentPane().add(physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 70, -1));

        maths.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        maths.setText("Maths");
        getContentPane().add(maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 70, 20));

        chemistry.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        chemistry.setText("Chemistry");
        getContentPane().add(chemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 60, -1));

        electrical.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        electrical.setText("Electrical");
        getContentPane().add(electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 60, -1));

        biology.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        biology.setText("Biology");
        getContentPane().add(biology, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 50, -1));
        getContentPane().add(PhysicsMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 130, 30));
        getContentPane().add(MathsMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 242, 130, 30));

        ChemistryMarks.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ChemistryMarksActionPerformed(evt);
            }
        });
        getContentPane().add(ChemistryMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 282, 130, 30));
        getContentPane().add(ElectricalMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 130, 30));
        getContentPane().add(BiologyMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 130, 30));
        getContentPane().add(EnterRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, -1));

        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-submit-document-32.png"))); 
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 130, -1));

        Close.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-close-30.png"))); 
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, 30));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        image.setText("jLabel1");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -140, -1, -1));

        pack();
    }

    private void ChemistryMarksActionPerformed(java.awt.event.ActionEvent evt){

    }

    private void searchActionPerformed(java.awt.event.ActionEvent evt){
        String rollNo = EnterRollNo.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= st.executeQuery("SELECT * FROM student WHERE rollNo='"+rollNo+"'");
            InformationTable.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered rollNo is Wrong");
            }
        }
        catch(Exception e){        
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    private void submitActionPerformed(java.awt.event.ActionEvent evt){

        String rollNo = EnterRollNo.getText();
        int physicsMarks = Integer.parseInt(PhysicsMarks.getText());
        int mathsMarks = Integer.parseInt(MathsMarks.getText());
        int chemistryMarks = Integer.parseInt(ChemistryMarks.getText());
        int electricalMarks = Integer.parseInt(ElectricalMarks.getText());
        int biologyMarks = Integer.parseInt(BiologyMarks.getText());
        int result=0;
        result=physicsMarks+mathsMarks+chemistryMarks+electricalMarks+biologyMarks;
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.execute("INSERT INTO result VALUES('"+rollNo+"','"+physicsMarks+"','"+mathsMarks+"','"+chemistryMarks+"','"+electricalMarks+"','"+biologyMarks+"','"+result+"')");
            JOptionPane.showMessageDialog(null,"Sucessfully Added");
            setVisible(false);
            AddResults frame = new AddResults();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());   
        }
    }
    private void CloseActionPerformed(java.awt.event.ActionEvent evt){
         int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
         if(flag==0){
             setVisible(false);
         }
    }
         public static void main(String args[]){
          java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new AddResults().setVisible(true);
            }
        });
    }
    private javax.swing.JTextField BiologyMarks;
    private javax.swing.JTextField ChemistryMarks;
    private javax.swing.JButton Close;
    private javax.swing.JTextField ElectricalMarks;
    private javax.swing.JTextField EnterRollNo;
    private javax.swing.JTable InformationTable;
    private javax.swing.JTextField MathsMarks;
    private javax.swing.JTextField PhysicsMarks;
    private javax.swing.JLabel biology;
    private javax.swing.JLabel chemistry;
    private javax.swing.JLabel electrical;
    private javax.swing.JLabel image;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maths;
    private javax.swing.JLabel physics;
    private javax.swing.JLabel rollno;
    private javax.swing.JButton search;
    private javax.swing.JButton submit;
   
}

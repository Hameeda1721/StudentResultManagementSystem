package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ListStudents extends javax.swing.JFrame{
    public ListStudents(){
        initComponents();
    }
    private void initComponents(){

        jScrollPane1 = new javax.swing.JScrollPane();
        ListofStudent = new javax.swing.JTable();
        Exit = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        addComponentListener(new java.awt.event.ComponentAdapter(){
            public void componentShown(java.awt.event.ComponentEvent evt){
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListofStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]{
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []{
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ListofStudent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 510, 180));

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-24.png"))); 
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 100, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp4720655-anime-school-aesthetic-wallpapers.jpg"))); 
        image.setText("jLabel1");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -200, -1, -1));

        pack();
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt){
       try{
            Connection con = ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery("SELECT *FROM student");
            ListofStudent.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void ExitActionPerformed(java.awt.event.ActionEvent evt){
         int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
         if(flag==0){
             setVisible(false);
         }
    }

    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new ListStudents().setVisible(true);
            }
        });
    }
    private javax.swing.JButton Exit;
    private javax.swing.JTable ListofStudent;
    private javax.swing.JLabel image;
    private javax.swing.JScrollPane jScrollPane1;
    
}

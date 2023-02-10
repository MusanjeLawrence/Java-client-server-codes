
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.lang.NullPointerException;
//import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.lang.NullPointerException;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
public class AGRICULTURAL_LIVELIHOOD_STUDENTS extends javax.swing.JFrame {

     Connection con; //establish connection
  PreparedStatement statement; //execute sql statement more of optimised
  Statement st;//execute sql statement less of optimised
  String cs; //holding path of the database
  String user;//username for the database
  String password;//password for the database
  String query;
  ResultSet rs;
  String records;
  Boolean bnext = false;
  Boolean bprevious = true;
    public AGRICULTURAL_LIVELIHOOD_STUDENTS() {
        initComponents();
            con = null;
    st = null;
    statement = null;
    
    cs = "jdbc:mysql://localhost:3306/university";
    user = "root";
    password = "peacebewithyouall2020";
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblRegNo = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnfind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtRegno = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        reportbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGRICULTURAL LIVELIHOOD STUDENTS");

        lblRegNo.setText("RegNo");

        lblFirstName.setText("FirstName");

        lblLastName.setText("LastName");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnfind.setText("Find");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnprevious.setText("Previous");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        reportbtn.setText("Report");
        reportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblRegNo)
                                    .addGap(104, 104, 104))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFirstName)
                                    .addGap(111, 111, 111)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLastName)
                                .addGap(112, 112, 112)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txtRegno)
                            .addComponent(txtLastName)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnfind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprevious))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(reportbtn)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRegNo)
                    .addComponent(txtRegno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblFirstName)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(reportbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnfind)
                    .addComponent(btnDelete)
                    .addComponent(btnNext)
                    .addComponent(btnFirst)
                    .addComponent(btnLast)
                    .addComponent(btnprevious)))
        );

        pack();
    }// </editor-fold>                        

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         if(txtRegno.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please insert  RegNo");
            txtRegno.requestFocus();
            return;
        }
        if(txtFirstName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please insert First Name");
            txtFirstName.requestFocus();
            return;
        }
        if(txtLastName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please insert  Last Name ");
            txtLastName.requestFocus();
            return;
        } 
        
String s1 =  txtRegno.getText();
String s2 =  txtFirstName.getText();
String s3 =  txtLastName.getText();

try {
    
    Class.forName("com.mysql.jdbc.Driver");//register JDBC driver
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "INSERT INTO AGRICULTURAL_LIVELIHOOD_STUDENTS (REGISTRATION_NUMBER,FIRST_NAME,LAST_NAME) VALUES ('"+s1+"','"+s2+"','"+s3+"')";
    st. executeUpdate(query);
    JOptionPane.showMessageDialog(null,"Record saved successfully");
    
    txtRegno.setText("");
     txtFirstName.setText("");
     txtLastName.setText("");
    
     
     txtRegno.requestFocus();  //setting focus on REGNO   
}
catch (SQLException ex){
    ex.printStackTrace();//displays information about SQL statement incase you typed table name or field name that is not existing
    //it displays where the error may be
}
catch (ClassNotFoundException e){
  e.printStackTrace();  //checks if the driver  is not configured
}

finally{
    
    try{
        if(st != null)
        {
            st.close();
        }
        if(con != null){
            con.close();
        }
    }
        catch (SQLException ex){
                ex.printStackTrace();
                }
    }

    }                                       

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
    
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "SELECT * FROM AGRICULTURAL_LIVELIHOOD_STUDENTS WHERE   REGISTRATION_NUMBER = '"+txtRegno.getText()+"'";
    
    ResultSet rs = st.executeQuery(query);
    if(rs.first()){
       txtRegno.setText(rs.getString("REGISTRATION_NUMBER")); 
        txtFirstName.setText(rs.getString("FIRST_NAME"));
       txtLastName.setText(rs.getString("LAST_NAME"));
      
    }
    else{
        JOptionPane.showMessageDialog(null,"Record not found");
        txtRegno.setText("");
        txtRegno.requestFocus();
    }
    
    
       
}
catch (SQLException ex){
    ex.printStackTrace();
}
catch (ClassNotFoundException e){
  e.printStackTrace();  
}

finally{
    
    try{
        if(st != null)
        {
            st.close();
        }
        if(con != null){
            con.close();
        }
    }
        catch (SQLException ex){
                ex.printStackTrace();
                }
    }

    }                                       

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
         
        int answer = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete?","confirm",JOptionPane.YES_NO_OPTION);
        
    if(answer == YES_OPTION){
     try {
    
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "DELETE  FROM   AGRICULTURAL_LIVELIHOOD_STUDENTS WHERE REGISTRATION_NUMBER='"+txtRegno.getText()+"'";
    
     if(st.executeUpdate(query) == 1){
         JOptionPane.showMessageDialog(null,"Record with RegNo: '"+txtRegno.getText()+"'deleted");
         
     }
     else if(st.executeUpdate(query) == 0){
         JOptionPane.showMessageDialog(null,"Record with RegNo: '"+txtRegno.getText()+"'does not exist");
     }
  }
     
catch (SQLException ex){
    ex.printStackTrace();
}
catch (ClassNotFoundException e){
  e.printStackTrace();  
}

finally{
    
    try{
        if(st != null)
        {
            st.close();
        }
        if(con != null){
            con.close();
        }
    }
        catch (SQLException ex){
                ex.printStackTrace();
                }
    }}
    }                                         

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
   
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "SELECT * FROM AGRICULTURAL_LIVELIHOOD_STUDENTS ";
   
    if(!bnext){
      rs = st.executeQuery(query);  
       rs.first();
   
       txtRegno.setText(rs.getString("REGISTRATION_NUMBER")); 
        txtFirstName.setText(rs.getString("FIRST_NAME"));
        txtLastName.setText(rs.getString("LAST_NAME"));
       
       bnext = true;
    }
    else if(rs.next()){
        
       txtRegno.setText(rs.getString("REGISTRATION_NUMBER")); 
        txtFirstName.setText(rs.getString("FIRST_NAME"));
        txtLastName.setText(rs.getString("LAST_NAME"));
     
     bnext = true;
       
    }
    
    
       
}
catch (SQLException ex){
    ex.printStackTrace();
}
catch (ClassNotFoundException e){
  e.printStackTrace();  
}


    }                                       

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try {
    
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "SELECT * FROM AGRICULTURAL_LIVELIHOOD_STUDENTS ";
   
    
    
    ResultSet rs = st.executeQuery(query);
    if(rs.first()){
       txtRegno.setText(rs.getString("REGISTRATION_NUMBER")); 
        txtFirstName.setText(rs.getString("FIRST_NAME"));
        txtLastName.setText(rs.getString("LAST_NAME"));
    }
    else{
        JOptionPane.showMessageDialog(null,"Record not found");
        txtRegno.setText("");
        txtRegno.requestFocus();
    }
    
    
       
}
catch (SQLException ex){
    ex.printStackTrace();
}
catch (ClassNotFoundException e){
  e.printStackTrace();  
}

finally{
    
    try{
        if(st != null)
        {
            st.close();
        }
        if(con != null){
            con.close();
        }
    }
        catch (SQLException ex){
                ex.printStackTrace();
                }
    }
    }                                        

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
    
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "SELECT * FROM AGRICULTURAL_LIVELIHOOD_STUDENTS ";
    
    ResultSet rs = st.executeQuery(query);
    if(rs.last()){
       txtRegno.setText(rs.getString("REGISTRATION_NUMBER")); 
        txtFirstName.setText(rs.getString("FIRST_NAME"));
        txtLastName.setText(rs.getString("LAST_NAME"));
    }
    else{
        JOptionPane.showMessageDialog(null,"Record not found");
        txtRegno.setText("");
        txtRegno.requestFocus();
    }
    
    
       
}
catch (SQLException ex){
    ex.printStackTrace();
}
catch (ClassNotFoundException e){
  e.printStackTrace();  
}

finally{
    
    try{
        if(st != null)
        {
            st.close();
        }
        if(con != null){
            con.close();
        }
    }
        catch (SQLException ex){
                ex.printStackTrace();
                }
    }
    }                                       

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        try {
   
    Class.forName("com.mysql.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    query = "SELECT * FROM AGRICULTURAL_LIVELIHOOD_STUDENTS ";
   
    if(!bprevious){
      rs = st.executeQuery(query);  
       rs.last();
   
       txtRegno.setText(rs.getString("REGISTRATION_NUMBER")); 
        txtFirstName.setText(rs.getString("FIRST_NAME"));
        txtLastName.setText(rs.getString("LAST_NAME"));
       
       bprevious = true;
    }
    else if(rs.previous()){
        
       txtRegno.setText(rs.getString("REGISTRATION_NUMBER")); 
        txtFirstName.setText(rs.getString("FIRST_NAME"));
        txtLastName.setText(rs.getString("LAST_NAME"));
     
     bnext = true;
       
    }
    
    
       
}
catch (SQLException ex){
    ex.printStackTrace();
}
catch (ClassNotFoundException e){
  e.printStackTrace();  
}

      
    }                                           

    private void reportbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try{
    Class.forName("com.mysql.jdbc.Driver");//registers the jdbc Driver
    con=DriverManager.getConnection(cs,user,password);
    st=con.createStatement();
      } catch(SQLException ex){
      ex.printStackTrace();
      } catch(ClassNotFoundException ex){
          ex.printStackTrace();
      }
    
    
    String RESULT="AGRICULTURAL_LIVELIHOOD_STUDENTS.pdf";
       
    Document document=new Document (PageSize.A5.rotate());
    try {
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));//Need to write in a table
    } catch (DocumentException ex) {
        
    } catch (FileNotFoundException ex) {
       
    }
    
       document.open();
    
       PdfPTable table = new PdfPTable(3);//create table with 2 columns
       
       try{
       query="select * from AGRICULTURAL_LIVELIHOOD_STUDENTS";
       rs = st.executeQuery(query);
      
       table.addCell("REG_NUMBER");
       table.addCell("FIRST_NAME");
       table.addCell("LAST_NAME");
       //table.addCell("age");
       while(rs.next())
       {
       table.addCell(rs.getString("REGISTRATION_NUMBER"));
       table.addCell(rs.getString("FIRST_NAME"));
       table.addCell(rs.getString("LAST_NAME"));
       //table.addCell(rs.getString("age"));
       }
       document.add(table);
        document.close();
       
      
       
       if(Desktop.isDesktopSupported()){
       try{
       File myfile = new File("AGRICULTURAL_LIVELIHOOD_STUDENTS.pdf");
       Desktop.getDesktop().open(myfile);
             }
       catch(IOException ex){}
       }
       document.close();//close a pdf document
       
    } catch (SQLException ex) {
        
    }   
       catch (DocumentException ex) {             
            
        }             
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void agric() {
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
            java.util.logging.Logger.getLogger(AGRICULTURAL_LIVELIHOOD_STUDENTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AGRICULTURAL_LIVELIHOOD_STUDENTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AGRICULTURAL_LIVELIHOOD_STUDENTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AGRICULTURAL_LIVELIHOOD_STUDENTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AGRICULTURAL_LIVELIHOOD_STUDENTS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnfind;
    private javax.swing.JButton btnprevious;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblRegNo;
    private javax.swing.JButton reportbtn;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtRegno;
    // End of variables declaration                   
}

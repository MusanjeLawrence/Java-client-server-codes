import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;

public class Faculty extends javax.swing.JFrame {
    
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
  
  ObjectOutputStream clientObjectStreamWriter;
  ObjectInputStream clientObjectStreamReader, isReader;
  
  Socket sock;
  
  Faculty_SC SerialObj;
    
    public Faculty() throws IOException {
        go();
        initComponents();
        
         con = null;
    st = null;
    statement = null;
    
    cs = "jdbc:mysql://localhost:3306/admission";
    user = "root";
    password = "peacebewithyouall2020";
    }
    public void go() throws IOException {
        try{
            
            sock = new Socket("127.0.0.1",50000);
        SerialObj = new Faculty_SC();
        
        clientObjectStreamWriter = new ObjectOutputStream(sock.getOutputStream());
        clientObjectStreamReader = new ObjectInputStream(sock.getInputStream());
        System.out.println("networking established");
        
        Thread t = new Thread((Runnable) new ClientRunnable());

	t.start();
	System.out.println("got a connection");
        }
        catch(java.net.ConnectException e){
            JOptionPane.showMessageDialog(null,"CONNECTION REFUSED!! SERVER DOWN MAYBE");
            System.exit(0);
                 }
            }
    public class ClientRunnable implements Runnable{

        @Override
        public void run() {
            try{
                while((SerialObj =  (Faculty_SC)clientObjectStreamReader.readObject()) != null ){
                    
                    txtFaculty_ID.setText(SerialObj.Faculty_ID);
                    txtFacultyName.setText(SerialObj. Faculty_Name);
                    
                    
                    go();
                }
            }
             catch (IOException ex) {
                        ex.printStackTrace();
                    }
            catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblFaculty_ID = new javax.swing.JLabel();
        lblFacultyName = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        txtFaculty_ID = new javax.swing.JTextField();
        txtFacultyName = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLIENT");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFaculty_ID.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        lblFaculty_ID.setText("Faculty ID");
        getContentPane().add(lblFaculty_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 60, 185, 61));

        lblFacultyName.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        lblFacultyName.setText("Faculty Name");
        getContentPane().add(lblFacultyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 203, -1, 65));

        btnSave.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 345, 83, 43));

        btnFind.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 345, 83, 43));

        txtFaculty_ID.setFont(new java.awt.Font("DejaVu Serif", 0, 24)); // NOI18N
        txtFaculty_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaculty_IDActionPerformed(evt);
            }
        });
        getContentPane().add(txtFaculty_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 49, 286, 61));

        txtFacultyName.setFont(new java.awt.Font("DejaVu Serif", 0, 24)); // NOI18N
        getContentPane().add(txtFacultyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 203, 286, 65));

        btnFirst.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        getContentPane().add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 345, 90, 43));

        btnNext.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 345, 94, 43));

        btnLast.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        getContentPane().add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 345, 80, 43));

        btnPrevious.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 345, -1, 43));

        Deletebtn.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 345, 97, 43));

        kGradientPanel2.setkEndColor(java.awt.Color.white);
        kGradientPanel2.setkStartColor(java.awt.Color.blue);

        jButton1.setText("B");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 660, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 392, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        SerialObj.Faculty_ID=txtFaculty_ID.getText();
        SerialObj.Faculty_Name=txtFacultyName.getText();
        try{
            clientObjectStreamWriter.writeObject(SerialObj);
        }
        catch(java.net.ConnectException e){
            JOptionPane.showMessageDialog(null,"CONNECTION REFUSED!! SERVER DOWN MAYBE");
            ;
            }
            catch (IOException ex) {
             ex.printStackTrace();
         }

    }                                       

    private void txtFaculty_IDActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    
    
     PreparedStatement st = con.prepareStatement("SELECT * FROM Faculty WHERE   Faculty_id ='"+txtFaculty_ID.getText()+"'", 
  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = st.executeQuery();
    
    if(rs.first()){
       txtFaculty_ID.setText(rs.getString("Faculty_id")); 
       txtFacultyName.setText(rs.getString("Faculty_Name"));
       
    }
    else{
        JOptionPane.showMessageDialog(null,"Record not found");
         txtFaculty_ID.setText("");
         txtFaculty_ID.requestFocus();
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

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try {
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    //query = "SELECT * FROM students ";
    //st. executeUpdate(query);
    //JOptionPane.showMessageDialog(null,"Record saved");
    PreparedStatement st = con.prepareStatement("SELECT * FROM Faculty", 
  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = st.executeQuery();
    
    
    
    if(rs.first()){
       txtFaculty_ID.setText(rs.getString("Faculty_id")); 
       txtFacultyName.setText(rs.getString("Faculty_Name"));
       
    }
    else{
        JOptionPane.showMessageDialog(null,"Record not found");
        txtFaculty_ID.setText("");
        txtFaculty_ID.requestFocus();
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

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
   
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    PreparedStatement st = con.prepareStatement("SELECT * FROM Faculty", 
  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    if(!bnext){
      rs = st.executeQuery();  
       rs.first();
   
       txtFaculty_ID.setText(rs.getString("Faculty_id")); 
       txtFacultyName.setText(rs.getString("Faculty_Name"));
       
       bnext = true;
    }
    else if(rs.next()){
        
        txtFaculty_ID.setText(rs.getString("Faculty_id")); 
       txtFacultyName.setText(rs.getString("Faculty_Name"));
       
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

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    PreparedStatement st = con.prepareStatement("SELECT * FROM Faculty", 
  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = st.executeQuery();
    
    if(rs.last()){
       txtFaculty_ID.setText(rs.getString("Faculty_id")); 
       txtFacultyName.setText(rs.getString("Faculty_Name"));
       
    }
    else{
        JOptionPane.showMessageDialog(null,"Record not found");
        txtFaculty_ID.setText("");
        txtFaculty_ID.requestFocus();
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

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:\
         try {
   
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    
    PreparedStatement st = con.prepareStatement("SELECT * FROM Faculty", 
  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    
    if(!bprevious){
      rs = st.executeQuery();  
       rs.last();
   
       txtFaculty_ID.setText(rs.getString("Faculty_id")); 
       txtFacultyName.setText(rs.getString("Faculty_Name"));
      
       bprevious = true;
    }
    else if(rs.previous()){
        
        txtFaculty_ID.setText(rs.getString("Faculty_id")); 
       txtFacultyName.setText(rs.getString("Faculty_Name"));
       
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

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete?","confirm",JOptionPane.YES_NO_OPTION);
        
    if(answer == YES_OPTION){
     try {
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con = DriverManager.getConnection(cs,user,password);
    st = con.createStatement();
    
    
    PreparedStatement st = con.prepareStatement("DELETE  FROM Faculty WHERE   Faculty_id ='"+txtFaculty_ID.getText()+"'", 
  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    
     if(st.executeUpdate() == 1){
         JOptionPane.showMessageDialog(null,"Record with RegNo: '"+txtFaculty_ID.getText()+"'deleted");
         
     }
     else if(st.executeUpdate() == 0){
         JOptionPane.showMessageDialog(null,"Record with RegNo: '"+txtFaculty_ID.getText()+"'does not exist");
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
else if(answer == NO_OPTION){
          Deletebtn.requestFocus();
          return ;
      }
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         Main_page ma = new Main_page();
      ma.setVisible(true);
      this.setVisible(true);
        dispose();
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String []args) {
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
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Faculty().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Faculty.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblFacultyName;
    private javax.swing.JLabel lblFaculty_ID;
    private javax.swing.JTextField txtFacultyName;
    private javax.swing.JTextField txtFaculty_ID;
    // End of variables declaration                   
}


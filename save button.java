 //Code to execute the button
        
        String s1=txtRegno.getText();
        String s2=txtSurname.getText();
        String s3=txtFirstname.getText();
        
        int s4=Integer.parseInt(txtAge.getText());
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Register the driver
            
            con=DriverManager.getConnection(cs,user,password); // Maaking connection
            
            st =con.createStatement();// Creating stmt
            
            //insert query stmt
            query= "INSERT INTO student (regno,Sname,Fname,Age)VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
            
            st.executeUpdate(query); //stst to execute the query
            
         JOptionPane.showMessageDialog(null,"Record Saved"); // to shop pop up message
            
            txtRegno.setText("");
            txtSurname.setText("");
            txtFirstname.setText("");
            txtAge.setText("");
                 
            txtRegno.requestFocus();//Request Focus
            
        }
        catch (SQLException ex){
            ex.printStackTrace();
    }                                        
  catch(ClassNotFoundException ex){
         ex.printStackTrace();
        
    }
        finally{
            
            try{
                if(st != null){
                    st.close();
                }
                if (con != null){
                    con.close();
                }
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.jdbc.Driver"); //Register the driver
            
            con=DriverManager.getConnection(cs,user,password); // Maaking connection
            
            st =con.createStatement();// Creating stmt
            
            //insert query stmt
            query= "SELECT * FROM student WHERE regno='"+txtRegno.getText()+"'";
            
           // st.executeUpdate(query); //stst to execute the query
           ResultSet rs = st.executeQuery(query);
            
           if(rs.first()){
               //rs.last();
               txtRegno.setText(rs.getString("regno"));
               txtSurname.setText(rs.getString("Sname"));
               txtFirstname.setText(rs.getString("Fname"));
               
                txtAge.setText(rs.getString("Age"));
           }
           else{
               
         JOptionPane.showMessageDialog(null,"Record Not found"); // to shop pop up message
           
              txtRegno.setText("");
            txtRegno.requestFocus();//Request Focus
           }
        }
        catch (SQLException ex){
            ex.printStackTrace();
    }                                        
  catch(ClassNotFoundException ex){
         ex.printStackTrace();
        
    }
        finally{
            
            try{
                if(st != null){
                    st.close();
                }
                if (con != null){
                    con.close();
                }
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
        }
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author navee
 */
public class Voterlogin extends javax.swing.JFrame {

    /**
     * Creates new form Voterlogin
     */
    public Voterlogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("    Voter Login");

        jLabel2.setText("Name :");

        jLabel3.setText("Password :");

        jButton1.setText("Show Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("CandidateDetails");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setText("Partyname :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(jTextField2))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        this.dispose();
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nameToSearch = jTextField1.getText();
String passwordToCheck = jTextField2.getText(); // Retrieve password from jTextField2

// Validate if name and password are provided
if (nameToSearch.isEmpty() || passwordToCheck.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please enter both name and password to search!");
    return;
}

// Perform database selection
try {
    // Establish database connection
    String url = "jdbc:mysql://localhost:3306/Naveen";
    String username = "root";
    String password = "cksnaveen";
    Connection connection = DriverManager.getConnection(url, username, password);

    // Define the SQL query
    String query = "SELECT * FROM register WHERE name = ? AND password = ?";
    
    // Create a PreparedStatement
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    
    // Set parameter values
    preparedStatement.setString(1, nameToSearch);
    preparedStatement.setString(2, passwordToCheck); // Set password parameter
    
    // Execute the query
    ResultSet resultSet = preparedStatement.executeQuery();
    
    // Check if any records are found
    if (resultSet.next()) {
        // Display the data in a table format
        String[] columnNames = {"Name", "Age", "Gender", "Phone Number", "Email", "Address", "Password", "Polling Station"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        // Extract data from the result set and add it to the table model
        String name = resultSet.getString("name");
        int age = resultSet.getInt("age");
        String gender = resultSet.getString("gender");
        String phoneNumber = resultSet.getString("phonenum");
        String email = resultSet.getString("mailid");
        String address = resultSet.getString("address");
        String passwd = resultSet.getString("password");
        String pollingStation = resultSet.getString("pollingstation");
        
        model.addRow(new Object[]{name, age, gender, phoneNumber, email, address, passwd, pollingStation});
        
        // Display the table
        JTable table = new JTable(model);
        JOptionPane.showMessageDialog(this, new JScrollPane(table), "Records for " + nameToSearch, JOptionPane.PLAIN_MESSAGE);
    } else {
        // If no records are found, display a message
        JOptionPane.showMessageDialog(this, "No records found for the provided name and password.");
    }

    // Close the connection
    connection.close();

    // Clear the JTextFields for name and password
    jTextField1.setText("");
    jTextField2.setText("");

} catch (SQLException e) {
    // Handle any errors
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error retrieving data: " + e.getMessage());
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String nameToSearch = jTextField1.getText();
String passwordToCheck = jTextField2.getText();
String partyNameToSearch = jTextField3.getText();

// Validate if name, password, and party name are provided
if (nameToSearch.isEmpty() || passwordToCheck.isEmpty() || partyNameToSearch.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please enter name, password, and party name to search!");
    return;
}

// Perform database selection for register table
try {
    // Establish database connection
    String url = "jdbc:mysql://localhost:3306/Naveen";
    String username = "root";
    String password = "cksnaveen";
    Connection connection = DriverManager.getConnection(url, username, password);

    // Define the SQL query for register table
    String registerQuery = "SELECT * FROM register WHERE name = ? AND password = ?";
    
    // Create a PreparedStatement for register table
    PreparedStatement registerStatement = connection.prepareStatement(registerQuery);
    
    // Set parameter values for register query
    registerStatement.setString(1, nameToSearch);
    registerStatement.setString(2, passwordToCheck);
    
    // Execute the query for register table
    ResultSet registerResult = registerStatement.executeQuery();
    
    // Check if any records are found in register table
    if (registerResult.next()) {
        // If user exists in register table, perform query on candid table
        try {
            // Define the SQL query for candid table
            String candidQuery = "SELECT * FROM candid WHERE partyname = ?";
            
            // Create a PreparedStatement for candid table
            PreparedStatement candidStatement = connection.prepareStatement(candidQuery);
            
            // Set parameter value for candid query
            candidStatement.setString(1, partyNameToSearch);
            
            // Execute the query for candid table
            ResultSet candidResult = candidStatement.executeQuery();
            
            // Display the data in a table format
            String[] columnNames = {"Party Name", "Party Symbol",  "Candidate Name"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            
            // Extract data from the candid result set and add it to the table model
            while (candidResult.next()) {
                String partyName = candidResult.getString("partyname");
                String partySymbol = candidResult.getString("partysymbol");
                //String uniqueCode = candidResult.getString("uniquecode");
                String candidateName = candidResult.getString("candidatename");
                
                model.addRow(new Object[]{partyName, partySymbol,  candidateName});
            }
            
            // Display the table
            JTable table = new JTable(model);
            JOptionPane.showMessageDialog(this, new JScrollPane(table), "Records for " + partyNameToSearch, JOptionPane.PLAIN_MESSAGE);
            
            // Close the candid result set and statement
            candidResult.close();
            candidStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retrieving candid data: " + ex.getMessage());
        }
    } else {
        // If no records are found in register table, display a message
        JOptionPane.showMessageDialog(this, "No records found for the provided name and password.");
    }

    // Close the connection
    connection.close();

    // Clear the JTextFields
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");

} catch (SQLException e) {
    // Handle any errors
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error retrieving data: " + e.getMessage());
}


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
//        jTextField4.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Voterlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voterlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voterlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voterlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voterlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

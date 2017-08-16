
package main;

import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

import java.sql.DriverManager;

public class NewTV extends javax.swing.JFrame {

    public NewTV() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    private void initComponents() {

        name = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        inches = new javax.swing.JLabel();
        TelName_text = new javax.swing.JTextField();
        Price_text = new javax.swing.JTextField();
        inches_combo = new javax.swing.JComboBox();
        NewTev_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        name.setText("Television Name");

        price.setText("Price");

        inches.setText("Inches");

        TelName_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelName_textActionPerformed(evt);
            }

            private void TelName_textActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });

        inches_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "20''", "22''", "24''", "28''", "29''", "32''", "40''", "42''", "43''", "48''", "49''", "50''", "55''", "60''", "65''", "75''" }));

        NewTev_Btn.setText("New Television");
        NewTev_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTev_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inches, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inches_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price_text, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(TelName_text)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(NewTev_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TelName_text, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Price_text, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inches_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inches, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(NewTev_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }
    private void NewTev_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            String host = "jdbc:derby://localhost:1527/Main";
            String username = "root";
            String password = "0313";

            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();

            String Query = "insert into untitled ( TELEVISION_NAME, PRICE, INCHES) VALUES ('" + TelName_text.getText() + "','" + Price_text.getText() + "','" + inches_combo.getSelectedItem() + "')";

            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Television Added to Database");

            TelName_text.setText(null);
            Price_text.setText(null);
            inches_combo.setSelectedItem("00");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }


    }                                          
public static void main(String args[]) {
    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTV().setVisible(true);
            }
        });
    }

                     
    private javax.swing.JButton NewTev_Btn;
    private javax.swing.JTextField Price_text;
    private javax.swing.JTextField TelName_text;
    private javax.swing.JComboBox inches_combo;
    private javax.swing.JLabel name;
    private javax.swing.JLabel price;
    private javax.swing.JLabel inches;
                 
}
    

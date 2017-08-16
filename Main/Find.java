package main;


import java.awt.event.*;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.*;
import javax.swing.*;
import javax.swing.text.Position;

public class Find extends javax.swing.JFrame {

    final void FillList() {

        try {
            String host = "jdbc:derby://localhost:1527/Main";
            String username = "root";
            String password = "0313";

            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM UNTITLED";
            ResultSet rs = stmt.executeQuery(Query);

            DefaultListModel DLM = new DefaultListModel();

            while (rs.next()) {

                DLM.addElement(rs.getString(1));
            

            }

            List1.setModel(DLM);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.toString());

        }

    }


    public Find() {
        initComponents();
        FillList();
        setLocationRelativeTo(null);
    }

                     
    private void initComponents() {

        Price_text = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        inches = new javax.swing.JLabel();
        TelName_text = new javax.swing.JTextField();
        Scroll = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList();
        inches_combo = new javax.swing.JComboBox();
        Delete_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Search_Text = new javax.swing.JTextField();
        Search_btn = new javax.swing.JButton();

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

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        Scroll.setViewportView(List1);
  
        inches_combo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "20''", "22''", "24''", "28''", "29''", "32''", "40''", "42''", "43''", "48''", "49''", "50''", "55''", "60''", "65''", "75''" }));

        Delete_Button.setText("Delete");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        Update_Button.setText("Update");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        Search_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_TextActionPerformed(evt);
            }

            private void Search_TextActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        Search_btn.setText("Search");
        Search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inches, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inches_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelName_text, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(Price_text, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelName_text, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price_text, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inches, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inches_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }                        

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {                                   

        try {
            String host = "jdbc:derby://localhost:1527/Main";
            String username = "root";
            String password = "0313";

            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM UNTITLED where television_name = '" + List1.getSelectedValue() + "'";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {

                TelName_text.setText(rs.getString(1));
                Price_text.setText(rs.getString(2));
                inches_combo.setSelectedItem(rs.getString(3));

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.toString());
        }


    }                                  

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        try {
            String host = "jdbc:derby://localhost:1527/Main";
            String username = "root";
            String password = "0313";

            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String Query = "UPDATE UNTITLED SET TELEVISION_NAME = '" + TelName_text.getText() + "' , PRICE = '" + Price_text.getText() + "' , INCHES = '" + inches_combo.getSelectedItem() + "' WHERE TELEVISION_NAME ='" + List1.getSelectedValue() + "'";
            stmt.execute(Query);

            JOptionPane.showMessageDialog(null, "Updated!");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.toString());

        }

    }                                             

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        try {
            String host = "jdbc:derby://localhost:1527/Main";
            String username = "root";
            String password = "0313";

            Connection con = DriverManager.getConnection(host, username, password);
            Statement stmt = con.createStatement();
            String Query = "DELETE FROM UNTITLED WHERE TELEVISION_NAME ='" + List1.getSelectedValue() + "'";
            stmt.execute(Query);

            JOptionPane.showMessageDialog(null, "Deleted!");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.toString());

        }

    }                                             

    private void Search_btnActionPerformed(java.awt.event.ActionEvent evt) {                                           

        int result = List1.getNextMatch(Search_Text.getText(), WIDTH, Position.Bias.Forward);

        List1.setSelectedIndex(result);
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
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Find().setVisible(true);
            }
        });
    }
                   
    private javax.swing.JButton Delete_Button;
    private javax.swing.JList List1;
    private javax.swing.JTextField Price_text;
    private javax.swing.JTextField Search_Text;
    private javax.swing.JButton Search_btn;
    private javax.swing.JTextField TelName_text;
    private javax.swing.JButton Update_Button;
    private javax.swing.JComboBox inches_combo;
    private javax.swing.JLabel name;
    private javax.swing.JLabel price;
    private javax.swing.JLabel inches;
    private javax.swing.JScrollPane Scroll;
              
}

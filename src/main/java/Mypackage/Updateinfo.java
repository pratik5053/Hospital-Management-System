/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DURGA
 */
public class Updateinfo extends javax.swing.JFrame
{

    /**
     * Creates new form Addnewpatient
     */
    public Updateinfo()
    {
        initComponents();
        CommonClassImage_hms.addLabelBackgroundimage(lblback, "C:\\Users\\DURGA\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\main\\java\\images\\add new patient background.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        lblpatientid = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblcontactno = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblbloodgp = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblanymajor = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtpetientid = new javax.swing.JTextField();
        txtcontactno = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtbloodgp = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtanymajor = new javax.swing.JTextField();
        cmbgender = new javax.swing.JComboBox<>();
        btnupdate = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        lblback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 102));
        setLocation(new java.awt.Point(301, 175));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpatientid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpatientid.setText("Patient ID");
        jPanel1.add(lblpatientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 237, 25));

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setText("Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 93, 237, 25));

        lblcontactno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcontactno.setText("Contact No");
        jPanel1.add(lblcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 143, 237, 25));

        lblage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblage.setText("Age");
        jPanel1.add(lblage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 187, 237, 25));

        lblbloodgp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbloodgp.setText("Blood Group");
        jPanel1.add(lblbloodgp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 275, 237, 25));

        lbladdress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbladdress.setText("Address");
        jPanel1.add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 319, 237, 25));

        lblanymajor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblanymajor.setText("Any Major disease Suffered Before");
        jPanel1.add(lblanymajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 363, -1, 25));

        lblgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblgender.setText("Gender");
        jPanel1.add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 231, 237, 25));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 96, 291, 28));

        txtpetientid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtpetientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 49, 170, -1));

        txtcontactno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcontactno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtcontactnoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 142, 291, -1));

        txtage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtage.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtageActionPerformed(evt);
            }
        });
        jPanel1.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 186, 291, -1));

        txtbloodgp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtbloodgp, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 274, 291, -1));

        txtaddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtaddress.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtaddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 318, 291, -1));

        txtanymajor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtanymajor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtanymajorActionPerformed(evt);
            }
        });
        jPanel1.add(txtanymajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 362, 291, -1));

        cmbgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(cmbgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 230, 291, -1));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\DURGA\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\main\\java\\images\\save-icon--1.png")); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 428, 124, 31));

        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclose.setIcon(new javax.swing.ImageIcon("C:\\Users\\DURGA\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\main\\java\\images\\Close.png")); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btncloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 90, 31));

        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\DURGA\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\main\\java\\images\\search.png")); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 100, -1));
        jPanel1.add(lblback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

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

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtaddressActionPerformed
    {//GEN-HEADEREND:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtanymajorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtanymajorActionPerformed
    {//GEN-HEADEREND:event_txtanymajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanymajorActionPerformed

    private void txtcontactnoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtcontactnoActionPerformed
    {//GEN-HEADEREND:event_txtcontactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactnoActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtageActionPerformed
    {//GEN-HEADEREND:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsearchActionPerformed
    {//GEN-HEADEREND:event_btnsearchActionPerformed
        String patientString=txtpetientid.getText();
        if(patientString.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"PatientId Field must be filled.","Error",JOptionPane.ERROR_MESSAGE);
        }
        String URL = "jdbc:mysql://localhost:3306/hms";
        String usernameString="root";
        String passString="Zalte@2001";
        
        try
        {
            Connection con=DriverManager.getConnection(URL,usernameString,passString);
            Statement st=con.createStatement();
            int id=Integer.parseInt(txtpetientid.getText());
            String queryString="select*from addpatientrecord where pid="+id;
            ResultSet stResultSet=st.executeQuery(queryString);
            
            if(stResultSet.first())
            {
                txtname.setText(stResultSet.getString("name"));
                txtcontactno.setText(stResultSet.getString("contact"));
                txtage.setText(stResultSet.getString("age"));
                cmbgender.setSelectedItem(stResultSet.getString("gender"));
                txtbloodgp.setText(stResultSet.getString("bloodgp"));
                txtaddress.setText(stResultSet.getString("address"));
                txtanymajor.setText(stResultSet.getString("anymajor"));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No record found");
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error"+ e);
        }                      
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncloseActionPerformed
    {//GEN-HEADEREND:event_btncloseActionPerformed
         this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnupdateActionPerformed
    {//GEN-HEADEREND:event_btnupdateActionPerformed
        
        String URL = "jdbc:mysql://localhost:3306/hms";
        String usernameString="root";
        String passString="Zalte@2001";
        
      //  String fnameString=txtfirstname.getText();
       // String lnamString=txtlastname.getText();
       // int id=Integer.parseInt(txtid.getText());
        int patientid=Integer.parseInt(txtpetientid.getText());
        String nameString1=txtname.getText();
        long contactno=Long.parseLong(txtcontactno.getText());
        int age=Integer.parseInt(txtage.getText());
        String genderString=String.valueOf(cmbgender.getSelectedItem());
        String bloodgpString=txtbloodgp.getText();
        String address = txtaddress.getText();
        String anymajorString1=txtanymajor.getText();
        
        String queryString="UPDATE `hms`.`addpatientrecord` SET `name` = '"+nameString1+" ', `contact` = '"+contactno+"', `age` = '"+age+"', `gender` = '"+genderString+"', `bloodgp` = '"+bloodgpString+"', `address` = '"+address+"', `anymajor` = '"+anymajorString1+"' WHERE (`pid` = '"+patientid+"')";
        
        try
        {
            Connection con=DriverManager.getConnection(URL,usernameString,passString);
            Statement st=con.createStatement();
            st.executeUpdate(queryString);
            JOptionPane.showMessageDialog(this,"Updated Successfully!!","InfoMessage",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error"+e);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Updateinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Updateinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Updateinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Updateinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Updateinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblanymajor;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblbloodgp;
    private javax.swing.JLabel lblcontactno;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpatientid;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtanymajor;
    private javax.swing.JTextField txtbloodgp;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpetientid;
    // End of variables declaration//GEN-END:variables
}

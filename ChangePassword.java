/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe_management_system;

import cafe_management_system.dao.UserDao;
import javax.swing.ImageIcon;

/**
 *
 * @author Pradnya Jadhav
 */
public class ChangePassword extends javax.swing.JFrame
{

    /**
     * Creates new form ChangePassword
     */
    public String userEmail;
    public ChangePassword()
    {
        initComponents();
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\brownbackground.jpg"));
        btnExit.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\close.png"));
        btnUpdate.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\update.png"));
        btnClear.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\clear.png"));
        btnUpdate.setEnabled(false);
        setLocationRelativeTo(this);
        
    }
    public ChangePassword(String email)
    {
        initComponents();
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\brownbackground.jpg"));
        btnExit.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\close.png"));
        btnUpdate.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\update.png"));
        btnClear.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\clear.png"));
        btnUpdate.setEnabled(false);
        userEmail = email;
        setLocationRelativeTo(this);
    }

    void validateFields()
    {
        String oldPassword = txtOldPassword.getText();
        String newPassword = txtNewPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();
        if(!oldPassword.equals("") && !newPassword.equals("") && !confirmPassword.equals("") && newPassword.equals(confirmPassword))
        {
            btnUpdate.setEnabled(true);
        }
        else
        {
            btnUpdate.setEnabled(false);
        }
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

        lblName = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);

        lblName.setFont(new java.awt.Font("Aparajita", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Old Password");
        getContentPane().add(lblName);
        lblName.setBounds(110, 90, 170, 40);

        lblCategory.setFont(new java.awt.Font("Aparajita", 1, 24)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(0, 0, 0));
        lblCategory.setText("New Password");
        getContentPane().add(lblCategory);
        lblCategory.setBounds(110, 160, 170, 30);

        lblPrice.setFont(new java.awt.Font("Aparajita", 1, 24)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblPrice.setText("Confirm Password");
        getContentPane().add(lblPrice);
        lblPrice.setBounds(110, 220, 180, 40);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(270, 280, 100, 40);

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(415, 280, 110, 40);

        jLabel2.setFont(new java.awt.Font("Aparajita", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Change Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 180, 40);

        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(630, 10, 50, 40);

        txtOldPassword.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtOldPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtOldPassword);
        txtOldPassword.setBounds(300, 90, 190, 30);

        txtNewPassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNewPasswordActionPerformed(evt);
            }
        });
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtNewPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewPassword);
        txtNewPassword.setBounds(300, 160, 190, 30);

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtConfirmPasswordActionPerformed(evt);
            }
        });
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtConfirmPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtConfirmPassword);
        txtConfirmPassword.setBounds(300, 222, 190, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpdateActionPerformed
    {//GEN-HEADEREND:event_btnUpdateActionPerformed
        String oldPassword = txtOldPassword.getText();
        String newPassword = txtNewPassword.getText();
        UserDao.changePassword(userEmail, oldPassword, newPassword);
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
            setVisible(false);
            new ChangePassword(userEmail).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        setVisible(false);
        new home().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtConfirmPasswordActionPerformed
    {//GEN-HEADEREND:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNewPasswordActionPerformed
    {//GEN-HEADEREND:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void txtOldPasswordKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtOldPasswordKeyReleased
    {//GEN-HEADEREND:event_txtOldPasswordKeyReleased
        validateFields();// TODO add your handling code here:
    }//GEN-LAST:event_txtOldPasswordKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNewPasswordKeyReleased
    {//GEN-HEADEREND:event_txtNewPasswordKeyReleased
        validateFields();        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtConfirmPasswordKeyReleased
    {//GEN-HEADEREND:event_txtConfirmPasswordKeyReleased
        validateFields();// TODO add your handling code here:;
    }//GEN-LAST:event_txtConfirmPasswordKeyReleased

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe_management_system;

import cafe_management_system.dao.UserDao;
import cafe_management_system.model.user;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pradnya Jadhav
 */
public class login extends javax.swing.JFrame
{

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public login()
    {
        initComponents();
        setLocationRelativeTo(null);
        jLabel9.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\loginpage.PNG"));
        btnlogin.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\login.png"));
        btnclear.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\clear.png"));
        btnexit.setIcon(new ImageIcon("C:\\Users\\Pradnya Jadhav\\Documents\\NetBeansProjects\\src\\main\\mavenproject1\\src\\main\\java\\cafe_management_system\\image\\exit.png"));
       
        btnlogin.setEnabled(false);
    }
    
    public void clear()
    {
        txtemail.setText("");
        txtpassword.setText("");
        btnlogin.setEnabled(false);
        
    }
    public void validateField()
    {
        String email = txtemail.getText();
        String password = txtpassword.getText();
        if(email.matches(emailPattern) && !password.equals(""))
        {
            btnlogin.setEnabled(true);
        }
        else
        {
           btnlogin.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        btnforget = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        btnexit = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1370, 720));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 720));
        jPanel1.setLayout(null);

        btnforget.setBackground(new java.awt.Color(204, 126, 67));
        btnforget.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnforget.setForeground(new java.awt.Color(0, 0, 0));
        btnforget.setText("Forgot Password?");
        btnforget.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnforgetActionPerformed(evt);
            }
        });
        jPanel1.add(btnforget);
        btnforget.setBounds(860, 540, 190, 50);

        btnlogin.setBackground(new java.awt.Color(204, 126, 67));
        btnlogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(0, 0, 0));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin);
        btnlogin.setBounds(810, 450, 114, 50);

        btnclear.setBackground(new java.awt.Color(204, 126, 67));
        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(0, 0, 0));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear);
        btnclear.setBounds(1010, 450, 114, 50);

        txtpassword.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 0, 0));
        txtpassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtpasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtpassword);
        txtpassword.setBounds(810, 380, 494, 31);

        btnexit.setBackground(new java.awt.Color(204, 126, 67));
        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnexit.setForeground(new java.awt.Color(0, 0, 0));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit);
        btnexit.setBounds(1200, 450, 102, 50);

        btnsignup.setBackground(new java.awt.Color(204, 126, 67));
        btnsignup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(0, 0, 0));
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignup);
        btnsignup.setBounds(1100, 540, 114, 50);

        txtemail.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(0, 0, 0));
        txtemail.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtemailKeyReleased(evt);
            }
        });
        jPanel1.add(txtemail);
        txtemail.setBounds(810, 310, 494, 30);

        lblpassword.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(204, 126, 67));
        lblpassword.setText("Password");
        jPanel1.add(lblpassword);
        lblpassword.setBounds(700, 380, 100, 26);

        lblemail.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblemail.setForeground(new java.awt.Color(204, 126, 67));
        lblemail.setText("Email");
        jPanel1.add(lblemail);
        lblemail.setBounds(700, 310, 80, 26);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 1380, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnloginActionPerformed
    {//GEN-HEADEREND:event_btnloginActionPerformed
        String email = txtemail.getText();
        String pasString = txtpassword.getText();
        user user = null;
        user = UserDao.login(email, pasString);
        if(user == null)
        {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect Username or Password</b></html>","Message",JOptionPane.ERROR_MESSAGE);
            
        }
        else
        {
            if(user.getStatus().equals("false"))
            {
                ImageIcon icon = new ImageIcon("src/popupicon/wait.png");
                JOptionPane.showMessageDialog(null, "<html><b>wait for admin approval</b></html>","message",JOptionPane.INFORMATION_MESSAGE,icon);
               clear();
            }
            if(user.getStatus().equals("true"))
            {
                setVisible(false);
                new home(email).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnclearActionPerformed
    {//GEN-HEADEREND:event_btnclearActionPerformed
        clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtpasswordActionPerformed
    {//GEN-HEADEREND:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsignupActionPerformed
    {//GEN-HEADEREND:event_btnsignupActionPerformed
        setVisible(false);
        new signup().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnforgetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnforgetActionPerformed
    {//GEN-HEADEREND:event_btnforgetActionPerformed
        setVisible(false);
        new forgetpassword().setVisible(true);
    }//GEN-LAST:event_btnforgetActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnexitActionPerformed
    {//GEN-HEADEREND:event_btnexitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close application ?","Select",JOptionPane.YES_NO_OPTION);
        if(a == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtemailKeyReleased
    {//GEN-HEADEREND:event_txtemailKeyReleased
        validateField();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtpasswordKeyReleased
    {//GEN-HEADEREND:event_txtpasswordKeyReleased
        validateField();
    }//GEN-LAST:event_txtpasswordKeyReleased

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnforget;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
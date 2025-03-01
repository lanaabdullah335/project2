
package project2;


public class login extends javax.swing.JFrame {

   
    public login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        pagelogin = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        wemail = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        wpass = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();
        notacc = new javax.swing.JTextField();
        login1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("login");
        jPanel1.setLayout(null);

        right.setBackground(new java.awt.Color(0, 153, 153));
        right.setPreferredSize(new java.awt.Dimension(400, 500));

        logo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/image/logo.png"))); // NOI18N

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(logo)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        left.setPreferredSize(new java.awt.Dimension(400, 500));

        pagelogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        pagelogin.setForeground(new java.awt.Color(0, 153, 153));
        pagelogin.setText("LOGIN");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setText("Email");

        wemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass.setText("password");

        wpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wpassActionPerformed(evt);
            }
        });

        signup.setBackground(new java.awt.Color(0, 153, 153));
        signup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("sign up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        notacc.setText("i do not have any account");

        login1.setBackground(new java.awt.Color(0, 153, 153));
        login1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login1.setForeground(new java.awt.Color(255, 255, 255));
        login1.setText("loggin");

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(pagelogin))
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wemail)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wpass, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addGroup(leftLayout.createSequentialGroup()
                                .addComponent(notacc, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(leftLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(274, Short.MAX_VALUE)))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pagelogin)
                .addGap(31, 31, 31)
                .addComponent(email)
                .addGap(18, 18, 18)
                .addComponent(wemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(pass)
                        .addGap(18, 18, 18)
                        .addComponent(wpass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(notacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
            .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                    .addContainerGap(340, Short.MAX_VALUE)
                    .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(123, 123, 123)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(left, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        signup si= new signup();
       si.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_signupActionPerformed

    private void wpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wpassActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left;
    private javax.swing.JButton login1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField notacc;
    private javax.swing.JLabel pagelogin;
    private javax.swing.JLabel pass;
    private javax.swing.JPanel right;
    private javax.swing.JButton signup;
    private javax.swing.JTextField wemail;
    private javax.swing.JPasswordField wpass;
    // End of variables declaration//GEN-END:variables
}

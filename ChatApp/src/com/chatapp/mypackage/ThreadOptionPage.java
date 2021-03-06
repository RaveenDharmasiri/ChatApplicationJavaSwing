package com.chatapp.mypackage;


import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ThreadOptionPage extends javax.swing.JFrame {

    // this varibale is true the first time when the ThreadOptionPage is loaded.
    boolean did_start_the_app = true;

    // this variable is used to store the threadId of the latest thread that is loaded to this page by the server.
    int latestThreadId = 0;

    Timer timerObj = new Timer();

    /**
     * Creates new form ThreadOptionPage
     */
    public ThreadOptionPage() {

        initComponents();

        // displaying the loginId and the nick name of the user in the threadOptionPageAfter he logs in.
        lblNickName.setText("Nick Name: " + LoginPage.nickName + " / Login ID: " + LoginPage.userLoginId + "");

        // this is running a thread in the background to check if new threads are being added to the database by other users.
        // Inside the displayThrea
        /**
         * this is running a thread in the background to check if new threads
         * are being added to the database by other users. Inside the
         * displayThread() method has the method that check with the web
         * application whether a new threads has been added to the database.
         */
        timerObj.schedule(new TimerTask() {

            @Override
            public void run() {
                displayThreads();
            }

        }, 0, 1000);

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
        btnCreateThread = new javax.swing.JButton();
        btnEditThread = new javax.swing.JButton();
        jpThreadContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        threadTable = new javax.swing.JTable();
        lblNickName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chatapp/mypackage/create_thumb.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Your Threads");

        btnCreateThread.setBackground(new java.awt.Color(102, 102, 102));
        btnCreateThread.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnCreateThread.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateThread.setText("Create Thread");
        btnCreateThread.setBorder(null);
        btnCreateThread.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateThread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateThreadActionPerformed(evt);
            }
        });

        btnEditThread.setBackground(new java.awt.Color(102, 102, 102));
        btnEditThread.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnEditThread.setForeground(new java.awt.Color(255, 255, 255));
        btnEditThread.setText("Edit Thread");
        btnEditThread.setBorder(null);
        btnEditThread.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditThread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditThreadActionPerformed(evt);
            }
        });

        jpThreadContainer.setBackground(new java.awt.Color(153, 153, 153));

        threadTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        threadTable.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        threadTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TITLE", "LAST EDITED", "BY"
            }
        ));
        threadTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        threadTable.setRowHeight(50);
        threadTable.getTableHeader().setReorderingAllowed(false);
        threadTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threadTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(threadTable);

        javax.swing.GroupLayout jpThreadContainerLayout = new javax.swing.GroupLayout(jpThreadContainer);
        jpThreadContainer.setLayout(jpThreadContainerLayout);
        jpThreadContainerLayout.setHorizontalGroup(
            jpThreadContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
        );
        jpThreadContainerLayout.setVerticalGroup(
            jpThreadContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        lblNickName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNickName.setText("Name : ");

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chatapp/mypackage/back button.png"))); // NOI18N
        btnBack.setText("Log Out");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185)
                .addComponent(btnCreateThread, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnEditThread, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblNickName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpThreadContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(52, 52, 52))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lblNickName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpThreadContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditThread, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCreateThread, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateThreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateThreadActionPerformed
        // This button takes you to the page that allows the user to create new threads.
        CreateThread threadCreateObj = new CreateThread();
        threadCreateObj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCreateThreadActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        // This is the back button therefore it takes you back to the loginPage
        LoginPage loginObj = new LoginPage();
        loginObj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void threadTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threadTableMouseClicked
        //
    }//GEN-LAST:event_threadTableMouseClicked

    private void btnEditThreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditThreadActionPerformed

        /**
         * Retrieving the selected row from the table that shows the thread
         * information and then storing that row in an array. This is more like
         * selecting a thread and then storing that thread in an array and later
         * doing the editing to it.
         */
        int indexes[] = threadTable.getSelectedRows();

        // This is to know the number of the rows selected by the user. Usually this is 1.
        int selectedRows = indexes.length;

        DefaultTableModel model = (DefaultTableModel) threadTable.getModel();

        // Displaying an error message if not threads has been selected.
        if (selectedRows == 0) {
            JOptionPane.showMessageDialog(null, "Warning : Please select a thread in order to edit!!");
        } else {

            // Taking the user to the thread editing page once the selection has been made and the edit thread button has been clicked.
            timerObj.cancel();
            
            String threadId = new String(model.getValueAt(indexes[0], 0).toString());
            String threadTitle = new String(model.getValueAt(indexes[0], 1).toString());

            EditThreadPage editThreadPageObj = new EditThreadPage(threadId, threadTitle);
            editThreadPageObj.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnEditThreadActionPerformed

    /**
     * the purpose of this application is to display threads in the table
     *
     * also to check if new threads has been added to the database.
     */
    public void displayThreads() {
        String checkNewThread = checkNewThread(latestThreadId);

        String infoArray[] = checkNewThread.split("-");

        latestThreadId = Integer.parseInt(infoArray[1]);

        boolean is_a_new_thread_added = Boolean.valueOf(infoArray[0]);

        if (is_a_new_thread_added || did_start_the_app) {
            String receivedThreadChain = getThreads();

            String receivedThreadChainArr[] = receivedThreadChain.split(";");

            DefaultTableModel model = (DefaultTableModel) threadTable.getModel();

            model.setRowCount(0);

            Object[] rows = new Object[4];

            int columnNo = 0;

            for (int i = 0; i < receivedThreadChainArr.length; i++) {
                String threadRowDataArr[] = receivedThreadChainArr[i].split(">");
                for (int j = 0; j < threadRowDataArr.length; j++) {
                    rows[columnNo] = threadRowDataArr[j];
                    columnNo++;
                }
                columnNo = 0;
                model.addRow(rows);
            }

            did_start_the_app = false;

        } else {

        }

    }

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
            java.util.logging.Logger.getLogger(ThreadOptionPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreadOptionPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreadOptionPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreadOptionPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThreadOptionPage threadPage = new ThreadOptionPage();
                threadPage.setVisible(true);

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateThread;
    private javax.swing.JButton btnEditThread;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpThreadContainer;
    private javax.swing.JLabel lblNickName;
    private javax.swing.JTable threadTable;
    // End of variables declaration//GEN-END:variables

    private static String getThreads() {
        ChatService.ChatService_Service service = new ChatService.ChatService_Service();
        ChatService.ChatService port = service.getChatServicePort();
        return port.getThreads();
    }

    private static String checkNewThread(int latestThreadId) {
        ChatService.ChatService_Service service = new ChatService.ChatService_Service();
        ChatService.ChatService port = service.getChatServicePort();
        return port.checkNewThread(latestThreadId);
    }

}

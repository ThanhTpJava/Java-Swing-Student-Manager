/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ps22219_thanhtp_sof203_asmFinal;

import com.sun.org.apache.bcel.internal.generic.IADD;
import javax.swing.ImageIcon;

/**
 *
 * @author Acer
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    private QuanLySinhVien mQLSV;
    private QuanLyDiemSV mQLD;

    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btnLogout = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnQLSV = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnQLD = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnAboutUs = new javax.swing.JButton();
        tbpMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnLogout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mmnuManageStudent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnManagePoint = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnContent = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnAboutUs = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 204));
        jToolBar1.setRollover(true);

        btnLogout.setBackground(new java.awt.Color(204, 255, 255));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(51, 51, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/logout (1).png"))); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerifyInputWhenFocusTarget(false);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnLogout);
        jToolBar1.add(jSeparator4);

        btnQLSV.setBackground(new java.awt.Color(204, 255, 255));
        btnQLSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQLSV.setForeground(new java.awt.Color(51, 51, 255));
        btnQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/student32.jpg"))); // NOI18N
        btnQLSV.setText("Quản lý sinh viên");
        btnQLSV.setFocusable(false);
        btnQLSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmnuManageStudentActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLSV);
        jToolBar1.add(jSeparator5);

        btnQLD.setBackground(new java.awt.Color(204, 255, 255));
        btnQLD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQLD.setForeground(new java.awt.Color(51, 51, 255));
        btnQLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/QLD32.png"))); // NOI18N
        btnQLD.setText("Quản lý điểm");
        btnQLD.setFocusable(false);
        btnQLD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnManagePointActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLD);
        jToolBar1.add(jSeparator6);

        btnAboutUs.setBackground(new java.awt.Color(204, 255, 255));
        btnAboutUs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAboutUs.setForeground(new java.awt.Color(51, 51, 255));
        btnAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/aboutus 32.png"))); // NOI18N
        btnAboutUs.setText("Giới Thiệu");
        btnAboutUs.setFocusable(false);
        btnAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAboutUs);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));

        jMenu1.setText("Hệ Thống");

        mnLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/login (1).png"))); // NOI18N
        mnLogout.setText("Đăng Xuất");
        jMenu1.add(mnLogout);
        jMenu1.add(jSeparator1);

        mnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/Button-Close-icon.png"))); // NOI18N
        mnExit.setText("Thoát");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mmnuManageStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mmnuManageStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/QLSV.jpg"))); // NOI18N
        mmnuManageStudent.setText("Quản Lý Sinh Viên");
        mmnuManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmnuManageStudentActionPerformed(evt);
            }
        });
        jMenu2.add(mmnuManageStudent);
        jMenu2.add(jSeparator2);

        mnManagePoint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnManagePoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/QLD.png"))); // NOI18N
        mnManagePoint.setText("Quản Lý Điểm");
        mnManagePoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnManagePointActionPerformed(evt);
            }
        });
        jMenu2.add(mnManagePoint);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ giúp");

        mnContent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        mnContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/help.png"))); // NOI18N
        mnContent.setText("Nội dung");
        jMenu3.add(mnContent);
        jMenu3.add(jSeparator3);

        mnAboutUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        mnAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sv/aboutus.png"))); // NOI18N
        mnAboutUs.setText("Giới Thiệu");
        jMenu3.add(mnAboutUs);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbpMainBoard))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmnuManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmnuManageStudentActionPerformed
//        if (mQLSVPanel == null) {
//            mQLSVPanel = new QuanLySinhVien();
//            ImageIcon icon = new ImageIcon(getClass()
//                    .getResource("/icon_sv/student32.jpg"));
//            tbpMainBoard.addTab("Quản Lý Sinh Viên", icon, mQLSVPanel, "Quản Lý Sinh Viên");
//
//        }
//        tbpMainBoard.setSelectedComponent(mQLSVPanel);
        if (mQLSV == null) {
            mQLSV = new QuanLySinhVien();
            mQLSV.setVisible(true);
        }
    }//GEN-LAST:event_mmnuManageStudentActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnManagePointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnManagePointActionPerformed
        if (mQLD == null) {
            mQLD = new QuanLyDiemSV();
            mQLD.setVisible(true);
        }
          
//
//        if (mQLDPanel == null) {
//            mQLDPanel = new QuanLyDiemSV();
//            ImageIcon icon = new ImageIcon(getClass()
//                    .getResource("/icon_sv/student32.jpg"));
//            tbpMainBoard.addTab("Quản Lý Sinh Viên", icon, mQLDPanel, "Quản Lý Sinh Viên");
//
//        }
//        tbpMainBoard.setSelectedComponent(mQLDPanel);
    }//GEN-LAST:event_mnManagePointActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnQLD;
    private javax.swing.JButton btnQLSV;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mmnuManageStudent;
    private javax.swing.JMenuItem mnAboutUs;
    private javax.swing.JMenuItem mnContent;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnLogout;
    private javax.swing.JMenuItem mnManagePoint;
    private javax.swing.JTabbedPane tbpMainBoard;
    // End of variables declaration//GEN-END:variables
}

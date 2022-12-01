
import java.rmi.Naming;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author quang
 */
public class frmRutTienSoKhac extends javax.swing.JFrame {

    private String SoTaiKhoan;
    private String GhiChu;

    /**
     * Creates new form frmRutTienSoKhac
     * @param SoTaiKhoan
     * @param GhiChu
     */
    public frmRutTienSoKhac(String SoTaiKhoan, String GhiChu) {
        initComponents();
        this.SoTaiKhoan = SoTaiKhoan;
        this.GhiChu = GhiChu;
    }

    private frmRutTienSoKhac() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSoTienRut = new javax.swing.JTextField();
        btnRut = new javax.swing.JButton();

        setTitle("Rút tiền");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nhập số tiền muốn rút: ");

        txtSoTienRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoTienRutActionPerformed(evt);
            }
        });

        btnRut.setBackground(new java.awt.Color(0, 102, 255));
        btnRut.setText("Rút");
        btnRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoTienRut, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRut)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoTienRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSoTienRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoTienRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoTienRutActionPerformed

    private void btnRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutActionPerformed
        int SoTienRut;
        try {
            SoTienRut = Integer.parseInt(txtSoTienRut.getText());
            if(SoTienRut>=50000) {
                if(tt.RutTien(SoTaiKhoan, SoTienRut, GhiChu)) {
                    JOptionPane.showMessageDialog(rootPane, "Giao dịch thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(rootPane, "Số dư không đủ để thực hiện giao dịch!", "Lỗi giao dịch", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Số tiền rút không hợp lệ!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(frmRutTien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRutActionPerformed

    ITinhToan tt;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            tt = (ITinhToan) Naming.lookup("rmi://localhost:1099/TinhToan");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmRutTienSoKhac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRutTienSoKhac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRutTienSoKhac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRutTienSoKhac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRutTienSoKhac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtSoTienRut;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.VuKhiDAO;
import java.util.ArrayList;
import java.util.List;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modul.VuKhi;

/**
 *
 * @author LeeĐăgg
 */
public class HomeFrm extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrm
     */
    private List<VuKhi> vuKhis;
    private DefaultTableModel tblModel;
    private int selectedIndex;
    private VuKhiDAO dao;
    public HomeFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        dao = new VuKhiDAO();
        vuKhis = new ArrayList<>();
        tblModel = (DefaultTableModel) tblVuKhi.getModel();
        tblModel.setColumnIdentifiers(new Object[]{
                "ID","Tên Vũ Khí", "Loại","Số Lượng", "Giá", "Ngày Nhập"

        });
        this.setTitle("Bảng Vũ Khí");
        loadDataToTable();
    }
    private void loadDataToTable() {
        vuKhis = dao.getListVuKhi();
        showData();
    }

    private void showData() {
        tblModel.setRowCount(0);
        for (VuKhi vuKhi : vuKhis) {
            tblModel.addRow(new Object[]{
                    vuKhi.getID(), vuKhi.getTenVuKhi(), vuKhi.getSoLuong(), vuKhi.getLoai(), vuKhi.getGia(), vuKhi.getNgayNhap()
            });
        }
    }

    public void addVuKhi(VuKhi v){
        vuKhis.add(v);
        showData();

    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVuKhi = new javax.swing.JTable();
        btnAdd = new java.awt.Button();
        btnEdit = new java.awt.Button();
        btnDel = new java.awt.Button();
        button4 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 255, 204));
        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Danh Sách Vũ Khí");

        tblVuKhi.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Tên Vũ Khí", "Số Lượng", "Loại", "Giá", "Ngày Nhập"
                }
        ));
        jScrollPane1.setViewportView(tblVuKhi);
        if (tblVuKhi.getColumnModel().getColumnCount() > 0) {
            tblVuKhi.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblVuKhi.getColumnModel().getColumn(2).setPreferredWidth(25);
        }

        btnAdd.setLabel("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setLabel("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDel.setLabel("Xóa");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        button4.setLabel("Thu Xuất Vũ Khí");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(184, 184, 184)
                                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        InputFrm inputFrm = new InputFrm(this, rootPaneCheckingEnabled);
        inputFrm.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        String selectedVuKhiName = getSelectedVuKhiName();
        if (selectedVuKhiName != null) {
            HomeFrm2 home2Frm = new HomeFrm2(selectedVuKhiName);
            home2Frm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một vũ khí từ bảng!");
        }



    }//GEN-LAST:event_button4ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        selectedIndex = tblVuKhi.getSelectedRow();
        if(vuKhis.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm Vũ Khí rồi sửa!");

        }else if(selectedIndex == -1 ){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn Vũ Khí cần sửa!");
        }
        else{ // chon dong can sua va nhan nut
            EditFrm1 edit = new EditFrm1(this, rootPaneCheckingEnabled);
            edit.setEditData(vuKhis.get(selectedIndex));
            edit.setVisible(true);

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        int removeIndex = tblVuKhi.getSelectedRow();
        if(removeIndex == -1){
            JOptionPane.showMessageDialog(rootPane, "Chọn vũ khí cần xóa!");
        }else if(vuKhis.size()==0){
            JOptionPane.showMessageDialog(rootPane, "Không có vũ khí để xóa!");
        }   else{
            vuKhis.remove(removeIndex);
            showData();
        }
    }//GEN-LAST:event_btnDelActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAdd;
    private java.awt.Button btnDel;
    private java.awt.Button btnEdit;
    private java.awt.Button button4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable tblVuKhi;
    // End of variables declaration//GEN-END:variables

    public void updateVuKhi(VuKhi v) {
        vuKhis.remove(selectedIndex);
        this.addVuKhi(v);
    }

    private String getSelectedVuKhiName() {
        int selectedRow = tblVuKhi.getSelectedRow();
        if (selectedRow != -1) {
            return (String) tblModel.getValueAt(selectedRow, 1); // Lấy tên vũ khí từ cột thứ 2 (index 1)
        }
        return null;
    }
}
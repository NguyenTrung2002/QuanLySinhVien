package GUI;

import Quanly.GiangVienSEV;
import ThuocTinh.giangVien;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trung
 */
public class editThongtinGiangvien extends javax.swing.JFrame {
    GiangVienSEV giangVienSEV1;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form editThongtinGiangvien
     */
    public editThongtinGiangvien() {
        initComponents();
        setTitle("Danh sách giáo viên");
        setLocationRelativeTo(this);
        giangVienSEV1 = new GiangVienSEV();
        
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        jtbGiangvien.setModel(defaultTableModel);
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("Họ và tên");
        defaultTableModel.addColumn("Giới tính");
        defaultTableModel.addColumn("Năm sinh");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Số điện thoại");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("Môn dạy");
        defaultTableModel.addColumn("Mã môn dạy");
        List<giangVien> giangviens = giangVienSEV1.getAllGiangvien();
        
        for(giangVien giangVien1 : giangviens){
            defaultTableModel.addRow(new Object[]{giangVien1.getIdGV(), giangVien1.getName(), giangVien1.getGioiTinh(), giangVien1.getNamSinh(), giangVien1.getAddress() ,giangVien1.getPhone(), giangVien1.getEmail(),giangVien1.getChuyenNganh(), giangVien1.getMaMonday()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbGiangvien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jbtSuaGV = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jbtXemlop = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtTimkiem = new javax.swing.JButton();
        magvTextfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtbGiangvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbGiangvien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtbGiangvien);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbtSuaGV.setText("Sửa");
        jbtSuaGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaGVActionPerformed(evt);
            }
        });

        exitButton.setText("Thoát");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        deleteButton.setText("Xóa");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jbtXemlop.setText("Xem lớp");
        jbtXemlop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXemlopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtSuaGV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtXemlop)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addGap(45, 45, 45)
                .addComponent(jbtSuaGV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(55, 55, 55)
                .addComponent(exitButton)
                .addGap(53, 53, 53)
                .addComponent(jbtXemlop)
                .addContainerGap())
        );

        jbtTimkiem.setText("Tìm kiếm");
        jbtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimkiemActionPerformed(evt);
            }
        });

        jLabel1.setText("Nhập mã giáo viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(magvTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtTimkiem)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtTimkiem)
                    .addComponent(magvTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        defaultTableModel.setRowCount(0);
        
        List<giangVien> giangviens = giangVienSEV1.getAllGiangvien();
        
        for(giangVien giangVien1 : giangviens){
            defaultTableModel.addRow(new Object[]{giangVien1.getIdGV(), giangVien1.getName(), giangVien1.getGioiTinh(), giangVien1.getNamSinh(), giangVien1.getAddress() ,giangVien1.getPhone(), giangVien1.getEmail(),giangVien1.getChuyenNganh(), giangVien1.getMaMonday()});
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtSuaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaGVActionPerformed
        // TODO add your handling code here:
        int row = jtbGiangvien.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn user trước", "Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int maGV =  Integer.valueOf(String.valueOf(jtbGiangvien.getValueAt(row, 0)));
            new SuaThongTinGiangVien(maGV).setVisible(true);
            
        }
        
    }//GEN-LAST:event_jbtSuaGVActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
            setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new ThemGiaoVien().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int row = jtbGiangvien.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn user trước", "Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int xacNhan = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn xóa không ?");
            if (xacNhan == JOptionPane.YES_OPTION){
                String maMonhoc =  String.valueOf(jtbGiangvien.getValueAt(row, 8));
                int maGV = Integer.valueOf(String.valueOf(jtbGiangvien.getValueAt(row, 0)));
                giangVienSEV1.deleteMonhoc(maMonhoc);
                giangVienSEV1.deleteGiangvien(maGV);
                giangVienSEV1.deleteUserGiangvien(maGV);
                giangVienSEV1.DropTableGV(maMonhoc);
                defaultTableModel.setRowCount(0);
                List<giangVien> giangviens = giangVienSEV1.getAllGiangvien();
        
        for(giangVien giangVien1 : giangviens){
            defaultTableModel.addRow(new Object[]{giangVien1.getIdGV(), giangVien1.getName(), giangVien1.getGioiTinh(), giangVien1.getNamSinh(), giangVien1.getAddress() ,giangVien1.getPhone(), giangVien1.getEmail(),giangVien1.getChuyenNganh(), giangVien1.getMaMonday()});
        }
            }
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jbtXemlopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXemlopActionPerformed
        // TODO add your handling code here:
        int row = jtbGiangvien.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn user trước", "Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String maMH =  String.valueOf(jtbGiangvien.getValueAt(row, 8));
            new DanhSachHocSinhCuaMonHoc(maMH).setVisible(true);
            
        }
    }//GEN-LAST:event_jbtXemlopActionPerformed

    private void jbtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimkiemActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        List<giangVien> giangviens = giangVienSEV1.getSelectGiangVien(Integer.parseInt(magvTextfield.getText()));
        
        for(giangVien giangVien1 : giangviens){
            defaultTableModel.addRow(new Object[]{giangVien1.getIdGV(), giangVien1.getName(), giangVien1.getGioiTinh(), giangVien1.getNamSinh(), giangVien1.getAddress() ,giangVien1.getPhone(), giangVien1.getEmail(),giangVien1.getChuyenNganh(), giangVien1.getMaMonday()});
        }
        magvTextfield.setText(null);
    }//GEN-LAST:event_jbtTimkiemActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtSuaGV;
    private javax.swing.JButton jbtTimkiem;
    private javax.swing.JButton jbtXemlop;
    private javax.swing.JTable jtbGiangvien;
    private javax.swing.JTextField magvTextfield;
    // End of variables declaration//GEN-END:variables
}

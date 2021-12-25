package GUI;

import Quanly.MonHocSEV;
import Quanly.sinhVienSev;
import ThuocTinh.MonHoc;
import ThuocTinh.sinhVien;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trung
 */
public class DangKyMonHoc extends javax.swing.JFrame {
    MonHocSEV monHocSEV1;
    DefaultTableModel defaultTableModel;
    sinhVienSev sinhVienSev1;
    sinhVien sinhVien1;

    /**
     * Creates new form DangKyMonHoc
     * @param id
     * @param hoTen
     */
    public DangKyMonHoc(int id, String hoTen) {
        initComponents();
        setTitle("Đăng ký môn học");
        setLocationRelativeTo(this);
        monHocSEV1 = new MonHocSEV();
        sinhVienSev1 = new sinhVienSev();
        sinhVien1 = new sinhVien();
        masvTextfield.setText(String.valueOf(id));
        tensvTextfield.setText(hoTen);
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        
        jtbDangkymonhoc.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã học phần");
        defaultTableModel.addColumn("Giáo viên");
        defaultTableModel.addColumn("Môn dạy");
        
        List<MonHoc> monhocs = monHocSEV1.getAllMonHoc();
        
        for(MonHoc monHoc1 : monhocs){
            defaultTableModel.addRow(new Object[]{monHoc1.getMaMH(),monHoc1.getTenGV(),monHoc1.getTenMH()});
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
        jtbDangkymonhoc = new javax.swing.JTable();
        jbtThoat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        masvTextfield = new javax.swing.JTextField();
        tensvTextfield = new javax.swing.JTextField();
        dangkyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtbDangkymonhoc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbDangkymonhoc);

        jbtThoat.setText("Thoát");
        jbtThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThoatActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã sinh viên");

        jLabel2.setText("Tên sinh viên");

        masvTextfield.setEditable(false);

        tensvTextfield.setEditable(false);

        dangkyButton.setText("Đăng kí");
        dangkyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangkyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(masvTextfield))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dangkyButton)
                    .addComponent(tensvTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(masvTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tensvTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dangkyButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtThoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dangkyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangkyButtonActionPerformed
        // TODO add your handling code here:
        int row = jtbDangkymonhoc.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn môn học", "Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int xacNhan = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn đăng ký không ?");
            if (xacNhan == JOptionPane.YES_OPTION){
                String maMH = String.valueOf(jtbDangkymonhoc.getValueAt(row, 0));
                String tenMH = String.valueOf(jtbDangkymonhoc.getValueAt(row, 2));
                int id = Integer.parseInt(masvTextfield.getText());
                String name = tensvTextfield.getText();
                sinhVienSev1.InsertMonHocSV(id, maMH, tenMH);
                sinhVienSev1.InsertThongTinSV(id, name, maMH);
            }
    }//GEN-LAST:event_dangkyButtonActionPerformed

    private void jbtThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThoatActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jbtThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangkyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtThoat;
    private javax.swing.JTable jtbDangkymonhoc;
    private javax.swing.JTextField masvTextfield;
    private javax.swing.JTextField tensvTextfield;
    // End of variables declaration//GEN-END:variables
}

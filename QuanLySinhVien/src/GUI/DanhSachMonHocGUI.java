package GUI;

import Quanly.MonHocSEV;
import ThuocTinh.MonHoc;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trung
 */
public class DanhSachMonHocGUI extends javax.swing.JFrame {
    MonHocSEV monHocSEV1;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form DanhSachMonHocGUI
     */
    public DanhSachMonHocGUI() {
        initComponents();
        setTitle("Danh sách lớp học");
        setLocationRelativeTo(this);
        monHocSEV1 = new MonHocSEV();
        
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        
        jtbDanhsachmonhoc.setModel(defaultTableModel);
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
        jtbDanhsachmonhoc = new javax.swing.JTable();
        jbtXemlophoc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbtTimkiem = new javax.swing.JButton();
        timkiemTextfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(574, 390));

        jtbDanhsachmonhoc.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbDanhsachmonhoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtbDanhsachmonhoc);

        jbtXemlophoc.setText("Xem lớp học");
        jbtXemlophoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXemlophocActionPerformed(evt);
            }
        });

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbtTimkiem.setText("Tìm kiếm");
        jbtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimkiemActionPerformed(evt);
            }
        });

        jLabel1.setText("Nhập mã môn học");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(timkiemTextfield)
                .addGap(32, 32, 32)
                .addComponent(jbtTimkiem)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtTimkiem)
                    .addComponent(timkiemTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtXemlophoc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtXemlophoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtXemlophocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXemlophocActionPerformed
        // TODO add your handling code here:
        int row = jtbDanhsachmonhoc.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn lớp", "Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String maMH =  String.valueOf(jtbDanhsachmonhoc.getValueAt(row, 0));
            new DanhSachHocSinhCuaMonHoc(maMH).setVisible(true);
            
        }
    }//GEN-LAST:event_jbtXemlophocActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimkiemActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        List<MonHoc> monhocs = monHocSEV1.getSelectMonHoc(timkiemTextfield.getText());
        for(MonHoc monHoc1 : monhocs){
            defaultTableModel.addRow(new Object[]{monHoc1.getMaMH(),monHoc1.getTenGV(),monHoc1.getTenMH()});
        }
        timkiemTextfield.setText(null);
    }//GEN-LAST:event_jbtTimkiemActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtTimkiem;
    private javax.swing.JButton jbtXemlophoc;
    private javax.swing.JTable jtbDanhsachmonhoc;
    private javax.swing.JTextField timkiemTextfield;
    // End of variables declaration//GEN-END:variables
}

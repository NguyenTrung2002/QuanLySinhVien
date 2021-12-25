package Quanly;

import KetNoiSQL.JDBCConnection;
import ThuocTinh.HocPhan;
import ThuocTinh.MonHoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class DanhSachMonHoc {
    public List<MonHoc> getAllMonHoc(){
       List<MonHoc> monhocs = new ArrayList<MonHoc>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.mon_day";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                MonHoc monHoc1 = new MonHoc();
                monHoc1.setMaMH(rs.getString("Mã học phần"));
                monHoc1.setTenGV(rs.getString("Giáo viên"));
                monHoc1.setTenMH(rs.getString("Môn dạy"));
                monhocs.add(monHoc1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monhocs;
    } 
    public List<HocPhan> getHocPhanSelect(String maMH){
        List<HocPhan> hocphans = new ArrayList<HocPhan>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Select * from du_lieu." + maMH;
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                HocPhan hocPhan1 = new HocPhan();
                hocPhan1.setId(rs.getInt("ID"));
                hocPhan1.setName(rs.getString("Họ và tên"));
                hocPhan1.setDiemCC(rs.getString("Điểm chuyên cần"));
                hocPhan1.setDiemGK(rs.getString("Điểm giữa kỳ"));
                hocPhan1.setDiemCK(rs.getString("Điểm cuối kỳ"));
                hocphans.add(hocPhan1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hocphans;
    }
    public List<MonHoc> getSelectMonHoc(String maMH){
       List<MonHoc> monhocs = new ArrayList<MonHoc>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.mon_day where `Mã học phần` = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, maMH);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                MonHoc monHoc1 = new MonHoc();
                monHoc1.setMaMH(rs.getString("Mã học phần"));
                monHoc1.setTenGV(rs.getString("Giáo viên"));
                monHoc1.setTenMH(rs.getString("Môn dạy"));
                monhocs.add(monHoc1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monhocs;
    } 
}

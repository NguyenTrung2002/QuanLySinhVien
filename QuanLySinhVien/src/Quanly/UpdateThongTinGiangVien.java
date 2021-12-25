package Quanly;

import KetNoiSQL.JDBCConnection;
import ThuocTinh.HocPhan;
import ThuocTinh.giangVien;
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
public class UpdateThongTinGiangVien {
    public List<giangVien> getAllGiangvien(){
       List<giangVien> giangviens = new ArrayList<giangVien>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.giao_vien";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                giangVien giangVien1 = new giangVien();
                giangVien1.setIdGV(rs.getInt("ID"));
                giangVien1.setName(rs.getString("Họ và tên"));
                giangVien1.setChuyenNganh(rs.getString("Môn dạy"));
                giangVien1.setGioiTinh(rs.getString("Giới tính"));
                giangVien1.setNamSinh(rs.getString("Năm sinh"));
                giangVien1.setAddress(rs.getString("Địa chỉ"));
                giangVien1.setEmail(rs.getString("Email"));
                giangVien1.setPhone(rs.getString("SDT"));
                giangVien1.setMaMonday(rs.getString("Mã học phần"));
                giangviens.add(giangVien1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return giangviens;
    }
    public void addGiangvien(giangVien giangVien1){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.giao_vien (ID, `Họ và tên`, `Giới tính`, `Năm sinh`, `Địa chỉ`, `SDT`, `Email`, `Môn dạy`,`Mã học phần`) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,giangVien1.getIdGV());
            preparedStatement.setString(2, giangVien1.getName());
            preparedStatement.setString(3, giangVien1.getGioiTinh());
            preparedStatement.setString(4, giangVien1.getNamSinh());
            preparedStatement.setString(5, giangVien1.getAddress());
            preparedStatement.setString(6, giangVien1.getPhone());
            preparedStatement.setString(7, giangVien1.getEmail());
            preparedStatement.setString(8, giangVien1.getChuyenNganh());
            preparedStatement.setString(9, giangVien1.getMaMonday());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateGiangvien(giangVien giangVien1){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Update du_lieu.giao_vien Set `Họ và tên` = ?, `Giới tính` = ?, `Năm sinh` = ?, `Địa chỉ` = ?, `SDT` = ?, `Email` = ?, `Môn dạy` = ?, `Mã học phần` = ? Where ID = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, giangVien1.getName());
            preparedStatement.setString(2, giangVien1.getGioiTinh());
            preparedStatement.setString(3, giangVien1.getNamSinh());
            preparedStatement.setString(4, giangVien1.getAddress());
            preparedStatement.setString(5, giangVien1.getPhone());
            preparedStatement.setString(6, giangVien1.getEmail());
            preparedStatement.setString(7, giangVien1.getChuyenNganh());
            preparedStatement.setString(8, giangVien1.getMaMonday());
            preparedStatement.setInt(9,giangVien1.getIdGV());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void deleteGiangvien(int id){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.giao_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public giangVien getGiangvienbyID(int id){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.giao_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                giangVien giangVien1 = new giangVien();
                giangVien1.setIdGV(rs.getInt("ID"));
                giangVien1.setName(rs.getString("Họ và tên"));
                giangVien1.setChuyenNganh(rs.getString("Môn dạy"));
                giangVien1.setGioiTinh(rs.getString("Giới tính"));
                giangVien1.setNamSinh(rs.getString("Năm sinh"));
                giangVien1.setAddress(rs.getString("Địa chỉ"));
                giangVien1.setEmail(rs.getString("Email"));
                giangVien1.setPhone(rs.getString("SDT"));
                giangVien1.setMaMonday(rs.getString("Mã học phần"));
                
                return giangVien1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<giangVien> getSelectGiangvien(int id){
       List<giangVien> giangviens = new ArrayList<giangVien>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.giao_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                giangVien giangVien1 = new giangVien();
                giangVien1.setIdGV(rs.getInt("ID"));
                giangVien1.setName(rs.getString("Họ và tên"));
                giangVien1.setChuyenNganh(rs.getString("Môn dạy"));
                giangVien1.setGioiTinh(rs.getString("Giới tính"));
                giangVien1.setNamSinh(rs.getString("Năm sinh"));
                giangVien1.setAddress(rs.getString("Địa chỉ"));
                giangVien1.setEmail(rs.getString("Email"));
                giangVien1.setPhone(rs.getString("SDT"));
                giangVien1.setMaMonday(rs.getString("Mã học phần"));
                giangviens.add(giangVien1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return giangviens;
    }
    public void addUserGiangvien(giangVien giangVien1){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.login (ID, `Username`, `Password`, `Usertype`, `Nickname`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,giangVien1.getIdGV());
            preparedStatement.setString(2, giangVien1.getUserName());
            preparedStatement.setString(3, giangVien1.getPassWord());
            preparedStatement.setString(4, giangVien1.getUserType());
            preparedStatement.setString(5, giangVien1.getName());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteUserGiangvien(int id){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.login where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void TableGiangvien(String maMonhoc){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "CREATE TABLE `du_lieu`.`" + maMonhoc + "`"
                + "( `ID` INT NOT NULL, "
                + "`Họ và tên` VARCHAR(45) NULL,"
                + " `Điểm chuyên cần` VARCHAR(45) NULL, "
                + "`Điểm giữa kỳ` VARCHAR(45) NULL, "
                + "`Điểm cuối kỳ` VARCHAR(45) NULL,"
                
                + " PRIMARY KEY (`ID`));";
        try {
            PreparedStatement preparedStatement = con.prepareCall(sql);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void DropTableGV(String maMonhoc){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Drop Table du_lieu." + maMonhoc;
        try {
            PreparedStatement preparedStatement = con.prepareCall(sql);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void addThongtinMonHoc(giangVien giangVien1){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.mon_day (`Mã học phần`, `Giáo viên`, `Môn dạy`) VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, giangVien1.getMaMonday());
            preparedStatement.setString(2, giangVien1.getName());
            preparedStatement.setString(3, giangVien1.getChuyenNganh());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteMonhoc(String maMonhoc){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.mon_day where `Mã học phần` = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,maMonhoc);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<HocPhan> getAllHocPhan(String maMH){
        List<HocPhan> hocphans = new ArrayList<HocPhan>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Select * from du_lieu." + maMH;
        try {
            PreparedStatement preparedStatement = con.prepareCall(sql);
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
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hocphans;
    }
    public HocPhan SuaDiemByID(int id, String maMH){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Select * from du_lieu." + maMH + " where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareCall(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                HocPhan hocPhan1 = new HocPhan();
                hocPhan1.setId(rs.getInt("ID"));
                hocPhan1.setName(rs.getString("Họ và Tên"));
                hocPhan1.setDiemCC(rs.getString("Điểm chuyên cần"));
                hocPhan1.setDiemGK(rs.getString("Điểm giữa kỳ"));
                hocPhan1.setDiemCK(rs.getString("Điểm cuối kỳ"));
                
                return hocPhan1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void UpdatediemMonHoc(HocPhan hocPhan, String maMH){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Update du_lieu." + maMH +" Set `Họ và tên` = ?, `Điểm chuyên cần` = ?, `Điểm giữa kỳ` = ?, `Điểm cuối kỳ` = ? Where ID = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, hocPhan.getName());
            preparedStatement.setString(2, hocPhan.getDiemCC());
            preparedStatement.setString(3, hocPhan.getDiemGK());
            preparedStatement.setString(4, hocPhan.getDiemCK());
            preparedStatement.setInt(5, hocPhan.getId());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void UpdatediemMonHocbySV(int id, HocPhan hocPhan, String maMH){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Update du_lieu.diem" + String.valueOf(id) +" Set  `Điểm chuyên cần` = ?, `Điểm giữa kỳ` = ?, `Điểm cuối kỳ` = ? Where `Mã môn học` = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, hocPhan.getDiemCC());
            preparedStatement.setString(2, hocPhan.getDiemGK());
            preparedStatement.setString(3, hocPhan.getDiemCK());
            preparedStatement.setString(4, maMH);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<HocPhan> getSelectHocPhan(String maMH,int id){
        List<HocPhan> hocphans = new ArrayList<HocPhan>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Select * from du_lieu." + maMH + " where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareCall(sql);
            preparedStatement.setInt(1, id);
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
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hocphans;
    }
}

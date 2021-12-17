package Quanly;

import KetNoiSQL.JDBCConnection;
import ThuocTinh.sinhVien;
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
public class UpdatethongtinSV {
    public List<sinhVien> getAllSinhvien(){
       List<sinhVien> sinhviens = new ArrayList<sinhVien>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.sinh_vien";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                sinhVien sinhVien1 = new sinhVien();
                sinhVien1.setIdSV(rs.getInt("ID"));
                sinhVien1.setName(rs.getString("Họ và tên"));
                sinhVien1.setLop(rs.getString("Lớp"));
                sinhVien1.setKhoa(rs.getString("Khóa"));
                sinhVien1.setGioiTinh(rs.getString("Giới tính"));
                sinhVien1.setNamSinh(rs.getString("Năm sinh"));
                sinhVien1.setAddress(rs.getString("Địa chỉ"));
                sinhVien1.setEmail(rs.getString("Email"));
                sinhVien1.setPhone(rs.getString("SDT"));
                sinhviens.add(sinhVien1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sinhviens;
    }
    public void addSinhvien(sinhVien sinhVien1){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.sinh_vien (ID, `Họ và tên`, `Lớp`, `Khóa`, `Giới tính`, `Năm sinh`, `Địa chỉ`, `Email`, `SDT`) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,sinhVien1.getIdSV());
            preparedStatement.setString(2, sinhVien1.getName());
            preparedStatement.setString(3, sinhVien1.getLop());
            preparedStatement.setString(4, sinhVien1.getKhoa());
            preparedStatement.setString(5, sinhVien1.getGioiTinh());
            preparedStatement.setString(6, sinhVien1.getNamSinh());
            preparedStatement.setString(7, sinhVien1.getAddress());
            preparedStatement.setString(8, sinhVien1.getEmail());
            preparedStatement.setString(9, sinhVien1.getPhone());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateSinhvien(sinhVien sinhVien1){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Update du_lieu.sinh_vien Set `Họ và tên` = ?, `Lớp` = ?, `Khóa` = ?, `Giới tính` = ?, `Năm sinh` = ?, `Địa chỉ` = ?, `Email` = ?, `SDT` = ? Where ID = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, sinhVien1.getName());
            preparedStatement.setString(2, sinhVien1.getLop());
            preparedStatement.setString(3, sinhVien1.getKhoa());
            preparedStatement.setString(4, sinhVien1.getGioiTinh());
            preparedStatement.setString(5, sinhVien1.getNamSinh());
            preparedStatement.setString(6, sinhVien1.getAddress());
            preparedStatement.setString(7, sinhVien1.getEmail());
            preparedStatement.setString(8, sinhVien1.getPhone());
            preparedStatement.setInt(9,sinhVien1.getIdSV());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void deleteSinhvien(int id){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.sinh_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public sinhVien getSinhvienbyID(int id){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.sinh_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                sinhVien sinhVien1 = new sinhVien();
                sinhVien1.setIdSV(rs.getInt("ID"));
                sinhVien1.setName(rs.getString("Họ và tên"));
                sinhVien1.setLop(rs.getString("Lớp"));
                sinhVien1.setKhoa(rs.getString("Khóa"));
                sinhVien1.setGioiTinh(rs.getString("Giới tính"));
                sinhVien1.setNamSinh(rs.getString("Năm sinh"));
                sinhVien1.setAddress(rs.getString("Địa chỉ"));
                sinhVien1.setEmail(rs.getString("Email"));
                sinhVien1.setPhone(rs.getString("SDT"));
                return sinhVien1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<sinhVien> getSelectSinhvien(int id){
       List<sinhVien> sinhviens1 = new ArrayList<sinhVien>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.sinh_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                sinhVien sinhVien1 = new sinhVien();
                sinhVien1.setIdSV(rs.getInt("ID"));
                sinhVien1.setName(rs.getString("Họ và tên"));
                sinhVien1.setLop(rs.getString("Lớp"));
                sinhVien1.setKhoa(rs.getString("Khóa"));
                sinhVien1.setGioiTinh(rs.getString("Giới tính"));
                sinhVien1.setNamSinh(rs.getString("Năm sinh"));
                sinhVien1.setAddress(rs.getString("Địa chỉ"));
                sinhVien1.setEmail(rs.getString("Email"));
                sinhVien1.setPhone(rs.getString("SDT"));
                sinhviens1.add(sinhVien1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sinhviens1;
    }
    public void addUserSinhvien(sinhVien sinhVien1){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.login (ID, `Username`, `Password`, `Usertype`, `Nickname`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,sinhVien1.getIdSV());
            preparedStatement.setString(2, sinhVien1.getUserName());
            preparedStatement.setString(3, sinhVien1.getPassWord());
            preparedStatement.setString(4, sinhVien1.getUserType());
            preparedStatement.setString(5, sinhVien1.getName());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteUserSinhvien(int id){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.login where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

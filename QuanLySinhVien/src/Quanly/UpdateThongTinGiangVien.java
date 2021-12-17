package Quanly;

import KetNoiSQL.JDBCConnection;
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
                giangviens.add(giangVien1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return giangviens;
    }
    public void addGiangvien(giangVien giangVien1){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.giao_vien (ID, `Họ và tên`, `Giới tính`, `Năm sinh`, `Địa chỉ`, `SDT, `Email`, `Môn dạy`) VALUES (?,?,?,?,?,?,?,?)";
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
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateGiangvien(giangVien giangVien1){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Update du_lieu.giao_vien Set `Họ và tên` = ?, `Giới tính` = ?, `Năm sinh` = ?, `Địa chỉ` = ?, `SDT` = ?, `Email` = ?, `Môn dạy` = ? Where ID = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, giangVien1.getName());
            preparedStatement.setString(2, giangVien1.getGioiTinh());
            preparedStatement.setString(3, giangVien1.getNamSinh());
            preparedStatement.setString(4, giangVien1.getAddress());
            preparedStatement.setString(5, giangVien1.getPhone());
            preparedStatement.setString(6, giangVien1.getEmail());
            preparedStatement.setString(7, giangVien1.getChuyenNganh());
            preparedStatement.setInt(8,giangVien1.getIdGV());
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
                giangviens.add(giangVien1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateThongTinGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return giangviens;
    }
}

package Quanly;

import ThuocTinh.sinhVien;
import java.util.List;

/**
 *
 * @author trung
 */
public class sinhVienSev {
    private UpdatethongtinSV updatethongtinSV;
   

    public sinhVienSev() {
        updatethongtinSV = new UpdatethongtinSV();
    }
     
    public List<sinhVien> getAllSinhvien(){
        return updatethongtinSV.getAllSinhvien();
    }
    public void addSinhvien(sinhVien sinhVien1){
        updatethongtinSV.addSinhvien(sinhVien1);
    }
    public void deleteSinhvien(int id){
        updatethongtinSV.deleteSinhvien(id);
    }
   
    public sinhVien getSinhvienbyID(int id){
        return updatethongtinSV.getSinhvienbyID(id);
    }
    public void updateSinhvien(sinhVien sinhVien1){
        updatethongtinSV.updateSinhvien(sinhVien1);
    }
    public List<sinhVien> getSelectSinhVien(int id){
        return updatethongtinSV.getSelectSinhvien(id);
    }
    public void addUserSinhvien(sinhVien sinhVien1){
        updatethongtinSV.addUserSinhvien(sinhVien1);
    }
    public void deleteUserSinhvien(int id){
        updatethongtinSV.deleteUserSinhvien(id);
    }
}

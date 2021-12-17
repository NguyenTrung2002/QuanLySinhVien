package Quanly;

import ThuocTinh.giangVien;
import ThuocTinh.sinhVien;
import java.util.List;
/**
 *
 * @author trung
 */
public class GiangVienSEV {
    private UpdateThongTinGiangVien updateThongTinGiangVien;
   

    public GiangVienSEV() {
        updateThongTinGiangVien = new UpdateThongTinGiangVien();
    }
     
    public List<giangVien> getAllGiangvien(){
        return updateThongTinGiangVien.getAllGiangvien();
    }
    public void addGiangvien(giangVien giangVien1){
        updateThongTinGiangVien.addGiangvien(giangVien1);
    }
    public void deleteGiangvien(int id){
        updateThongTinGiangVien.deleteGiangvien(id);
    }
   
    public giangVien getGiangvienbyID(int id){
        return updateThongTinGiangVien.getGiangvienbyID(id);
    }
    public void updateGiangvien(giangVien giangVien1){
        updateThongTinGiangVien.updateGiangvien(giangVien1);
    }
    public List<giangVien> getSelectGiangVien(int id){
        return updateThongTinGiangVien.getSelectGiangvien(id);
    }
}

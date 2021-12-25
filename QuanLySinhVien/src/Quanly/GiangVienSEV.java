package Quanly;

import ThuocTinh.HocPhan;
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
    public void addUserGiangvien(giangVien giangVien1){
        updateThongTinGiangVien.addUserGiangvien(giangVien1);
    }
    public void deleteUserGiangvien(int id){
        updateThongTinGiangVien.deleteUserGiangvien(id);
    }
    public void TableGiangvien(String maMonhoc){
        updateThongTinGiangVien.TableGiangvien(maMonhoc);
    }
    public void DropTableGV(String maMonhoc){
        updateThongTinGiangVien.DropTableGV(maMonhoc);
    }
    public void addThongtinMonHoc(giangVien giangVien1){
        updateThongTinGiangVien.addThongtinMonHoc(giangVien1);
    }
    public void deleteMonhoc(String maMonhoc){
        updateThongTinGiangVien.deleteMonhoc(maMonhoc);
    }
    public List<HocPhan> getAllHocPhan(String maMH){
        return updateThongTinGiangVien.getAllHocPhan(maMH);
    }
    public HocPhan SuaDiemByID(int id, String maMH){
        return updateThongTinGiangVien.SuaDiemByID(id, maMH);
    }
    public void UpdatediemMonHoc(HocPhan hocPhan, String maMH){
        updateThongTinGiangVien.UpdatediemMonHoc(hocPhan, maMH);
    }
    public void UpdatediemMonHocbySV(int id, HocPhan hocPhan, String maMH){
        updateThongTinGiangVien.UpdatediemMonHocbySV(id, hocPhan, maMH);
    }
    public List<HocPhan> getSelectHocPhan(String maMH,int id){
        return  updateThongTinGiangVien.getSelectHocPhan(maMH, id);
    }
}

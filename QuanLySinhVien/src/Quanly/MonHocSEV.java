package Quanly;

import ThuocTinh.HocPhan;
import ThuocTinh.MonHoc;
import java.util.List;

/**
 *
 * @author trung
 */
public class MonHocSEV {
    private DanhSachMonHoc danhSachMonHoc;
    
    
    public MonHocSEV(){
        danhSachMonHoc = new DanhSachMonHoc();
    }
    
    public List<MonHoc> getAllMonHoc(){
        return danhSachMonHoc.getAllMonHoc();
    }
    public List<HocPhan> getHocPhanSelect(String maMH){
        return danhSachMonHoc.getHocPhanSelect(maMH);
    }
    public List<MonHoc> getSelectMonHoc(String maMH){
        return danhSachMonHoc.getSelectMonHoc(maMH);
    }

}

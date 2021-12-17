package ThuocTinh;

/**
 *
 * @author trung
 */
public class HocPhan {
    private String maHP;
    private String tenHP;
    private String maMH;
     private String tenKhoa;

    public HocPhan() {
    }

    public HocPhan(String maHP, String tenHP, String maMH, String tenKhoa) {
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.maMH = maMH;
        this.tenKhoa = tenKhoa;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
    
}

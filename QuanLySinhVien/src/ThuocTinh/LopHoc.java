package ThuocTinh;

/**
 *
 * @author trung
 */
public class LopHoc {
    private String malop;
    private String tenlop;
    private String machuyennganh;
    private String siso;
    private String khoahoc;

    public LopHoc() {
    }

    public LopHoc(String malop, String tenlop, String machuyennganh, String siso, String khoahoc) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.machuyennganh = machuyennganh;
        this.siso = siso;
        this.khoahoc = khoahoc;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getMachuyennganh() {
        return machuyennganh;
    }

    public void setMachuyennganh(String machuyennganh) {
        this.machuyennganh = machuyennganh;
    }

    public String getSiso() {
        return siso;
    }

    public void setSiso(String siso) {
        this.siso = siso;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }
    
}

package ThuocTinh;

/**
 *
 * @author trung
 */
public class TimKiem {
    private String malop;
    private String masv;

    public TimKiem(String malop, String masv) {
        this.malop = malop;
        this.masv = masv;
    }

    public TimKiem() {
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }
    
}

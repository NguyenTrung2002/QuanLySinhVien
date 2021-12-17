package ThuocTinh;

/**
 *
 * @author trung
 */
public class giangVien {
    private int idGV;
    private String name;
    private String gioiTinh;
    private String namSinh;
    private String address;
    private String phone;
    private String chuyenNganh;
    private String email;

    public giangVien() {
    }

    public int getIdGV() {
        return idGV;
    }

    public void setIdGV(int idGV) {
        this.idGV = idGV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public giangVien(int idGV, String name, String gioiTinh, String namSinh, String address, String phone, String chuyenNganh, String email) {
        this.idGV = idGV;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.address = address;
        this.phone = phone;
        this.chuyenNganh = chuyenNganh;
        this.email = email;
    }
}

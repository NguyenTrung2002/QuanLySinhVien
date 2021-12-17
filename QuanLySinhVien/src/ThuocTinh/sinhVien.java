package ThuocTinh;

import javax.swing.JTextField;

/**
 *
 * @author trung
 */
public class sinhVien {
    private int idSV;
    private String name;
    private String gioiTinh;
    private String namSinh;
    private String address;
    private String phone;
    private String Lop;
    private String Khoa;
    private String email;
    private String userName;
    private String passWord;
    private String userType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    public int getIdSV() {
        return idSV;
    }

    public void setIdSV(int idSV) {
        this.idSV = idSV;
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

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public sinhVien(int idSV, String name, String gioiTinh, String namSinh, String address, String phone, String Lop, String Khoa, String email) {
        this.idSV = idSV;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.address = address;
        this.phone = phone;
        this.Lop = Lop;
        this.Khoa = Khoa;
        this.email = email;
    }

    public sinhVien() {
    }

    public void getIdSV(JTextField idTextfield) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

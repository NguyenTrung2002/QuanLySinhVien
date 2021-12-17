package GUI;

import javax.swing.JFrame;

/**
 *
 * @author trung
 */
public class DangXuat {
    public static void logOut(JFrame context, Login loginScreen){
        DangNhap.isLoggedin = false;
        context.setVisible(false);
        loginScreen.setVisible(true);
    }

    static void logOut(MainSV aThis, DangNhap dangNhap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package Quanly;

import KetNoiSQL.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author trung
 */
public class DoiMK {
    public static boolean doiMK123(String passWordnew,int ID, JFrame jFrame){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "update du_lieu.login set password = ? where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, passWordnew);
            preparedStatement.setInt(2, ID);
            
            int rs = preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DoiMK.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

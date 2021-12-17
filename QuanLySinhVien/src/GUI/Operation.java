package GUI;

import KetNoiSQL.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author trung
 */
public class Operation {
    public static boolean isLogin(String userName, String passWord, String userType, JFrame jFrame){
        try {
            Connection myCon = JDBCConnection.getJDBCConnection();
            String mySqlQuery = "Select id, Usertype, Nickname From du_lieu.login Where Username = '" + 
                    userName +
                    "' And Password = '" +
                     passWord + 
                    "' And Usertype = '" +
                     userType  + "'";
            PreparedStatement preparedStatement = myCon.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                DangNhap.ID = resultSet.getInt("ID");
                DangNhap.userType = resultSet.getString("Usertype");
                DangNhap.nickName = resultSet.getString("Nickname");
                
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jFrame, "Database error: "+ e.getMessage() );
        }
        return false;
    }
    
}

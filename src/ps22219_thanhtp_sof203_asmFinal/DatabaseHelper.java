/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ps22219_thanhtp_sof203_asmFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AQ
 */
public class DatabaseHelper {
    public static Connection oppenConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String DB_URL = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=PS22219_Thanhtp_sof203_asmFinal;";
            String USER_NAME = "sa";
            String PASSWORD = "123";
            Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);            
                return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

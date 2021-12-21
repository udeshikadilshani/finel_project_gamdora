package common;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class db {

private static Connection connection;

private static void init() throws SQLException,ClassNotFoundException{
Class.forName("com.mysql.cj.jdbc.Driver");
connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3312/gamdorata_shop","root","7878");
  
} 
public static void iud(String sql) throws Exception{
 if(connection==null){
 init();
 }
 connection.createStatement().executeUpdate(sql);
}

public static ResultSet serch(String sql) throws Exception{
if(connection==null){
init();
}
return  connection.createStatement().executeQuery(sql);
}

    static void search(String select__from_Employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static Connection getNewConnection() throws Exception{
if(connection== null){
init();
}
return connection;
}

    static void iud(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static PreparedStatement prepareStatement(String sequel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setAutoCommit(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Object getDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
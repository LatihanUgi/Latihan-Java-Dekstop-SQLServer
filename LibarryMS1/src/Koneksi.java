
import java.sql.*;

public class Koneksi {
    public Connection open()
    {
        Connection con = null;
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://PAVILIONG4-PC;databaseName=perpus";
            con = DriverManager.getConnection(url,"sa","sa");
            if(con!=null)
            {
                System.out.println("Koneksi Berhasil");
            }
            return con;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
        
    }
}
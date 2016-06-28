
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ugi Ispoyo Widodo
 */
public class ProsesMember {
    
    public int insertmember(String idmember, String no, String nama, String alamat, String tlp, String jk)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "insert into Member values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idmember);
            ps.setString(2, no);
            ps.setString(3, nama);
            ps.setString(4, alamat);
            ps.setString(5, tlp);
            ps.setString(6, jk);
            int rowsaffected = ps.executeUpdate();
            return rowsaffected;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public String[] cariMemberId(String id)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Member where ID_Member = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            
            String[] data = new String [5]; //array untuk membinding jadi dibikin array dahulu agar bisa di return
            if(rs.next())
            {
                data[0] = rs.getString("No_Pengaman");
                data[1] = rs.getString("Nama");
                data[2] = rs.getString("Alamat");
                data[3] = rs.getString("Telp");
                data[4] = rs.getString("JK");
            }
            else
            {
                data[0]="Kosong";
            }
            return data;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    public int ubahmember(String idmember, String no, String nama, String alamat, String tlp, String jk)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "update Member set No_Pengaman = ?, Nama = ?, Alamat = ?, Telp = ?,Jk = ? where ID_Member = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, no);
            ps.setString(2, nama);
            ps.setString(3, alamat);
            ps.setString(4, tlp);
            ps.setString(5, jk);
            ps.setString(6, idmember);
            int row = ps.executeUpdate();
            return row;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    public int hapusmember(String id)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "delete from Member where ID_Member = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            
            int rows = ps.executeUpdate();
            return rows;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return 0;
        }
    }
}

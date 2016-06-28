
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ugi Ispoyo Widodo
 */
public class ProsesAdmin {
    
    public String[] loginadmin(String username)
    {
      try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Pegawai where Username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            String[] login = new String[2];
            if(rs.next())
            {
                login[0] = rs.getString("Username");
                login[1] = rs.getString("Password");
            }
            
            else
            {
                login[0]="Kosong";
            }
            return login;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public int insertadmin(String idpegawai, String nama, String alamat, String tlp, String jk, String uname, String pwd)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "insert into Pegawai values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idpegawai);
            ps.setString(2, nama);
            ps.setString(3, alamat);
            ps.setString(4, tlp);
            ps.setString(5, jk);
            ps.setString(6, uname);
            ps.setString(7, pwd);
            int rowsaffected = ps.executeUpdate();
            return rowsaffected;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public String[] cariPegawaiId(String id)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Pegawai where ID_Pegawai = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            
            String[] data = new String [4]; //array untuk membinding jadi dibikin array dahulu agar bisa di return
            if(rs.next())
            {
                data[0] = rs.getString("Nama");
                data[1] = rs.getString("Alamat");
                data[2] = rs.getString("Telp");
                data[3] = rs.getString("JK");
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
    
    public String[] cariPegawaiId1(String iduser)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select Username, Password from Pegawai where ID_Pegawai = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, iduser);
            ResultSet rs = ps.executeQuery();
            
            String[] data = new String [2]; //array untuk membinding jadi dibikin array dahulu agar bisa di return
            if(rs.next())
            {
                data[0] = rs.getString("Username");
                data[1] = rs.getString("Password");
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
     public int ubahuser(String iduser, String user, String pswd)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "update Pegawai set Username = ?, Password = ? where ID_Pegawai = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pswd);
            ps.setString(3, iduser);
            int row = ps.executeUpdate();
            return row;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    public int ubahadmin(String idpeg, String nama, String alamat, String tlp, String jk)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "update Pegawai set Nama = ?, Alamat = ?, Telp = ?,Jk = ? where ID_Pegawai = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nama);
            ps.setString(2, alamat);
            ps.setString(3, tlp);
            ps.setString(4, jk);
            ps.setString(5, idpeg);
            int row = ps.executeUpdate();
            return row;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    public int hapusadmin(String id)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "delete from Pegawai where ID_Pegawai = ?";
            
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

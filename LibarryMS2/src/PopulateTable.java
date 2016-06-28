
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PopulateTable {
    
    public ResultSet displayPegawai()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select ID_Pegawai,Nama,Alamat,Telp,Jk,Username from Pegawai";
            
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    public ResultSet displayMember()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Member";
            
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet displayKatBuku()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Kat_Buku";
            
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet displayBuku()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Buku";
            
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    public ResultSet carikatbuku(String kat)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Buku where Kat_Buku = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, kat);
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
     public ResultSet displayTempTrans()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Temp_Trans";
            
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
     
      public ResultSet displayTrans()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Transaksi";
            
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
      
    public ResultSet cariPegawai(String nama)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select ID_Pegawai,Nama,Alamat,Telp,Jk,Username from Pegawai where Nama = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nama);
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public ResultSet cariPegawaiById (String id)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select ID_Pegawai,Nama,Alamat,Telp,Jk,Username from Pegawai where ID_Pegawai = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
}

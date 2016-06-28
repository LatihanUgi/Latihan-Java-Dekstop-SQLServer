
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
public class ProsesBuku {
    
    public int insertkatbuku(String idkatbuku, String katbuku)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "insert into Kat_Buku values(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idkatbuku);
            ps.setString(2, katbuku);
            int rowsaffected = ps.executeUpdate();
            return rowsaffected;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public int insertbuku(String idbuku, String kode, String katbuku, String buku, String des, String stock)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "insert into Buku values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idbuku);
            ps.setString(2, kode);
            ps.setString(3, katbuku);
            ps.setString(4, buku);
            ps.setString(5, des);
            ps.setString(6, stock);
            int rowsaffected = ps.executeUpdate();
            return rowsaffected;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public String[] cariKatBukuId(String id)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select * from Kat_Buku where ID_Kat_Buku = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            
            String[] data = new String [5]; //array untuk membinding jadi dibikin array dahulu agar bisa di return
            if(rs.next())
            {
                data[0] = rs.getString("Kat_Buku");
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
    
    public int ubahkatbuku(String idkatbuku, String katbuku)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "update Kat_Buku set Kat_Buku = ? where ID_Kat_Buku = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, katbuku);
            ps.setString(2, idkatbuku);
            int row = ps.executeUpdate();
            return row;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public int ubahstockbuku(String kode, int stock)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "update Buku set Stock = ? where Kode = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            String convertstock = new Integer(stock).toString();
            ps.setString(1, convertstock);
            ps.setString(2, kode);
            int row = ps.executeUpdate();
            return row;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    
    public int hapuskatbuku(String id)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "delete from Kat_Buku where ID_Kat_Buku = ?";
            
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
    public int cekjmlhkat(String kat)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql= "select count(*) as jumlah from Buku where Kat_Buku = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, kat);
            ResultSet rs = ps.executeQuery();
            
            int jumlah = 0;
            if(rs.next())
            {
                jumlah = rs.getInt("jumlah");
            }
            return jumlah;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
}

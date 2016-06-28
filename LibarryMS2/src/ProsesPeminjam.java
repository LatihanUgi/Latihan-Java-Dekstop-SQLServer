
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
public class ProsesPeminjam {
    
      public String[] cariBukuId(String kode)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select Buku, Stock from Buku where Kode = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, kode);
            ResultSet rs = ps.executeQuery();
            
            String[] data = new String [5]; //array untuk membinding jadi dibikin array dahulu agar bisa di return
            if(rs.next())
            {
                data[0] = rs.getString("Buku");
                data[1] = rs.getString("Stock");
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
      
    public int inserttemptrans(String idtrans, String kode, String buku, String np, String tpinjam, String tpengembalian, String stock)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "insert into Temp_Trans values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idtrans);
            ps.setString(2, kode);
            ps.setString(3, buku);
            ps.setString(4, np);
            ps.setString(5, tpinjam);
            ps.setString(6, tpengembalian);
            ps.setString(7, stock);
            int rowsaffected = ps.executeUpdate();
            return rowsaffected;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return 0;
        }
    }
    public String[] cekStock(String kode)
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select Stock from Buku where Kode = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, kode);
            ResultSet rs = ps.executeQuery();
            
            String[] data = new String [5]; //array untuk membinding jadi dibikin array dahulu agar bisa di return
            if(rs.next())
            {
                data[0] = rs.getString("Stock");
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
}

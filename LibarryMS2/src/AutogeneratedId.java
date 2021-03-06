
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AutogeneratedId {
    
    public String autoidpegawai()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select top 1 ID_Pegawai from Pegawai order by ID_Pegawai desc";
            
            Statement state = con.createStatement(); //karna tidak memakai parameter
            ResultSet rs = state.executeQuery(sql);
            
            String idpegawai = null;
            String id = null;
            
            if(rs.next())
            {
                idpegawai = rs.getString("ID_Pegawai");
                String potong = idpegawai.substring(1); //untung memotong id
                int subidpegawai = Integer.parseInt(potong) + 1;
                
                if(subidpegawai<10)
                {
                    id = "P000" + Integer.toString(subidpegawai);
                }
                else if(subidpegawai<100)
                {
                    id = "P00" + Integer.toString(subidpegawai);
                }
                else if(subidpegawai<1000)
                {
                    id = "P0" + Integer.toString(subidpegawai);
                }
                else if(subidpegawai<10000)
                {
                    id = "P" + Integer.toString(subidpegawai);
                }
                
            }
            return id;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public String autoidmember()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select top 1 ID_Member from Member order by ID_Member desc";
            
            Statement state = con.createStatement(); //karna tidak memakai parameter
            ResultSet rs = state.executeQuery(sql);
            
            String idmember = null;
            String id = null;
            
            if(rs.next())
            {
                idmember = rs.getString("ID_Member");
                String potong = idmember.substring(1); //untung memotong id
                int subidmember = Integer.parseInt(potong) + 1;
                
                if(subidmember<10)
                {
                    id = "M000" + Integer.toString(subidmember);
                }
                else if(subidmember<100)
                {
                    id = "M00" + Integer.toString(subidmember);
                }
                else if(subidmember<1000)
                {
                    id = "M0" + Integer.toString(subidmember);
                }
                else if(subidmember<10000)
                {
                    id = "M" + Integer.toString(subidmember);
                }
                
            }
            else 
            {
                id = "M0001";
            }
            return id;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
     public String autoidkat_buku()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select top 1 ID_Kat_Buku from Kat_Buku order by ID_Kat_Buku desc";
            
            Statement state = con.createStatement(); //karna tidak memakai parameter
            ResultSet rs = state.executeQuery(sql);
            
            String idkat = null;
            String id = null;
            
            if(rs.next())
            {
                idkat = rs.getString("ID_Kat_Buku");
                String potong = idkat.substring(1); //untung memotong id
                int subidkat = Integer.parseInt(potong) + 1;
                
                if(subidkat<10)
                {
                    id = "K0" + Integer.toString(subidkat);
                }
                else if(subidkat<100)
                {
                    id = "K" + Integer.toString(subidkat);
                }
                
            }
            else 
            {
                id = "K01";
            }
            return id;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
     
    public String autoidbuku()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select top 1 ID_Buku from Buku order by ID_Buku desc";
            
            Statement state = con.createStatement(); //karna tidak memakai parameter
            ResultSet rs = state.executeQuery(sql);
            
            String idbuku = null;
            String id = null;
            
            if(rs.next())
            {
                idbuku = rs.getString("ID_Buku");
                String potong = idbuku.substring(1); //untung memotong id
                int subidbook = Integer.parseInt(potong) + 1;
                
                if(subidbook<10)
                {
                    id = "B000" + Integer.toString(subidbook);
                }
                else if(subidbook<100)
                {
                    id = "B00" + Integer.toString(subidbook);
                }
                else if(subidbook<1000)
                {
                    id = "B0" + Integer.toString(subidbook);
                }
                else if(subidbook<10000)
                {
                    id = "B" + Integer.toString(subidbook);
                }
                
            }
            else 
            {
                id = "B0001";
            }
            return id;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
    
    public String autoidtrans()
    {
        try 
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.open();
            
            String sql = "select top 1 ID_Transaksi from Transaksi order by ID_Transaksi desc";
            
            Statement state = con.createStatement(); //karna tidak memakai parameter
            ResultSet rs = state.executeQuery(sql);
            
            String idtrans = null;
            String id = null;
            
            if(rs.next())
            {
                idtrans = rs.getString("ID_Transaksi");
                String potong = idtrans.substring(1); //untung memotong id
                int subidtrans = Integer.parseInt(potong) + 1;
                
                if(subidtrans<10)
                {
                    id = "T000" + Integer.toString(subidtrans);
                }
                else if(subidtrans<100)
                {
                    id = "T00" + Integer.toString(subidtrans);
                }
                else if(subidtrans<1000)
                {
                    id = "T0" + Integer.toString(subidtrans);
                }
                else if(subidtrans<10000)
                {
                    id = "T" + Integer.toString(subidtrans);
                }
                
            }
            else 
            {
                id = "T0001";
            }
            return id;
        } 
        catch (Exception e) 
        {
            System.err.println(e);
            return null;
        }
    }
}

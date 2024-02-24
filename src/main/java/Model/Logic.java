package Model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//import org.omg.CORBA.Request;

public class Logic {

	public boolean UserLogin(Data data)throws Exception{
		String dburl = "jdbc:mysql://localhost:3306/ep1";
		String dbun = "root";
		String dbpw = "Sri@8919224273";
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		ps = con.prepareStatement("select count(*) from userlogin where username = ? and password = ?");
		String susername=data.getUsername();
		String spassword=data.getPassword();
		ps.setString(1, susername);
		ps.setString(2, spassword);
		rs = ps.executeQuery();
		if(rs.next())
		{
			if(rs.getInt(1) == 1)
			{
				return true;
			}
			else
			{	
				return false;
			}
		}
		return false;
		
		}
	public boolean AdminLogin(Data data)throws Exception{
		String dburl = "jdbc:mysql://localhost:3306/ep1";
		String dbun = "root";
		String dbpw = "Sri@8919224273";
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		ps = con.prepareStatement("select count(*) from adminlogin where username = ? and password = ?");
		String susername=data.getUsername();
		String spassword=data.getPassword();
		ps.setString(1, susername);
		ps.setString(2, spassword);
		rs = ps.executeQuery();
		if(rs.next())
		{
			if(susername=="Srikanth" && spassword=="123")
			{
				return true;
			}
			else
			{	
				return false;
			}
		}
		return false;
		
		}
	public String insertProduct(Data d)throws Exception{
		String dburl = "jdbc:mysql://localhost:3306/ep1";
		String dbun = "root";
		String dbpw = "Sri@8919224273";
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		ps = con.prepareStatement("insert into additem values(?,?,?,?,?,?)");
		int sid=d.getId();
		String sname=d.getName();
		String stype=d.getType();
		String sprice=d.getPrice();
		String scompany=d.getCompany();
		byte[] sphoto=d.getPhoto();
		ps.setInt(1, sid);
		ps.setString(2, sname);
		ps.setString(3, stype);
		ps.setString(4, sprice);
		ps.setString(5, scompany);
		ps.setBytes(6, sphoto);
		ps.executeUpdate();
		return "Added successfully..";
		
	}
	public List<Data> getall()throws Exception{
		String dburl = "jdbc:mysql://localhost:3306/ep1";
		String dbun = "root";
		String dbpw = "Sri@8919224273";
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		ps=con.prepareStatement("select * from additem");
		rs = ps.executeQuery();
		List<Data> L = new ArrayList<Data>();
		while(rs.next())
		{
			
			Data d=new Data();
			d.setId(rs.getInt(1));
			d.setName(rs.getString(2));
			d.setType(rs.getString(3));
			d.setPrice(rs.getString(4));
			d.setCompany(rs.getString(5));
			L.add(d);
			
		}
		return L;
		
	}
	public boolean insertData (Data d) throws Exception
	 {
			String dburl = "jdbc:mysql://localhost:3306/ep1";
			String dbun = "root";
			String dbpw = "Sri@8919224273";
			Connection con =null;
			PreparedStatement ps = null;
			ResultSet rs = null;
	    try {
	    con = DriverManager.getConnection(dburl, dbun,dbpw);
	    ps=con.prepareStatement("insert into userlogin values(?,?)");
	    String sid=d.getUsername();
	    String spwd=d.getPassword();
	    ps.setString(1, sid);
		ps.setString(2, spwd);
	    ps.executeUpdate();
	    return true;
	    }
	    catch(Exception e)
	    {
	      return false;
	    }
	  }
	
		
		
	}


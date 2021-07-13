package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTestapp {
	
	String host = "localhost:3306";
    String database = "fisapp";
    String url = "jdbc:mysql://"+ host+"/"+database;

    Connection con;
    PreparedStatement ps;
   
    public DBTestapp() throws SQLException, ClassNotFoundException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,"root","Cloud@123$");
        System.out.println("con "+con);
       
    }

    public static void main(String[] args) {
		try {
			new DBTestapp();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
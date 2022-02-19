package javajdbc;

import java.sql.*;
public class Connexion {
		public String url="jdbc:mysql://localhost/javadb";
		private static String driver="com.mysql.cj.jdbc.Driver";
		private static Connection con=null;
		Connexion(){
			try{
			Class.forName(driver);
			con= DriverManager.getConnection(url,"root","");
			}catch(ClassNotFoundException | SQLException e){
			System.out.println(e);
			}
			}
		
		public static Connection maConnexion(){
			if(con==null){
					new Connexion();
			}
			return con;
		}
}
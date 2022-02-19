package javajdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonImpDao implements PersonDAO{
	
	Connection con=Connexion.maConnexion();
	String sql;
	Statement st=null;
	@Override
		public void save(Person p){
		sql="insert into Personne values ('"+p.getId()+"','"+p.getNom()+"','"+p.getPrenom()+"')" ;
		try {
		st=con.createStatement();
		int nb= st.executeUpdate(sql);
		if(nb!=0){
		System.out.println("person inserted correctly!");
		}
		else{
		System.out.println("error insertion!");
		}
		} catch (SQLException ex) {
		System.out.println(ex);
		}
	}
	@Override
	public void remove(Person p){
	try {
	sql="delete from Personne where id='"+p.getId()+"' ";
	st=con.createStatement();
	int nb= st.executeUpdate(sql);
	if(nb!=0){
	System.out.println("person removed correctly!");
	}
	else{
	System.out.println("deletion error!");
	}
	} catch (SQLException ex) {
	System.out.println(ex);
	}
	}
	
	
	
	
	@Override
	public void Update(Person p){
	try{
	sql="update Personne set nom='"+p.getNom()+"', prenom='"+p.getPrenom()+"' where id='"+p.getId()+"'";
	st=con.createStatement();
	int nb=st.executeUpdate(sql);
	if(nb!=0){
	System.out.println("person updated correctly!");
	}
	else{
	System.out.println("update error!");
	}
	}
	catch(Exception ex){
	ex.getStackTrace();
	}
	}
	
	
	
	@Override
	public Person FindPerson(int id){
	try{
	sql="select * from Personne where id='"+id+"'";
	st=con.createStatement();
	ResultSet rs=st.executeQuery(sql);
	if(rs.next()){
	System.out.println("Person with code '"+id+"' is found in the DB");
	Person newP=new Person(rs.getInt(1),rs.getString(2), rs.getString(3));
	return newP;
	}
	else{
	System.out.println("Person with code '"+id+"' not found");
	return null;
	}
	}
	catch(Exception e){
	e.printStackTrace();
	}
	return null;
	}
	
	@Override
	public List<Person> getAllPersons(){
		try{
		sql=" select * from Personne";
		st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		List<Person> lp=new ArrayList<Person>();
		while(rs.next()){
		lp.add(new Person(rs.getInt("num"),rs.getString("nom"),rs.getString("prenom")));
		}
		return lp;
		}
		catch(Exception e){
		}
		return null;
		}
	
}

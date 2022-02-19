package javajdbc;

public class Affichage {

	public static void main(String[] args) {
//		Person p0=new Person(3,"toto","tutu");
//		Person p1=new Person(4,"jojo","jiji");
//		Person p2=new Person(5,"tata","titi");
//		
		PersonImpDao pimpDao=new PersonImpDao();
//		pimpDao.save(p0);
//		pimpDao.save(p1);
//		pimpDao.save(p2);
		Person p=pimpDao.FindPerson(3);
		
		pimpDao.remove(p);
		
		
	}

}

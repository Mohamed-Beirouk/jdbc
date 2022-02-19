package javajdbc;

import java.util.*;

public interface PersonDAO {
	
	
	void save(Person p);
	void remove(Person p);
	void Update(Person p);
	Person FindPerson(int id);
	List<Person> getAllPersons();
	

}

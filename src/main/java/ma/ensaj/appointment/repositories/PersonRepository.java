package ma.ensaj.appointment.repositories;

import ma.ensaj.appointment.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,String>{
	
	
}

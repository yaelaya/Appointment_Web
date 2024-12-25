package ma.ensaj.appointment.repositories;

import ma.ensaj.appointment.entities.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment,String>, CustomRepository, CustomTwo {

	
	
}

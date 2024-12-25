package ma.ensaj.appointment.service;

import java.util.List;

import ma.ensaj.appointment.repositories.CustomRepository;
import ma.ensaj.appointment.repositories.CustomTwo;
import ma.ensaj.appointment.entities.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService implements CustomRepository, CustomTwo {
	@Autowired
	private JdbcTemplate jtm;
	
	public List<Appointment> findAllByEmail(String email) {
		String sql="select * from Appointment where email="+email;
		return jtm.query(sql, new BeanPropertyRowMapper<>(Appointment.class));
	}
	
	public List<Appointment> findByDocId(String DocId) {
		String sql="select * from Appointment where DocId="+DocId;
		return jtm.query(sql, new BeanPropertyRowMapper<>(Appointment.class));
	}
}

package ma.ensaj.appointment.repositories;

import ma.ensaj.appointment.entities.Appointment;

import java.util.List;

public interface CustomRepository{
    public List<Appointment> findAllByEmail(String email);
    //public List<Appointment> findAllForDoc(String docId);
}
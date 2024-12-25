package ma.ensaj.appointment.repositories;

import ma.ensaj.appointment.entities.Appointment;

import java.util.List;

public interface CustomTwo{
    public List<Appointment> findByDocId(String docId);
}
package com.doctors.appointment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.doctors.appointment.entities.Patient;
@Service
public class PatientServiceImpl implements PatientService{
List<Patient> list;
PatientServiceImpl(){
}
@Override
	public Patient save(Patient newPatient) {
		// TODO Auto-generated method stub
		return newPatient;
	}

}

package com.doctors.appointment.controller;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doctors.appointment.entities.Patient;
import com.doctors.appointment.services.PatientService;

@RestController
public class AppointmentController {
	@Autowired
	private PatientService PatientService;

@PostMapping("/patient")
public ResponseEntity<Patient> addPatient(@ModelAttribute Patient newPatient) throws ServerException {
	Patient patient = PatientService.save(newPatient);
    if (patient == null) {
        throw new ServerException("Exceception");
    } else {
        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }
}

	
}

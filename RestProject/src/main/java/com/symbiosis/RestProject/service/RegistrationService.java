package com.symbiosis.RestProject.service;

import java.util.List;

import com.symbiosis.RestProject.model.Registration;

public interface RegistrationService {
	//for post request
Registration insertrecord(Registration r);
//for get request
List<Registration> getAll();
//for delete request
void del(int ri);
//for put request
Registration updaterecord(int i,Registration r);

List<Registration> login(String emailid,String password);


}

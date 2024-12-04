package com.symbiosis.RestProject.service;

import java.util.List;

import com.symbiosis.RestProject.model.Feedback;
import com.symbiosis.RestProject.model.Registration;

public interface FeedbackService {
	//for post request
Feedback insertrecord(Feedback r);
//for get request
List<Feedback> getAll();
//for delete request
void del(int ri);
//for put request
Feedback updaterecord(int i,Feedback r);


}

package com.hostel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.model.HostelParent;
import com.hostel.repository.Parent;
@Service
public class HostelTotalData {

	@Autowired
	public Parent perRepository;
	public List<HostelParent>fetchAllPersons()
	   {
		   return perRepository.findAll();
	   }
    public HostelParent savePersons(HostelParent p)
	   {
		   return perRepository.save(p);
	   }
    
}

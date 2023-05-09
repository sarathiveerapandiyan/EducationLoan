package com.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hostel.model.HostelParent;
import com.hostel.service.HostelTotalData;

@RestController
public class HostelStudentsData {
	@Autowired
	HostelTotalData apService;
	@GetMapping("/getAllPersons")
     public List<HostelParent> fetchAllPersons()
	 {
		 return apService.fetchAllPersons();
	 }
	 @PostMapping("/saveAlldata")
	 public HostelParent savePersons(@RequestBody HostelParent p)
	 {
		 return HostelParent.savePersons(p);
	 }
}

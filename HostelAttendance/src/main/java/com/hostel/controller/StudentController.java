package com.hostel.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hostel.model.Students;
import com.hostel.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/print")
	public String index() {
		return "Welcome to My Hostel";
	}
	
	@GetMapping("/getstudents")
	public List<Students> getAllStudent(){
		List<Students> val=studentService.getAllStudent();
		return val;
	}
	
	@PostMapping("/addstudent")
	public Students addStudent(@RequestBody Students students) {
		return studentService.addStudent(students);
	}
//	
	@PutMapping("/updatestudent/{rollno}")
	public Students updateStudent(@PathVariable String rollno,@RequestBody Students students) {
		return studentService.updateStudent(rollno,students);
	}
//	
	@DeleteMapping("/deletestudent/{rollno}")
	public String deleteStudent(@PathVariable String rollno) {
		return studentService.deleteStudent(rollno);
	}
//	
	@GetMapping("/pagination/{offset}/{pageSize}")
	public List<Students> paginationMethed(@PathVariable int offset,@PathVariable int pageSize){
		return studentService.pagination(offset,pageSize);
	}
//	
	@GetMapping("/sort/{feild}")
	public List<Students> sortBy(@PathVariable String feild){
		return studentService.sortBy(feild);
	}
//	
	@GetMapping("/fetchPrefix/{prefix}")
	public List<Students> fetchStudentByNamePrefix(@PathVariable String prefix)
	{
		return studentService.fetchStudentByNamePrefix(prefix);
	}
	@GetMapping("/fetchSuffix/{suffix}")
	public List<Students> fetchStudentByNameSuffix(@PathVariable String suffix)
	{
		return studentService.fetchStudentByNameSuffix(suffix);
	}
	@GetMapping("/fetchPrefix")
	public List<Students> fetchPlayerByNamePrefix(@RequestParam String prefix)
	{
		return studentService.fetchPlayerByNamePrefix(prefix);
	}
	@GetMapping("/fetchSuffix")
	public List<Students> fetchPlayerByNameSuffix(@RequestParam String suffix)
	{
		return studentService.fetchPlayerByNameSuffix(suffix);
	}
	@GetMapping("/fetchByCity")
	public List<Students> fetchPlayerByCountry(@RequestParam String city)
	{
		return studentService.fetchPlayerByCountry(city);
	}
	@DeleteMapping("/deletePlayerByName/{name}")
    public String deletePlayerByName(@PathVariable String name)
    {
 	   int result = studentService.deletePlayerByName(name);
 	   if(result>0)
 		     return "Player record deleted";
 	   else
 		     return "Problem occured while deleting";
    }
    @PutMapping("/updatePlayerByName/{country}/{name}")
    public String updatePlayerByName(@PathVariable String country,String name)
    {
 	   int res = studentService.updatePlayerByName(country,name);
 	   if(res>0)
 		      return "Player record updated";
 	   else
 		    return "Problem occured";                       
}
    @GetMapping("/fetchByname")
	public List<Students> fetchPlayerByCount(@RequestParam String city)
	{
		return studentService.fetchPlayerByCount(city);
	}
}

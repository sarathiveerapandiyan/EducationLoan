package com.hostel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hostel.model.Students;

@Repository
public interface StudentsRepo extends JpaRepository<Students, String> {

	List<Students> findByNameStartingWith(String prefix);

	List<Students> findByNameEndingWith(String suffix);

  //positional parameter,order should match
  		@Query("select f from Students f where f.city=?1 and f.name=?2")
  	     public List<Students> getPlayerByCountry(String dept,String name);
  		
          //named parameter
          @Query("select f from Students f where f.city=:city")
  	    public List<Students> getPlayerByCity(String city);
          
  		//DML
  		@Modifying
  		@Query("delete from Students f where f.name=?1")
  		public int deletePlayerByName(String name);
  		
          @Modifying
          @Query("update Students f set f.city=?1 where f.name=?2")
          public int updatePlayerByName(String city,String name);
          
          @Query(value="select * from Students f where f.name=?",nativeQuery=true)
          public List<Students> fetchPlayerByCount(String name);


}

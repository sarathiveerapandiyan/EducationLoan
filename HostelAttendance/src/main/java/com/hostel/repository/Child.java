package com.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.model.HostelChild;

@Repository
public interface Child extends JpaRepository <HostelChild,Integer>{

}

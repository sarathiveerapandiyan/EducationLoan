package com.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.model.HostelParent;

@Repository
public interface Parent extends JpaRepository <HostelParent,Integer>{

}

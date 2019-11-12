package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Attendence;
@Repository
public interface AttendenceRepository extends JpaRepository<Attendence, Long> {

	
	public List<Attendence> findByRollNumberAndMonth(long rollNumber,int month);
}

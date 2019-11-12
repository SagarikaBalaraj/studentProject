package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends User{

	private String studentName;
	
	private LocalDate doB;
	
	@Id
	private  long rollNumber;
	
	private long proctorId;
	
	
	
	
	
}

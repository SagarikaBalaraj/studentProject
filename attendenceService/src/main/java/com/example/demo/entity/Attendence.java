package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Attendance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attendence {

	@Id
	private long id;
	private long rollNumber;
	private int year;
	private int month;
	private int day;
}

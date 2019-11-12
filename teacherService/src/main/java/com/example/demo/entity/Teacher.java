package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Teacher")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

	private String teacherName;
	
	@Id
	private long id;
	
}

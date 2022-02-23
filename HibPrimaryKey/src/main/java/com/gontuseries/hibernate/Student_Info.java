package com.gontuseries.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="STUDENT_INFORMATION")
public class Student_Info {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int roll_no;

	@Column(name="FULL_NAME", nullable=false)
	private String name;

	public Student_Info() {
		
	}
	
	public Student_Info(String name, int roll_no) {
		
		this.name    = name;
		this.roll_no = roll_no;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

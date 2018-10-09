package com.nt.domain;
// Generated Apr 12, 2018 6:01:46 PM by Hibernate Tools 5.1.4.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "EMPLOYEE", schema = "SYSTEM")
public class Employee implements java.io.Serializable {

	private int eid;
	private String firstname;
	private String lastname;
	private BigDecimal salary;

	public Employee() {
	}

	public Employee(int eid) {
		this.eid = eid;
	}

	public Employee(int eid, String firstname, String lastname, BigDecimal salary) {
		this.eid = eid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}

	@Id

	@Column(name = "EID", unique = true, nullable = false, precision = 5, scale = 0)
	public int getEid() {
		return this.eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Column(name = "FIRSTNAME", length = 20)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "LASTNAME", length = 20)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "SALARY", precision = 7)
	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
package com.capgemini.model.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class University implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private String name;
//	@NotNull
	private String address;
	@NotNull @OneToOne(cascade=CascadeType.ALL)
	private Department department;
	public University() {
		super();
	}
	public University(Integer id, String name, String address, Department department) {
		super();
		this.id = id;
		this.name = name;
		address = address;
		this.department = department;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address = address;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", Address=" + address + ", department=" + department + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, department, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		University other = (University) obj;
		return Objects.equals(address, other.address) && Objects.equals(department, other.department)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	
	
}

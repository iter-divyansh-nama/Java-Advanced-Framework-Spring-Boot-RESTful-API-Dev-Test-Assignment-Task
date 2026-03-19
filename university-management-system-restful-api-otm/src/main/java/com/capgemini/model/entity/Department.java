//package com.capgemini.model.entity;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//import jakarta.validation.constraints.NotNull;
//@Entity
//public class Department implements Serializable{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	@NotNull
//	private String name;
//	@NotNull
//	private String mailId;
//	@NotNull @OneToOne(cascade=CascadeType.ALL)
//	private Student student;
//	
//	public Department() {
//		super();
//	}
//
//	public Department(Integer id, String name, String mailId, Student student) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.mailId = mailId;
//		this.student = student;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getMailId() {
//		return mailId;
//	}
//
//	public void setMailId(String mailId) {
//		this.mailId = mailId;
//	}
//
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//
//	@Override
//	public String toString() {
//		return "Department [id=" + id + ", name=" + name + ", mailId=" + mailId + ", student=" + student + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, mailId, name, student);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Department other = (Department) obj;
//		return Objects.equals(id, other.id) && Objects.equals(mailId, other.mailId) && Objects.equals(name, other.name)
//				&& Objects.equals(student, other.student);
//	}
//	
//	
//
//}






package com.capgemini.model.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String mailId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Student> students;

    public Department() {}

    public Department(Integer id, String name, String mailId, List<Student> students) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.students = students;
    }

    // getters setters
}
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
//public class Student implements Serializable{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	@NotNull
//	private String name;
//	@NotNull
//	private String mailId;
//	@NotNull
//	private Long contactNumber;
//	@NotNull @OneToOne(cascade=CascadeType.ALL)
//	private Project project;
//	public Student() {
//		super();
//	}
//	public Student(Integer id, String name, String mailId, Long contactNumber, Project project) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.mailId = mailId;
//		this.contactNumber = contactNumber;
//		this.project = project;
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getMailId() {
//		return mailId;
//	}
//	public void setMailId(String mailId) {
//		this.mailId = mailId;
//	}
//	public Long getContactNumber() {
//		return contactNumber;
//	}
//	public void setContactNumber(Long contactNumber) {
//		this.contactNumber = contactNumber;
//	}
//	public Project getProject() {
//		return project;
//	}
//	public void setProject(Project project) {
//		this.project = project;
//	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", contactNumber=" + contactNumber
//				+ ", project=" + project + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(contactNumber, id, mailId, name, project);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(contactNumber, other.contactNumber) && Objects.equals(id, other.id)
//				&& Objects.equals(mailId, other.mailId) && Objects.equals(name, other.name)
//				&& Objects.equals(project, other.project);
//	}
//	
//	
//}





package com.capgemini.model.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String mailId;
    private Long contactNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Project> projects;

    public Student() {}

    public Student(Integer id, String name, String mailId, Long contactNumber, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
        this.projects = projects;
    }

    // getters setters
}
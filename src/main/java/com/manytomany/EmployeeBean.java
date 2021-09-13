package com.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")

public class EmployeeBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	private String name;
//	@JoinTable(joinColumns ="",inverseJoinColumns = "")
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(inverseJoinColumns = {@JoinColumn(name="proj_id")},name = "emp_proj",joinColumns = {@JoinColumn(name="emp_id")} )
	private List<ProjectBean> projects;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ProjectBean> getProjects() {
		return projects;
	}
	public void setProjects(List<ProjectBean> projects) {
		this.projects = projects;
	}
	
	
	
	
}

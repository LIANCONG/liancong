package org.qhit.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Emp {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eid;
	private String ename;
	@ManyToOne
	@JoinColumn(name = "did",insertable=false,updatable=false)
	private Dept dept;
	//@Transient
	private Integer did;
	
	
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	public Emp(Integer eid, String ename, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

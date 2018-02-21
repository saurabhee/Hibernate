package com.scp.Annotations;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Saurabhee
 *
 */


@Entity
@Table(name="Student1")

public class HibernateAnnotations {
	
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="remark")
	private String remark ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public HibernateAnnotations(int id, String name, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.remark = remark;
	}
	public HibernateAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HibernateAnnotations [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	}
	
	
	
	
	

}

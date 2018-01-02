package com.ss.onlineTest.bean;

import java.io.Serializable;

/**
 * 课程信息表
 * @author 神兽
 */
public class CourseInfo implements Serializable{
	private static final long serialVersionUID = 448744940868829850L;
	private Integer coid;
	private String coname;
	private String remarks;

	@Override
	public String toString() {
		return "CourseInfo [coid=" + coid + ", coname=" + coname + ", remarks=" + remarks + "]";
	}

	public Integer getCoid() {
		return coid;
	}

	public void setCoid(Integer coid) {
		this.coid = coid;
	}

	public String getConame() {
		return coname;
	}

	public void setConame(String coname) {
		this.coname = coname;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public CourseInfo(Integer coid, String coname, String remarks) {
		super();
		this.coid = coid;
		this.coname = coname;
		this.remarks = remarks;
	}

	public CourseInfo() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coid == null) ? 0 : coid.hashCode());
		result = prime * result + ((coname == null) ? 0 : coname.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseInfo other = (CourseInfo) obj;
		if (coid == null) {
			if (other.coid != null)
				return false;
		} else if (!coid.equals(other.coid))
			return false;
		if (coname == null) {
			if (other.coname != null)
				return false;
		} else if (!coname.equals(other.coname))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		return true;
	}
}

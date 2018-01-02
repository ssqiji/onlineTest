package com.ss.onlineTest.bean;

import java.io.Serializable;

/**
 * 班级信息表
 * @author 神兽
 */
public class ClassInfo implements Serializable{
	private static final long serialVersionUID = -5920596355808313826L;
	private Integer cid;
	private String cname;
	private Integer mid;
	private Integer status;
	private String sparea;
	private String spareb;

	@Override
	public String toString() {
		return "ClassInfo [cid=" + cid + ", cname=" + cname + ", mid=" + mid + ", status=" + status + ", sparea="
				+ sparea + ", spareb=" + spareb + "]";
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSparea() {
		return sparea;
	}

	public void setSparea(String sparea) {
		this.sparea = sparea;
	}

	public String getSpareb() {
		return spareb;
	}

	public void setSpareb(String spareb) {
		this.spareb = spareb;
	}

	public ClassInfo(Integer cid, String cname, Integer mid, Integer status, String sparea, String spareb) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mid = mid;
		this.status = status;
		this.sparea = sparea;
		this.spareb = spareb;
	}

	public ClassInfo() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		result = prime * result + ((mid == null) ? 0 : mid.hashCode());
		result = prime * result + ((sparea == null) ? 0 : sparea.hashCode());
		result = prime * result + ((spareb == null) ? 0 : spareb.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		ClassInfo other = (ClassInfo) obj;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (mid == null) {
			if (other.mid != null)
				return false;
		} else if (!mid.equals(other.mid))
			return false;
		if (sparea == null) {
			if (other.sparea != null)
				return false;
		} else if (!sparea.equals(other.sparea))
			return false;
		if (spareb == null) {
			if (other.spareb != null)
				return false;
		} else if (!spareb.equals(other.spareb))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
}

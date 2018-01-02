package com.ss.onlineTest.bean;

import java.io.Serializable;

/**
 * 专业信息表
 * @author 神兽
 */
public class MajorInfo implements Serializable{
	private static final long serialVersionUID = 6115113982061768956L;
	private Integer mid;
	private String mname;
	private Integer status;
	private String sparea;
	private String spareb;

	@Override
	public String toString() {
		return "MajorInfo [mid=" + mid + ", mname=" + mname + ", status=" + status + ", sparea=" + sparea + ", spareb="
				+ spareb + "]";
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
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

	public MajorInfo(Integer mid, String mname, Integer status, String sparea, String spareb) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.status = status;
		this.sparea = sparea;
		this.spareb = spareb;
	}

	public MajorInfo() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mid == null) ? 0 : mid.hashCode());
		result = prime * result + ((mname == null) ? 0 : mname.hashCode());
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
		MajorInfo other = (MajorInfo) obj;
		if (mid == null) {
			if (other.mid != null)
				return false;
		} else if (!mid.equals(other.mid))
			return false;
		if (mname == null) {
			if (other.mname != null)
				return false;
		} else if (!mname.equals(other.mname))
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

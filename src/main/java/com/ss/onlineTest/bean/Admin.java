package com.ss.onlineTest.bean;

import java.io.Serializable;

/**
 * 操作员表
 * 
 * @author 神兽
 */
public class Admin implements Serializable {
	private static final long serialVersionUID = -4813158402903306963L;
	private Integer aid;
	private Integer pid;
	private Integer adid;
	private String aname;
	private String pwd;
	private String photo;
	private String email;
	private Integer status;
	private String sparea;
	private String spareb;

	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", pid=" + pid + ", adid=" + adid + ", aname=" + aname + ", pwd=" + pwd
				+ ", photo=" + photo + ", email=" + email + ", status=" + status + ", sparea=" + sparea + ", spareb="
				+ spareb + "]";
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getAdid() {
		return adid;
	}

	public void setAdid(Integer adid) {
		this.adid = adid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Admin(Integer aid, Integer pid, Integer adid, String aname, String pwd, String photo, String email,
			Integer status, String sparea, String spareb) {
		super();
		this.aid = aid;
		this.pid = pid;
		this.adid = adid;
		this.aname = aname;
		this.pwd = pwd;
		this.photo = photo;
		this.email = email;
		this.status = status;
		this.sparea = sparea;
		this.spareb = spareb;
	}

	public Admin() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adid == null) ? 0 : adid.hashCode());
		result = prime * result + ((aid == null) ? 0 : aid.hashCode());
		result = prime * result + ((aname == null) ? 0 : aname.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
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
		Admin other = (Admin) obj;
		if (adid == null) {
			if (other.adid != null)
				return false;
		} else if (!adid.equals(other.adid))
			return false;
		if (aid == null) {
			if (other.aid != null)
				return false;
		} else if (!aid.equals(other.aid))
			return false;
		if (aname == null) {
			if (other.aname != null)
				return false;
		} else if (!aname.equals(other.aname))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
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

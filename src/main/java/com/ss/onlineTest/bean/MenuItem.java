package com.ss.onlineTest.bean;

import java.io.Serializable;

/**
 * 二级菜单类
 * @author 神兽
 */
public class MenuItem implements Serializable {
	private static final long serialVersionUID = 3068534933305840571L;
	private Integer id;
	private Integer mid;
	private String text;
	private String urls;
	private String sparea;
	private String spareb;

	private Attributes attributes;

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", mid=" + mid + ", text=" + text + ", urls=" + urls + ", sparea=" + sparea
				+ ", spareb=" + spareb + ", attributes=" + attributes + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
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

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public MenuItem(Integer id, Integer mid, String text, String urls, String sparea, String spareb,
			com.ss.onlineTest.bean.Attributes attributes) {
		super();
		this.id = id;
		this.mid = mid;
		this.text = text;
		this.urls = urls;
		this.sparea = sparea;
		this.spareb = spareb;
		this.attributes = attributes;
	}

	public MenuItem() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mid == null) ? 0 : mid.hashCode());
		result = prime * result + ((sparea == null) ? 0 : sparea.hashCode());
		result = prime * result + ((spareb == null) ? 0 : spareb.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((urls == null) ? 0 : urls.hashCode());
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
		MenuItem other = (MenuItem) obj;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (urls == null) {
			if (other.urls != null)
				return false;
		} else if (!urls.equals(other.urls))
			return false;
		return true;
	}
}

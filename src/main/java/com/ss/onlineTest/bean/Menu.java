package com.ss.onlineTest.bean;

import java.io.Serializable;

/**
 * 一级菜单类
 * @author 神兽
 */
public class Menu implements Serializable{
	private static final long serialVersionUID = 7935649839472394259L;
	private Integer id;
	private String text;

	@Override
	public String toString() {
		return "Menu [id=" + id + ", text=" + text + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Menu(Integer id, String text) {
		super();
		this.id = id;
		this.text = text;
	}

	public Menu() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Menu other = (Menu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
}

package com.ss.onlineTest.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 一级菜单类
 * @author 神兽
 */
public class Menu implements Serializable{
	private static final long serialVersionUID = 7935649839472394259L;
	private Integer id;
	private String text;
	
	private List<MenuItem> children;

	@Override
	public String toString() {
		return "Menu [id=" + id + ", text=" + text + ", children=" + children + "]";
	}
}

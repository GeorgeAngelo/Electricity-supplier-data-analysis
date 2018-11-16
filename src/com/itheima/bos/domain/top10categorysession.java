package com.itheima.bos.domain;

public class top10categorysession {
	
 
	  private int id;
	  private int taskid;
	  private int categoryid;
	  private String sessionid;
	  private int clickcount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public int getClickcount() {
		return clickcount;
	}
	public void setClickcount(int clickcount) {
		this.clickcount = clickcount;
	}
	  

}

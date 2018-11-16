package com.itheima.bos.domain;

public class top10category {
 
	  
	  private int id;
	  
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int taskid;
	  private int categoryid;
	  private int clickcount;
	  private int ordercount;
	  private int paycount;
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
	public int getClickcount() {
		return clickcount;
	}
	public void setClickcount(int clickcount) {
		this.clickcount = clickcount;
	}
	public int getOrdercount() {
		return ordercount;
	}
	public void setOrdercount(int ordercount) {
		this.ordercount = ordercount;
	}
	public int getPaycount() {
		return paycount;
	}
	public void setPaycount(int paycount) {
		this.paycount = paycount;
	}
	  

}

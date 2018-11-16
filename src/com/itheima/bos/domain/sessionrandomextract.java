package com.itheima.bos.domain;

public class sessionrandomextract {
	/*
	 * session_random_extract  `task_id` int(11) NOT NULL,
  `session_id` varchar(255) DEFAULT NULL,
  `start_time` varchar(50) DEFAULT NULL,
  `end_time` varchar(50) DEFAULT NULL,
  `search_keywords` varchar(255) DEFAULT NULL,
	 */
	
	private int id;
	
	private int task_id;
	private String sessionid;
	private String starttime;
	private String endtime;
	private String searchkeywords;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTask_id() {
		return task_id;
	}
	
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getSearchkeywords() {
		return searchkeywords;
	}
	public void setSearchkeywords(String searchkeywords) {
		this.searchkeywords = searchkeywords;
	}
	
	
	
	
	

}

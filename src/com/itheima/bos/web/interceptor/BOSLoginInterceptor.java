package com.itheima.bos.web.interceptor;

import org.apache.struts2.ServletActionContext;

import com.itheima.bos.domain.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 自定义一个struts2拦截器，实现用户未登录，自动跳转到登录页面
 * 
 * @author zhaoqx
 * 
 */
public class BOSLoginInterceptor extends MethodFilterInterceptor {
	// 拦截方法
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		User user = (User) ServletActionContext.getRequest().getSession()
				.getAttribute("loginUser");
		if(user == null){
			//未登录，跳转到登录页面
			return "login";
		}
		return invocation.invoke();// 放行
	}
}

package com.itheima.bos.web.action;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.bos.domain.Workordermanage;
import com.itheima.bos.web.action.base.BaseAction;

/**
 * 工作单管理
 * @author zhaoqx
 *
 */
@Controller
@Scope
public class WorkordermanageAction extends BaseAction<Workordermanage>{
	public String add() throws IOException{
		String flag = "1";
		try{
			workordermanageService.save(model);
		}catch (Exception e) {
			flag = "0";
		}
		ServletActionContext.getResponse().setContentType(
				"text/html;charset=UTF-8");
		ServletActionContext.getResponse().getWriter().print(flag);
		return NONE;
	}
}

package com.itheima.bos.web.action;

import java.io.IOException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.crm.domain.Customer;

import com.itheima.bos.domain.Noticebill;
import com.itheima.bos.domain.User;
import com.itheima.bos.utils.BOSContext;
import com.itheima.bos.web.action.base.BaseAction;

@Controller
@Scope("prototype")
public class NoticebillAction extends BaseAction<Noticebill>{
	/**
	 * 调用代理对象，根据手机号查询客户信息
	 * @throws IOException 
	 */
	public String findCustomerByTelephone() throws IOException{
		Customer customer = customerService.findCustomerByPhonenumber(model.getTelephone());
		String[] excludes = new String[]{};
		this.writeObject2Json(customer, excludes);
		return NONE;
	}
	
	/**
	 * 保存业务通知单，尝试自动分单
	 * @return
	 */
	public String add(){
		User user = BOSContext.getLoginUser();
		model.setUser(user);
		noticebillService.save(model);
		return "addUI";
	}
}

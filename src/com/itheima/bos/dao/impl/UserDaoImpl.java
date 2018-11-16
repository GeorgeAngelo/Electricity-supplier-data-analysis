package com.itheima.bos.dao.impl;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import com.itheima.bos.dao.IUserDao;
import com.itheima.bos.dao.base.impl.BaseDaoImpl;
import com.itheima.bos.domain.User;

@Repository
//@Scope("prototype")
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{
	/**
	 * 根据用户名和密码查询用户
	 */
	public User findByUsernameAndPassword(String username, String password) {
		String hql = "FROM User u WHERE u.username = ? AND u.password = ?";
		List<User> list = this.getHibernateTemplate().find(hql, username,password);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

}

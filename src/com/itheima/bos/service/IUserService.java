package com.itheima.bos.service;

import com.itheima.bos.domain.User;

public interface IUserService {

	public User login(User model);

	public void editPassword(String password, String id);

}

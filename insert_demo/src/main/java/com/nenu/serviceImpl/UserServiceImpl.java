package com.nenu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nenu.dao.UserDao;
import com.nenu.domain.User;
import com.nenu.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	@Override
	public int batchInsertUser(List<User> list) {
		// TODO Auto-generated method stub
		return userDao.batchInsertUser(list);
	}

	@Override
	public void clearAllUser() {
		// TODO Auto-generated method stub
		userDao.clearAllUser();
	}

}

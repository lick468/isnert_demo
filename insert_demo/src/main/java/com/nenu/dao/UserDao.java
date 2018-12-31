package com.nenu.dao;

import java.util.List;

import com.nenu.domain.User;

public interface UserDao {
	int insertUser(User user);
	int batchInsertUser(List<User> list);
	void clearAllUser();
}

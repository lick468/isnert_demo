package com.nenu.service;

import java.util.List;

import com.nenu.domain.User;

public interface UserService {
	int insertUser(User user);
	int batchInsertUser(List<User> list);
	void clearAllUser();
}

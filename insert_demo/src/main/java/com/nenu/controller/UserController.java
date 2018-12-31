package com.nenu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nenu.domain.User;
import com.nenu.service.UserService;

@Controller
public class UserController {
	long startTime =0;
	@Autowired
	private UserService userService;
	@RequestMapping(value="insert",method=RequestMethod.GET)
	public String show() {
		List<User> list = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			User user = new User();
			user.setName("name"+i);
			list.add(user);
		}
		
		startTime = System.currentTimeMillis();//记录当前时间(毫秒)
		for (int i = 0; i <list.size(); i++) {
			userService.insertUser(list.get(i));
		}
		System.out.println("逐条插入 "+list.size()+" 条,耗时："+(System.currentTimeMillis()-startTime)/1000);
		userService.clearAllUser();//删除数据
		startTime = System.currentTimeMillis();//记录当前时间(毫秒)
		userService.batchInsertUser(list);
		System.out.println("批量插入 "+list.size()+" 条,耗时："+(System.currentTimeMillis()-startTime)/1000);
		userService.clearAllUser();//删除数据
		list.clear();
		for (int i = 0; i < 10000; i++) {
			User user = new User();
			user.setName("name"+i);
			list.add(user);
		}
		startTime = System.currentTimeMillis();//记录当前时间(毫秒)
		for (int i = 0; i <list.size(); i++) {
			userService.insertUser(list.get(i));
		}
		System.out.println("逐条插入 "+list.size()+" 条,耗时："+(System.currentTimeMillis()-startTime)/1000);
		userService.clearAllUser();//删除数据
		startTime = System.currentTimeMillis();//记录当前时间(毫秒)
		userService.batchInsertUser(list);
		System.out.println("批量插入 "+list.size()+" 条,耗时："+(System.currentTimeMillis()-startTime)/1000);
		userService.clearAllUser();//删除数据
		list.clear();
		for (int i = 0; i < 100000; i++) {
			User user = new User();
			user.setName("name"+i);
			list.add(user);
		}
		startTime = System.currentTimeMillis();//记录当前时间(毫秒)
		for (int i = 0; i <list.size(); i++) {
			userService.insertUser(list.get(i));
		}
		System.out.println("逐条插入 "+list.size()+" 条,耗时："+(System.currentTimeMillis()-startTime)/1000);
		userService.clearAllUser();//删除数据
		startTime = System.currentTimeMillis();//记录当前时间(毫秒)
		userService.batchInsertUser(list);
		System.out.println("批量插入 "+list.size()+" 条,耗时："+(System.currentTimeMillis()-startTime)/1000);
		userService.clearAllUser();//删除数据
		
		
		
		
		
		return "index";
	}

}

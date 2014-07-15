package cn.v5cn.spring_jpa.service;

import cn.v5cn.spring_jpa.entity.User;


public interface UserService {
	User save(User user); 
	Iterable<User> findAll();
}

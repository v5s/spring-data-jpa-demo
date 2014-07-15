package cn.v5cn.spring_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.v5cn.spring_jpa.dao.UserDao;
import cn.v5cn.spring_jpa.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public User save(User user) {
		return userDao.save(user);
	}

	@Override
	public Iterable<User> findAll() {
		return userDao.findAll();
	}

}

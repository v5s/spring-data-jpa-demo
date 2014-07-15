package cn.v5cn.spring_jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.v5cn.spring_jpa.entity.User;

@Repository("userDao")
public interface UserDao extends CrudRepository<User, Integer> {
	
}

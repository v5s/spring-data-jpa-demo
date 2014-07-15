package cn.v5cn.spring_jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.v5cn.spring_jpa.entity.User;
import cn.v5cn.spring_jpa.service.UserService;


/**
 * Spring test 使用方法
 * 需要junit 4.11以上的版本
 */
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {
	@Autowired
	private UserService userService;
		
	@Test
    public void insert(){
		userService.save(new User("赵六","lisi","123456789"));
    }
	@Test
	public void findAll(){
		Iterable<User> result = userService.findAll();
		for(User user : result){
			System.out.println(user.getId());
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getPhone());
			System.out.println("++++++++++++++++++");
		}
	}
}

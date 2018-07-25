package com.misrobot.springcloud;

import com.misrobot.springcloud.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

	@Autowired
	RedisDao redisDao;

	@Test
	public void contextLoads() {

	}
	@Test
	public void testredis() {
		redisDao.setKey("name","weihuanbo");
		String value=redisDao.getValue("name");
		System.out.println(value);
	}

}

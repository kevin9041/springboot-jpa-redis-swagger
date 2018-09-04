package com.misrobot.springcloud.dao;

import com.misrobot.springcloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long>{

	User findByUsername(String username);
}

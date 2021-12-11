package com.atguigu.ticket;

import com.atguigu.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerTicketApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
		userService.hello();
	}

}

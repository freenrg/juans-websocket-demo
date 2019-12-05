package com.example.juansspringbootwebsocket;

import com.example.juansspringbootwebsocket.controller.UserController;
import com.example.juansspringbootwebsocket.model.User;
import com.example.juansspringbootwebsocket.model.UserResponse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JuansSpringBootWebsocketApplicationTests {

	@Test
	public void testUserResponse() {
		UserController userController = new UserController();
		UserResponse userResponse = userController.getUser(new User("Jemmy"));
		Assert.assertEquals(userResponse.getContent(),"Hello, Jemmy");
	}

}

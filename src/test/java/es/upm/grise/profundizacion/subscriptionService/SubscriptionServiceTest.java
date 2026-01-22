package es.upm.grise.profundizacion.subscriptionService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SubscriptionServiceTest {
	
	@Test
	public void smokeTest() {}
	
	@Test( )
	public void UserExistTest(){
		User user = new User();
		SubscriptionService subUser = new SubscriptionService();
		user.setDelivery(Delivery.DO_NOT_DELIVER);
		user.setEmail("jorge@gmail.com");
		assertEquals(user, subUser.getSubscribers());
	}
}

package org.test.Testing;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest {
	
	@Test
	public void testApi() {
		ExternalApi mockApi= Mockito.mock(ExternalApi.class);
		
		when(mockApi.getData()).thenReturn("Mock Data being called");
		
		MyService service=new MyService(mockApi);
		String res=service.fetchData();
		
		
		assertEquals("Mock Data being called", res);
		
	}
	

}

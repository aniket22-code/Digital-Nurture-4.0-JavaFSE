package org.test.Testing;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest2 {
	
	@Test
	public void testVerifyInteraction() {
		
		//creating the mock object
		ExternalApi mockApi= Mockito.mock(ExternalApi.class);
		
		
		//injecting mock object into service
		MyService service=new MyService(mockApi);
		
		//calling the method
		service.fetchData();
		
		
		//verify that the data was been called
		verify(mockApi).getData();
		
		
		
	}
	

}

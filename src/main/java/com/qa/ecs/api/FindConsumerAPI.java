package com.qa.ecs.api;

import static com.qa.ecs.apiUtils.APIHeaderManager.getHeader;

import org.testng.Assert;

import com.qa.ecs.apiUtils.CommonAPIUtils;
import com.qa.ecs.pojo.request.FindCustomer;
import io.restassured.response.Response;

public class FindConsumerAPI {

	public static Response post(String baseUrl, FindCustomer findConsumerRequest) {
		Response response = CommonAPIUtils.post(baseUrl, "/core/v1/customer/find", getHeader(baseUrl), findConsumerRequest);
		if(response.getStatusCode() != 200 && response.getStatusCode() != 201) {
			try {
				Thread.sleep(10 * 1000);
				response = CommonAPIUtils.post(baseUrl, "/core/v1/customer/find", getHeader(baseUrl), findConsumerRequest);				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		if(response.getStatusCode() != 200 && response.getStatusCode() != 201)
			Assert.fail("Find Consumer API is down. Hence Returning response code "+ response.getStatusCode());
		return response;
	}

}

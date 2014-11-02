package com.oomori.hello;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpClient {

	public HttpClient() {
		// TODO Auto-generated constructor stub
	}

	public String get(String url) {
		String result = null;
		HttpGet http = new HttpGet(url);
		DefaultHttpClient client = new DefaultHttpClient();
		try {
			HttpResponse response = client.execute(http);
			result = EntityUtils.toString(response.getEntity(), "UTF-8");
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}

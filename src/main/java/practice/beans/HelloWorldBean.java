package practice.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloworld", eager = true)
public class HelloWorldBean {
	
	public HelloWorldBean() {
		System.out.println("Hello world web app practice started...");
	}
	
	public String getMessage() {
		return "Hello world from BEAN";
	}
	
}

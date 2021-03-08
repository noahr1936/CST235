package controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;

@ManagedBean
public class FormController {
	
	@Inject
	OrdersBusinessInterface s;
	
	@EJB
	MyTimerService timer;

	public String onSubmit() {
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		//line will print message to console based on what alternative is selected in beans.xml
		s.test();
		
		//start a timer when the login button is clicked
		//timer.setTimer(5000);
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		return "TestResponse.xhtml";
	}
	
	public OrdersBusinessInterface getService() {
		return s;
		
	}
}

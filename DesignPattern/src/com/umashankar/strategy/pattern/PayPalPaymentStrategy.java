package com.umashankar.strategy.pattern;

public interface PayPalPaymentStrategy extends PaymentStrategy{
	
	public void authenticationVerification(String emailId, String password);

}

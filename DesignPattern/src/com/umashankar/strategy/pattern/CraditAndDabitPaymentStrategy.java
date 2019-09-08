package com.strategy.pattern;

public interface CraditAndDabitPaymentStrategy extends PaymentStrategy{

	public boolean cardDetailsVarification(String name, String cardNo, String expDate, String cvc);
}

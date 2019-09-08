package com.strategy.pattern;

public class CreditCardStrategy implements CraditAndDabitPaymentStrategy{

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	@Override
	public void pay(int amount) {
		cardDetailsVarification(name,cardNumber, dateOfExpiry, cvv);
		System.out.println(amount +" paid with credit card");
	}
	
	
	@Override
	public boolean cardDetailsVarification(String name, String cardNo, String expDate, String cvc) {
		System.out.println("Card Details is correct..........");
		return false;

		
	}

}

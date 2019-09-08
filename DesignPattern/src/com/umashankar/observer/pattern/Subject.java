package com.umashankar.observer.pattern;

public interface Subject {

	public void registerObserver(Observer observer);
	  public void removeObserver(Observer observer);
	  public void notifyObservers();
	  
}

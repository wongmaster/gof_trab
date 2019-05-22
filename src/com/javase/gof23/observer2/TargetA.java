package com.javase.gof23.observer2;

import java.util.Observable;

public class TargetA extends Observable{
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		//Marks this <tt>Observable</tt> object as having been changed
		setChanged();
		//if the object has changed,notify all of its observers.
		//notifyObservers();  
		notifyObservers(state);  
	}


}

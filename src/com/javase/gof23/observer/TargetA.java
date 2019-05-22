package com.javase.gof23.observer;

public class TargetA extends Target{

	public String state;

	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 * @throws NoObservorException
	 */
	public void setState(String state) throws NoObservorException {
		this.state = state;
		super.notifyAllObservors();
	}
	
}

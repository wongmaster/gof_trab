
package com.javase.gof23.observer;

public class Client {
	
	public static void main(String[] args) {
		TargetA t = new TargetA();
		
		
		ObservorImpl o1 = new ObservorImpl();
		ObservorImpl o2 = new ObservorImpl();
		ObservorImpl o3 = new ObservorImpl();
		t.registerObservor(o1);
		t.registerObservor(o2);
		t.registerObservor(o3);
		
		
		try {
			t.setState("teste 1 别玩了，班主任来了!");
			System.out.println(o1.getOstate());
			System.out.println(o2.getOstate());
			System.out.println(o3.getOstate());
			
			t.setState(" teste 2别玩了，校长来了!");
			System.out.println(o1.getOstate());
			System.out.println(o2.getOstate());
			System.out.println(o3.getOstate());
		} catch (NoObservorException e) {
			e.printStackTrace();
		}
	}

}

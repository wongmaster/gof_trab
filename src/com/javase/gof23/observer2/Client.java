package com.javase.gof23.observer2;

public class Client {
	
	public static void main(String[] args) {
		//Ŀ�����
		TargetA ta = new TargetA();
		
		//�۲���
		ObserverA o1 = new ObserverA();
		ObserverA o2 = new ObserverA();
		ObserverA o3 = new ObserverA();
		
		//���۲�����ӵ�Ŀ�����������
		ta.addObserver(o1);
		ta.addObserver(o2);
		ta.addObserver(o3);
		
		ta.setState("teste 1  ��˯�ˣ���ʦ���ˣ�");
		System.out.println(o1.getObserverState());
		System.out.println(o2.getObserverState());
		System.out.println(o3.getObserverState());
		ta.setState(" teste 2��˯�ˣ�У�����ˣ�");
		System.out.println(o1.getObserverState());
		System.out.println(o2.getObserverState());
		System.out.println(o3.getObserverState());
	}

}

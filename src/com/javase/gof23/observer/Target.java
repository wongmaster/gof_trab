package com.javase.gof23.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ����󣺷�����Ϣ
 * @author root
 *
 */
public class Target {
	
	List<Observor> list;

	//ע��һ���۲���
	public void registerObservor(Observor o){
		if(list == null){
			list = new ArrayList<Observor>();
		}
		list.add(o);
	}
	//�Ƴ��۲���
	public void removeObservor(Observor o){
		if(list != null && list.contains(o)){
			list.remove(o);
		}
	}
	// ֪ͨ���й۲���
	public void notifyAllObservors() throws NoObservorException{
		if(list != null){
			for (Observor o : list) {
				o.updateState(this);
			}
		}else{
			throw new NoObservorException();
		}
	}
}

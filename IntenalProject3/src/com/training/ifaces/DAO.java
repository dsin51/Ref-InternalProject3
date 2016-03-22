package com.training.ifaces;

import java.io.Serializable;

public interface DAO<T> extends Serializable {
	
	
	public  Serializable add(T t);
	public T display(Serializable obj);

}

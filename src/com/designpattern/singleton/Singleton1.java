package com.designpattern.singleton;

/**
 * 懒汉，线程不安全
 * 
 * @author chao
 *
 */
public class Singleton1 {
	private static Singleton1 instance;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
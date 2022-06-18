package com.tutai.oops.classloader;

import java.util.ArrayList;

public class PrintClassLoader {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Classloader of this class:" + PrintClassLoader.class.getClassLoader());

//		System.out.println("Classloader of Logging:" + Logging.class.getClassLoader());?

		System.out.println("Classloader of ArrayList:" + ArrayList.class.getClassLoader());
	}
}

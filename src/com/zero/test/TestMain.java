package com.zero.test;

import java.io.File;
import java.net.URL;

public class TestMain {

	public static void main(String[] args) throws Exception {
		URL url = TestMain.class.getResource("/com/zero/test");
		System.out.println(url);
		File folder = new File(url.toURI());
		for (File subsysFloder : folder.listFiles()) {
			System.out.println(subsysFloder.getName());
			if ((subsysFloder.isDirectory())
					&& (subsysFloder.getName().matches("\\w+"))) {
				
			}
		}
	}
}

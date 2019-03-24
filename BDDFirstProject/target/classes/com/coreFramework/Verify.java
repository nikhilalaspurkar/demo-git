package com.coreFramework;

import junit.framework.Assert;

import com.wrapper.file.SeleniumWrapper;

public class Verify extends SeleniumWrapper {
	protected static boolean inError;

	public Verify() {

	}

	public static void verify(String actual, String expected) {

		Assert.assertEquals(actual, expected);

	}

	public static void verify(boolean actual, boolean expected) {

		Assert.assertEquals(actual, expected);

	}

}

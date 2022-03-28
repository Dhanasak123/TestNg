package org.test;

import org.testng.annotations.Test;

public class C {
	@Test
	public void tc111() {
		System.out.println("Test 111:"+Thread.currentThread().getId());

	}

	@Test
	public void tc222() {
		System.out.println("Test 222:"+Thread.currentThread().getId());
	}

	@Test
	public void tc333() {
		System.out.println("Test 333:"+Thread.currentThread().getId());
	}}



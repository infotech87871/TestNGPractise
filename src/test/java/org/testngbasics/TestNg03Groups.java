package org.testngbasics;

import org.testng.annotations.Test;

public class TestNg03Groups {

	@Test(groups = "vivo")
	private void vivo1() {
		System.out.println("Vivo Y73");		
	}
	@Test(groups = "vivo")
	private void vivo2() {
		System.out.println("Vivo Y91");
	}
	@Test(groups = "vivo")
	private void vivo3() {
		System.out.println("Vivo V60");
	}
	@Test(groups = "oppo")
	private void oppo1() {
		System.out.println("Oppo Reno 7");
	}
	@Test(groups = "oppo")
	private void oppo2() {
		System.out.println("Oppo Reno 9");
	}
	@Test(groups = "oppo")
	private void oppo3() {
		System.out.println("Oppo Reno 10 pro");
	}
	@Test(groups = {"iphone , apple"})
	private void iphone1() {
		System.out.println("Iphone 11");
	}
	@Test(groups = "iphone")
	private void iphone2() {
		System.out.println("Iphone 12 pro");
	}
	@Test(groups = "iphone")
	private void iphone3() {
		System.out.println("Iphone 14 pro max");
	}
	
}

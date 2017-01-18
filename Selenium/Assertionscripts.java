package Assertionsndverification;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertionscripts {
@Test
	public void Test1(){
	System.out.println("Testcase Started 1");
	Assert.assertEquals(12, 13);
	System.out.println("Testcase Stopped 1");

}
@Test
public void test2(){
	System.out.println("Testcase Started 2");
	Assert.assertEquals("Assertion failed", 12, 13);
	System.out.println("Testcase Stopped 2");

}

@Test
public void test12(){
	System.out.println("Testcase Started 3");

	Assert.assertEquals("Assertion failed", "Hello", "Hello");
	System.out.println("Testcase Stopped 3");

}
@Test
public void test3(){
	System.out.println("Testcase Started 4");
String mystr="Ajay P";
Assert.assertTrue(mystr.contains("z"));	
System.out.println("Testcase Stopped 4");

}
@Test
public void test4(){
	System.out.println("Testcase Started 5");

	Assert.assertTrue(false);
	System.out.println("Testcase Stopped 5");

}
}
package groupss.group;

import org.testng.annotations.Test;

public class GroupsPractice {

	@Test(groups= {"smoke","sanity","regression"})
	public void testcase1() {
		System.out.println("testcase1 smoke ,sanity,regression  executed");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void testcase2() {
		System.out.println("testcase1  smoke ,sanity executed");
	}
	
	@Test(groups= {"smoke"})
	public void testcase3() {
		System.out.println(5/0);
		System.out.println("testcase1  smoke only executed");
	}
	
	
	@Test(groups= {"regression"},dependsOnMethods={"testcase3"})
	public void testcase4() {
		System.out.println("testcase1 regression only  executed");
	}
	@Test(groups= {"sanity "})
	public void testcase5() {
		System.out.println("testcase1  sanity  only executed");
	}
}

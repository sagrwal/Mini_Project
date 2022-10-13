package com.primesoft.MiniProject.test;




import static org.junit.jupiter.Assertions.assertEquals;

import com.primesoft.MiniProject.entity.Plan;
import com.primesoft.MiniProject.service.PlanServiceImpl;

public class PlanTest {
	
	private static PlanServiceImpl ser=null;
	private static Plan p= null;
	
	@BeforeAll
	public static void init() {
	    ser= new PlanServiceImpl();
	    p= new Plan();
		p.setPlanName("jon");
		p.setActiveSw("xyz");
		p.setPlanCategoryId(101);
		p.setCreatedBy("Harish");
		
	}
	
	@AfterAll
	public static void destroy() {
		ser=null;
		p=null;
	}
	
	@Test
	public void testsave() {
		
		Boolean actualResult = ser.savePlan(p);
		
		Boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
		
	}
	
	public void m1() {
		System.out.println("Hello");
	}

}

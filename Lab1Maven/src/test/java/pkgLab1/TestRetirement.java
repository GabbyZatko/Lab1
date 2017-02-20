package pkgLab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRetirement {

	@Test
	public void test() {
		
		double r = 0.02/12;
		double n = 20 * 12;
		double y = 10000-2642;
		double f = 0;
		boolean t = false;
		double dExpectedPV = 1454485.54;
		double pv = Retirement.FindPV(r, n, Math.abs(y) * -1, f, t);
		
		assertEquals(dExpectedPV,pv,0.01);
		
		
		
		
		
		System.out.println(pv);
		
		r = 0.07/12;
		n = 40 * 12;
		
		
		y = Math.abs(Retirement.FindPMT(r, n, 0, pv, t));
		
		double dExpectedPayment = 554.13;
		
		System.out.println(y);
		
		assertEquals(dExpectedPayment,y,0.01);
		
		
		
		
	}

}

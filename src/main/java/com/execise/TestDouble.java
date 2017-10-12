package com.execise;

import java.math.BigDecimal;

public class TestDouble {
	public static void main(String[] args) {
		double d = 0.03;
		double d2 = 0.02;
		System.out.println(d-d2);
		
		
		BigDecimal b = BigDecimal.valueOf(0.03);
		BigDecimal b2 = BigDecimal.valueOf(0.02);
		System.out.println(b.subtract(b2));
		

	}
}

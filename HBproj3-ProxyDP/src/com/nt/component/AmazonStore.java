package com.nt.component;

import java.util.stream.DoubleStream;

public class AmazonStore implements EcommerceStore {

	/*
	 * @Override public double shopping(String[] items, double[] prices) { double
	 * total=0.0f; for(double p:prices) { total+=p; } return total; }//method
	 */
	

	@Override
	public double Shopping(String[] items, double[] price) {
		double billAmt = 0.0;
		billAmt = DoubleStream.of(price).sum();
		return billAmt;
	}

	
}

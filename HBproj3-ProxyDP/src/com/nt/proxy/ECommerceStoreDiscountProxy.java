package com.nt.proxy;

import com.nt.component.AmazonStore;
import com.nt.component.EcommerceStore;

public class ECommerceStoreDiscountProxy implements EcommerceStore {
		
			private EcommerceStore real;
			private float Discount;
		
			public ECommerceStoreDiscountProxy(float Discount) {
				this.Discount=Discount;
				real=new AmazonStore();
			}
	
	
	@Override
	public double Shopping(String[] items, double[] price) {
		 double billAmt=0.0f;
		 double finalAmt=0.0f;
		 
		 // use real object
		 billAmt=real.Shopping(items, price);
		 
		 // gives the discount
		finalAmt=billAmt-(billAmt*Discount/100);
		 
		 return finalAmt;
	}

	
}

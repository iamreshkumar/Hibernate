package com.nt.factory;

import com.nt.component.AmazonStore;
import com.nt.component.EcommerceStore;
import com.nt.proxy.ECommerceStoreDiscountProxy;

public class EcommerceStoreFactory {

	public static EcommerceStore getInstance(String cuponCode) {

		if (cuponCode.equalsIgnoreCase("") || cuponCode.trim().length() == 0)
			return new AmazonStore();

		else {

			if (cuponCode.equalsIgnoreCase("AM10"))
				return new ECommerceStoreDiscountProxy(10); // proxy object
			else if (cuponCode.equalsIgnoreCase("AM20"))
				return new ECommerceStoreDiscountProxy(20); // proxy object
			else
				return new ECommerceStoreDiscountProxy(5); // proxy object

		}

	}
}

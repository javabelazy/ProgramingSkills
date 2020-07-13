/**
 * 
 */
package com.konzerntech.tax;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author gosling
 * 
 */
public class PriceModification {
	public Object calculateTax(Insurance axa) {
		try {
			Class refClass = axa.getClass();
			Annotation taxAnno;
			Method[] methods = refClass.getMethods();
			for (Method thisMethod : methods) {
				String methodName = thisMethod.getName();
				if (thisMethod.getAnnotations().length > 0
						&& methodName.startsWith("get")) {
					for (Annotation annotation : thisMethod.getAnnotations()) {
						if (annotation instanceof Tax) {
							taxAnno = thisMethod.getAnnotation(Tax.class);
							Tax tax = (Tax) taxAnno;
							System.out.println(" *** "
									+ thisMethod.invoke(axa, new Object[] {}));
							double price = (Double) thisMethod.invoke(axa,
									new Object[] {});
							double supplierPrice = 0;
							String setMethodName = null;
							switch (tax.mode()) {
							case PERCENTAGE:
								double taxPrice = price * tax.amount() / 100;
								supplierPrice = price + taxPrice;
								setMethodName = methodName
										.replace("get", "set");
								Method ss1Method = refClass.getMethod(
										setMethodName, double.class);
								ss1Method.invoke(axa,
										new Object[] { supplierPrice });
								break;
							case AMOUNT:
								supplierPrice = price + tax.amount();
								setMethodName = methodName
										.replace("get", "set");
								Method ss1Method1 = refClass.getMethod(
										setMethodName, double.class);
								ss1Method1.invoke(axa,
										new Object[] { supplierPrice });
								break;
							default:
								break;
							}
						}
					}
				}
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return axa;
	}

}

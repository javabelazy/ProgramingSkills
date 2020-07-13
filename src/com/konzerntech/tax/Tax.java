/**
 * Created a custom annotation interface name Tax
 * 
 */
package com.konzerntech.tax;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author belazy
 * 
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface Tax {
	public String name();
	public double amount();
	public TaxMode mode() default TaxMode.PERCENTAGE;
	public TaxTypes type() default TaxTypes.INCLUSIVE;
}

/**
 * This class is an exaple for dependency injection
 * 
 * we dont need to change this class if any new type of shape comes
 * 
 */
package com.konzern.spring.dependencyInjection;

/**
 * @author Apple
 *
 */
public class Drawing {
	
	public Shape shape = null;
	
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void toDraw() {
		this.shape.draw();
	}

}

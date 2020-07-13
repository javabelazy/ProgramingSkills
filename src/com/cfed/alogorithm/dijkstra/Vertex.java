package com.cfed.alogorithm.dijkstra;
/**
 * 
 * @author Cfed
 *
 */
public class Vertex implements Comparable<Vertex> {
	
	public final String name;
	public Edge[] adjacencies;
	public double minDistance = Double.POSITIVE_INFINITY;
	public Vertex previous;

	public Vertex(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Vertex other) {
		return Double.compare(minDistance, other.minDistance);
	}
}
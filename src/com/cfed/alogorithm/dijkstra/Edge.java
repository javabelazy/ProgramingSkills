package com.cfed.alogorithm.dijkstra;
/**
 * 
 * @author Cfed
 *
 */
class Edge {
	
	
	public final Vertex target;
	public final double weight;

	public Edge(Vertex argTarget, double argWeight) {
		target = argTarget;
		weight = argWeight;
	}
}
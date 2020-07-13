/**
 * Dijkstra's algorithm to find the shortest path between a and b. It picks the unvisited vertex with the lowest distance, calculates the distance through it to each unvisited neighbor, and updates the neighbor's distance if smaller.
The process that underlies Dijkstra’s algorithm is similar to the greedy process used in Prim’s algorithm. Prim’s purpose is to find a minimum spanning tree that connects all vertices in the graph; Dijkstra is concerned with only two vertices. Prim’s does not evaluate the total weight of the path from the starting vertex, only the individual path.
Breadth-first search can be viewed as a special-case of Dijkstra’s algorithm on unweighted graphs (or when all edge lengths are same).
 */
package com.cfed.alogorithm.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 
 * @author Konzerntech
 * @version 1.0
 *
 */
public class DijkstraAlgorithm {
	
	
	public static void computePaths(Vertex source) {
		source.minDistance = 0.;
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
		vertexQueue.add(source);

		while (!vertexQueue.isEmpty()) {
			Vertex u = (Vertex) vertexQueue.poll();  // 8281808029
			for (Edge e : u.adjacencies) {
				Vertex v = e.target;
				double weight = e.weight;
				double distanceThroughU = u.minDistance + weight;
				if (distanceThroughU < v.minDistance) {
					vertexQueue.remove(v);
					v.minDistance = distanceThroughU;
					v.previous = u;
					vertexQueue.add(v);
				}
			}
		}
	}

	public static List<Vertex> getShortestPathTo(Vertex target) {
		List<Vertex> path = new ArrayList<>();
		for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
			path.add(vertex);
		Collections.reverse(path);
		return path;
	}

	public static void main(String[] args) {
		Vertex v0 = new Vertex("a");
		Vertex v1 = new Vertex("b");
		Vertex v2 = new Vertex("c");
		Vertex v3 = new Vertex("d");
		Vertex v4 = new Vertex("e");

		Vertex[] vertices = new Vertex[5];
		Edge[] ed = new Edge[4];

		for (int i = 0; i < 5; i++) {
			vertices[i] = new Vertex("a" + i);
			for (int j = 0; j < 4; j++) {
				ed[j] = new Edge(vertices[j], 10 + j);
			}
		}

		System.out.println(vertices.length + "and " + vertices[3]);
		
		v0.adjacencies = new Edge[] { new Edge(v1, 8), new Edge(v2, 10), new Edge(v3, 8) };
		v1.adjacencies = new Edge[] { new Edge(v0, 5), new Edge(v2, 3), new Edge(v4, 7) };
		v2.adjacencies = new Edge[] { new Edge(v0, 10), new Edge(v1, 3) };
		v3.adjacencies = new Edge[] { new Edge(v0, 8), new Edge(v4, 12) };
		v4.adjacencies = new Edge[] { new Edge(v1, 7), new Edge(v3, 2) };
		Vertex[] vertices1 = { v0, v1, v2, v3, v4 };
		
		
		
		for (Vertex v : vertices1) {
			System.out.println("Distance to the vertex ( " + v + ") is : " + v.minDistance);
			List<?> path = getShortestPathTo(v);
			System.out.println("Shortest path: " + path);
			System.out.println(" Dijkstra algorithm to compute shortest distance ");
		
		}
		
		computePaths(vertices[0]);
		
		for (Vertex v : vertices) {
			System.out.println("Distance to the vertex ( " + v + ") is : " + v.minDistance);
			List<?> path = getShortestPathTo(v);
			System.out.println("Shortest path: " + path);
			System.out.println(" Dijkstra algorithm to compute shortest distance ");
		}
	}
}
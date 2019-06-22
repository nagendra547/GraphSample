package com.nagendra547.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author nagendra
 *
 */
@Data
@RequiredArgsConstructor
public class Vertex {
	
	private final String name;
	private boolean visited = false;
	private List<Edge> neighbors = new ArrayList<>();

	public void printBFS() {
		Queue<Vertex> q = new LinkedList<>();
		System.out.println("printing BFS");
		q.add(this);

		while (q.isEmpty() != true) {
			Vertex v = q.remove();
			System.out.print(v.name + " ");
			v.visited = true;
			for (Edge e : v.neighbors) {
				if (e.getDestination().visited == false)
					q.add(e.getDestination());
			}

		}
		System.out.println();
	}

	public void printDFS() {
		Stack<Vertex> q = new Stack<>();
		System.out.println("printing DFS");
		q.add(this);

		while (q.isEmpty() != true) {
			Vertex v = q.pop();
			System.out.print(v.name + " ");
			v.visited = true;
			for (Edge e : v.neighbors) {
				if (e.getDestination().visited == false)
					q.push(e.getDestination());
			}

		}
		System.out.println();
	}

	public void printEdge() {
		for (Edge e : neighbors) {
			if (e.getDestination() != null) {
				System.out.print(this.name + " -> " + e.getDestination().name + ", ");
			}
		}
		System.out.println();
	}

	public void addUndirectedEdge(Vertex destination, int weight) {
		neighbors.add(new Edge(destination, weight));
		destination.neighbors.add(new Edge(this, weight));
	}

	public void addDirectedEdge(Vertex destination, int weight) {
		neighbors.add(new Edge(destination, weight));
	}

}
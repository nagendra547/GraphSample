package com.nagendra547.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author nagendra
 *
 */
public class Graph {

	List<Vertex> graphs = new ArrayList<>();

	public Graph(){
		
	}
	public void createGraph() {
		Vertex v1 = new Vertex("A");
		Vertex v2 = new Vertex("B");
		Vertex v3 = new Vertex("C");
		Vertex v4 = new Vertex("D");
		Vertex v5 = new Vertex("E");
		v1.addDirectedEdge(v2, 10);
		v2.addDirectedEdge(v3, 20);
		v2.addDirectedEdge(v4, 30);
		v3.addDirectedEdge(v1, 40);
		v1.addDirectedEdge(v5, 45);

		graphs.add(v1);
		graphs.add(v5);
		graphs.add(v2);
		graphs.add(v3);
		graphs.add(v4);
	}

	public void printGraph() {
		for (Vertex v : graphs) {
			if (v != null) {
				System.out.print(v.getName()+", ");
				v.printEdge();
			}
		}

	}

	public void addDirectedEdge(String src, String destination, int weight) {
		Vertex s = null, d = null;
		for (Vertex x : graphs) {
			if (x.getName() == src) {
				s = x;
			} else if (x.getName() == destination) {
				d = x;
			}

			if (s != null && d != null) {
				break;
			}
		}

		if (s == null) {
			s = new Vertex(src);
		}
		if (d == null) {
			d = new Vertex(destination);
		}

		s.addDirectedEdge(d, weight);

	}

	public void printBFS() {
		for (Vertex v : this.graphs) {
			if (v != null && v.isVisited() == false) {
				v.printBFS();
			}
		}
		resetVisit();
	}

	private void resetVisit() {
		for (Vertex v : graphs) {
			v.setVisited(false);
		}
		
	}

	public void printDFS() {
		for (Vertex v : this.graphs) {
			if (v != null && v.isVisited() == false) {
				v.printDFS();
			}
		}
		resetVisit();
	}

}

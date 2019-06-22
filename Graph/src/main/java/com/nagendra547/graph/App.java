package com.nagendra547.graph;

/**
 * 
 * @author nagendra
 *
 */
public class App {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.createGraph();
		graph.printGraph();
		graph.printBFS();
		graph.printDFS();
	}
}

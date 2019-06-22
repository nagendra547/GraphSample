package com.nagendra547.graph;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * 
 * @author nagendra
 *
 */
@Data
@AllArgsConstructor
public class Edge {
	private Vertex destination;
	private int weight;

}
package Lab8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bfs_Dfs {
	static ArrayList<Integer> edges;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numVertices, numEdges;

        System.out.print("Enter the number of vertices: ");
        numVertices = in.nextInt();

        System.out.print("Enter the number of edges: ");
        numEdges = in.nextInt();
        Node n;
        int [][] adjMatrix = new int[numVertices][numVertices];
        Graph.populateMatrix(adjMatrix, numVertices, numEdges);

        System.out.print("Randomly generated Adjacency matrix is: \n");
        Graph.printMatrix(adjMatrix, numVertices);
        
        System.out.print("Enter the starting vertex: ");
        int u = in.nextInt();
        Graph.BFS(u);
    }
	
	
	
    public void display(int size) {
    	for(int i=0; i<size; i++) {
    		System.out.print("(");
    	}
    }
}

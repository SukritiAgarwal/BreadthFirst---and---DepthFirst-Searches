package Lab8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Graph {
	int val;
	Node node = new Node(val);

	static Node[] nodes;
	
	public Graph(int v) {
		val = v;
		nodes = new Node[v];
		for(int i=0; i < val; i++) {
			nodes[i] = new Node(i);
		}
	}
	
	public static void populateMatrix(int [][] matrix, int order, int size){
        int num1=0;
        int num2=0;
        Random rand = new Random();

        for (int i=0;i<size;i++){
            num1 = rand.nextInt(order);
            num2 = rand.nextInt(order);

            if ((num1==num2)||(matrix[num1][num2]==1)){
                i--;
                continue;
            }
            else {
                matrix[num1][num2]=1;
                //adj[num1].add(num2); ADD Node to list
            }
        }
    }

    public static void printMatrix(int [][] matrix, int order) {
        for(int i=0; i < order; i++) {
            for(int j=0; j< order; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
    
    public void addEdge(int num, Node adj) {
    	nodes[num].addAdj(adj);
    }
    
    public static void BFS(int s) {
    	if(nodes[s].getAdj().size() == 0) {
    		System.out.println("No edges to any OTHER Vertex from: " + s);
    	}
    	else {
    		Node n = null;
    		n.value= s;
    		n.setDistance(0);
    		n.setParent(-1);
    		Queue<Node> q = new LinkedList<Node>();
    		q.add(n);
    		
    		while(q.size()!=0) {
    			q.remove(n);
    			for(Node a: n.getAdj()) {
    				if(a.getParent() != 0) {
    					q.add(a);
    					a.setParent(n.value);
    					a.setDistance(n.getDistance()+1);
    				}
    				else if(a.getDistance() > n.getDistance()+1) {
    					a.setParent(n.value);
    					a.setDistance(n.getDistance()+1);
    				}
    			}
    		}
    	}
    }
    
}
